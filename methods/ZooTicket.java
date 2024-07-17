class ZooTicket{
	static int price=250;
	static int tea =20;
	static int samosa=40;
	public static int snacks(int age){
	
	if(age>=18 && age<=25){
		System.out.println("the ticket amount is:");
		return price;
		}
		else if (age>=25 && age<=35){
			System.out.println("the ticket price:" + price);
		System.out.println("the tea price:" + tea);
		
		return price + tea;
	}
	    else if(age>=35){
		System.out.println("the ticket amount"+ price);
		System.out.println("the tea price:"+ tea);
		System.out.println("the samosa price:"+ samosa);
	    return price +samosa + tea;
        }
    else {
	System.out.println("there is no extra charge");
	return 0;
}
}
}