class Passportredo{
	
	static String cprLoc;
	static int dcdrloc;
	static String sName;
	static String gName;
	static String db;
	static String mail;
	static boolean isSame;
	static String logId;
	static String pd;
	static String cPwd;
	static String hQues;
	static String hAns;
	static String ca;
public static boolean createPassportredo(String cprLocation,int dcdrLocation,String sureName,String givenName,String dob,String email,boolean isEmailLoginSame,String loginId,String pwd,String confirmPwd,String hintQuess,String hintAns,String captcha){
boolean isPassportDataCreated=false;
if(cprLocation!=null && dcdrLocation>0 && sureName!=null && givenName!=null && dob!=null && email!=null && 
isEmailLoginSame==true && loginId!=null && pwd!=null && confirmPwd!=null && hintQuess!=null && hintAns!=null &&captcha!=null){
	System.out.println("the details are valid");

						cprLoc=cprLocation;
						dcdrloc=dcdrLocation;
						sName=sureName;
						gName=givenName;
						db=dob;
						mail=email;
						isSame=isEmailLoginSame;
						logId=loginId;
						pd=pwd;
						cPwd=confirmPwd;
						hQues=hintQuess;
						hAns=hintAns;
						ca=captcha;
						isPassportDataCreated =true;
System.out.println("Passport Created");
}
else{
	System.out.println("details are invalid");
}
return isPassportDataCreated;
}

public static void getPassportredo(){
System.out.println("method started");	
System.out.println("The cprLocation is :"+ cprLoc);
System.out.println("The dcdroLcation  is :"+ dcdrloc);
System.out.println("The sureName is :"+ sName);
System.out.println("The givename is :"+gName );
System.out.println("The  dob is :"+db );
System.out.println("The email is :"+ mail);
System.out.println("isEmailLoginSame :"+isSame );
System.out.println("The loginId is :"+ logId);
System.out.println("The pwd is :"+pd );
System.out.println("The confirmPwd is :"+ cPwd);
System.out.println("The hintQuess is :"+ hQues);
System.out.println("The hintAns is :"+ hAns);
System.out.println("The captchais :"+ ca);
System.out.println("method ended");
}
}