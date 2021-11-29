package com.example.sector.repository;

import com.example.sector.domain.SectorUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorUserRepository extends JpaRepository<SectorUser, Long> {
}
