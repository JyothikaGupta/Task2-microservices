package com.practice.Certificate_service_final.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    public int certificateid;
    public String course_title;
    public String certificateName;
    public List<Student> student;

}
