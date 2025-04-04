package testing;

import static org.junit.Assert.*;

import java.util.HashMap;

import testing.flipkart;
import testing.product;

import org.junit.Assert;
import org.junit.Test;
import testing.bill;

public class flipkart_test{
	int newid=2;
	
	product po1=new product(1,"s24",10000,"samsung",1);

	product po2=new product(2,"s24",10000,"samsung",1);

	product po3=new product(3,"s24",10000,"samsung",1);

	product po4=new product(4,"s24",10000,"samsung",1);

	

	@Test
	public void test() {
		HashMap<Integer,product> las=new HashMap<Integer,product>();
		las.put(po1.id,po1);
		las.put(po2.id,po2);
		las.put(po3.id,po3);
		las.put(po4.id,po4);
		int thetotal=bill.display(las);
		assertEquals(thetotal,40000);
		
	}

}
