class Passport{
static String cprlocation;
static int dcdrlocation;
static String surname;
static String givenName;
static String dob;
static String email;
static boolean isEmailLoginSame;
static String loginId;
static String pwd;
static String confirmpwd;
static String hintQuen;
static String hintAns;
static String captcha;	

public Passport(){
	System.out.println("the object is created for passport");
}
	

	
public  boolean createPassport(String cprlocation,int dcdrlocation, String surname,String givenName,String dob,String email,boolean isEmailLoginSame,String loginId,String pwd, String confirmpwd,String hintQuen,String hintAns,String captcha){
	
boolean isPassportDataCreated=false;

this.cprlocation=cprlocation;
this.dcdrlocation=dcdrlocation;
this.surname=surname;
this.givenName=givenName;
this.dob=dob;
this.email=email;
this.isEmailLoginSame=isEmailLoginSame ;
this.loginId=loginId;
this.pwd=pwd;
this.confirmpwd=confirmpwd;
this.hintQuen=hintQuen;
this.hintAns=hintAns;
this.captcha=captcha;       

isPassportDataCreated=true;
return isPassportDataCreated;
}

public void getPassportDetails(){
	        
		System.out.println("CPR Location  : " + cprlocation );
		System.out.println("dcdr Location  : " + dcdrlocation );
		System.out.println("surname : " + surname );
		System.out.println("givenName : " + givenName );
		System.out.println("date of birth : " + dob );
		System.out.println("emailId : " + email );
		System.out.println("confirm email : " + isEmailLoginSame);
		System.out.println("LoginId : " + loginId );
		System.out.println("Password : " + pwd );
		System.out.println("confirm password: " + confirmpwd );
		System.out.println("The hint question : " + hintQuen );
		System.out.println("The hint answer : " + hintAns );
		System.out.println("The captcha : " + captcha );
		

}
}