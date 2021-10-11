   
 class ProductProduct
 {
	 String name;
	 String type;
	 float price;
	 int quantity;
	 String vendor;
	 static float totalProductsPrice;
	 
	 ProductProduct(String name,String type,float price,int quantity,String vendor)
	 {
		 this.name=name;
		 this.price=price;
		 this.quantity=quantity;
		 this.vendor=vendor;
		 this.type=type;
		 System.out.println("invoked 5 parameter const");
	 }
	 ProductProduct(String name,float price,int quantity)
	 {
		 this.name=name;
		 this.price=price;
		 this.quantity=quantity;
		 System.out.println("invoked 3 parameter const");
	 }
	 void displayDetails()
	 {
		 System.out.println("display method invoked");
		 System.out.println(this.name);
		System.out.println(this.type);
	   System.out.println(this.price);
      System.out.println(this.quantity);
	   System.out.println(this.vendor);
	 }
	 void printTotalCost()
	 {
		 float total=this.price*this.quantity;
		 System.out.println("TOTAL COST:"+total);
		 totalProductsPrice=totalProductsPrice+total;
		 System.out.println("total products price:"+totalProductsPrice);
	 }
	 static void printTotalProductsPrice()
	 {
		 System.out.println("total products price:"+totalProductsPrice);
	 }
 }


		 