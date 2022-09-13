package com.capgemini.client;

import com.capgemini.entities.Student;
import com.capgemini.service.StudentService;
import com.capgemini.service.StudentServiceImplementation;

public class Client {

	public static void main(String[] args)
	{
		StudentService service=new StudentServiceImplementation();
		Student s=new Student();
		
		/*//create operation
		s.setRollno(1320);
		s.setName("Ajay");
		service.addStudent(s);

		//create operation
		s.setRollno(1335);
		s.setName("Tirth");
		service.addStudent(s);*/
		
		/*//retreieve
		s=service.getStudentById(1335);
		System.out.println("Student Roll No: "+s.getRollno());
		System.out.println("Student Name: "+s.getName());*/
		
		/*//update
		s=service.getStudentById(1335);
		s.setName("Samir");
		service.updateStudent(s);*/
		
		//delete
		s=service.getStudentById(1320);
		service.deleteStudent(s);
		System.out.println("Data is deleted");  
	}
}
