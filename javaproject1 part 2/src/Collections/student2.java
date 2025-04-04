package Collections;

public class student2 implements Comparable<student2>{
	
	
	public String sname;
	public int id;
	public int age;
	
	public student2(String sname,int id,int age) {
		
		this.sname=sname;
		this.id=id;
		this.age=age;
			
	}
	
	public void display() {
		System.out.println(sname+" "+id+" "+age);
	}
	@Override
	public int compareTo(student2 s) {
		return this.age-s.age;
		
	}
	
	

}
