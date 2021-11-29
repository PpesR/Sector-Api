package com.example.sector.request.in;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class SectorUserSaveRequest {
    @NotBlank(message = "Name is a required field")
    private String name;

    @NotEmpty(message = "Sectors is a required field")
    private List<String> sectors;

    @AssertTrue(message = "User has to agree to terms")
    private boolean hasAgreedToTerms;
}
