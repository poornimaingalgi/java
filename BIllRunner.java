class BillRunner{
	public static void main(String[] amount){
		Bill ref=new Bill();
		boolean bill=ref.createBill(100,"17/07/2024","20/07/2024",false,true);
		System.out.println(bill);
		ref.displayBillInfo();
		
		boolean bill1=ref.createBill(110,"17/08/2024","20/08/2024",false,false);
		System.out.println(bill1);
		ref.displayBillInfo();
	}
}