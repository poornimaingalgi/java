class Npr{
public static int toGetFact(int factnum){
	System.out.println("The main method started");
		int fact=1;
		int fnum=1;
	for(int i=1;i<=factnum;i++){
	fact=i*fact/(fact-fnum);
}
System.out.println("the factorial ended");
return fact;
}
}