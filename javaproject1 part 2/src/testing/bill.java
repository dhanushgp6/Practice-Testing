package testing;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class bill{
	
	
	
	
	public static int display(HashMap<Integer,product> last){
	System.out.println("Id| productname | Brand |Price | Quantity");
	int theunit ;
	int total6=0;
	for(Entry<Integer,product> e: last.entrySet()) {
		
		product p=e.getValue();
		theunit=p.quantity;		
		total6+=p.price*theunit;
		
		
		

	}
	
	System.out.println("Your  bill is "+total6);
	return total6;
	}
	public static int displaybill(HashMap<Integer,product> last,int total){
		int discount = 0;
	if(total>25000) {
		
		discount=(20*total)/100;
		total=total-discount;
		
	}else if(total>15000 && total<25000) {
		
		discount=(10*total)/100;
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




	
	
return total;
}
}