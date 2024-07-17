class Instagram{
 static String username;
static String email;
    static String phoneNumber;
    static String fullName;
    static String password;
public static boolean createInstaAccount(String uname, String mail, String phone, String name, String pwd){
 
 boolean isInstaCreated = false;
 boolean isunameValid = false;
 boolean ismailValid = false ;
 boolean isphoneValid = false ;
 boolean isnameValid = false ;
boolean ispwdValid = false ;

if(uname != null ){
                   username =  uname ;
 isunameValid = true;
}else{
  System.out.println("Please provide valid User Name");
} 
if(mail != null){
email        =  mail ;
   ismailValid = true ;
  }else{
    System.out.println("Please provide valid E-mail");
}
 if( phone != null){
        phoneNumber     = phone;
    isphoneValid = true ;
  }else{
  System.out.println("Please provide valid Phone Number  ");
}
  if( name != null){
	fullName  = name;
    isnameValid = true ;
}else{
  System.out.println("Please provide valid Full Name ");
 }
 if( pwd != null){
        password  = pwd;
    ispwdValid = true ;
}else{
  System.out.println("Please provide valid Password ");
 }

   if(isunameValid && ismailValid && isphoneValid && isnameValid && ispwdValid){
  isInstaCreated  =true;
               }
			   return isInstaCreated ;
}
 public static void getInstaDetails() {
        System.out.println("The User Name is : " + username);
        System.out.println("The E-mail is: " + email);
        System.out.println("The Phone Number is : " + phoneNumber);
        System.out.println("The Full Name is : " + fullName);
        System.out.println("The Password is : " + password);
    }


}