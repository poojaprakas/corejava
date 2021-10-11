    class Telivision1{
     int cost;   
	 String name;
	 int size;
	 String brand;
	 
	 
	 Telivision1(int cost,String name )
	 {
		System.out.println("constructer is invoked");
		System.out.println(cost);
	 System.out.println(name);
			   
		this.cost=cost;
		this.name=name;
	 }
	 
      Telivision1(String brand,int size )
	  {
	  		System.out.println("overlode is invoked");
		System.out.println(size);
		System.out.println(brand);
		this.brand=brand;
	  this.size=size;
	  }
	}
	 
	  

	 