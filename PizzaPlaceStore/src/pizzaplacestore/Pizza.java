package pizzaplacestore;


public class Pizza {
	private String crust;
	private String size;
	private Topping sauce;
	private Topping toppings[];
	
	/**
	 * To create pizza with crust and size
	 * */
	public Pizza(String crust, String size) {
		this.crust = crust;
		this.size = size;
		toppings=new Topping[7];
		sauce=null;
	}
	
	//to return pizza crust 
	public String getCrust() {
		return crust;
	}
	
	//to set pizza crust
	public void setCrust(String crust) {
		this.crust = crust;
	}
	
	//to get pizza size
	public String getSize() {
		return size;
	}
	//to set pizza size
	public void setSize(String size) {
		this.size = size;
	}
	
	//to set pizza sauce
	public Topping getSauce() {
		return sauce;
	}
	
	//to get pizza sauce
	public void setSauce(Topping sauce) {
		this.sauce = sauce;
	}
	
	//to add toppings to the pizza
	public boolean addTopping(Topping topping) {
		
		for(int i=0;i<toppings.length;i++) {
			if(toppings[i]==null) {
				toppings[i]=topping;
				return true;
			}
		}
		return false;
	}
	
	
	/*
	 * To get the number of topping added
	 * */
	public int getToppingCount() {
		int count=0;
		if(sauce!=null) {
			count++;
		}
		for(Topping topping:toppings) {
			if(topping!=null) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * To return string representation of the pizza
	 * */
	
	public String toString() {
		StringBuffer details=new StringBuffer("");
		double total=0;
		if(size.equalsIgnoreCase("small")) {
			details.append("Small");
			total=5.50;
		}else if(size.equalsIgnoreCase("large")) {
			details.append("Large");
			total=13.70;
		}else if(size.equalsIgnoreCase("medium")) {
			details.append("Medium");
			total=9.10;
		}
		if(crust.equalsIgnoreCase("Thick")) {
			details.append(" Thick-Crust pizza, ");
			total+=2.20;
		}else {
			details.append(" Thin-Crust pizza, ");
		}
		details.append("with ");
		if(sauce!=null) {
			details.append(sauce.getName()+", ");
			total+=sauce.getCharge();
		}
		for(Topping topping:toppings) {
			if(topping!=null) {
				details.append(topping.getName()+", ");
				total+=topping.getCharge();
			}
		}
		
		details.append("Price: $"+String.format("%.2f", total));
		return details.toString();
		
	}

	
}
