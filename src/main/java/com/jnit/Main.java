package com.jnit;

import org.hibernate.Session;

public class Main {
	public static void main(String args[]) {
		Main m = new Main();
		int sid = m.saveStudent("Rahul", "Roy", "2A");
		System.out.println(sid);
	}

	public int saveStudent(String firstName, String lastName, String section) {
        
		Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setSection(section);
 
        Session session = HibernateUtil.buildSessionFactory().openSession();
        session.beginTransaction();
 
        int id = (Integer) session.save(student);
        session.getTransaction().commit();
        session.close();
        return id;
    }
}
