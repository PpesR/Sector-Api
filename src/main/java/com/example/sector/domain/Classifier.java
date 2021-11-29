package com.example.sector.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "classifier")
@Data
public class Classifier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank
    private String code;

    @Column
    @NotBlank
    private String name;

    @Column
    private boolean hasChild;
}
