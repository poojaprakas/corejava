   class MovieTicket{
	   String name;
	   int price;
	   int noOfSeats;
	   static float totalMovieTicketPrice;
	   
	MovieTicket(String name,int price, int noOfSeats)
	{
		this.name=name;
		this.price=price;
		this.noOfSeats=noOfSeats;
System.out.println("invoked 3 parameters const");
	}
	void displayDetails()
	{
		System.out.println(name);
		System.out.println(price);
		System.out.println(noOfSeats);
	}

	  void printTotalPrice()
	  {
		  float total=this.price*this.noOfSeats;
		  System.out.println("total price:"+total);
		  totalMovieTicketPrice=totalMovieTicketPrice+total;
	  }
	  static void printtotalMovieTicketPrice()
	  {
		  System.out.println("totalMovieTicketPrice:"+totalMovieTicketPrice);
	  }
   }
		 
 

 
   