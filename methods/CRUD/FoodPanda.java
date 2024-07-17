class FoodPanda{

public static double takeOrder(String fooditems){
	double price=0.0;
   if(fooditems=="Chicken Roll"){
        price= 50.00;
		return price;
   }
    if(fooditems=="Milky Bread"){
        return 70.00;
   }   
   if(fooditems=="Burger"){
        return 200.00; 
   }
   if(fooditems=="Fried Chicken"){
        return  300.00 ;
   }
   if(fooditems=="Popcorn"){
        return  140.00 ;
   }
   if(fooditems=="Chicken Sandwich"){
        return  80.00 ;
   }
   if(fooditems=="masala chai"){
        return  80.00 ;
   }
   if(fooditems=="Nuggets"){
        return 90.00  ;
   }
   if(fooditems=="Cake"){
        return 60.00  ;
   }
   if(fooditems=="Lassi"){
        return  120.00 ;
   }
   if(fooditems=="Strawbery Punch"){
        return 200.00  ;
   }
   if(fooditems=="Veg roll"){
        return 100.00;
   }
   if(fooditems=="Momos"){
        return  75.0;
   }
   if(fooditems=="Potato Chips"){
        return  30.00;
   }
   if(fooditems=="Samosa"){
        return   99.00;
   }
   else{
   System.out.println(fooditems + "Not found");
   
   }
   return price;
}

public static double takeOrder(String fooditems,int quantity){
	double price=0.0;
	if(fooditems=="Chicken Roll"){
        price= 50.00 * quantity;
		return price;
   }
   if(fooditems=="Milky Bread"){
        price= 70.00 * quantity;
		return price;
   }  
   if(fooditems=="Burger"){
        price= 200.00*quantity;
        return price;		
   }
   if(fooditems=="Fried Chicken"){
        price=300.00*quantity;
		return  price ;
   }
   if(fooditems=="Popcorn"){
        price=  140.00 * quantity ;
		return price;
   }
   if(fooditems=="Chicken Sandwich"){
        price =  80.00*quantity;
		return price;
   }
   if(fooditems=="Masala Chai"){
        price=  80.00*quantity;
		 return price;
   }
   if(fooditems=="Nuggets"){
        price= 90.00*quantity ;
		return price;
   }
   if(fooditems=="Cake"){
        price= 60.00*quantity;
		return price;
   }
   if(fooditems=="Lassi"){
        price=120.00*quantity;
		return price;
   }
   if(fooditems=="Strawbery Punch"){
        price =200.00*quantity;
		return price;
   }
   if(fooditems=="Veg roll"){
        price= 100.00*quantity;
		return price;
   }
	else{
		System.out.println(fooditems + "Not found");
	}
	return price;
}
}