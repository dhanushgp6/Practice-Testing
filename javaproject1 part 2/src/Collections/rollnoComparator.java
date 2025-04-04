package Collections;

import java.util.Comparator;

public class rollnoComparator implements Comparator<student2>{
	
	public int compare(student2 s1,student2 s2) {
		
		return s1.id-s2.id;
		
	}
	
	

}
