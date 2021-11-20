     class Micro2{
		 String city,road;
		 int id;
		 String name;
	 
  Micro2(int id,String name){
	  this.id=id;
	  this.name=name;
  System.out.println(id);
  System.out.println(name);
  } 
  Micro2(String city,String road)
  {
	  this.city=city;
	  this.road=road;
	  System.out.println(city);
	   System.out.println(road);
  }
  public static void main(String args[])
  {
	  Micro2 obj=new Micro2(3,"pinky");
	          obj=new Micro2("sorab","sagara road");
  }
	 }
	 //parameterised method by using" this" keyword
	 //this is called constructor overloading by using a same class name we can create parameter with different data types
	 //but the printing values in main method
	//  constructor rules
	// 1. cannot be a return types
	//2.class and method name should be same
	//3.it should not be an static ,abstract ,synchronised