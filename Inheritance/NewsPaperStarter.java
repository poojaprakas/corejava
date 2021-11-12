package com.xworkz.hajama;

public class NewsPaperStarter {

	public static void main(String[] args) {
		NewsPaper news1=new NewsPaper(); 
		NewsPaper news2=new NewsPaper();
		System.out.println(news1.toString());
		System.out.println(news1.hashCode());
		
		news1.setName("prajavani");
		news2.setName("kannadaprabha");
		System.out.println(news1.equals(news1));

	}

}
