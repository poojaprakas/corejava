

   class WatchStarter{
  public  static void main(String[] args)
  {
	  //primitive = initilization
	  //non primitive=instanstation
Watch watch =  new Watch(657,"Rolex");
System.out.println(watch.model);
System.out.println(watch.brand);
int model=watch.model;
String brand=watch.brand;
Light light=watch.light;
System.out.println(light.on);
  }
   }
