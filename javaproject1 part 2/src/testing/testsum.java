package testing;

import static org.junit.Assert.*;

import org.junit.Test;
public class testsum {
	int[] input= {2,6,3,4};

	@Test
	public void test() {
		sum s=new sum();
		int ya=s.getsum(input);
		assertEquals(ya,15);
		System.out.println("in test");
		
		
		
	}

}
