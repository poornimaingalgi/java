class BankAccount{
static double balance;
public static double debit(double amount){
	if(amount<=balance)
balance=balance-amount;
else
	System.out.println("insufficient balance");

return balance ;
}
public static double credit(double amount){
	if(amount>0)
balance=balance+amount;
else
	System.out.println("amount can't be credited");

return balance;
}
public static double getBalance(double amount){
return balance;
}
}