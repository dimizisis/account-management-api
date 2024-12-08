package com.zisis.AccountManagementRestApi.account.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accounts")
@NoArgsConstructor
@AllArgsConstructor
@Data
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

    public void addTransaction(String transaction) {
        this.transactions.add(transaction);
    }
}
