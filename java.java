package Ejercicios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.UtilesHibernate;
import pojos.Equipo;

public class CargarEquipo {

	
	public static void main(String[] args) {
		SessionFactory factory = UtilesHibernate.getSessionFactory();
		Session sesion = factory.getCurrentSession();
		sesion.beginTransaction();
		
		
		
		Equipo e = (Equipo) sesion.get(Equipo.class, "Banesto");
		System.out.println(e.getDirector());
		
		
		
		
		sesion.getTransaction().commit();
	}


TRES
}