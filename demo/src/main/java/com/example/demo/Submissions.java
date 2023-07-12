package com.example.demo;


import lombok.Data;

@Data

public class Submissions {
    private String id;
    private String consultantName;
    private String submissionDate;
    private String leadName;
    private int rate;
    private String salesPersonName;
    private String technology;
    private String vendorName;

    // Generate getters and setters
}