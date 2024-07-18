class Bill{
int billId;
String billIssueDate;
String billDueDate;
boolean isBillPaid;
boolean isLatestBill;
public boolean createBill(int billId,String billIssueDate,String billDueDate,boolean isBillPaid,boolean isLatestBill){
	boolean isBillCreated = false;
	if(billId > 0 && billIssueDate!=null && billDueDate!=null){
		this.billId=billId;
		this.billIssueDate=billIssueDate;
		this.billDueDate=billDueDate;
		this.isBillPaid=isBillPaid;
		this.isLatestBill=isLatestBill;
		isBillCreated=true;
	}
	return isBillCreated;
}
public void displayBillInfo(){
	System.out.println("the bill id is:" + this.billId);
	System.out.println("the bill issue date is:" + this.billIssueDate);
}
}