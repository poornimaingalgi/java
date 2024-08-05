class AccountDTO{
//data transfer object
 static int customerId;
static String bankName;
static String branchName;
static String ifscCode;
static long accountNumber;
static String address;
static String accountType;

public AccountDTO(int customerId,String bankName,String branchName,String ifscCode,long accountNumber,String address,String accountType){
	
	this.customerId=customerId;
this.bankName=bankName;
this.branchName=branchName;
this.ifscCode=ifscCode;
this.accountNumber=accountNumber;
this.address=address;
this.accountType=accountType;
}

}
