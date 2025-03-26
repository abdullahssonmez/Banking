package com.abdullahssonmez.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullahssonmez.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
