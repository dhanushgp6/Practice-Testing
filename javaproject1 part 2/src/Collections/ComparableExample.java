package Collections;
import java.util.*;
public class ComparableExample {
	
	public static void main(String[] args) {
		
		List<student2> std_list=new ArrayList<student2>();
		std_list.add(new student2("dhanush",12,21));
		student2 s2=new student2("krishna",34,32);
		std_list.add(s2);
		std_list.add(new student2("anil",16,91));
		
		for (student2 s: std_list) {
			System.out.println(s.sname+" "+s.id+" "+s.age);
		
		}
		
		Collections.sort(std_list);
		for (student2 s: std_list) {
			System.out.println(s.sname+" "+s.id+" "+s.age);
		
		}
		Collections.sort(std_list,new nameComparable());
		for (student2 s: std_list) {
			System.out.println(s.sname+" "+s.id+" "+s.age);
		
		}
		Collections.sort(std_list,new rollnoComparator());
		for (student2 s: std_list) {
			System.out.println(s.sname+" "+s.id+" "+s.age);
		
		}
		
		

		
		
	}
	
	
	
	
	

}
