class SocialMediaAppStarter
{
	public static void main(String[] coffee)
	{
	SocialMediaApp mediaApp=new SocialMediaApp();
     mediaApp.setName("Instagram");
	System.out.println(mediaApp.name);
	String version="208.0.0.32.135";
	mediaApp.setVersion(version);
	System.out.println(mediaApp.version);

	Company company=new Company();
	company.setName("dell");
	System.out.println(company.name);
	
	}
}	
