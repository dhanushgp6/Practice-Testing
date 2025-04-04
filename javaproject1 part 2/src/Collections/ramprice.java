package Collections;

import java.util.ArrayList;

public class ramprice {
	public static void display_mobile_details(int ram,int price,ArrayList<mobile> mb) {
		for(mobile s :mb) {
			if (s.ram>ram && s.price>price) {
				mobile.details(s);
				
			}
			
		}
		
		
	}

}
