package com.practice.Certificate_service_final.controller;


import com.practice.Certificate_service_final.model.Certificate;
import com.practice.Certificate_service_final.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;



    @GetMapping("/getcertificatedetails/{studentId}")
    public Optional<Certificate> getCertificatedetailsByStudentId(@PathVariable int studentId) {
        return certificateService.getCertificateByStudentId(studentId);
    }



}
