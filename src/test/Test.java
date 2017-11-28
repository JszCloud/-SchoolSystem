package test;

import java.sql.SQLException;
import com.titular.model.Student;
import com.titular.service.impl.StudentServiceImpl;

public class Test {
	public static void main(String[] args) throws SQLException {
		StudentServiceImpl stu=new StudentServiceImpl();
		Student student =new Student();
		/*List<Student> list=stu.findAll(student);
		for (Student student2 : list) {
			System.out.println(student2);
		}*/
		/*student.setStudentno(1007);
		Student stu1=stu.selectGetById(student);
		System.out.println(stu1);
		stu1.setStudentname("Ð¡·¼");
		int row=stu.edit(stu1);
		System.out.println(row);*/
		student.setStudentno(1017);
		int row=stu.remove(student);
		System.out.println(row);
	}

}
