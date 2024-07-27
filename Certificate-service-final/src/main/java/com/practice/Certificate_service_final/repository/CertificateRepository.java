package com.practice.Certificate_service_final.repository;


import com.practice.Certificate_service_final.model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CertificateRepository extends JpaRepository<Certificate,Integer> {
    List<Certificate> findByCompleted(Boolean completed);
}
