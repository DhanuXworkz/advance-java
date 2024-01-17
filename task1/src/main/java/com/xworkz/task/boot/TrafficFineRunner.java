package com.xworkz.task.boot;

import com.xworkz.task.entity.TrafficFine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineRunner {
    public static void main(String[] args) {
      EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
     EntityManager em= emf.createEntityManager();
        System.out.println("EM:"+em);
       EntityTransaction et= em.getTransaction();
        System.out.println("ET:"+et);
        et.begin();
        System.out.println("entity transaction begins ");
        System.out.println("Operation Starts");
        TrafficFine trafficFine=new TrafficFine(2,"Drink And Drive",4356,"Chandan",2000.00);
        em.persist(trafficFine);
        System.out.println("Operation complete");
        et.commit();
        em.close();
        emf.close();



    }
}
