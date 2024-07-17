class WatchShop{
static String watchBrands[]={null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean createWatchBrand(String watchbrand){
	System.out.println("create brand started");
	 boolean isBrandCreated=false;
	 if (watchbrand!=null){
		 watchBrands[index]=watchbrand;
		 index++;
		 isBrandCreated=true;
	 }
	 System.out.println("create brand ended");
	 return isBrandCreated;
}
	 
	public static void getWatchBrand(){
		System.out.println("The brands available are:");
		for(String watchbrand : watchBrands){
			if(watchbrand!=null){
			System.out.println(watchbrand);
			}
		}
		
	}
			
		 
public static boolean updateWatchBrand(String oldWatch,String newWatch){
	System.out.println("update brand stared");
boolean isWatchBrandUpdated=false;
for(int index=0; index<watchBrands.length; index++){
	if(oldWatch==watchBrands[index]){
		watchBrands[index]=newWatch;
		isWatchBrandUpdated=true;
	}
}
if(isWatchBrandUpdated==false){
	System.out.println(oldWatch + "not found");
}
System.out.println("update brand ended");
return isWatchBrandUpdated;
}
}
	