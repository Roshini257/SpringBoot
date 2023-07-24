package com.example.demo.dto;

import com.example.demo.entity.LeadDetail;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ConsultantDetailsDTO {
    private long id;
    private long leadId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
}

