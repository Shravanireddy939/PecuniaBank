package com.capgemini.pecunia.exceptions;

@SuppressWarnings("serial")
public class BankAccountNotFound extends RuntimeException {
	public BankAccountNotFound(String exception) {
        super(exception);

}
}