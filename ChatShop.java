import java.util.*;
class ChatShop{
static String name=null;
static String ownerName=" ";
static String chatNames[]={null,null,null,null};
 static int index;
 static double price;
 static double chatPrices[]={0.0,0.0,0.0,0.0};
 static int chatNameIndex;
 static int chatPriceIndex;

 public static boolean createChatName(String chatName){
	//System.out.println("createChatName started");
boolean isChatNameCreated=false;
//validation
if(chatNameIndex < chatNames.length){
  if(chatName!=null ){
  chatNames[chatNameIndex] = chatName;
  chatNameIndex++;
  isChatNameCreated=true;
  }
  else System.out.println("the chat name is not available");
 
  }
 else{ System.out.println("chat name is full");
 }
 //System.out.println("createChatName ended");
 return isChatNameCreated;
 }
 
 
public static void getChatNames(){
	System.out.println("the available chats are:");
	for( String chatName:chatNames){
		if(chatName!=null){
			System.out.println(chatName);
			
		}	
	}
}
    
	public static double addChatPrice(double chatPrice){
boolean isChatPriceCreated=false;
if(chatPrice!=0){
chatPrices[index]=chatPrice;
index++;
}
else System.out.println("the name of chat:" + chatPrice);
return price;	
	
	
	
}
	public static void getChatPrice(){
	for(double chatPrice:chatPrices)
		System.out.println("the price of chat is:" + chatPrice);
}




	public static  boolean updateChatName(String oldChatName,String newChatName){
System.out.println("update started");
boolean isChatNameUpdated=false;
for(int index=1;index<chatNames.length; index++){

if(oldChatName==chatNames[index]){
chatNames[index] = newChatName;
isChatNameUpdated=true;
}
}
if(isChatNameUpdated==false){
	System.out.println(oldChatName + "not found");
	
}
System.out.println("update ended");
return isChatNameUpdated;
}
public static boolean deleteChatName(String chatNameToBeDeleted){
	System.out.println("delete chatName started");
	boolean isChatNameDeleted=false;
	int oldIndex,newIndex;//declaration
	for(newIndex=0,oldIndex=0;oldIndex<chatNames.length; oldIndex++){
	if(chatNames[oldIndex]!=chatNameToBeDeleted){
		chatNames[newIndex]=chatNames[oldIndex];
	newIndex++;
	}
	else isChatNameDeleted = true;
}
	chatNames=Arrays.copyOf(chatNames,newIndex);
	/*if(chatNames!=null){
		isChatNameDeleted = true;  this will not delete the data else will delete
	}*/
	if(isChatNameDeleted==false){
		System.out.println(chatNameToBeDeleted + "not found");
	}
	System.out.println("delete chatName ended");
	return isChatNameDeleted;
}
}
	
	