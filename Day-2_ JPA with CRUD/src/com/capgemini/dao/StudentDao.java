package com.capgemini.dao;

import com.capgemini.entities.Student;

public interface StudentDao 
{
	//user-defined method for CRUD operation
	//abstract method by default
	public abstract void addStudent(Student s);
	public abstract void updateStudent(Student s);
	public abstract void deleteStudent(Student s);
	public abstract Student getStudentById(int rollno);
	
	public abstract void beginTransaction();//begin means start
	public abstract void commitTransaction();//commit means end
}
