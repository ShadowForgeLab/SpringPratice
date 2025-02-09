package com.SpringJDBC;

import com.SpringJDBC.model.Student;
import com.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);

		StudentService service=context.getBean(StudentService.class);

		Student s=context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Navin");
		s.setMarks(78);

		service.addStudetns(s);

		List<Student> students=service.getStudents();

		System.out.println(students);
	}

}
