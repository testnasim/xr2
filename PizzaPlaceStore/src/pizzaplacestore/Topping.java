package pizzaplacestore;

/**
 * The toppings added to the pizza
 * */

public class Topping {
		//to store topping name and charge
		private String name;
		private double charge;		
		
		/**
		 * Constructor to create topping with name and charge
		 * */		
		public Topping(String name, double charge) {
			this.name = name;
			this.charge = charge;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getCharge() {
			return charge;
		}
		public void setCharge(double charge) {
			this.charge = charge;
		}
		
		
}
