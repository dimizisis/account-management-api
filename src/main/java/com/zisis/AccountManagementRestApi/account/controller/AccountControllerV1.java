package com.zisis.AccountManagementRestApi.account.controller;

import com.zisis.AccountManagementRestApi.account.dto.request.OpenAccountRequestDto;
import com.zisis.AccountManagementRestApi.account.dto.response.OpenAccountResponseDto;
import com.zisis.AccountManagementRestApi.account.service.AccountService;
import com.zisis.AccountManagementRestApi.account.util.mapping.AccountDtoMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountControllerV1 {
    private final AccountService accountService;

    @Autowired
    public AccountControllerV1(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/open")
    public ResponseEntity<OpenAccountResponseDto> openAccount(@Valid @RequestBody OpenAccountRequestDto request) {
        var account = accountService.openAccount(request.getCustomerId(), request.getInitialCredit());
        return ResponseEntity.ok(AccountDtoMapper.mapToOpenAccountResponseDto(account));
    }
}
