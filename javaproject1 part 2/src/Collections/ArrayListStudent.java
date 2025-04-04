package Collections;

import java.util.ArrayList;

public class ArrayListStudent {
	
	public static void main(String[] args) {
	
	
	ArrayList<student> stu=new ArrayList<student>();
	student s1= new student("ram",2,3,4);

	student s2= new student("krishna",2,3,4);
	
	stu.add(new student("yo",2,7,9));
	stu.add(s2);
	stu.add(s1);
	System.out.println(stu.get(0).name);
	

	
	
	}

}
