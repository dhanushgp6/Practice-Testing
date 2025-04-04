package Collections;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList s=new ArrayList ();
		s.add("sdsd");
		s.add("apple");
		s.add(548);
		String ol=(String) s.get(2);
		s.add(0,"string");
		System.out.println(s);
		int oo=s.size();
		System.out.println(oo);
		s.clear();
		System.out.println(s);


		
		
		
		
		
	}

}
