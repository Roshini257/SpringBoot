package com.example.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;


@Entity
@Table(name="submission")
@Data
public class SubmissionDetail  {
    @Column(name="Id")
    @Id
    private String id;
    @Column(name="Consultant_id")
    private long consultantId;
    @Column(name="Submission_date")
    private String submissionDate;

    @Column(name="Vendor_company")
    private String vendorCompany;

    @Column(name="Vendor_name")
    private String vendorName;
    @Column(name="Vendor_email_address")
    private String vendorEmailAddress;
    @Column(name="Vendor_phone_number")
    private String vendorPhoneNumber;

    @Column(name="Implementation_partner")
    private String implementationPartner;

    @Column(name="Client_name")
    private String clientName;

    @Column(name="Pay_rate")
    private int payRate;

    @Column(name="Submission_status")
    private String submissionStatus;

    @Column(name="Submission_type")
    private String submissionType;

    @Column(name="City")
    private String city;

    @Column(name="State")
    private String state;

    @Column(name="Zipcode")
    private int zipcode;


}