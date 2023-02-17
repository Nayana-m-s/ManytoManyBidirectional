package manytomanybi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanybi.dto.Course;
import manytomanybi.dto.Student;

public class Main {

	public static void main(String[] args) {
//		    Student s1=new Student();
//		    s1.setId(1);
//		    s1.setName("nayana");
//		    s1.setPhone(57800348);
//		    
//		    Student s2=new Student();
//		    s2.setId(2);
//		    s2.setName("snehal");
//		    s2.setPhone(6780900);
//		    
//		    Student s3=new Student();
//		    s3.setId(3);
//		    s3.setName("pinky");
//		    s3.setPhone(7924332);
//		    
//		    Course c1=new Course();
//		    c1.setCid(101);
//		    c1.setCname("java");
//		    c1.setDuartion("1 month");
//		    
//		    Course c2=new Course();
//		    c2.setCid(102);
//		    c2.setCname("adv java");
//		    c2.setDuartion("2 months");
//		    
//		    Course c3=new Course();
//		    c3.setCid(103);
//		    c3.setCname("sql");
//		    c3.setDuartion("1.5 months");
//		    
//		    List<Course> list1=new ArrayList<Course>();
//		    list1.add(c1);
//		    list1.add(c2);
//		    
//		    List<Course> list2=new ArrayList<Course>();
//		    list2.add(c1);
//		    list2.add(c2);
//		    list2.add(c3);
//		    
//		    
//		    s1.setList(list1);
//		    s2.setList(list1);
//		    s2.setList(list2);
//		    
//		    List<Student> stdlist1= new ArrayList<Student>();
//		     stdlist1.add(s1);
//		     stdlist1.add(s2);
//		     stdlist1.add(s3);
//		     
//
//			    List<Student> stdlist2= new ArrayList<Student>();
//			    stdlist2.add(s3);
//			    
//			    c1.setStudent(stdlist1);
//			    c2.setStudent(stdlist1);
//			    c3.setStudent(stdlist2);
			    
//			    EntityManagerFactory eMfEntityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//			    EntityManager eManager=eMfEntityManagerFactory.createEntityManager();
//			    EntityTransaction eTransaction=eManager.getTransaction();
//			    eTransaction.begin();
//			    eManager.persist(c1);
//			    eManager.persist(c2);
//			    eManager.persist(c3);
//			    eManager.persist(s1);
//			    eManager.persist(s2);
//			    eManager.persist(s3);
//			   
//			    
//			    eTransaction.commit();
		
		 EntityManagerFactory eMfEntityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		    EntityManager eManager=eMfEntityManagerFactory.createEntityManager();
			    
			    eManager.find(Student.class,1);
			    eManager.find(Student.class,1);
			    
		    
		    
		    

	}

}
