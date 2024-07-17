class WatchBrandRun{
public static void main(String brands[]){
	System.out.println("main started");
	boolean isbrandadded=WatchShop.createWatchBrand("Fastrack");
	System.out.println("the brand name is:" + isbrandadded);

 isbrandadded=WatchShop.createWatchBrand("Titan");
	System.out.println("the brand name is:" + isbrandadded);

 isbrandadded=WatchShop.createWatchBrand("Hmt");
	System.out.println("the brand name is:" + isbrandadded);

 isbrandadded=WatchShop.createWatchBrand("Fire-Boltt");
	System.out.println("the brand name is:" + isbrandadded);

 isbrandadded=WatchShop.createWatchBrand("boAt");
	System.out.println("the brand name is:" + isbrandadded);

 isbrandadded=WatchShop.createWatchBrand("Fossil");
	System.out.println("the brand name is:" + isbrandadded);

	isbrandadded=WatchShop.createWatchBrand("Casio");
	System.out.println("the brand name is:" + isbrandadded);

 isbrandadded=WatchShop.createWatchBrand("Rolex");
	System.out.println("the brand name is:" + isbrandadded);

 isbrandadded=WatchShop.createWatchBrand("Maxima");
	System.out.println("the brand name is:" + isbrandadded);

 isbrandadded=WatchShop.createWatchBrand("Rado");
	System.out.println("the brand name is:" + isbrandadded);	
	
	WatchShop.getWatchBrand();
	
	boolean isbrandUpdate=WatchShop.updateWatchBrand("Rado","Timex");
	System.out.println("the updated brand is:" + isbrandUpdate);
	WatchShop.getWatchBrand();
	
}
}