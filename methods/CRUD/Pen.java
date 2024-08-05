class Pen{
String name;
double price;
String colour;
int id;
//parameterized constructor
public Pen(String  name,double price,String colour,int id){
this.name=name;
this.price=price;
this.colour=colour;
this.id=id;
}

public void getPen(){
	System.out.println("the pen name is:" + this.name);
	System.out.println("the amount is:" + this.price);
	System.out.println("the pen colour is:" + this.colour);
	System.out.println("the pen id is:" + this.id);
}
}

	
/*public void write(){
System.out.println("writing in book");*/
