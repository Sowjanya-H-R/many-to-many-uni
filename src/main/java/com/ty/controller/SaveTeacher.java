package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Subject;
import com.ty.dto.Teacher;

public class SaveTeacher {
	public static void main(String[] args) {
		EntityManagerFactory factroy = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factroy.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Teacher teacher=new Teacher();
		teacher.setName("vinod");
		teacher.setAge(30);
	
		List<Subject> sub=new ArrayList<Subject>();
		
		
		Subject subject=new Subject();
		subject.setDays(65);
		subject.setName("hibernate");
//		
		sub.add(subject);
		
		Subject subject3=entityManager.find(Subject.class, 2);
		
//	  Teacher teacher1=entityManager.find(Teacher.class,1);
//	  List <Subject> sub1=teacher1.getSubject();
//	  Subject subject1=sub1.get(0);
	  
	
//		Subject subject1=new Subject();
//		subject1.setDays(50);
//		subject1.setName("English");
//		
//		Subject subject2=new Subject();
//		subject2.setDays(45);
//		subject2.setName("Social");
		
         sub.add(subject3);
//		sub.add(subject1);
//		sub.add(subject2);
		
		teacher.setSubject(sub);
		
		entityTransaction.begin();
		entityManager.persist(teacher);
		 entityManager.persist(subject);
		
		 
		 entityTransaction.commit();
		 
		 System.out.println("saved successfully");
	}
}
