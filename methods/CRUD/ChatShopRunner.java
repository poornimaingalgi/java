class ChatShopRunner{
	public static void main(String[] chat){
		System.out.println("main started");
		
		boolean ChatCreated=ChatShop.createChatName("Pani puri");
		System.out.println(ChatCreated);
		double amount=ChatShop.addChatPrice(40.0);
		
	
		
		ChatCreated=ChatShop.createChatName("Dhahi Puri");
		System.out.println(ChatCreated);
		amount=ChatShop.addChatPrice(45.0);
		
		ChatCreated=ChatShop.createChatName("Masala Puri");
		System.out.println(ChatCreated);
		amount=ChatShop.addChatPrice(35.0);
		
	    ChatCreated=ChatShop.createChatName("tikki Puri");
		System.out.println(ChatCreated);
		amount=ChatShop.addChatPrice(50.0);
		
		 boolean chatNameUpdate=ChatShop.updateChatName("Masala Puri", "Bhel puri");
		 System.out.println("Is Chat Name updated"  +  chatNameUpdate);
		 
		ChatShop.getChatNames();
		
		ChatShop.getChatPrice();
		
		boolean chatNameDelete=ChatShop.deleteChatName("tikki Puri");
		System.out.println("the deleted chat name is:" + chatNameDelete);
		
		ChatShop.getChatNames();
		
		
		System.out.println("main ended");
	}
}
