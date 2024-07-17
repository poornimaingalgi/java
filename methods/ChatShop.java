class ChatShop{

	static	String  chatShopName  = "";
		static String address = "";
		
		
	static	String chatNames[] = {null, null, null};
	static double chatprices[] = {0.0, 0.0, 0.0}; 
	 static int index;
		
		public static boolean createChatNames(String chatName){
			System.out.println("Chat Shop opened");
			boolean	isChatNameCreated = false;
			//validation
				if(index < chatNames.length){
					if(chatName != null){
						   chatNames[index] = chatName;
						   index++;
						   
					isChatNameCreated = true;
					
					}
					else{
						System.out.println("Chat name is null");
					
					}
			
			}
			
			System.out.println("Chat Shop closed");
			return isChatNameCreated;	
		
		}
		
			
			
			public static boolean updateChatNames(String oldChatName, String newChatName){
				System.out.println("newChatName updated");
				
					boolean isupdateChatName = false;
					for(int index = 0;index<chatNames.length; index++){
						if(oldChatName == chatNames[index]){
							chatNames[index] = newChatName;
							isupdateChatName = true;
						}
					}
				
					if(isupdateChatName == false){
							System.out.println(oldChatName + "not found");
					}
				
				
				
				System.out.println(" updated chatName ended");
				return isupdateChatName;
				
				
			}
			
			
				
		public static void getChatNames(){
			for(String chatName:chatNames)
				System.out.println("The name of chat: " + chatName);
				
	}

		




}