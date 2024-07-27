package com.practice.Certificate_service_final.service;


import com.practice.Certificate_service_final.model.Certificate;
import com.practice.Certificate_service_final.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CertificateService {
    @Autowired
    private CertificateRepository certificateRepository;





    public Optional<Certificate> getCertificateByStudentId(int studentId) {
        return certificateRepository.findById(studentId);
    }

}



