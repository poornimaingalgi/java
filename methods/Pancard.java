class Pancard{
    //method
	static String uName;
		static String  db;
		static String an;
		static String vid;
		static String cf;
		static String pa;
		static String em;
		static String pn;
		
	public static boolean creatPancard(String givenName,String dob,String aadharnumber,String voterID,String certificate,
	String parentsaadharnumber,String email,String phonenumber){
        boolean isPancardDatecreated=false;

          uName=givenName;
		   db=dob;
		   an=aadharnumber;
		   vid=voterID;
		   cf=certificate;
		   pa=parentsaadharnumber;
		   em=email;
		   pn=phonenumber;
		   
		   return isPancardDatecreated;
			}
		public static void getcreated(){

System.out.println("The givenName is :" + uName);
System.out.println("The date of birth is :"+ db);
System.out.println("The aadharnumber is :" + an);
System.out.println("The voterID is :" + vid);
System.out.println("The certificate is:" + cf);
System.out.println("The Parentsaadharnumber is:" + pa);
System.out.println("The email is :" + em);
System.out.println("The phonenumber is :" + pn);

}
}