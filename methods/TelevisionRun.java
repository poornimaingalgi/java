class TelevisionRun{
public static void main(String[] ac){
	System.out.println("main started");

	Television.onOrOff();
	Television.increaseVolume();
	Television.decreaseVolume();
    Television.getFeatures();
	System.out.println("main ended");
}
}