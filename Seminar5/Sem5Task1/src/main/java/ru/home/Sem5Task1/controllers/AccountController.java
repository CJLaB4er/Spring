package ru.home.Sem5Task1.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.home.Sem5Task1.dto.TransferRequest;
import ru.home.Sem5Task1.model.Account;
import ru.home.Sem5Task1.services.TransferService;

@RestController
@AllArgsConstructor
public class AccountController {
    private final TransferService transferService;


    @PostMapping("/transfer")
    public void transferMoney(
            @RequestBody TransferRequest request
    ) {
        transferService.transferMoney(
                request.getSenderAccountId(),
                request.getReceiverAccountId(),
                request.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(
            @RequestParam(required = false) String name
    ) {
        if (name == null) {
            return transferService.getAllAccounts();
        } else {
            return transferService.findAccountsByName(name);
        }
    }

}
