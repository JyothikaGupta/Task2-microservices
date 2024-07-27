package com.practice.Student_service_final.feign;
import com.practice.Student_service_final.client.Certificate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name="Certificate-service-final",url="http://localhost:8082/certificates")
public interface CertificateClient {

    @GetMapping("/getcertificatedetails/{studentId}")
    public List<Certificate> getCertificatedetailsByStudentId(@PathVariable int studentId);


}
