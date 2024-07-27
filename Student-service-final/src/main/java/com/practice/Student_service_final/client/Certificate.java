package com.practice.Student_service_final.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Certificate {
    public int studentId;
    public int certificateid;

    public String certificateName;
    public String completed;
}
