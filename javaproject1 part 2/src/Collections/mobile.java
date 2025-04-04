package Collections;

import java.util.ArrayList;

public class mobile {
	String brand;
	String model;
	int price,ram;

	public mobile(String brand,String model,int ram,int price){
		this.brand=brand;
		this.model=model;
		this.price=price;		
		this.ram=ram;
	}
	public static void details(mobile s) {
		System.out.println(s.brand+" "+s.model+" "+s.price+" "+s.ram);
		
	}
	public static void find(String name,ArrayList<mobile> mb) {
		for(mobile s : mb) {
			if(s.brand==name) {
				System.out.println(s.brand+" "+s.price+" "+s.model );
				
			}
			
			
		}
		
	}

}
