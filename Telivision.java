   //def const
    class Telivision{
     int cost;   //instans v 
	 String name;
	 int size;
	 String brand;
	 
	 
	 Telivision(int cost,String name ) //cont
	 {
		System.out.println("constructer is invoked");
		System.out.println(cost);
	 System.out.println(name);
			   
		this.cost=cost;
		this.name=name;
	 }
	 
      Telivision(String brand,int size ) //cont
	 {
		System.out.println("overlode is invoked");
		System.out.println(size);
		System.out.println(brand);
		this.brand=brand;
		this.size=size;
		
		
	 }
	 
	  void display(){
		  
	  System.out.println("non static is invoked");
	  
	  this. qualiti();
	  }
	  
	  static void qualiti(){
		  
		  
		  System.out.println("static is invoked");
	  }
	 
	}
	
	
