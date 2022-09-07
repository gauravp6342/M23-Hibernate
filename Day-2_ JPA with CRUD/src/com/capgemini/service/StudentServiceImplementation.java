package com.capgemini.service;

import com.capgemini.dao.StudentDao;
import com.capgemini.dao.StudentDaoImplementation;
import com.capgemini.entities.Student;

public class StudentServiceImplementation implements StudentService 
{
	private StudentDao dao;
	public StudentServiceImplementation() {
		super();
		dao=new StudentDaoImplementation();
	}
	@Override
	public void addStudent(Student s) {
		dao.beginTransaction();
		dao.addStudent(s);
		dao.commitTransaction();
	}
	@Override
	public void updateStudent(Student s) {
		dao.beginTransaction();
		dao.updateStudent(s);
		dao.commitTransaction();	
	}
	@Override
	public void deleteStudent(Student s) {
		dao.beginTransaction();
		dao.deleteStudent(s);
		dao.commitTransaction();
	}
	@Override
	public Student getStudentById(int rollno) {
		Student s=dao.getStudentById(rollno);
		return s;
	}
}
