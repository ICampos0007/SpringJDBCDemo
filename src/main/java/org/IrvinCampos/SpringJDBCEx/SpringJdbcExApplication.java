package org.IrvinCampos.SpringJDBCEx;

import org.IrvinCampos.SpringJDBCEx.model.Student;
import org.IrvinCampos.SpringJDBCEx.repository.StudentRepository;
import org.IrvinCampos.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringJdbcExApplication.class, args);
		Student student = applicationContext.getBean(Student.class);
		student.setRollNo(104);
		student.setName("Locky");
		student.setMarks(80);
		StudentService studentService = applicationContext.getBean(StudentService.class);
		studentService.addStudent(student);

		StudentRepository studentRepository = applicationContext.getBean(StudentRepository.class);
		System.out.println(studentRepository.findAll());
	}
}
