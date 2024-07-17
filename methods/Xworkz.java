class Xworkz{
		
		static String fName;
		static long cN;
		static long wNum;
		static String eMail;
		static String usn;
		static String quali;
		static String branch;
		static String college;
		static int pass;
		static String offer;
		
	
		public static boolean course(String fullName, long contactNumber,long whatsAppNumber, String emailId, String rollNo, 
										String qualification, String stream, String collegeName, int passOut, String offered){
			
				boolean iscoursecreated = false;
			
						fName = fullName;
						cN = contactNumber;
						wNum = whatsAppNumber;
						eMail = emailId;
						usn = rollNo;
						quali = qualification;
						branch = stream;
						college = collegeName;
						pass = passOut;
						offer = offered; 
						
			
				
			
		return iscoursecreated;
			}
		
		public static void getCourse(){
			
				System.out.println("Enter the Full Name               :        " + fName);
				System.out.println("Enter the Mobile Number           :        " + cN);
				System.out.println("Enter your whatsAppNumber         :        " + wNum);          
				System.out.println("Enter the e-Mail                  :        " + eMail);
				System.out.println("Enter the USN                     :        " + usn);
				System.out.println("Enter the highest qualification   :        " + quali);
				System.out.println("Enter the Stream                  :        " + branch);
				System.out.println("Enter the College Name            :        " + college);
				System.out.println("Year of passing                   :        " + pass);
				System.out.println("Offered As                        :        " + offer);
			
						
		}

}