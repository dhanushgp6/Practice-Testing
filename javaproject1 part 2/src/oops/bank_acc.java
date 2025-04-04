package oops;

import java.util.Scanner;

public class bank_acc {
	int no,balance;
	String name;
	
	public bank_acc(int accno, String name, int balance) {
		this.no=accno;
		this.name=name;
		this.balance=balance;	
	}
	
	public void details(){
		System.out.println("Account number :"+ no +" Name :"+ name +" balance :"+ balance);
	}
	
	
	
	
	
	
	
	
}
