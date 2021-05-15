package testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pizzaplacestore.Pizza;
import pizzaplacestore.Topping;

public class IncorrectTestCases {
	
	//the test case fails as Small and Thin are in captical case in output always
	@Test
	public void validatingToString() {
		Pizza pizza=new Pizza("thin","small");
		assertEquals("small thin-Crust pizza, with Price: $5.50",pizza.toString());		
	}
	
	
	//the test case will fail as we added 1 topping and expecting count of 2
	@Test
	public void validatingAddTopping() {
		Pizza pizza=new Pizza("Thin","Small");
		pizza.addTopping(new Topping("Chicken",2.0));
		assertEquals(pizza.getToppingCount(),2);
	}
}
