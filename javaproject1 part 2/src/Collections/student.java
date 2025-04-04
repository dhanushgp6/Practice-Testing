package Collections;

public class student {
	String name;
	int id;
	int mark1;
	int mark2;
	int average;
	public student(String name, int id, int mark1,int mark2) {
		this.id=id;
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;		
	}
	
	

	int average(){
		average=(mark1+mark2)/2;
		System.out.println("The average marks scored by "+name+" is "+average);


		return average;	
	}
	
	String getname() {
		return name;
		
		
	}
	
	}
