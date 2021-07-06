package com.linktracker.linktracker.repositories;

import java.util.HashMap;
import java.util.Map;

import com.linktracker.linktracker.entities.Link;

import org.springframework.stereotype.Repository;

@Repository
public class LinkRepository {

    Map<Long, Link> links = new HashMap<>();
    private static Long autoIncrementLinkId = 1L;

    public LinkRepository() {}
    
    public Link getLinkById(Long linkId) throws RuntimeException {
        if (!this.links.containsKey(linkId)) {
            throw new RuntimeException("We don't have a link with id " + linkId + ". :(");
        }
        return this.links.get(linkId);
    }

    public void invalidateLink(Long linkId) throws RuntimeException {
        if (!this.links.containsKey(linkId)) {
            throw new RuntimeException("We don't have a link with id " + linkId + ". :(");
        }
        this.links.remove(linkId);
    }

    public Link addLink(Link link) {
        link.setId(autoIncrementLinkId++);
        
        this.links.put(link.getId(), link);
        
        return link;
    }

}