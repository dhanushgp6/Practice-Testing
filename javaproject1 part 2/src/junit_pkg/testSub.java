package junit_pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSub {

	@Test
	public void testsub() {
	
		sub_num sub=new sub_num();
		int j,i;
		j=9;i=3;
		assertEquals(j-i,sub.sub(j, i));
		
	}
	
	@Test
	public void testsub2() {
		sub_num s=new sub_num();
		int k,j;
		k=10;j=11;
		assertEquals(30,s.sub(k, j));
		
		
	}

}
