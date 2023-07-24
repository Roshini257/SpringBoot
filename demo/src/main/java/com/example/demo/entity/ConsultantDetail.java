package com.example.demo.entity;
import lombok.Data;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;


@Entity
@Table(name="consultant_detail")
@Data
public class ConsultantDetail  {
    @Column(name="Id")
    @Id
    private long id;
    @Column(name="Lead_id")
    private long Lead_id;
    @Column(name="First_name")
    private String firstName;

    @Column(name="Last_name")
    private String lastName;

    @Column(name="Email_address")
    private String emailAddress;

    @Column(name="Phone_number")
    private String phoneNumber;
}


