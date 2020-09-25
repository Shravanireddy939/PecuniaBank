package com.capgemini.pecunia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.pecunia.entity.Transactions;

public interface TransactionsDao extends JpaRepository<Transactions, String> {

}
