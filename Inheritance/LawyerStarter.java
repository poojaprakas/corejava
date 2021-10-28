package com.xworkz.dp;

import com.xworkz.dp.dao.LawyerDAO;
import com.xworkz.dp.dto.BucketDTO;
import com.xworkz.dp.dto.Lawyer;

public class LawyerStarter {

	public static void main(String[] args) {
		Lawyer ref=new Lawyer("vani","LLB","two years",'f',25,true,false);
		
		Lawyer ref1=new Lawyer("vani","LLB","two years",'f',25,true,false);
		
	LawyerDAO lawyerDAO=new LawyerDAO();
		lawyerDAO.save(ref1);
	}
}
		
	