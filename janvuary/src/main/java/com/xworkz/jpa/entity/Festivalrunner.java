package com.xworkz.jpa.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Festivalrunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em =emf.createEntityManager();
        System.out.println("EM"+em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("et begins");
        System.out.println("operation starts");
       Festival festival=new Festival(1,"Onam","kottyam","kerala","India");
        em.persist(festival);
        System.out.println("operation complete");
        et.commit();
        em.close();
        emf.close();
    }
}
