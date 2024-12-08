package com.zisis.AccountManagementRestApi.account.util.mapping;

import com.zisis.AccountManagementRestApi.account.dto.response.OpenAccountResponseDto;
import com.zisis.AccountManagementRestApi.account.entity.Account;

public final class AccountDtoMapper {
    public static OpenAccountResponseDto mapToOpenAccountResponseDto(Account account) {
        var dto = new OpenAccountResponseDto();
        dto.setId(account.getId());
        dto.setBalance(account.getBalance());
        return dto;
    }
}
