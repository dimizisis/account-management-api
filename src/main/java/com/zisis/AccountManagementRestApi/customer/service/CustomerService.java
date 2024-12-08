package com.zisis.AccountManagementRestApi.customer.service;

import com.zisis.AccountManagementRestApi.customer.entity.Customer;

import java.util.Optional;

public interface CustomerService {
    Optional<Customer> getCustomerInfo(Long id);
}
