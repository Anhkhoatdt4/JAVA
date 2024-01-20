package view;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class Ex01HibernateTest {
	public static void main(String[] args) {
		SessionFactory sf = HibernateProvider.getSessionFactory();
		
//		Session: khi tao ra 1 session -> tao ra 1 thread truy cap 
//		lien ket tu java vao database
//		co 2 cach de tao ra session trong jpa/hibernate tu sessionfactory
//	 openSession() luon tao ra 1 thread moi 
//		get Curent Session() -> singleton - chi co 1 thread (session)duy nhat duoc tao ra
		
		
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();
		System.out.println("sesion ->>" + session1);
		System.out.println("sesion ->>" + session2);
	
	
		Session session3 = sf.getCurrentSession();
		Session session4 = sf.getCurrentSession();
		System.out.println("sesion ->>" + session3);
		System.out.println("sesion ->>" + session4);
	}
}
