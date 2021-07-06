package com.linktracker.linktracker.dtos;

import com.linktracker.linktracker.entities.Link;

public class LinkMetricsDTO {
    
    private Long redirectCounter;
    

    public LinkMetricsDTO() {}

    public LinkMetricsDTO(Long redirectCounter) {
        this.redirectCounter = redirectCounter;
    }

    public Long getRedirectCounter() {
        return this.redirectCounter;
    }

    public static LinkMetricsDTO toDTO(Link link){
        return new LinkMetricsDTO(link.getRedirectCounter());
    }
}
