
package pizzaplacestore;

import java.util.Scanner;

public class Application {

	
	public static void main(String args[]) {
		
		System.out.println("****************************************");
		System.out.println("Pizza Place");
		System.out.println("****************************************");
		boolean close=false;
		Scanner scan=new Scanner(System.in);
		while(!close) {
				String crust="",size="";
				System.out.println("Order Pizza");
				System.out.println("Pizza Type:");
				System.out.println("1) Thin crust");
				System.out.println("2) Thick crust extra $2.20");
				switch(scan.nextInt()) {
					case 1: crust="Think";
							break;
					
					case 2: crust="Thick";
							break;
				}
				if(crust.equals("")) {
					System.out.println("Invalid choice");
					continue;
				}
				System.out.println("Size:");
				System.out.println("1) Small $5.50");
				System.out.println("2) Medium $9.10");
				System.out.println("3) Large $13.70");
				switch(scan.nextInt()) {
					case 1: size="Small";
							break;
					
					case 2: size="Medium";
							break;
					
					case 3: size="Large";
							break;
				}
				if(size.equals("")) {
					System.out.println("Invalid choice");
					continue;
				}
				//creating pizza object
				Pizza pizza=new Pizza(crust,size);
				System.out.println("Sauce:");
			
				System.out.println("1) Tomato-paste  $1.0");
				System.out.println("2) Barbeque $1.8");
				System.out.println("3) No Sauce");
				switch(scan.nextInt()) {
					case 1: pizza.setSauce(new Topping("tomato-paste sauce",1));
							break;
					
					case 2: pizza.setSauce(new Topping("barbeque sauce",1.80));
							break;
					default: 
							System.out.println("No sauce set for pizza!");
				}
				
				
					
				for(int i=0;i<3;i++) {
					System.out.println("Add meat topping");				
					System.out.println("1) Ham  $0.50");
					System.out.println("2) Salami $0.50");
					System.out.println("3) Bacon $0.90");
					System.out.println("4) Chicken $2.00");
					System.out.println("5) Shrimp $1.40");
					System.out.println("6) Add Extra Toppings");	
					int option=scan.nextInt();
					if(option>=6) {
						break;
					}
					switch(option) {
						case 1: pizza.addTopping(new Topping("ham",0.50));break;
						case 2: pizza.addTopping(new Topping("salami",0.50));break;
						case 3: pizza.addTopping(new Topping("bacon",0.90));break;
						case 4: pizza.addTopping(new Topping("chicken",2.00));break;
						case 5: pizza.addTopping(new Topping("shrimp",1.40));break;	
					}
					
				}
				
				//adding extra topping

				boolean checkout=false;
				while(!checkout) {
					System.out.println("Add Extra toppings");				
					System.out.println("1) Capsicum  $0.30");
					System.out.println("2) Onion $0.20");
					System.out.println("3) Tomatoes $0.40");
					System.out.println("4) Mushrooms $0.45");
					System.out.println("5) Pineapple $0.45");
					System.out.println("6) Egg $0.25");	
					System.out.println("7) Olives $0.35");	
					System.out.println("8) Garlic $0.30");	
					System.out.println("9) Cheese $0.20");
					System.out.println("10) Pumpkin $0.50");
					System.out.println("11) Complete Order");
					switch(scan.nextInt()) {
						case 1: pizza.addTopping(new Topping("capsicum",0.30));break;
						case 2: pizza.addTopping(new Topping("onion",0.20));break;
						case 3: pizza.addTopping(new Topping("tomatoes",0.40));break;
						case 4: pizza.addTopping(new Topping("mushrooms",0.45));break;
						case 5: pizza.addTopping(new Topping("pineapple",0.45));break;	
						case 6: pizza.addTopping(new Topping("egg",0.25));break;	
						case 7: pizza.addTopping(new Topping("olives",0.35));break;	
						case 8: pizza.addTopping(new Topping("garlic",0.30));break;	
						case 9: pizza.addTopping(new Topping("cheese",0.20));break;	
						case 10: pizza.addTopping(new Topping("pumpkin",0.50));break;	
						case 11: checkout=true;break;	
					}
					//checking for max 8 toppings
					if(pizza.getToppingCount()>=8) {
						System.out.println("8 toppings added proceeding to checkout");
						checkout=true;
					}
			  }
			  System.out.println("Order palced:"+pizza);
			  
				
			  System.out.println("Order another pizza?");
			  System.out.println("1) Yes");
			  System.out.println("2) No");
			  switch(scan.nextInt()) {
			  	case 1:break;
			  	case 2:close=true;System.out.println("Closing Application");break;
			  	default: close=true;break;
			  }
			  
		
	}
	}
}
