package com.xworkz.jpa.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficRunner {
    public static void main(String[] args) {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    EntityManager em =emf.createEntityManager();
        System.out.println("EM"+em);
       EntityTransaction et= em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("et begins");
        System.out.println("operation starts");
        Traffic traffic=new Traffic(1,"Rajajinagar","bengalore","Karnataka","India");
        em.persist(traffic);
        System.out.println("operation complete");
        et.commit();
        em.close();
        emf.close();
    }
}
