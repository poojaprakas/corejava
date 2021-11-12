package com.xworkz.hajama;
public class NewsPaper {
	private String name;
	private int since;
	private boolean lang;
	
	public NewsPaper() {
		System.out.println("invoke no arg const");
	}
	@Override
	public String toString() {
		System.out.println("Invoked to String Method");
		return super.toString();
	};

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode method");
		return 100;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals method");
		if (obj == null) {
			System.out.println("You have passed null value");
				return false;
		}
			if (obj instanceof NewsPaper) {
				System.out.println("Newspaper is  an instance of newspaper ");
				NewsPaper a = (NewsPaper) obj;
				System.out.println("Casted");
				String storage = a.getName();
				if (this.name.equals(storage)) {
					System.out.println("name have matched");
					return true;
				}
			}
			return false;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getSince() {
		return since;
	}

	protected void setSince(int since) {
		this.since = since;
	}

	protected boolean isLang() {
		return lang;
	}

	protected void setLang(boolean lang) {
		this.lang = lang;
	}

}
