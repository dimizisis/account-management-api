package com.zisis.AccountManagementRestApi.customer.controller;

import com.zisis.AccountManagementRestApi.customer.service.CustomerService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerControllerV1 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV1(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<?> getCustomerInfo(@PathVariable @NotNull Long customerId) {
        var customer = customerService
                .getCustomerInfo(customerId)
                .orElseThrow();
        return ResponseEntity.ok(customer);
    }
}