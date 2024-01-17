package com.xworkz.task.boot;

import com.xworkz.task.entity.Shop;
import com.xworkz.task.entity.Sports;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("EM:"+em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("Starts");
        Sports sports=new Sports(2,"Cricket","India","Rohit",11);
        em.persist(sports);
        System.out.println("Completed");
        et.commit();
        em.close();
        emf.close();
    }
}
