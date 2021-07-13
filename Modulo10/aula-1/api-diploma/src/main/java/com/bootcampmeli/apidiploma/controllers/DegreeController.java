package com.bootcampmeli.apidiploma.controllers;

import javax.validation.Valid;

import com.bootcampmeli.apidiploma.dtos.DegreeDTO;
import com.bootcampmeli.apidiploma.dtos.StudentDTO;
import com.bootcampmeli.apidiploma.services.DegreeService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DegreeController {

    private final DegreeService degreeService; 

    public DegreeController(DegreeService degreeService) {
        this.degreeService = degreeService;
    }

    @PostMapping("/analyzeNotes")
    @ResponseStatus(HttpStatus.CREATED)
    public DegreeDTO analyzeNotes(@RequestBody @Valid StudentDTO student) {        
        DegreeDTO degree = this.degreeService.analyzeNotes(student);
        return degree;
    }
}