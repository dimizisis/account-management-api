package com.zisis.AccountManagementRestApi.account.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double balance;

    @ElementCollection
    @CollectionTable(name = "transactions", joinColumns = @JoinColumn(name = "account_id"))
    @Column(name = "transaction")
    private List<String> transactions = new ArrayList<>();
}
