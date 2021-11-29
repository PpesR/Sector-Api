package com.example.sector.controller;

import com.example.sector.domain.SectorUser;
import com.example.sector.request.in.SectorUserSaveRequest;
import com.example.sector.service.SectorUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
@CrossOrigin(origins = "http://localhost:4200")
public class SectorUserController {

    private final SectorUserService sectorUserService;

    @GetMapping(value = "")
    public List<SectorUser> getAllUsers() {
        return sectorUserService.getAllUsers();
    }

    @GetMapping(value = "/{sectorUserId}")
    public SectorUser getUserById(@PathVariable("sectorUserId") long sectorUserId) {
        return sectorUserService.getUserById(sectorUserId);
    }

    @PostMapping(value = "")
    public SectorUser saveUser(@Valid @RequestBody SectorUserSaveRequest request) {
        return sectorUserService.saveUser(request);
    }

    @PatchMapping(value = "/{sectorUserId}")
    public SectorUser updateUser(@PathVariable("sectorUserId") long sectorUserId,
                                 @Valid @RequestBody SectorUserSaveRequest request) {
        return sectorUserService.updateSectorUserById(sectorUserId, request);
    }
}
