package com.nit.requirement;

import com.nit.Exceptions.InsufficientBalanceException;
import com.nit.Exceptions.InvalidInputException;
import com.nit.Exceptions.InvalidPasswordException;
import com.nit.Exceptions.InvalidUsernameException;

public interface RBI{
	
	void deposit(double amount) throws InvalidInputException;
	void withdraw(double amount) throws InvalidInputException,InsufficientBalanceException;
	void checkBalance(String username,String password) throws InvalidUsernameException,InvalidPasswordException;
	String[] viewDetails(String username,String password) throws InvalidUsernameException,InvalidPasswordException;



}
