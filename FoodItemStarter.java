     
	 class FoodItemStarter{
	 public static void main(String[] args)
	 {
		 FoodItem fooditem=new FoodItem("Dosa",15.0f,"BIRIYANIHOME", 3,5.0f);
		 fooditem.type=Type.VEG;
		 fooditem.orderType=ONLINE;
		 System.out.println("fooditem.type");
		  System.out.println("fooditem.orderTypetype");
		  fooditem.displayDetails();
		 fooditem.printTotalPrice();
	 }
	 }