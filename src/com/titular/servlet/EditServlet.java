package com.titular.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.titular.model.Student;
import com.titular.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentServiceImpl ser=new StudentServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int stuNo = Integer.parseInt(request.getParameter("stuNo"));
		Student student=new Student();
		student.setStudentno(stuNo);
		
		try {
			Student stu = ser.selectGetById(student);
			// ´æ
			request.setAttribute("list", stu);
			// ×ª
			request.getRequestDispatcher("/edit.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String studentno=request.getParameter("studentno");
		String loginpwd=request.getParameter("loginpwd");
		String studentname=new String(request.getParameter("studentname").getBytes("iso-8859-1"), "utf-8");
		String sex=request.getParameter("sex");
		String gradeid=request.getParameter("gradeid");
		String phone=request.getParameter("phone");
		String address=new String(request.getParameter("address").getBytes("iso-8859-1"), "utf-8");
		String borndate=request.getParameter("borndate");
		String email=request.getParameter("email");
		String identitycard=request.getParameter("identitycard");
try {
	int editStu=ser.edit(new Student(Integer.valueOf(studentno), loginpwd, studentname, sex.equals("ÄÐ")?true:false, Integer.valueOf(gradeid), phone, address, new SimpleDateFormat("yyyy-MM-dd").parse(borndate), email, identitycard));
	if (editStu>0) {
		request.getRequestDispatcher("SelectServlet").forward(request, response);
		
	} else {
		request.getRequestDispatcher("/add.jsp").forward(request, response);
	}
} catch (SQLException | NumberFormatException | ParseException e) {
	e.printStackTrace();
}
	}

}
