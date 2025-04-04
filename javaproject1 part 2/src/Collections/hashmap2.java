package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,student> hk=new HashMap<Integer,student>();
		
		student s1=new student("dhansuh",10,23,25);

		student s2=new student("yess",11,23,25);

		student s3=new student("hello",12,23,25);

		hk.put(s1.id,s1);

		hk.put(s2.id,s2);

		hk.put(s3.id,s3);

		for(Entry<Integer, student> e: hk.entrySet()) {
			student s=e.getValue();
			System.out.println(e.getKey()+ " "+ s.mark1);
			
		}
		

		
	}

}
