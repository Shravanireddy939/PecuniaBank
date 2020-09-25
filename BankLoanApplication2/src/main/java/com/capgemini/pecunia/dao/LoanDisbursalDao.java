package com.capgemini.pecunia.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.pecunia.entity.LoanDisbursal;

public interface LoanDisbursalDao extends JpaRepository<LoanDisbursal, Integer> {

	@Query("select r from LoanDisbursal r where loanStatus='Accepted' and accountId=?1")
	List<LoanDisbursal> findAllAccepted(@Param("c") String s1);
	@Query("select r from LoanDisbursal r where loanStatus='Rejected' and accountId=?1")
	List<LoanDisbursal> findAllRejected(@Param("c") String s1);
}
