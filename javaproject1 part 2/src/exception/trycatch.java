package exception;

import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number to divide");
		Scanner sc = new Scanner(System.in);
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		try {
			int o=x/y;
			System.out.println("divsion "+o);	
			
		}catch(Exception e){
			System.out.println("Caught u");	

			
		}finally {
			System.out.println("Finally");	

			
			
		}
		
		
		

	}

}
