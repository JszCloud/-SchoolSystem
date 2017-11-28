package com.titular.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.titular.dao.impl.StudentDAOImpl;
import com.titular.model.Student;

public class StudentServiceImpl {
private StudentDAOImpl studentDAOImpl=new StudentDAOImpl();
	
	public List<Student> findAll(Student student) throws SQLException {
		return studentDAOImpl.findAll(student);
	}

	public Student selectGetById(Student student) throws SQLException {
		return studentDAOImpl.selectGetById(student);
	}

	public int save(Student student) throws SQLException {
		return studentDAOImpl.save(student);
	}

	public int remove(Student student) throws SQLException {
		return studentDAOImpl.remove(student);
	}

	public int edit(Student student) throws SQLException {
		return studentDAOImpl.edit(student);
	}
}
