package oops;

import java.util.Scanner;

public class bank_main {

public static void main(String[] args) {
		
		System.out.println("Enter the details:");
		Scanner sc= new Scanner(System.in);
		String name;
		System.out.println("Enter name");
		
		name=sc.nextLine();
		System.out.println("Enter account number\naccount balance:");
		int[] arr=new int[2];
		for(int i=0;i<2;i++) {
			arr[i]=sc.nextInt();			
		}
		
		
		
		bank_acc name2 = new bank_acc(arr[0],name,arr[1]);
		name2.details();

		
	}
	

}
