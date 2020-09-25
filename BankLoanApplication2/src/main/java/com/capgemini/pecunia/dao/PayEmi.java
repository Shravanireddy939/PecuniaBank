package com.capgemini.pecunia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.entity.LoanDisbursal;
@Repository
public interface PayEmi extends JpaRepository<LoanDisbursal, Integer> {

}
