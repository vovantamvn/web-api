package com.example.api.core.billline;

import com.example.api.exception.ResourceNotFound;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BillLineService {
    private final BillLineRepository repository;

    public BillLine getBillLine(long id) {
        if (repository.existsById(id)) {
            return repository.getOne(id);
        }

        throw new ResourceNotFound();
    }

    public void updateBillLine(long id, BillLine billLine) {
        if (repository.existsById(id)) {
            billLine.setId(id);
            repository.save(billLine);
        }

        throw new ResourceNotFound();
    }

    public void addBillLine(BillLine billLine) {
        billLine.setId(0);
        repository.save(billLine);
    }

    public void deleteBillLine(long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new ResourceNotFound();
        }
    }
}
