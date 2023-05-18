package com.braindata.bankmanagement.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.braindata.bankmanagement.service.Sbi;

public class Test {

	public static void main(String[] args) {

		Sbi sbi = new Sbi();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(
					" 1.CreateAccount \n 2.Display AccountDetails \n 3.WithdralL \n 4.Deposite \n 5. che1ck Money \n 6.Exit");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				sbi.createAccount();
				break;
			case 2:
				sbi.displayAllDetails();
				break;
			case 3:
				sbi.withdrwal();
				break;
			case 4:
				sbi.deposite();
				break;
			case 5:
				sbi.checkMoney();
				break;
			case 6:
				System.out.println("Thank You !! Visit Again");
				System.exit(0);
				break;
			default:
				System.out.println("Choice correct Option");
			}

		}
	}
}