package com.capgemini.pecunia.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.entity.LoanRequests;
@Repository
public interface LoanRequestDao extends JpaRepository<LoanRequests, String>{

	@Query("select e from LoanRequests e where accountId=:accountId")
	List<LoanRequests> selectById(String accountId);
	

}
