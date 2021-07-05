package com.bootcamp.linktracker.controller;

import com.bootcamp.linktracker.models.Link;
import com.bootcamp.linktracker.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/link")
public class LinkController {

    @Autowired
    LinkService service;

    @PostMapping("/addLink")
    public ResponseEntity<Link> post(@RequestBody Link link) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addLink(link));
    }
    @GetMapping("redirect/{id}/{password}")
    public ResponseEntity<?> redirect(@PathVariable Long id, @PathVariable String password) {
        Link redirectUrl = service.redirectTo(id,password);
        return ResponseEntity.status(HttpStatus.TEMPORARY_REDIRECT)
                .location(URI.create(redirectUrl.getUrl()))
                .build();
    }

    @GetMapping("metrics/{id}/{password}")
    public ResponseEntity<?> metrics(@PathVariable Long id , @PathVariable String password) {
        return ResponseEntity.ok(service.returnRedirectCount(id,password));
    }

    @PostMapping("/invalidate/{id}/{password}")
    public ResponseEntity<String> post(@PathVariable Long id,  @PathVariable String password) {
        return ResponseEntity.ok(service.invalidateUrl(id,password));
    }

}
