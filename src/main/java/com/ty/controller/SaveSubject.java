package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Course;
import com.ty.dto.Student;

public class SaveSubject {
	public static void main(String[] args) {
		EntityManagerFactory factroy = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factroy.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student student1 = new Student();
		student1.setAge(20);
		student1.setName("Sowjanya");

//        Course course1=new Course();
//        course1.setCost(20000);
//        course1.setName("java");
//        
//        Course course2=new Course();
//        course2.setCost(30000);
//        course2.setName("Advance java");

//		Course course3 = new Course();
//		course3.setCost(40000);
//		course3.setName("Python");

//        Course course4=new Course();
//        course4.setCost(20000);
//        course4.setName("HTML");

		Course course5 = new Course();
		course5.setCost(10000);
		course5.setName("CSS");

		List<Course> course = new ArrayList<Course>();
		Course c1 = entityManager.find(Course.class, 1);
		Course c2 = entityManager.find(Course.class, 2);
		Course c3 = entityManager.find(Course.class, 3);
		Course c4 = entityManager.find(Course.class, 4);

		course.add(c1);
		course.add(c2);
		course.add(c3);
		course.add(c4);

		course.add(course5);

		student1.setCourse(course);
		entityTransaction.begin();
//      entityManager.persist(course1);
//       entityManager.persist(course2);
		// entityManager.persist(course3);
		// entityManager.persist(course4);
		entityManager.persist(course5);

		entityManager.persist(student1);
		entityTransaction.commit();
		System.out.println("---data stored---------");

	}
}
