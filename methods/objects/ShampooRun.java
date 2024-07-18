class ShampooRun{
public static void main(String[] clean){
	Shampoo wash=new Shampoo();
wash.brandName = "Wella";
wash.quantity =1;
wash.type = "Dry Hair";
wash.price = 1800;
wash.mgfDate = "10/07/2024";
wash.expDate = "10/10/2026";
System.out.println("the brand name is:" + wash.brandName);

Shampoo wash1=new Shampoo();
wash1.brandName = "L'OREAL";
wash1.quantity =2;
wash1.type = "Anti-Dandruff";
wash1.price = 1700;
wash1.mgfDate = "15/04/2024";
wash1.expDate = "10/10/2027";
System.out.println("the shampoo quantity is:" + wash1.quantity);

Shampoo wash2=new Shampoo();
wash2.brandName = "Matrix";
wash2.quantity =1;
wash2.type = "Frizz-free";
wash2.price = 760;
wash2.mgfDate = "15/1/2023";
wash2.expDate = "10/10/2025";
System.out.println("the price is:" + wash2.price);

Shampoo wash3=new Shampoo();
wash3.brandName = "Bare-Anatomy";
wash3.quantity =1;
wash3.type = "Anti-Hair-Fall";
wash3.price = 386;
wash3.mgfDate = "15/03/2024";
wash3.expDate = "15/08/2025";
System.out.println("the type is:" + wash3.type);

Shampoo wash4=new Shampoo();
wash4.brandName = "Just-herbs";
wash4.quantity =1;
wash4.type = "Hair fall control";
wash4.price = 340;
wash4.mgfDate = "15/1/2023";
wash4.expDate = "25/05/2027";
System.out.println("the brand name is:" + wash4.brandName);

Shampoo wash5=new Shampoo();
wash5.brandName = "Kesh-King";
wash5.quantity =1;
wash5.type = "clear scalp";
wash5.price = 270;
wash5.mgfDate = "15/04/2023";
wash5.expDate = "30/07/2025";
System.out.println("the price is:" + wash5.price);

Shampoo wash6=new Shampoo();
wash6.brandName = "Skin science";
wash6.quantity =2;
wash6.type = "Hair thinning";
wash6.price = 600;
wash6.mgfDate = "20/02/2023";
wash6.expDate = "25/08/2026";
System.out.println("the type of shampoo is:" + wash6.type);

Shampoo wash7=new Shampoo();
wash7.brandName = "TRESemme";
wash7.quantity =1;
wash7.type = "Nourishing dry hair";
wash7.price = 620;
wash7.mgfDate = "20/3/2023";
wash7.expDate = "10/10/2027";
System.out.println("the manufacturing date is:" + wash7.mgfDate);
}
}