package com.nit.implementation;

import com.nit.Enduser.UserInfo;
import com.nit.Enduser.UserNameAndPwd;
import com.nit.Exceptions.InsufficientBalanceException;
import com.nit.Exceptions.InvalidInputException;
import com.nit.Exceptions.InvalidPasswordException;
import com.nit.Exceptions.InvalidUsernameException;
import com.nit.requirement.RBI;

public class ICICI implements RBI{
	private UserInfo info;
	private UserNameAndPwd identity;

	public ICICI(UserInfo info, UserNameAndPwd identity) {
		super();
		this.info = info;
		this.identity = identity;
	}

	public ICICI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfo getInfo() {
		return info;
	}

	public void setInfo(UserInfo info) {
		this.info = info;
	}

	public UserNameAndPwd getIdentity() {
		return identity;
	}

	public void setIdentity(UserNameAndPwd identity) {
		this.identity = identity;
	}

	@Override
	public String toString() {
		return "ICICI [info=" + info + ", identity=" + identity + "]";
	}

	@Override
	public void deposit(double amount) throws InvalidInputException {
		if (amount <= 0) {
			throw new InvalidInputException("can't able to deposite zero or -ve amount create your own bank for this");
		} else {
			info.setBalance(info.getBalance() + amount);
			System.out.println("Money deposited succesfully!!!!!!!");
		}

	}

	@Override
	public void withdraw(double amount) throws InvalidInputException, InsufficientBalanceException {
		if (amount <= 0) {
			throw new InvalidInputException(
					"\"can't able to withdraw zero or -ve amount create your own bank for this");
		} else if (amount > info.getBalance()) {
			throw new InsufficientBalanceException("Insufficient balance");
		} else {
			info.setBalance(info.getBalance() - amount);
			System.out.println("Withdraw Completed!!!!!!!");
		}

	}

	@Override
	public void checkBalance(String username, String password)
			throws InvalidUsernameException, InvalidPasswordException {
		if (identity.getUserName().equalsIgnoreCase(username) && identity.getPassword().equals(password)) {
			System.out.println("---------------------------------------");
			System.out.println("THE CURRENT BALANCE  :" + info.getBalance());
			System.out.println("---------------------------------------");
		} else if (!identity.getUserName().equalsIgnoreCase(username)) {
			throw new InvalidUsernameException("wrong username");
		} else if (!identity.getPassword().equals(password)) {
			throw new InvalidPasswordException("Wrong password");
		}

	}

	@Override
	public String[] viewDetails(String username, String password)
			throws InvalidUsernameException, InvalidPasswordException {
		String info1=null;
		String identity1=null;
		if (identity.getUserName().equalsIgnoreCase(username) && identity.getPassword().equals(password)) {
			 info1=info.toString();
		     identity1= identity.toString();
			
		} else if (!identity.getUserName().equalsIgnoreCase(username)) {
			throw new InvalidUsernameException("wrong username");
		} else if (!identity.getPassword().equals(password)) {
			throw new InvalidPasswordException("Wrong password");
		}
		
		 return new String[ ] {info1,identity1};
	}

	
}
