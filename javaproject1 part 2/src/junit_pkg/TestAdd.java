package junit_pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void testSum() {
		add_num obj= new add_num();
		int i,j;
		i=9;j=10;
		System.out.println("in tesyong add");
		assertEquals(i+10,obj.sum(i, j));
		
		
		
	}

}
