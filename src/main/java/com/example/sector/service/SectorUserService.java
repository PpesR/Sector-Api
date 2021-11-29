package com.example.sector.service;

import com.example.sector.domain.SectorUser;
import com.example.sector.repository.SectorUserRepository;
import com.example.sector.request.in.SectorUserSaveRequest;
import com.example.sector.util.DomainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SectorUserService {

    private final DomainMapper domainMapper;
    private final SectorUserRepository sectorUserRepository;

    public List<SectorUser> getAllUsers() {
        return sectorUserRepository.findAll();
    }

    public SectorUser getUserById(long sectorUserId) {
        return sectorUserRepository.getById(sectorUserId);
    }

    public SectorUser saveUser(SectorUserSaveRequest request) {
        var sectorUser = new SectorUser();
        domainMapper.map(request, sectorUser);
        return sectorUserRepository.save(sectorUser);
    }

    public SectorUser updateSectorUserById(long id, SectorUserSaveRequest request) {
        var sectorUser = sectorUserRepository.getById(id);
        domainMapper.map(request, sectorUser);
        return sectorUserRepository.save(sectorUser);
    }
}
