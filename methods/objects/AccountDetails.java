class AccountDetailsDTO{
int customerId;
String bankName;
String branchName;
String ifscCode;
long accountNumber;
String address;
String accountType;

public AccountDetailsDTO( ){
	
	System.out.println("Account details object is created");
}

public createAccount(int customerId,String bankName,String branchName,String ifscCode,long accountNumber,String address,String accountType){
	
	
	this.customerId=customerId;
this.bankName=bankName;
this.branchName=branchName;
this.ifscCode=ifscCode;
this.accountNumber=accountNumber;
this.address=address;
this.accountType=accountType;

}

public void getAccountDetails(){
	System.out.println("the customer id is:" + this.customerId);
	System.out.println("the bank name is:" +this. bankName);
	System.out.println("the branch name:" + this.branchName);
	System.out.println("the ifscCode of the bank is:" + this. ifscCode);
	System.out.println("the account number is:" + this.accountNumber);
	System.out.println("the address of customer is:" + this.address);
	System.out.println("the account type is:" + this.accountType);
}
}