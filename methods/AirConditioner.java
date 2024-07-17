class AirConditioner{
static boolean isConnected;
static int currentTemperature;
static int maxTemperature=6;



public static boolean onOrOff(){
System.out.println("onOrOff Started");
if(isConnected==false){
	isConnected=true;
	System.out.println("the current temperature");
}else{
	System.out.println("  ");
	return;
}
}
	


/*isConnected= !isConnected  ? true : false;
System.out.println("onOrOff ended");
return isConnected;
}*/

public static void increaseTemperature(){
	System.out.println("increaseTemperature() started");


	if(isConnected==true){
		if(currentTemperature<=maxTemperature){
			currentTemperature=currentTemperature+1;
			System.out.println("the current temperature is:"+currentTemperature);
		}
		else{
			System.out.println("Max temperature reached");
		}
	}else{
			System.out.println("Gubee.... AC on madu....");
		}
		System.out.println("increaseTemperature() ended");
	
		return;
}

public static void getFeatures(){
	System.out.println("getFeatures() started");
String name="Samsung";
double prise=53000.0;
System.out.println("the brand name is"+name);
System.out.println("the brand price is"+prise);
System.out.println("getFeatures() ended");
return;
}
}
