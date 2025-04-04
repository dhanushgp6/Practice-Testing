package exception;

public class exception2 {
	public static void main(String[] args) {
	
	int a=2,b=0;
	int[] arr=new int[10];
	try{
		
		arr[15]=34;
		
		
	}catch(ArrayIndexOutOfBoundsException f) {
		System.out.println("array Exception");		

		
	}finally {
		
		System.out.println("Fianlly");		

	}
	try{
		int c=a/b;}
	catch(ArithmeticException e){
		System.out.println("Arithmatic Exception");			
	}
	
	
	}

}
