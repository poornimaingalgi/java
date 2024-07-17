import java.util.*;
class GoldShop{
	static String shopName="Mahalaksmi";
	static String owneName="Jaanaki";
	static String golditems[]={null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createGoldItem(String golditem){
		System.out.println("create item started");
	boolean isItemCreated=false;
	if(golditems !=null){
	golditems[index] = golditem;	
	index++;
	isItemCreated=true;
	}
	System.out.println("create item ended");
	return isItemCreated;
	}
	
	public static void getAllGoldItems(){
	System.out.println("get started");
	for(String golditem : golditems)
	System.out.println(golditem);

	System.out.println("get ended");
	}
	
	public static boolean updateGoldItem(String oldItem,String newItem){
		System.out.println("update started");
		boolean isGoldItemUpdated=false;
		for(int index=0; index<golditems.length; index++){
		if(oldItem == golditems[index]){
		golditems[index]=newItem;
		isGoldItemUpdated=true;
		}
		}
		
	if(isGoldItemUpdated==false){
		System.out.println(oldItem + "not found");
	}
	System.out.println("update ended");
	return  isGoldItemUpdated;
	}
	public static boolean deleteGoldItem(String isGoldItemToBeDeleted){
		System.out.println("delete item started");
		boolean isItemDeleted = false;
		int oldIndex,newIndex;
		for( oldIndex=0,newIndex=0; oldIndex<golditems.length; oldIndex++){
			if(golditems[oldIndex]!=isGoldItemToBeDeleted){
				golditems[newIndex]=golditems[oldIndex];
				newIndex++;
			}
			else isItemDeleted =true;
		}
		golditems=Arrays.copyOf(golditems,newIndex);
		if(isItemDeleted == false){
			System.out.println(isGoldItemToBeDeleted + "not found");
		}
	System.out.println("delete ended");
	return isItemDeleted;
	}				
}