package Collections;

import java.util.ArrayList;

public class range {
	
	public static void display_mobile_details(int price1,int price2,ArrayList<mobile> mb) {
		for(mobile s :mb) {
			if (s.price<price2 && s.price>price1) {
				System.out.println(s.brand);
				
			}
			
		}
		
		
	}

}
