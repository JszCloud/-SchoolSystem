package com.titular.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.titular.model.Student;

public class StudentDAOImpl {
	DataSource ds = new ComboPooledDataSource();
	QueryRunner ruanner = new QueryRunner(ds);

	public List<Student> findAll(Student stu) throws SQLException {
		String sql = "select * from student";
		List<Student> list = ruanner.query(sql, new BeanListHandler<>(Student.class));
		
		return list;
	}

	public Student selectGetById(Student stu) throws SQLException {
		Student stu1=null;
		System.out.println(stu.getStudentno());
		String sql = "select * from student where studentno=?";
		stu1 =  ruanner.query(sql, new BeanHandler<>(Student.class), stu.getStudentno());
		System.out.println(stu1);
		return stu1;

	}

	public int save(Student stu) throws SQLException {
		int row = 0;
		String sql = "insert into student(studentno,loginpwd, studentname, sex, gradeid, phone, address, borndate, email, identitycard) values(?,?,?,?,?,?,?,?,?,?)";
		row=ruanner.update(sql,
				stu.getStudentno(),
				stu.getLoginpwd(),
				stu.getStudentname(),
				stu.getSex(),
				stu.getGradeid(),
				stu.getPhone(),
				stu.getAddress(),
				stu.getBorndate(),
				stu.getEmail(),
				stu.getIdentitycard());
		return row;

	}

	public int remove(Student stu) throws SQLException {
		int row=0;
		String sql="delete from  student where studentno=?";
		System.out.println(stu);
		row=ruanner.update(sql,stu.getStudentno());
		return row;
	}

	public int edit(Student stu) throws SQLException {
		int row=0;
		
		String sql="update student set loginpwd=?, studentname=?, sex=?, gradeid=?, phone=?, address=?, borndate=?, email=?, identitycard=? where studentno=?";
		row=ruanner.update(sql,
				
				stu.getLoginpwd(),
				stu.getStudentname(),
				stu.getSex(),
				stu.getGradeid(),
				stu.getPhone(),
				stu.getAddress(),
				stu.getBorndate(),
				stu.getEmail(),
				stu.getIdentitycard(),
				stu.getStudentno()
		);
		return row;
	}
}
