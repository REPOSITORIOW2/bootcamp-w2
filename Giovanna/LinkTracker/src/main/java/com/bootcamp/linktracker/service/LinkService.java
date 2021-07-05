package com.bootcamp.linktracker.service;

import com.bootcamp.linktracker.models.Link;


import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class LinkService {
    static HashMap<Long, Link> urls = new HashMap<>();
    static long currentId = 0;


    public Link addLink(Link link) {
        String[] schemes = {"http", "https"};
        UrlValidator urlValidator = new UrlValidator(schemes);
        if (urlValidator.isValid(link.getUrl())) {
            Link _link = new Link(link.getUrl(), currentId, link.getPassword());
            urls.put(currentId, _link);
            currentId++;
            return _link;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int returnRedirectCount(long linkId, String Password) {
        var link = urls.get(linkId);
        if(link!=null && link.getPassword() == Password){
            return link.getClicks();
        }
        else{
            throw new InvalidParameterException();
        }
    }

    public String invalidateUrl(long idlink, String Password) {
        var url = urls.get(idlink);
        if(url!=null && url.getPassword() == Password){
            urls.get(idlink).setActive(false);
            return idlink + " foi invalidado.";
        }
        else{
            throw new InvalidParameterException();
        }
    }

    public Link redirectTo(long idlink , String Password) {
        var url = urls.get(idlink);
        if(url!=null && url.isActive() && url.getPassword() == Password){
            url.setClicks(url.getClicks() + 1);
            return url;
        }
        else{
            throw new InvalidParameterException();
        }
    }



}
