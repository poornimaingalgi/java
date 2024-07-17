class MixerRun{
public static void main(String[] ac){
	System.out.println("main started");

	Mixer.onOrOff();
	Mixer.increaseVolume();
    Mixer.getFeatures();
	System.out.println("main ended");
}
}