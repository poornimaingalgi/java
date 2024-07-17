class AirConditionerRunner{
public static void main(String[] ac){
	boolean onOrOff=AirConditioner.onOrOff();
	System.out.println(onOrOff);
	AirConditioner.increaseTemperature();

	/*AirConditioner.onOrOff();
	AirConditioner.increaseTemperature();
    AirConditioner.getFeatures();
	System.out.println("main ended");*/
}
}
