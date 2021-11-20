class Chair{
int cost;
String colour;
Chair()
{
System.out.println("default constructor invoked");
}

public static void main(String[] args)

{
Chair obj=new Chair();
System.out.println(obj.cost);
System.out.println(obj.colour);
}
}
//default constructor