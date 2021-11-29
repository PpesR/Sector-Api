package com.example.sector.controller;

import com.example.sector.domain.Classifier;
import com.example.sector.service.ClassifierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/classifiers")
@CrossOrigin(origins = "http://localhost:4200")
public class ClassifierController {

    private final ClassifierService classifierService;

    @GetMapping(value = "")
    public List<Classifier> getAllClassifiers() {
        return classifierService.getAllClassifiers();
    }
}
