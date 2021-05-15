package testcases;
import static org.junit.Assert.*;

import org.junit.Test;

import pizzaplacestore.Pizza;
import pizzaplacestore.Topping;

public class CorrectTestCases {

	//validating the toString method of the pizza classes with different pizza types
	@Test
	public void validatingToString() {
		Pizza pizza=new Pizza("Thin","Small");
		assertEquals("Small Thin-Crust pizza, with Price: $5.50",pizza.toString());		
		
		pizza=new Pizza("Thick","Small");
		assertEquals("Small Thick-Crust pizza, with Price: $7.70",pizza.toString());
		
		pizza=new Pizza("Thin","Small");
		pizza.setSauce(new Topping("tomato-paste sauce",1));
		assertEquals("Small Thin-Crust pizza, with tomato-paste sauce, Price: $6.50",pizza.toString());			
	}
	
	@Test
	public void validatingSetSauce() {
		Pizza pizza=new Pizza("Thin","Small");
		pizza.setSauce(new Topping("tomato-paste sauce",1));
		assertEquals("Small Thin-Crust pizza, with tomato-paste sauce, Price: $6.50",pizza.toString());		
	}
	
	@Test
	public void validatingAddTopping() {
		Pizza pizza=new Pizza("Thin","Small");
		pizza.addTopping(new Topping("Chicken",2.0));
		assertEquals(pizza.getToppingCount(),1);
	}

}
