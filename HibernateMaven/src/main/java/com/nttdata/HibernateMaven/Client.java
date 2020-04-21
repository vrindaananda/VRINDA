package com.nttdata.HibernateMaven;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	Configuration cfg=new Configuration();
	cfg.configure("hibernateconfig.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	employee e=new employee();
	System.out.println("enter the id");
	int id=s.nextInt();
	e.setId(id);
	System.out.println("enter the name");
	String name=s.next();
	e.setName(name);
	session.save(e);
	Transaction t1=session.beginTransaction();
	t1.commit();

}
}
