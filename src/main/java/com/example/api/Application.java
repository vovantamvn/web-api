package com.example.api;

import com.example.api.core.billline.BillLineRepository;
import com.example.api.core.billline.MedicalBillLine;
import com.example.api.core.drug.Drug;
import com.example.api.core.drug.DrugRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        var app = SpringApplication.run(Application.class);
        var repository = app.getBean(BillLineRepository.class);
        var drugRepository = app.getBean(DrugRepository.class);

        var drug = new Drug();
        drugRepository.save(drug);

        var bill = new MedicalBillLine();
        bill.setDrug(drug);
        bill.setPrice(100f);

        repository.save(bill);
    }
}
