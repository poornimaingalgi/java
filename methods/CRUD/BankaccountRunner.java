class BankAccountRunner{
public static void main(String[] amt){
BankAccount.credit(1000.00);
double finalbalance=BankAccount.getBalance(20.0);
System.out.println("the availabal balance is:" + finalbalance);
BankAccount.debit(50000.00);
finalbalance=BankAccount.getBalance(20.0);
System.out.println("the net balance is:" + finalbalance);
}
}