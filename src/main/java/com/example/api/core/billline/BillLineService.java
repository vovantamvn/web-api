package com.example.api.core.billline;

import com.example.api.core.billline.BillLineRepository;

public class BillLineService {
    private final BillLineRepository billLineRepository;

    public BillLineService(BillLineRepository billLineRepository) {
        this.billLineRepository = billLineRepository;
    }

//    public BillLine getBillLine(long id) {
//        //todo
//    }
//
//    public void updateBillLine(long id, BillLine billLine) {
//        //todo
//    }
//
//    public void addBillLine(BillLine billLine) {
//        //todo
//    }
//
//    public void deleteBillLine(long id) {
//        //todo
//    }
}
