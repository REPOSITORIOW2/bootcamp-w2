package com.linktracker.linktracker.controller;

import java.net.URI;

import javax.validation.Valid;

import com.linktracker.linktracker.dtos.CreateLinkDTO;
import com.linktracker.linktracker.dtos.LinkDTO;
import com.linktracker.linktracker.dtos.LinkMetricsDTO;
import com.linktracker.linktracker.services.LinkService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class LinkController {
    
    private final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }
    
    @GetMapping("/link/{linkId}")
    public ResponseEntity<Void> redirectToUrl(
            @PathVariable Long linkId, 
            @RequestParam(required = false) String password) {
        String url = null;
        try {
            url = this.linkService.getUrlById(linkId, password);
            this.linkService.incrementRedirectCounter(linkId);
        }catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
        }
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(url)).build();       
    }
    
    @PostMapping("/link")
    public LinkDTO addLink(@RequestBody @Valid CreateLinkDTO createLinkDto) {
        return this.linkService.addLink(createLinkDto);
    }

    @GetMapping("/link/invalidate/{linkId}")
    public ResponseEntity<Void> invalidateLink(@PathVariable Long linkId) {
        try {
            this.linkService.invalidateLink(linkId);
        } catch(Exception ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
        }

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/metrics/{linkId}")
    public LinkMetricsDTO getMetrics(@PathVariable Long linkId) {
        LinkMetricsDTO metrics = null;
        try {
            metrics = linkService.getMetrics(linkId);
        } catch(RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
        }
        return metrics;
    }
}
