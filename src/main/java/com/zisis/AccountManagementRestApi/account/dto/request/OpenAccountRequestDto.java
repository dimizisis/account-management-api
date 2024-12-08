package com.zisis.AccountManagementRestApi.account.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OpenAccountRequestDto {
    @NotNull(message = "Customer ID is required.")
    private Long customerId;
    @Min(value = 0, message = "Initial credit must be zero or positive.")
    private double initialCredit;
}
