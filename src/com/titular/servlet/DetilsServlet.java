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
 * Servlet implementation class DetilsServlet
 */
@WebServlet("/DetilsServlet")
public class DetilsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentServiceImpl ser=new StudentServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// È¡
				int stuNo = Integer.parseInt(request.getParameter("stuNo"));
				if (stuNo!=0) {
					
					// µ÷
					Student student=new Student();
					student.setStudentno(stuNo);
					
					try {
						Student stu = ser.selectGetById(student);
						// ´æ
						request.setAttribute("list", stu);
						// ×ª
						request.getRequestDispatcher("/details.jsp").forward(request, response);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
