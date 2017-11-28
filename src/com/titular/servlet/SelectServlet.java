package com.titular.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.titular.model.Student;
import com.titular.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentServiceImpl ser=new StudentServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> list;
		try {
			list = ser.findAll(null);
			request.setAttribute("list", list);
			request.getRequestDispatcher("/entry.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
