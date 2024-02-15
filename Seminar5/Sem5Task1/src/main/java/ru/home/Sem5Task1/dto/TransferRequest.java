package ru.home.Sem5Task1.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferRequest {
    private long senderAccountId;
    private long receiverAccountId;
    private BigDecimal amount;
}
