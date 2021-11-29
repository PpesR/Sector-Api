package com.example.sector.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "sector_user")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SectorUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank
    private String name;

    @Column(name = "sector_code")
    @ElementCollection
    @CollectionTable(
            name = "selected_sector",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id")
    )
    @NotEmpty
    private List<String> sectors;

    @Column(name = "has_agreed_to_terms")
    private boolean hasAgreedToTerms;

}
