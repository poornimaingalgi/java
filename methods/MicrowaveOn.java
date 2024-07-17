class MicrowaveOn {
	static boolean timerOn = true;
	
	public static void timerOn(){
	System.out.println("Timer Started");
	if (timerOn == false){
		timerOn = true;
	System.out.println("The timer is ON ");
	
	}
	else 
		System.out.println("The Timer is Off");
	}
	public static void getFeature(){
		String name="Onida";
		int price=43500;
		System.out.println("The name of the Oven is "+ name +" and the Price is "+ price);
		}
	

}class MicrowaveOff {
	static boolean timerOff = true;
	
	public static void  timerOff(){
	System.out.println("Timer ended");
	if (timerOff == false){
		timerOff = true;
	System.out.println("The timer is OFF ");
	
	}
	else 
		System.out.println("The Timer is On");
	}
	

}