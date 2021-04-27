package com.example.api.core.billline;

import com.example.api.core.drug.Drug;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@Setter
@Getter
public class MedicalBillLine extends BillLine {
    @OneToOne(fetch = FetchType.EAGER)
    private Drug drug;
}
