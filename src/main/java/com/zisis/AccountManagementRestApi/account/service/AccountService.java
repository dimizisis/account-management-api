package com.zisis.AccountManagementRestApi.account.service;

import com.zisis.AccountManagementRestApi.account.entity.Account;

public interface AccountService {
    Account openAccount(Long customerId, double initialCredit);
}
