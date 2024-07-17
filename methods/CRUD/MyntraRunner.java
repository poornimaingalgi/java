class MyntraRunner{

public static void main(String[] cloth){

boolean myntraAccountCreated = MyntraAccount.createMyntraAccount("Varun", "varunv@gmail.com", "9731358212", "Varun V", "Varun@12", "137 bsg ka");
        System.out.println("Myntra Account Created: " + myntraAccountCreated);
        if (myntraAccountCreated) {
            MyntraAccount.getMyntraAccountDetails();
        }
		}
}