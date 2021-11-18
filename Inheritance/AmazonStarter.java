package com.xworkz.amazon;

import com.xworkz.amazon.dao.ArrayAmazonCartDAO;
import com.xworkz.amazon.dao.CartDTO;

public class AmazonStarter {

	public static void main(String[] args) 
	{
		CartDTO cartDTOs1 = new CartDTO("MI", 20, 18000.0f,4);
		ArrayAmazonCartDAO dto1 = new ArrayAmazonCartDAO();
		dto1.saveCart(cartDTOs1);

		dto1.saveCart(new CartDTO("VIO",30,10000.0f,3), 3);

		CartDTO ref = dto1.findByName("MI");
		System.out.println(ref);
		
		ArrayAmazonCartDAO arrayAmazonCartDAO=new ArrayAmazonCartDAO();
		System.out.println(arrayAmazonCartDAO.save(cartDTOs1));
		System.out.println(arrayAmazonCartDAO.findByName("mi"));
		arrayAmazonCartDAO.displayAllCartDetails();
		
	}

}