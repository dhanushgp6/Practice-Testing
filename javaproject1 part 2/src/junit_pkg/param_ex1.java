package junit_pkg;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class param_ex1 {
	
	private int num1,num2,expected_op;
	public param_ex1(int num1,int num2,int expected_op) {
		this.num1=num1;
		this.num2=num2;
		this.expected_op=expected_op;		
	}
	
	@Parameterized.Parameters
	public static List<Object[]> data(){
		System.out.println("In data method");
		Object b[][] =new Object[][] {
			{1,2,3},{4,5,9},{7,8,15}
			
		};
		List<Object[]> c=Arrays.asList(b);
		return c;
		
	}
	
	public int sum(int a,int b) {
		int c=a+b;
		System.out.println("In sum");
		return c;
	}
	

	@Test
	public void test() {
		System.out.println("num1"+num1+"num2"+num2+"expected_op"+expected_op);
		assertEquals(expected_op,sum(num1,num2));
	}

}
