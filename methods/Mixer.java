class Mixer{
static boolean isConnected=true;
static int currentVolume;
static int maxVolume=3;



public static void onOrOff(){
System.out.println("onOrOff Started");
if(isConnected==false){
isConnected=true;
System.out.println("mixer is on");
}
else if(isConnected==true){
isConnected=false;
System.out.println("mixer is off");
}
System.out.println("onOff Ended");
return;
}
public static void increaseVolume(){
	System.out.println("increaseVolume() started");


	if(isConnected==true){
		if(currentVolume<=maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("the current Volume is:"+currentVolume);
		}
		else{
			System.out.println("Max volume reached");
		}
	}else{
			System.out.println("... mixer on madu....");
		}
		System.out.println("increaseVolume() ended");
	
		return;
}

public static void getFeatures(){
	System.out.println("getFeatures() started");
String name="sony";
double prise=8000.0;
System.out.println("the brand name is" +name);
System.out.println("the brand price is" +prise);
System.out.println("getFeatures() ended");
return;
}
}