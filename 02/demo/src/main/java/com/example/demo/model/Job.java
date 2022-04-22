package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

//id, kiểu String, mã tin tuyển dụng cần phải là duy nhất (unique)
//       title: kiểu String, tiêu đề tuyển dụng
//       description: kiểu String, mô tả tin tuyển dụng
//        location: [Hanoi, Hai Phong, Da Nang, Ho Chi Minh]
//        min_salary: int, lương tối thiểu
//        max_salary: int, lương tối đa
//        email_to: String, email nhà tuyển dụng
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    private String id;
    private String title;
    private String description;
    private Location location;
    private int min_salary;
    private int max_salary;
    private String email_to;


}
