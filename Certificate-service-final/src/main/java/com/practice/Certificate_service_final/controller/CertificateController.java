package com.practice.Certificate_service_final.controller;

import com.practice.Certificate_service_final.client.Student;
import com.practice.Certificate_service_final.model.Certificate;
import com.practice.Certificate_service_final.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;



    @GetMapping("/studentscertificates")
    public ResponseEntity<List<Student>> getCertificatesByCompletionStatus(@RequestParam boolean completed) {
        List<Student> certificates = certificateService.getCertificatesByCompletionStatus(completed);
        return ResponseEntity.ok(certificates);
    }



}
