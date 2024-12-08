package com.zisis.AccountManagementRestApi.account.service;

import com.zisis.AccountManagementRestApi.account.entity.Account;
import com.zisis.AccountManagementRestApi.account.persistence.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account openAccount(Long customerId, double initialCredit) {
        var newAccount = new Account();
        newAccount.setBalance(initialCredit);

        if (initialCredit > 0) {
            newAccount.addTransaction("Initial deposit: " + initialCredit);
        }

        accountRepository.save(newAccount);

        return newAccount;
    }
}
