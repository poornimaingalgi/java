class AadhaarRunner
{
	public static void main(String aad[])
	{
		Aadhaar.createAadhaar("AC", 14, "Poornima", "F", "07/11/2002", "7204369240", "poorni@gmail.com");
		Aadhaar.getAadhaarDetails();
	}
}