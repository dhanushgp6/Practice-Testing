package Collections;

import java.util.ArrayList;

public class mobile_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<mobile> mb=new ArrayList<mobile>();
		mb.add(new mobile("samsung","s4",6,20000));
		
		mb.add(new mobile("samsung","s8",8,20000));

		mb.add(new mobile("one plus","s4",12,15000));

		mb.add(new mobile("iphone","s4",4,10000));

		mb.add(new mobile("nokia","s4",9,80000));
		
		mb.add(new mobile("poko","s4",16,50000));

		mb.add(new mobile("iqoo","s4",32,30000));
		
		mobile.find("poko",mb);
		
		ramprice.display_mobile_details(8,30000,mb);


		
		
		
		
		
		
		
		
		
	}

}
