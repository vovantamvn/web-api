package com.example.api.core.billline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BillLineRepositoryTest {

    @Autowired
    private BillLineRepository repository;

    @BeforeEach
    void setUp() {
        repository.deleteAll();
    }

    @Test
    void it_should_insert_medical_bill_line() {
        // Arrange
        MedicalBillLine bill = new MedicalBillLine();
        bill.setPrice(50f);
        bill.setDrug(null);

        // Act
        BillLine result = repository.save(bill);

        // Assert
        assertTrue(result instanceof MedicalBillLine);
        assertEquals(50f, result.getPrice());
    }

    @Test
    void it_should_insert_service_bill_line() {
        // Arrange
        ServiceBillLine bill = new ServiceBillLine();
        bill.setPrice(50f);
        bill.setServiceName("Name");

        // Act
        BillLine result = repository.save(bill);

        // Assert
        assertTrue(result instanceof ServiceBillLine);
        assertEquals(50f, result.getPrice());
        assertEquals("Name", ((ServiceBillLine) result).getServiceName());
    }
}