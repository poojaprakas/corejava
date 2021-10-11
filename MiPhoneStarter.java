  class MiPhoneStarter
  {
	  public static void main(String[] poojas)
	  {
	MiPhone phone=new MiPhone();
phone.setBrand("Mi Note 2 Pro");
System.out.println(phone.brand);
  
  
  phone.setPrice(12.5f);
System.out.println(phone.price);
  
  phone.colour=Colour.BLACK;
  phone.setColour(phone.colour);
  System.out.println(phone.colour);
 
 phone.setImei(8674);
  System.out.println(phone.imei);
  
  PhonePay pay=new PhonePay();
  pay.setCompany("bharathi");
  System.out.println(pay.company);
  
	  }
  }
  