package com.accolite.SpringHiberNetJpaMTM;

import com.accolite.SpringHiberNetJpaMTM.Entites.Students;
import com.accolite.SpringHiberNetJpaMTM.Entites.Teacher;
import com.accolite.SpringHiberNetJpaMTM.Services.StudentsServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringHiberNetJpaMtmApplicationTests {
	@Autowired
	StudentsServices services;

	@Test
	void contextLoads() {
		Students stu4=new Students();

		stu4.setName("TNBKYESASVI");
		stu4.setPhonenumber(9966795977l);
		stu4.setEmail("tyesasvi200@gmail.com");
		Students stu5=new Students();

		stu5.setName("Nikita");
		stu5.setPhonenumber(9966795988l);
		stu5.setEmail("nikita@gmail.com");

		//List<Teacher> teachers=new ArrayList<>();


		Teacher tea1=new Teacher("Rani");
		Teacher tea2=new Teacher("Sugun");
		Teacher tea3=new Teacher("Revanth");

		stu4.getTeaList().add(tea1);
		stu4.getTeaList().add(tea2);
		stu4.getTeaList().add(tea3);



//		teachers.add(tea1);
//		teachers.add(tea2);
//		teachers.add(tea3);
//
//
//
//		stu4.setTeaList(teachers);
//		stu4.getTeaList().add(teachers);


		services.CreateStudents(stu4);
		services.CreateStudents(stu5);
		System.out.println(services.getAllStudents());



	}

}
