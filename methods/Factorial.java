class Factorial{
public static int toGetFact(int factnum){
System.out.println("the factorial started");
int fact=1;
for(int num=1; num<=factnum; num++){
fact=num*fact;
}
System.out.println("the factorial ended");
return fact;
}
}