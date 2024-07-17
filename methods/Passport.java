class Passport{
static String cprloc;
static int dcdrloc;
static String sname;
static String gname;
static String dob;
static String mail;
static boolean iselsame;
static String lId;
static String psd;
static String cpsd;
static String hques;
static String hans;
static String cap;	
	

	
public static boolean createPassport(String cprlocation,int dcdrlocation, String surname,String givenName,String dob,String email,boolean isEmaiLoginSame,String loginId,String pwd, String confirmpwd,String hintQuen,String hintAns,String captcha){
boolean isPassportDataCreated=false;
        
return isPassportDataCreated;
}
cprloc=CPR Location;
dcdrloc=dcdr Location;
sname=surname;
gname=givenName;
date of birth=dob;
mail=emailId;
iselame=confirm email;
lId=LoginId;
psd=Password;
cpsd=confirm password;
hquen=The hint question;
hans=The hint answer;
cap=The captcha; 

public static void getPassportDetails(){
	        
		System.out.println("CPR Location  : " + cprloc );
		System.out.println("dcdr Location  : " + dcdrloc );
		System.out.println("surname : " + sname );
		System.out.println("givenName : " + gname );
		System.out.println("date of birth : " + dob );
		System.out.println("emailId : " + mail );
		System.out.println("confirm email : " + iselame);
		System.out.println("LoginId : " + lId );
		System.out.println("Password : " + psd );
		System.out.println("confirm password: " + cpsd );
		System.out.println("The hint question : " + hquen );
		System.out.println("The hint answer : " + hans );
		System.out.println("The captcha : " + cap );

}
}