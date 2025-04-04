package junit_pkg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class threeclass {
	static int[][] arr=new int[][] {{20,30,40,30},{5,5,5,5}};
	
	int r=-1;
	average av=new average();
	@Before
	public void bf() {
		r=r+1;		
	}	
	@Test
	public void test1() {	
		assertEquals(arr[r][3],av.avg(arr[r][0], arr[r][1], arr[r][2]));
	}
	@Test
	public void test2() {	
		assertEquals(arr[r][3],av.avg(arr[r][0], arr[r][1], arr[r][2]));
	}

}
