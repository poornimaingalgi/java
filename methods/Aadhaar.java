class Aadhaar
{
	static String demoDetails;
	static int add;
	static String giveN;
	static String gend;
	static String dob;
	static String mobileN;
	static String emailI;
	public static boolean createAadhaar(String demographaicDetails, int address, String giveName, String gender, 
	String dob, String mobileNumber, String emailId){
		boolean isAadhaarDataCreated = false;
		demoDetails = demographaicDetails;
		add = address;
		giveN = giveName;
		gend = gender;
		dob = dob;
		mobileN = mobileNumber;
		emailI = emailId;
		return isAadhaarDataCreated;
	}
	
	public static void getAadhaarDetails()
	{
		System.out.println("Person demographaicDetails : " + demoDetails);
		System.out.println("Person giveName : " + giveN);
		System.out.println("Person gender : " + gend);
		System.out.println("Person address : " + add);
		System.out.println("Person dob : " + dob);
		System.out.println("Person mobileNumber : " + mobileN);
		System.out.println("Person emailId : " + emailI);
	}

}