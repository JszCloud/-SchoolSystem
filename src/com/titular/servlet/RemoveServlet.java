package com.titular.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.titular.model.Student;
import com.titular.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class RemoveServlet
 */
@WebServlet("/RemoveServlet")
public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentServiceImpl ser=new StudentServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int stuNo = Integer.parseInt(request.getParameter("stuNo"));
		
			try {
				if (stuNo!=0) {
					Student student=new Student();
					student.setStudentno(stuNo);
					int row=ser.remove(student);
					if (row>0) {
						request.getRequestDispatcher("SelectServlet").forward(request, response);
					}
					
			} else {

			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
