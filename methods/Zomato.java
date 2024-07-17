class Zomato{

	
	public static double takeOrder(String foodName ){
	
		if(foodName == "Spaghetti Aglio e Olio"){
			System.out.println("The price of "+foodName);	
			return 475.0;		
		}
		
		if(foodName == "Penne Chicken Arrabbiata"){
			System.out.println("The price of "+foodName);
			return 545.00;
		}
		
		if(foodName == "Baked Chicken Pesto & Penne"){	
			System.out.println("The price of "+foodName);
		return 545.55;
		}
		
		
		if(foodName == "Mushroom Artichokes"){	
			System.out.println("The price of "+foodName);		
		return 399.00;
		}	
		
		if(foodName == "Vegetable Lasagna"){
			System.out.println("The price of "+foodName);
		return 600.00;
		}
		
		if(foodName == "Penne in Cream Sauce") {
			System.out.println("The price of "+foodName);
		return 545.00;
		}
		
		if(foodName == "Spaghetti with Basil Pesto") {
			System.out.println("The price of "+foodName);
		return 425.00;
		}
		
		if(foodName == "Penne Arrabbiata") {
			System.out.println("The price of "+foodName);
		return 460.00;
		}
		
		if(foodName == "Mozzarella And Tomato Salad") {
			System.out.println("The price of "+foodName);
		return 325.00;
		}
		
		if(foodName == "Grand Chicken Caesar Salad") {
			System.out.println("The price of "+foodName);
		return 625.00;
		}
		
		if(foodName == "Grilled Chicken Salad") {
			System.out.println("The price of "+foodName);
		return 425.00;
		}
		
		if(foodName == "Watermelon And Goat cheese salad") {
			System.out.println("The price of "+foodName);
		return 550.00;
		}
		
		if(foodName == "Coke Zero") {
			System.out.println("The price of "+foodName);
		return 330.00;
		}
		
	    if(foodName == "Dough Ball Nutella") {
			System.out.println("The price of "+foodName);
		return 459.00;
		}
		
		if(foodName == "Chocolate fudge cake") {
			System.out.println("The price of "+foodName);
		return 225.00;
		}
		
		if(foodName == "Raspberry Cheesecake") {
			System.out.println("The price of "+foodName);
		return 425.00;
		}
		
		
		
		else{
			System.out.println(foodName + "is not found");
			
		}
		
		return 0.0;
	}

}