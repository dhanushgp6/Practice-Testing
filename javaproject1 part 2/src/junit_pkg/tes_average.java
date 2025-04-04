package junit_pkg;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class tes_average {
	int a,b,c,d;
	
	public tes_average(int a,int b,int c,int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;		
	}
	
	@Parameterized.Parameters
	public static List<Object[]> data(){
		System.out.println("In data method");
		Object b[][] =new Object[][] {
			{20,30,40,30},{2,2,2,2}			
		};
		List<Object[]> c=Arrays.asList(b);
		return c;
		
	}
	@Test
	public void test1() {
		average av=new average();
		
		assertEquals(b[0].d,av.avg(a, b, c));
	}
}
