package com.zerobase.member.repository;

import com.zerobase.member.domain.model.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {
    Optional<Partner> findByUsername(String username);
}