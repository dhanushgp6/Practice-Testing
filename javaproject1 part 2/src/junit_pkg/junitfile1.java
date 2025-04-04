package junit_pkg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitfile1 {
	
	@BeforeClass
	public static void beforeclass() {
		System.out.println("before class");
			}
	@AfterClass
	public static void afterclass() {
		System.out.println("@AfterClass");
			}
	@Before
	public void before() {
		System.out.println("@BeforeClass");
			}
	@After
	public void after() {
		System.out.println("before class");
			}
	@Test
	public void test1() {
		System.out.println("before class");
			}
	@Test
	public void test2() {
		System.out.println("before class");
			}
	

	
}
