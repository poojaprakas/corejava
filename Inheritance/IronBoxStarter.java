package com.xworkz.festival;
  import com.xworkz.festival.company.PhilipIronBox;

public class IronBoxStarter {

	public static void main(String[] args) {
		
		PhilipIronBox philip=new PhilipIronBox("PHILIP","HIGH",true,178,220);
		philip.displayDetails();
		philip.produceHeat();

	}

}
