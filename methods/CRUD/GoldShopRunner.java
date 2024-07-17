class GoldShopRunner{
	public static void main(String[] item){
		boolean isAdded = GoldShop.createGoldItem("Earring");
		System.out.println("the added item is:" + isAdded);
		
		 isAdded = GoldShop.createGoldItem("Nose Pin");
		 System.out.println("the added item is:" + isAdded);
		
		 isAdded = GoldShop.createGoldItem("Bracelet");
		 System.out.println("the added item is:" + isAdded);
		
		 isAdded = GoldShop.createGoldItem("Bangle");
		 System.out.println("the added item is:" + isAdded);
		
		
		 isAdded = GoldShop.createGoldItem("Chain");
		System.out.println("the added item is:" + isAdded);
		
		 isAdded = GoldShop.createGoldItem("Ear Stud");
		System.out.println("the added item is:" + isAdded);
		
		 isAdded = GoldShop.createGoldItem("Necklace");
		 System.out.println("the added item is:" + isAdded);
		 
		 
		  isAdded = GoldShop.createGoldItem("Kada");
		 System.out.println("the added item is:" + isAdded);
		
		GoldShop.getAllGoldItems();
		
		boolean ItemAdded=GoldShop.updateGoldItem("Kada","Anklet" );
		System.out.println("is All Gold Item updated:" + ItemAdded);
		GoldShop.getAllGoldItems();
		
		boolean delete=GoldShop.deleteGoldItem("Chain");
		System.out.println("the deleted gold item is:" + delete);
		GoldShop.getAllGoldItems();
		
	}
		
		
}
		