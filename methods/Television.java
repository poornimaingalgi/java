class Television{
static boolean isConnected=false;
static int currentVolume;
static int maxVolume=10;
static int minVolume;


public static void onOrOff(){
System.out.println("onOrOff Started");
if(isConnected==false){
isConnected=true;
System.out.println("television is on");
}
else if(isConnected==true){
isConnected=false;
System.out.println("television is off");
}
System.out.println("onOrOff Ended");
return;
}
public static void increaseVolume(){
	System.out.println("increaseVolume() started");


	if(isConnected==true){
		if(currentVolume< maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("the current Volume is:"+currentVolume);
		}
		else{
			System.out.println("Max volume reached");           
		}
	}else{
			System.out.println("Gubee.... television on madu....");
		}
		System.out.println("increaseVolume() ended");
	
		return;
}
public static void decreaseVolume(){
	System.out.println("decreaseVolume() started");
	if(isConnected==true){
		if(currentVolume > minVolume){
			currentVolume = currentVolume-1;
			System.out.println("the current volume is:" +currentVolume);
		}
		else{System.out.println("min volume reached");
		}
	}else
	{
		System.out.println("tv on madu");
	}
	System.out.println("decreaseVolume() ended");
	return;
}






public static void getFeatures(){
	System.out.println("getFeatures() started");
String name="Sony";
double prise=32000.0;
System.out.println("the brand name is"+name);
System.out.println("the brand price is"+prise);
System.out.println("getFeatures() ended");
return;
}
}