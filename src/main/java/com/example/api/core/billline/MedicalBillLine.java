package com.example.api.core.billline;

import javax.persistence.Entity;

@Entity
public class MedicalBillLine extends BillLine {
    private String drug;

    public MedicalBillLine() {
    }

    public MedicalBillLine(long id, double price, String drug) {
        super(id, price);
        this.drug = drug;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }
}
