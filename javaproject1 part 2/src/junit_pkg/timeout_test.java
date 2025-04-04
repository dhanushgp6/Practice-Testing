package junit_pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class timeout_test {

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void test1() {
		int arr[]=new int[4];
		arr[5] = 5;
	}
	@Test(expected=ArithmeticException.class)
	public void test2() {
		int b= 7/0;
		
	}
	
}
