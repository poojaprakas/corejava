package com.xworkz.busroute;
import com.xworkz.busroute.StorageFullRunTimeException;
import com.xworkz.busroute.business.PanOperator;
import com.xworkz.busroute.business.PanValidationException;

public class PanStarter {
	public static void main(String[] args) throws EmailValidationException, StorageFullRunTimeException, PanValidationException {
		PanOperator panoperator = new PanOperator();
		panoperator.save("GAN78901");
	}



}




	
	

	

	
