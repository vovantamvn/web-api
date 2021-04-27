package com.example.api.core.bill;

import com.example.api.core.patient.Patient;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Setter
@Getter
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne

    private Patient patient;

    private double totalPrice;

    private Locale createDate;
}
