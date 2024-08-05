class PassportRunner{
public static void main(String[] passPortApp){
	//ClassName ref=new ClassName();
	Passport ref=new Passport();
boolean value=ref.createPassport("pune",8,"ingalagi","poornima","07/11/2002","poornima@gmail.com",true,"poornima","poorvi","poorvi","fav colour","yellow","cpD7a");
System.out.println(value);
ref.getPassportDetails();
}
}