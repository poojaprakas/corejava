   
class Fan{
	
   int cost;
   String name;
   int id;
   String brand;
    
	Fan(int cost,String name){
		System.out.println("fan invoked");
		System.out.println(cost);
		System.out.println(name);
		this.cost=cost;
		this.name=name;
	}
		
			Fan( String brand,int id){
			System.out.println(id);
			System.out.println(brand);
		this.id=cost;
		this.brand=brand;
}
   }