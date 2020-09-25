package com.capgemini.pecunia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entity.LoanDisbursal;
import com.capgemini.pecunia.entity.LoanRequests;
import com.capgemini.pecunia.exceptions.NullFoundException;
import com.capgemini.pecunia.service.BankLoanAppService;

@RestController
@RequestMapping("/loan")
@CrossOrigin("http://localhost:4200")
public class BankLoanApplicationController {
	@Autowired
	BankLoanAppService service;

	@PostMapping("/request")
	public ResponseEntity<String> loanRequest(@RequestBody LoanRequests loanreq) {
		if(loanreq.getAccountId()==null) {
			throw new NullFoundException("cannot be null");
		}
		else {
			String request = service.loanRequest(loanreq);
			return new ResponseEntity<String>(request, new HttpHeaders(), HttpStatus.OK);
		}
	}

	@GetMapping("/getAllRequests")
	public ResponseEntity<List<LoanRequests>> getAllRequests() {
		ArrayList<LoanRequests> requests = service.getAllRequests();
		return new ResponseEntity<List<LoanRequests>>(requests, HttpStatus.OK);
	}

	@GetMapping("/approvedrequests/{accountId}")
	public List<LoanDisbursal> allApproved(@PathVariable String accountId) {
		if(accountId==null) {
			throw new NullFoundException("cannot be null");
		}
		else {
			return service.getApproveLoans(accountId);
		}}

	@GetMapping("/rejectedrequests/{accountId}")
	public List<LoanDisbursal> allRejected(@PathVariable String accountId) {
		if(accountId==null) {
			throw new NullFoundException("cannot be null");
		}
		else {
			return service.getRejectedLoans(accountId);
		}}

	@PostMapping("/updateBal")
	public ResponseEntity<String> updateBal(@RequestBody LoanDisbursal loandis) {
		if(loandis==null) {
			throw new NullFoundException("All fields are required");
		}else {
			String update = service.updateBalance(loandis);
			return new ResponseEntity<String>(update, new HttpHeaders(), HttpStatus.OK);
		}}

}
