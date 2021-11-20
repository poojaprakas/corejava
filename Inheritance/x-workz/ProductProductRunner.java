class ProductProductRunner
{
public static void main(String[] args)
{
 ProductProduct product=new ProductProduct("Hair Dryer","EC",1900,2,"Philips");
 product.displayDetails();
 product.printTotalCost();
		
 ProductProduct product2=new ProductProduct("Trimmer","EC",200,4,"Nova");
 product2.displayDetails();
 product2.printTotalCost();
		}
}