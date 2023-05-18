package com.braindata.bankmanagement.service;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;

public class Sbi {
	Scanner sc = new Scanner(System.in);

	Account acc[] = new Account[2];

	public void createAccount() {

		for (int i = 0; i < acc.length; i++) {
			Account account = new Account();

			System.out.println("Enter Your Account Number ");
			account.setAccount(sc.nextInt());

			System.out.println("Enter Your Name");
			account.setName(sc.next());

			System.out.println("Enter Your Mobile number");
			account.setMobno(sc.nextLong());

			System.out.println("Enter Your Address");
			account.setAddress(sc.next());

			System.out.println("Enter Your Gender");
			account.setGender(sc.next());

			System.out.println("Enter Your Adhar");
			account.setAdharno(sc.nextLong());

			System.out.println("Enter Your Age");
			account.setAge(sc.nextInt());

			System.out.println("Enter Your Balance");
			account.setBalance(sc.nextDouble());

			acc[i] = account;

		}

	}

	public void displayAllDetails() {
		/*
		 * for (Account aa : acc) { System.out.println(aa); }
		 */

		for (int i = 0; i < acc.length; i++) {
			Account c = acc[i];
			System.out.println("Account ");
			System.out.println("Account Number =" + c.getAccount());
			System.out.println("Applicant  Name =" + c.getName());
			System.out.println("Applicant Address =" + c.getAddress());
			System.out.println("Applicant Mobile number =" + c.getMobno());
			System.out.println("Applicant Gender =" + c.getGender());
			System.out.println("Applicant Adhar Number =" + c.getAdharno());
			System.out.println("Applicant Age =" + c.getAge());
			System.out.println("Applicant Account Balance =" + c.getBalance());

		}
	}

	public void deposite() {
		System.out.println("Enter Account Number to Deposite Money");
		int accountno = sc.nextInt();
		for (int i = 0; i < acc.length; i++) {
			Account c = acc[i];

			if (accountno == c.getAccount()) {

				System.out.println("Enter Money For Deposite");
				double dMoney = sc.nextDouble();
				double upadatedMoney = c.getBalance() + dMoney;
				c.setBalance(upadatedMoney);

				break;
			} else {
				System.out.println("Enter Correct Account Number");
				break;
			}
		}
		
	}

	public void withdrwal() {
		System.out.println("Enter Account Number to Withdrawal Money");
		int accountno = sc.nextInt();
		for (int i = 0; i < acc.length; i++) {
			Account c = acc[i];

			if (accountno == c.getAccount()) {

				System.out.println("Enter Amount for Withdrawal");

				double wMoney = sc.nextDouble();
				double newBalance = c.getBalance() - wMoney;

				c.setBalance(newBalance);
				break;
			} else {
				System.out.println("Enter Correct Account Number");
				break;
			}
		}
	}

	public void checkMoney() {
		System.out.println("Enter Account Number to Check Money");
		String s="Enter Corect Account no.";
		int accountno = sc.nextInt();
		for (int i = 0; i < acc.length; i++) {
			Account c = acc[i];

			if (accountno == c.getAccount()) {
				System.out.print("Balance is   ");
				System.out.println(c.getBalance());
				break;

			} else {
				System.out.println(s);
				break;
			}
		}
	}
}
