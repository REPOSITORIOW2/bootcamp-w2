package com.bootcampmeli.apidiploma.controllers;

import com.bootcampmeli.apidiploma.entities.Degree;
import com.bootcampmeli.apidiploma.entities.Student;
import com.bootcampmeli.apidiploma.services.DegreeService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping
public class DegreeController {

    private final DegreeService degreeService; 

    public DegreeController(DegreeService degreeService) {
        this.degreeService = degreeService;
    }

    @PostMapping
    public Degree printDegree(@RequestBody Student student) {
        try{
            degreeService.validarStudent(student);
        }catch(RuntimeException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
        return this.degreeService.printDegree(student);
    }
}