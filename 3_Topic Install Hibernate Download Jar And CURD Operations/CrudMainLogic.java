package com.airlines.test;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class CrudMainLogic {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		Airline p = new Airline();

		
//Save Main logic
/*		
		p.setaId(1);
		p.setaName("Trujet Airline");
		p.setaType("Aircraft");
		p.setaCountry("India");

		Transaction tx = session.beginTransaction();
		session.save(p);
		
		System.out.println("Object saved successfully.....!!");
		System.out.println(p);
		
		tx.commit();
		*/
	
		
//Select Main logic
/*		
		Object o = session.get(Airline.class, new Integer(1));
		Airline a1 = (Airline) o;

		System.out.println("    Airline ID   : " + a1.getaId());
		System.out.println("    Airline Name : " + a1.getaName());
		System.out.println("    Airline Type : " + a1.getaType());
		System.out.println(" Airline Country : " + a1.getaCountry());
*/
		

		
//Update Main Logic
/*		
		Object o = session.get(Airline.class, new Integer(1));
		Airline a = (Airline) o;
		a.setaName("Lufthansa Airlines");
		a.setaCountry("German");

		Transaction tx = session.beginTransaction();
		session.update(a); 
		System.out.println("Object delete successfully.....!!");
		tx.commit();
	*/
	
		
		
//Delete Main Logic
		
		Object o=session.get(Airline.class, new Integer(1));
		Airline a=(Airline)o;
		
		
		Transaction tx = session.beginTransaction();
		session.delete(a);
		System.out.println("Loaded object Airline name is : "+" Id :  "+a.getaId()+", Name :"+a.getaName()+", Type : "+a.getaType()+" "+a.getaCountry());
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		
		
		session.close();
		sf.close();
	}
}