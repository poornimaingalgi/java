class BlinkItTest{
static String itemNames[]={null, null,null,null,null};
	static  int itemIndex=5;
	static boolean isItemNameCreated;
	public static boolean createItemNames(){
		isItemNameCreated=false;
		if(itemNames!=null){
			for(itemIndex=0; itemIndex<itemNames.length; itemIndex++){
			itemNames	=  itemNames[itemIndex];
			isItemNameCreated=true;
			System.out.println("the product is created:");
		}
		}
			
		else System.out.println("the product is not craeted");
	return isItemNameCreated;		
	}
}