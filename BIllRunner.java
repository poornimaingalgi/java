class BillRunner{
public static void main(String[] amount){
Bill bill=new Bill();
bill.billId=100;
bill. billIssueDate="18/07/2024";
bill.billDueDate="22/07/2024";
bill.isBillPaid=false;
bill.isBillDue=true;
System.out.println("the bill id is:" + bill.billId);
System.out.println("the bill is due,last date is:" + bill.billDueDate);

Bill bill2=new Bill();
bill2.billId=120;
bill2.billIssueDate="28/06/2024";
bill2.billDueDate="02/07/2024";
bill2.isBillPaid=true;
bill2.isBillDue=false;
System.out.println("the bill id is:" + bill2.billId);
System.out.println("the bill is paid:" + bill2.isBillDue);
}
}