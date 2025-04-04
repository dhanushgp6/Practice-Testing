package booking;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class ticketbooking extends data {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		data g=new data();
		HashMap<Integer,bus> data2=new HashMap<>();
		g.getdata();
		System.out.println("Rid  ||   from   ||   To   ||   Rem-seats   ||  Cost");
		for(Entry<Integer, bus> e :data1.entrySet()) {
			bus a=e.getValue();
			System.out.println(a.routeid +"  "+a.from1+"  "+a.To1+"  "+a.ReaminingSeats+"  "+a.cost);	
		}
		System.out.println("Enter the id number u wanna buy");
		Scanner sc =new Scanner(System.in);
		int buyid=sc.nextInt();
		System.out.println("Enter the number of tickets u wanna buy");
		int tickets=sc.nextInt();
		int value = 0;
		for(Entry<Integer, bus> e :data1.entrySet()) {
			bus a=e.getValue();
			if(a.routeid==buyid) {
				data2.put(a.routeid,a);	
				value=a.cost;
			}
		}	
		
		int total=tickets*value;
		System.out.println("=====================================================");
		System.out.println("YOUR BILL");
		for(Entry<Integer, bus> e :data2.entrySet()) {
			bus a=e.getValue();
			System.out.println(a.routeid +"  "+a.from1+"  "+a.To1+"  "+tickets+"  "+a.cost);
			
		}
		System.out.println("Your Toal Amount:-"+total);
		System.out.println("=====================================================");
		
		data.putdata(buyid, tickets);
		
				
			
	}
}
