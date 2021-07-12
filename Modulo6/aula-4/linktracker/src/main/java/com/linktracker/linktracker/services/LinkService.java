package com.linktracker.linktracker.services;

import java.util.Objects;

import com.linktracker.linktracker.dtos.CreateLinkDTO;
import com.linktracker.linktracker.dtos.LinkDTO;
import com.linktracker.linktracker.dtos.LinkMetricsDTO;
import com.linktracker.linktracker.entities.Link;
import com.linktracker.linktracker.repositories.LinkRepository;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class LinkService {

    private final LinkRepository linkRepository;

    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public String getUrlById(Long linkId, String password) throws RuntimeException {
        Link link = this.linkRepository.getLinkById(linkId);

        if (verifyPassword(link, password))
            throw new RuntimeException("This link has no password. :)");

        if (!isPasswordValid(link, password))
            throw new RuntimeException("Invalid password.");

        return link.getUrl();
    }

    public LinkDTO addLink(CreateLinkDTO createLinkDTO) {
        Link link = new Link(createLinkDTO.getPassword(), createLinkDTO.getUrl());
        Link newLink = this.linkRepository.addLink(link);
        
        return LinkDTO.toDto(newLink);
    } 

    public void invalidateLink(Long linkId, String password) throws RuntimeException {
        Link link = this.linkRepository.getLinkById(linkId);

        if (verifyPassword(link, password))
            throw new RuntimeException("This link has no password. :)");

        if (!isPasswordValid(link, password))
            throw new RuntimeException("Invalid password.");

        this.linkRepository.invalidateLink(linkId);
    }

    public LinkMetricsDTO getMetrics(Long linkId) throws RuntimeException {
        Link link = linkRepository.getLinkById(linkId);
        return LinkMetricsDTO.toDTO(link);
    }

    public void incrementRedirectCounter(Long linkId) throws RuntimeException {
        Link link = this.linkRepository.getLinkById(linkId);
        link.setRedirectCounter(link.getRedirectCounter() + 1);
    }

    private boolean verifyPassword(Link link, String password) {
        return Objects.isNull(link.getPassword()) && Objects.nonNull(password);
    }

    private boolean isPasswordValid(Link link, String password) {
        if (Objects.nonNull(link.getPassword()) && 
            !link.getPassword().isEmpty() && 
            !link.getPassword().equals(password)) {
                return false;
        }
        return true;
    }
}
