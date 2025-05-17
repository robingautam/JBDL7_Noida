package org.gfg.JBDL7_SpringJPA;

import org.gfg.JBDL7_SpringJPA.model.Student;
import org.gfg.JBDL7_SpringJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jbdl7SpringJpaApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Jbdl7SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setName("Robin");
		student.setEmail("robin@gmail.com");
		student.setAge(23);
     // save
	//	studentRepository.save(student);

	//	System.out.println("Data saved");

		// fetch
	//	Student data = studentRepository.findById(1).get();

	//		System.out.println(data);

		//	studentRepository.deleteById(1);

		//System.out.println("data deleted");

	//	studentRepository.save(student);

		//Student data = studentRepository.findByEmail("robin@gmail.com2");
	//	Student data = studentRepository.findByEmailAndName("robin@gmail.com","Robin1");

	//	Student data = studentRepository.findByEmailOrName("robin@gmail.com","robin34");

		//Student data = studentRepository.findByAgeGreaterThan(30);

	//	Student data = studentRepository.findByNameAndEmailCustomQuery("Robin","robin@gmail.com");

	//	System.out.println(data);

		studentRepository.updateEmailById(1,"robingautam@Yahoo.com");

	}
}
