package com.linktracker.linktracker.services;

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

        if (!link.getPassword().isEmpty() && !link.getPassword().equals(password)) {
            throw new RuntimeException("The given password is invalid. :/");
        }

        return link.getUrl();
    }

    public LinkDTO addLink(CreateLinkDTO createLinkDTO) {
        Link link = new Link(createLinkDTO.getPassword(), createLinkDTO.getUrl());
        Link newLink = this.linkRepository.addLink(link);
        
        return LinkDTO.toDto(newLink);
    } 

    public void invalidateLink(@PathVariable Long linkId) throws RuntimeException {
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
}
