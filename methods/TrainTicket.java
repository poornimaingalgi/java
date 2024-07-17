class TrainTicket{
		
		static String uName;
		static long mN;
		static String eMail;
		static String pwd;
		static String captch;
		static int otp;
		
	
		public static boolean bookTrainTicket(String userName, long mobileNumber, String email, String password, String captcha,
			int loginAndBookOtp){
			
				boolean isTrainTicketbooked = false;
			
						uName = userName;
						mN = mobileNumber;
						eMail = email;
						pwd = password;
						captch = captcha;
						otp = loginAndBookOtp;
			
			
			
			
			
		return isTrainTicketbooked;
			}
		
		public static void getBooked(){
			
				System.out.println("Enter the UserName                :        " + uName);
				System.out.println("Enter the Mobile Number           :        " + mN);
				System.out.println("Enter the e-Mail                  :        " + eMail);
				System.out.println("Enter the Password                :        " + pwd);
				System.out.println("Enter the Captch                  :        " + captch);
				System.out.println("Enter the Login & book Otp        :        " + otp);
			
			
			
			
			
			
			
			
			
		}





}