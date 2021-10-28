package com.xworkz.dp.dto;

public class StudentStarter {

	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.setNoOfStudent(67);
		student.setUniFormColour("blue");
		student.setExamMarks(45);
		
		Student student1=new Student();
		student1.setNoOfStudent(34);
		student1.setUniFormColour("red");
		student1.setExamMarks(67);
		
		Student student2=new Student();
		student2.setNoOfStudent(45);
		student2.setUniFormColour("purple");
		student2.setExamMarks(90);
		
		
		
	        
		System.out.println(student.getNoOfStudent());
		System.out.println(student.getUniFormColour());
		System.out.println(student.getExamMarks());
		
		System.out.println(student1.getNoOfStudent());
		System.out.println(student1.getUniFormColour());
		System.out.println(student1.getExamMarks());
		
		System.out.println(student2.getNoOfStudent());
		System.out.println(student2.getUniFormColour());
		System.out.println(student2.getExamMarks());
		
	}

}
