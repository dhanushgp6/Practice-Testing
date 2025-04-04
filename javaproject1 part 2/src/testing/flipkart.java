package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class flipkart {
	static HashMap<Integer,product> last= new HashMap<Integer,product>();
	static HashMap<Integer,product> has=new HashMap<Integer,product>();
	static double total=0;
	static double discount=0;
	public static void main(String[] args) {
	product po1=new product(1,"s24",10000,"samsung",20);
	product po2=new product(2,"7",30000,"iphone",20);
	product po3=new product(3,"8",16000,"iphone",20);
	product po4=new product(4,"s21",10000,"samsung",20);
	product po5=new product(5,"v11",10000,"vivo",20);
	product po6=new product(6,"v9",10000,"vivo",20);
	product po7=new product(7,"basic",10000,"nokia",20);
	product po8=new product(8,"10 pro",10000,"nokia",20);
	product po9=new product(9,"king",10000,"nokia",20);
	product po10=new product(10,"tshirt",28000,"Puma",10);
	int theid;
	int theunit;
	Scanner sc=new Scanner(System.in);
	has.put(po1.id,po1);
	has.put(po2.id,po2);
	has.put(po3.id,po3);
	has.put(po4.id,po4);
	has.put(po5.id,po5);
	has.put(po6.id,po6);
	has.put(po7.id,po7);//use for
	has.put(po8.id,po8);
	has.put(po9.id,po9);
	has.put(po10.id,po10);
	System.out.println("===================================================="  );
	System.out.println("Id| productname | brand | Price | avaible"  );
while(true) {
	for(Entry<Integer,product> e: has.entrySet()) {
		product p=e.getValue();
		System.out.println(String.format(e.getKey()+"| "+p.pname+" | "+p.brand+" "+p.price+" | "+p.quantity)  );
		
	}
	System.out.println("enter no of products u wanna buy"  );
	int no;
	no=sc.nextInt();
	for(int i=0;i<no;i++) {
	System.out.println("Enter the product id's u want to buy :"  );
	theid=sc.nextInt();
	System.out.println("Enter the units u want to buy :"  );
	theunit=sc.nextInt();
	for(Entry<Integer,product> e: has.entrySet()) {	
		product g=e.getValue();
		if(e.getKey()==theid) {
			product k=new product(g.id,g.pname,g.price,g.brand,theunit);
			g.quantity-=theunit;
			last.put(theid,k);
			}}		
	}	
	double totals;
	int total1;
	total1=bill.display(last);
	totals=bill.displaybill(last,total1);
	total=0;
	discount=0;
		
	
}
}}
