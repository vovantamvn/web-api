package com.example.api.core.bill;

import com.example.api.core.bill.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
