package Collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class bill extends flipkart {
	
	
	
	static double discount=0;
	public static void display(){
	System.out.println("Id| productname | Brand |Price | Quantity");
	int theunit ;
	for(Entry<Integer,product> e: last.entrySet()) {
		product p=e.getValue();
		theunit=p.quantity;		
		total+=p.price*theunit;
		if(p.id==10 && theunit>=3) {
			discount=0.10*total;
			total-=discount;
		}
		
		

	}
	System.out.println("Your  bill is "+total);
	
	if(total>25000) {
		
		discount=0.20*total;
		total=total-discount;
		
	}else if(total>15000 && total<25000) {
		
		discount=0.10*total;
		total=total-discount;

		
	}
	

	System.out.println("Your total discount "+discount);
	System.out.println(" total bill after discont "+total);
	System.out.println("Do u Wanna Buy?");
	Scanner sc = new Scanner(System.in);
	boolean decision;
	decision=sc.nextBoolean();
	
	
	if(decision==true) {
		System.out.println("Product purschaed and paid");	
		System.out.println("Id| productname | brand | Price | avaible" );
		for(Entry<Integer,product> e:last.entrySet()) {
			product p=e.getValue();
			System.out.println(p.id+" | "+ p.pname+ " | "+p.brand+  " | "+p.price+ " | "+p.quantity );
		}
		System.out.println(" total discount "+discount);
		System.out.println(" total bill "+total);
		
		
		
	}else {
		for(Entry<Integer,product> e:last.entrySet()) {
			product y=e.getValue();
			for(Entry<Integer,product> f:last.entrySet()) {
				product z=f.getValue();
				if(y.id==z.id) {
					y.quantity+=z.quantity;					
				}
			}		
		}
		
		System.out.println("Go Home");
		
		
	}
total=0;
discount=0;
	



	
	

}
}