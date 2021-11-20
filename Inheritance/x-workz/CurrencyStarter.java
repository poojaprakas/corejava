class CurrencyStarter{


  public static void main(String[] pooja)
  {
	  Currency currency=new Currency("rupees");
	  currency.displayDetails();
	  currency=new Currency("dollar");
	  currency.value=9.70f;
	  currency.displayDetails();
	  currency.country=new countryDetail("india",98);
	  System.out.println(currency.country);
	  countryDetail country=currency.country;
	  country.displayDetails();
	  Application application=new Application("java",16.2);
	  application.displayDetails();
	  application.company=new CompanyDetail("oracle","saffz", "ranveer");
	  CompanyDetail company=application.company;
	  company.displayDetails();
	  company.country=new CountryDetail();
	  CountryDetail country1=company.country;
	  country1.displayDetails();  
  }
}