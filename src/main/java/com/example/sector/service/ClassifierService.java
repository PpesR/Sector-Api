package com.example.sector.service;

import com.example.sector.domain.Classifier;
import com.example.sector.repository.ClassifierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassifierService {
    private final ClassifierRepository classifierRepository;

    public List<Classifier> getAllClassifiers() {
        return classifierRepository.findAll();
    }
}
