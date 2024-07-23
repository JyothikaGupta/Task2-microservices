package com.practice.Certificate_service_final.service;

import com.practice.Certificate_service_final.client.FullResponse;
import com.practice.Certificate_service_final.client.Student;
import com.practice.Certificate_service_final.feign.StudentClient;
import com.practice.Certificate_service_final.model.Certificate;
import com.practice.Certificate_service_final.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CertificateService {
    @Autowired
    private CertificateRepository certificateRepository;

    @Autowired
    private StudentClient client;

    public List<Student> getCertificatesByCompletionStatus(boolean completed) {
        return client.findByCompleted(completed);
    }



    }



