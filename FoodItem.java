      class FoodItem
	 {	 
	 String name;
	 float price;
	 String hotelName;
	 int quantity;
	 Type type;
	 float rating;
	 OrderType orderType;
	 static float TotalFoodItemsPrice;
	 

FoodItem(String name, float price,String hotelName, int quantity,float rating)
{
	this.name=name;
	this.price=price;
	this.hotelName=hotelName;
	this.quantity=quantity;
	this.rating=rating;
}

FoodItem(String name, float price, String hotelName)
{
	this.name=name;
	this.price=price;
	this.hotelName=hotelName;
	
}

void displayDetails()
{
	System.out.println(name);
	System.out.println(price);
	System.out.println(hotelName);
	System.out.println(quantity);
	System.out.println(rating);
}
void printTotalPrice()
{
	float total=this.price*this.quantity;
	System.out.println("total cost :"+total);
	totalFoodItemPrice=totalFoodItemPrice+total;
	System.out.println("totalFoodItemPrice:"+totalFoodItemPrice);

}

	 
	 