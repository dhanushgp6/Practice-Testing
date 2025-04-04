package polymorphism;

public class car extends vechile {
	
	@Override
	public void start() {
		
		System.out.println("car starts");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car cr =new car();
		cr.start();
		vechile vc=new vechile();
		vc.start();
		
		
	}

}
