package com.example.api.core.drug;

import com.example.api.core.billline.MedicalBillLine;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "drug")
    private MedicalBillLine medicalBillLine;
}
