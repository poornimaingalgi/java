class Girias{

	static String homeAppliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
	static int index = 0;

	public static boolean createHomeAppliance(String applianceName){

		boolean isApplianceCreated = false;
		if(applianceName != null){
			homeAppliances[index] = applianceName;
			index++;
			isApplianceCreated = true;
		}
		else {
			System.out.println("Invalid appliance name Added");
		}
		
	return isApplianceCreated;
	}

	public static void getHomeAppliances(){
		System.out.println("The home appliances available are:");
		for(String appliance : homeAppliances){
			if(appliance != null){
				System.out.println(appliance);
			}
		}
	}
	
	public static boolean updateHomeAppliance(String oldhomeAppliance,String newhomeAppliance){
		System.out.println("update started");
	boolean isHomeApplianceUpdated=false;
	for(int index=1;index<homeAppliances.length; index++){

if(oldhomeAppliance == homeAppliances[index]){
homeAppliances[index] = newhomeAppliance; //initialization
isHomeApplianceUpdated=true;
}    
}
if(isHomeApplianceUpdated==false){
	System.out.println(oldhomeAppliance + "not found");
	
}
System.out.println("update ended");
return isHomeApplianceUpdated;	
	}
	
	
	
	
	
}
