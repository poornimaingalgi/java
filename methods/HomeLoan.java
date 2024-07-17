class HomeLoan{
		
		static String fName;
		static String dob;
		static long mN;
		static String marital;
		static String eMail;
		static String pwd;
		static String add;
		static String place;
		static String loc;
		static int pin;
		static int income;
		static String bank;
		
		
	
		public static boolean loan(String fullName, String dateOfBirth, long mobileNumber, String maritalStatus, 
									String email,String security,String address,String city,String state,int pincode,
									int annualIncome, String bankName){
			
				boolean iscreateLoan = false;
			
						fName = fullName;
						dob = dateOfBirth;
						mN = mobileNumber;
						marital = maritalStatus;
						eMail = email;
						pwd = security;
						add = address;
						place = city;
						loc = state;
						pin = pincode;
						income = annualIncome;
						bank = bankName;
						
			
			
			
			
			
		return iscreateLoan;
			}
		
		public static void getloan(){
			
				System.out.println("Enter the Full Name               :        " + fName);
				System.out.println("Enter the DOB                     :        " + dob);
				System.out.println("Enter the Mobile Number           :        " + mN);
				System.out.println("Enter the Marital status          :        " + marital);
				System.out.println("Enter the e-Mail                  :        " + eMail);
				System.out.println("Enter the Social Security Number  :        " + pwd);
				System.out.println("Enter the Address                 :        " + add);
				System.out.println("Enter the City                    :        " + place);
				System.out.println("Enter the State                   :        " + loc);
				System.out.println("Enter the PIN CODE                :        " + pin);
				System.out.println("Enter the Annual Income           :        " + income);
				System.out.println("Enter the bank Name               :        " + bank);
			
			
			
		}





}