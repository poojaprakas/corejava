package com.xworkz.busroute;
import com.xworkz.busroute.EmailOperator;
import com.xworkz.busroute.EmailValidationException;
import com.xworkz.busroute.StorageFullRunTimeException;
public class EmailStarter {
		
			public static void main(String[] args) throws EmailValidationException, StorageFullRunTimeException {
				EmailOperator emailoperator = new EmailOperator();
				emailoperator.save("poojaxworkz@gmail.com");
			}

		

	}


