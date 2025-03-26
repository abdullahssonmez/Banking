package com.abdullahssonmez.service.impl;

import com.abdullahssonmez.dto.TransacctionDto;
import com.abdullahssonmez.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransacctionDto transacctionDto);
}
