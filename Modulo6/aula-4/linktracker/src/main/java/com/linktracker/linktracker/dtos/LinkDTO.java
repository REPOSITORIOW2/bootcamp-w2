package com.linktracker.linktracker.dtos;

import com.linktracker.linktracker.entities.Link;

public class LinkDTO {

    private Long linkId;

    public LinkDTO() {}

    public LinkDTO(Long linkId) {
        this.linkId = linkId;
    }

    public Long getLinkId() {
        return this.linkId;
    }

    public static LinkDTO toDto(Link link) {
        return new LinkDTO(link.getId());
    }
}
