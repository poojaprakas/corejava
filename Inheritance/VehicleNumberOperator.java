package com.xworkz.busroute.business;

import com.xworkz.busroute.EmailValidationException;
import com.xworkz.busroute.StorageFullRunTimeException;

public class VehicleNumberOperator {

	private String[] vehiclenumberoperator = new String[5];
	private int count = 0;

	public void save(String vehiclenumberoperator) throws Exception {
		System.out.println("Invoked save method from Email Operator");
		if (this.count < this.vehiclenumberoperator.length && vehiclenumberoperator != null) {
			this.vehiclenumberoperator[this.count++] = vehiclenumberoperator;
			if (vehiclenumberoperator.contains("@") && vehiclenumberoperator.endsWith(".com")) {
				System.out.println("vehiclenumber is Valid");

			} else {
				System.err.println("vehiclenumber is Invalid");
				throw new Exception();
			}
		} else {
			System.err.println("Email is equal to null");
			throw new StorageFullRunTimeException();

		}

	}
}




