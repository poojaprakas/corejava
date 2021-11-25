package com.xworkz.busroute.business;

import com.xworkz.busroute.EmailValidationException;
import com.xworkz.busroute.StorageFullRunTimeException;

public class PanOperator {
	private String[] pan = new String[5];
	private int count = 0;

	public void save(String email) throws PanValidationException,StorageFullRunTimeException {
		System.out.println("Invoked save method from Email Operator");
		if (this.count < this.pan.length && pan != null) {
			this.pan[this.count++] = pan;
			if (email.contains("@") && email.endsWith(".com")) {
				System.out.println("Pan is Valid");

			} else {
				System.err.println("Pan is Invalid");
				throw new EmailValidationException();
			}
		} else {
			System.err.println("pan is equal to null");
			throw new StorageFullRunTimeException();

		}

	}
}




