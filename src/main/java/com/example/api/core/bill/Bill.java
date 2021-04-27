package com.example.api.core.bill;

import com.example.api.core.patient.Patient;

import javax.persistence.*;
import java.util.Locale;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Patient patient;

    private double totalPrice;

    private Locale createDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Locale getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Locale createDate) {
        this.createDate = createDate;
    }
}
