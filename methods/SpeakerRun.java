class SpeakerRun{
public static void main(String[] ac){
	System.out.println("main started");

	Speaker.onOrOff();
	Speaker.increaseVolume();
    Speaker.getFeatures();
	System.out.println("main ended");
}
}
