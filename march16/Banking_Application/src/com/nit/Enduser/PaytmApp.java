package com.nit.Enduser;

import java.util.Arrays;
import java.util.Scanner;

import com.nit.Exceptions.InsufficientBalanceException;
import com.nit.Exceptions.InvalidInputException;
import com.nit.Exceptions.InvalidPasswordException;
import com.nit.Exceptions.InvalidUsernameException;
import com.nit.implementation.ICICI;
import com.nit.implementation.PNB;
import com.nit.implementation.SBI;
import com.nit.requirement.RBI;

public class PaytmApp {

	public static void main(String[] args) {
		UserInfo info = null;
		UserNameAndPwd identity = null;
		RBI account = null;
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("===============================");
		System.out.println("Enter sbi  to perform SBI Operation");
		System.out.println("Enter icici to perform ICICI Operation");
		System.out.println("Enter  pnb to perform PNB Operation");
		System.out.println("===============================");
		System.out.println("Enter you choice");
		String choice = sc.next();

		switch (choice) {
		case "sbi":
			while (true) {
				System.out.println("-----------------------------------");
				System.out.println("Press 1 for creating the account");
				System.out.println("Press 2 for performing deposite operation");
				System.out.println("Press 3 for performing wihtdraw operation");
				System.out.println("Press 4 for view the balance");
				System.out.println("Press 5 for view the account detail ");
				System.out.println("Press 6 for exit");
				System.out.println("------------------------------------");
				System.out.println("Enter the option to perform operation");
				int option = sc.nextInt();
				if (option == 1) {
					if (flag == false) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the username for account");
						String uname = sc.next();
						System.out.println("Enter the password for account");
						String password = sc.next();
						System.out.println("Enter the Customer name");
						String customer_Name = sc.next();
						System.out.println("Enter the Customer adhar Number");
						String adhar_No = sc.next();
						System.out.println("Enter the Customer mobile Number");
						String mobile_No = sc.next();
						System.out.println("Enter the balance for creating the account");
						double balance = sc.nextDouble();
						System.out.println("--------------------------------------");
						info = new UserInfo(customer_Name, adhar_No, mobile_No, balance);
						identity = new UserNameAndPwd(uname, password);
						account = new SBI(info, identity);
						flag = true;
						System.out.println("ACCOUNT CREATED!!!!");
					} else {
						System.out.println("Already you have the account");
					}
				} else if (option == 2) {
					if (flag == true) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the amount to be added in the account");
						double amount = sc.nextDouble();
						try {
							account.deposit(amount);
						} catch (InvalidInputException e) {
							System.err.println(e.getMessage());
						}

					} else {
						System.err.println("CREATE THE ACCOUNT");
					}
					System.out.println("-----------------------------------");
				} else if (option == 3) {
					if (flag == true) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the amount to withdraw from the account");
						double amount = sc.nextDouble();
						try {
							account.withdraw(amount);
						} catch (InvalidInputException | InsufficientBalanceException e) {
							System.err.println(e.getMessage());
						}
					} else {
						System.err.println("CREATE THE ACCOUNT");
					}
					System.out.println("-----------------------------------");
				} else if (option == 4) {
					if (flag == true) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the username for seeing the balance");
						String uname = sc.next();
						System.out.println("Enter the password for seeing the balance");
						String password = sc.next();
						try {
							account.checkBalance(uname, password);
						} catch (InvalidUsernameException e) {
							System.err.println(e.getMessage());
						} catch (InvalidPasswordException e) {
							System.err.println(e.getMessage());
						}

					} else {
						System.err.println("CREATE THE ACCOUNT");
					}
				} else if (option == 5) {
					if(flag==true) { 
						System.out.println("-----------------------------------");
						System.out.println("Enter the username for seeing the balance");
						String uname = sc.next();
						System.out.println("Enter the password for seeing the balance");
						String password = sc.next();
						try {
							String acc[]=account.viewDetails(uname, password);
							System.out.println(Arrays.toString(acc));
						} catch (InvalidUsernameException | InvalidPasswordException e) {
							System.err.println(e.getMessage());
						}
					}
					else {
						 System.err.println("CREATE ACCOUNT");
					}
				} 
				else if(option==6) {
					System.out.println("Thanks for using SBI BANK Visit Again but AFTER LUNCH!!!!");
					System.exit(1);
				}
				else {
					System.out.println("Invalid Input");
				}
			}
		case "icici":
			while (true) {
				System.out.println("-----------------------------------");
				System.out.println("Press 1 for creating the account");
				System.out.println("Press 2 for performing deposite operation");
				System.out.println("Press 3 for performing wihtdraw operation");
				System.out.println("Press 4 for view the balance");
				System.out.println("Press 5 for view the account detail ");
				System.out.println("Press 6 for exit");
				System.out.println("------------------------------------");
				System.out.println("Enter the option to perform operation");
				int option = sc.nextInt();
				if (option == 1) {
					if (flag == false) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the username for account");
						String uname = sc.next();
						System.out.println("Enter the password for account");
						String password = sc.next();
						System.out.println("Enter the Customer name");
						String customer_Name = sc.next();
						System.out.println("Enter the Customer adhar Number");
						String adhar_No = sc.next();
						System.out.println("Enter the Customer mobile Number");
						String mobile_No = sc.next();
						System.out.println("Enter the balance for creating the account");
						double balance = sc.nextDouble();
						System.out.println("--------------------------------------");
						info = new UserInfo(customer_Name, adhar_No, mobile_No, balance);
						identity = new UserNameAndPwd(uname, password);
						account = new ICICI(info, identity);
						flag = true;
						System.out.println("ACCOUNT CREATED!!!!");
					} else {
						System.out.println("Already you have the account");
					}
				} else if (option == 2) {
					if (flag == true) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the amount to be added in the account");
						double amount = sc.nextDouble();
						try {
							account.deposit(amount);
						} catch (InvalidInputException e) {
							System.err.println(e.getMessage());
						}

					} else {
						System.err.println("CREATE THE ACCOUNT");
					}
					System.out.println("-----------------------------------");
				} else if (option == 3) {
					if (flag == true) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the amount to withdraw from the account");
						double amount = sc.nextDouble();
						try {
							account.withdraw(amount);
						} catch (InvalidInputException | InsufficientBalanceException e) {
							System.err.println(e.getMessage());
						}
					} else {
						System.err.println("CREATE THE ACCOUNT");
					}
					System.out.println("-----------------------------------");
				} else if (option == 4) {
					if (flag == true) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the username for seeing the balance");
						String uname = sc.next();
						System.out.println("Enter the password for seeing the balance");
						String password = sc.next();
						try {
							account.checkBalance(uname, password);
						} catch (InvalidUsernameException e) {
							System.err.println(e.getMessage());
						} catch (InvalidPasswordException e) {
							System.err.println(e.getMessage());
						}

					} else {
						System.err.println("CREATE THE ACCOUNT");
					}
				} else if (option == 5) {
					if(flag==true) { 
						System.out.println("-----------------------------------");
						System.out.println("Enter the username for seeing the balance");
						String uname = sc.next();
						System.out.println("Enter the password for seeing the balance");
						String password = sc.next();
						try {
							String acc[]=account.viewDetails(uname, password);
							System.out.println(Arrays.toString(acc));
						} catch (InvalidUsernameException | InvalidPasswordException e) {
							System.err.println(e.getMessage());
						}
					}
					else {
						 System.err.println("CREATE ACCOUNT");
					}
				} 
				else if(option==6) {
					System.out.println("Thanks for using ICICI BANK Visit Again !!!!");
					System.exit(1);
				}
				else {
					System.out.println("Invalid Input");
				}
			}
			
			
		case "pnb":
			while (true) {
				System.out.println("-----------------------------------");
				System.out.println("Press 1 for creating the account");
				System.out.println("Press 2 for performing deposite operation");
				System.out.println("Press 3 for performing wihtdraw operation");
				System.out.println("Press 4 for view the balance");
				System.out.println("Press 5 for view the account detail ");
				System.out.println("Press 6 for exit");
				System.out.println("------------------------------------");
				System.out.println("Enter the option to perform operation");
				int option = sc.nextInt();
				if (option == 1) {
					if (flag == false) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the username for account");
						String uname = sc.next();
						System.out.println("Enter the password for account");
						String password = sc.next();
						System.out.println("Enter the Customer name");
						String customer_Name = sc.next();
						System.out.println("Enter the Customer adhar Number");
						String adhar_No = sc.next();
						System.out.println("Enter the Customer mobile Number");
						String mobile_No = sc.next();
						System.out.println("Enter the balance for creating the account");
						double balance = sc.nextDouble();
						System.out.println("--------------------------------------");
						info = new UserInfo(customer_Name, adhar_No, mobile_No, balance);
						identity = new UserNameAndPwd(uname, password);
						account = new PNB(info, identity);
						flag = true;
						System.out.println("ACCOUNT CREATED!!!!");
					} else {
						System.out.println("Already you have the account");
					}
				} else if (option == 2) {
					if (flag == true) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the amount to be added in the account");
						double amount = sc.nextDouble();
						try {
							account.deposit(amount);
						} catch (InvalidInputException e) {
							System.err.println(e.getMessage());
						}

					} else {
						System.err.println("CREATE THE ACCOUNT");
					}
					System.out.println("-----------------------------------");
				} else if (option == 3) {
					if (flag == true) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the amount to withdraw from the account");
						double amount = sc.nextDouble();
						try {
							account.withdraw(amount);
						} catch (InvalidInputException | InsufficientBalanceException e) {
							System.err.println(e.getMessage());
						}
					} else {
						System.err.println("CREATE THE ACCOUNT");
					}
					System.out.println("-----------------------------------");
				} else if (option == 4) {
					if (flag == true) {
						System.out.println("-----------------------------------");
						System.out.println("Enter the username for seeing the balance");
						String uname = sc.next();
						System.out.println("Enter the password for seeing the balance");
						String password = sc.next();
						try {
							account.checkBalance(uname, password);
						} catch (InvalidUsernameException e) {
							System.err.println(e.getMessage());
						} catch (InvalidPasswordException e) {
							System.err.println(e.getMessage());
						}

					} else {
						System.err.println("CREATE THE ACCOUNT");
					}
				} else if (option == 5) {
					if(flag==true) { 
						System.out.println("-----------------------------------");
						System.out.println("Enter the username for seeing the balance");
						String uname = sc.next();
						System.out.println("Enter the password for seeing the balance");
						String password = sc.next();
						try {
							String acc[]=account.viewDetails(uname, password);
							System.out.println(Arrays.toString(acc));
						} catch (InvalidUsernameException | InvalidPasswordException e) {
							System.err.println(e.getMessage());
						}
					}
					else {
						 System.err.println("CREATE ACCOUNT");
					}
				} 
				else if(option==6) {
					System.out.println("Thanks for using PNB BANK Visit Again !!!!");
					System.exit(1);
				}
				else {
					System.out.println("Invalid Input");
				}
			}
		
		default:
			System.out.println("You entered wrong input.");

		}

	}
}


