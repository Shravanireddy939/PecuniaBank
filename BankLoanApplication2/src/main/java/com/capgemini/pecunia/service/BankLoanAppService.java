package com.capgemini.pecunia.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.pecunia.entity.LoanDisbursal;
import com.capgemini.pecunia.entity.LoanRequests;

public interface BankLoanAppService {
	public String loanRequest(LoanRequests loanreq);
	public ArrayList<LoanRequests> getAllRequests();
	public  List<LoanDisbursal> getApproveLoans(String accountId);
	public List<LoanDisbursal> getRejectedLoans(String accountId);
	public String updateBalance(LoanDisbursal loandis);

}
