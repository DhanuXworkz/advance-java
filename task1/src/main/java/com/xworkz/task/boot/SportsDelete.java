package com.xworkz.task.boot;

import com.xworkz.task.entity.Shop;
import com.xworkz.task.entity.Sports;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsDelete {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("EM:"+em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET:"+et);
        et.begin();
        System.out.println("Starts");
        Sports sports=  em.find(Sports.class,2);
        if (sports!=null){
            em.remove(sports);
            System.out.println("Removed");

        }
        else
            System.out.println("Not removed");
        et.commit();
        em.close();
        emf.close();
    }
}
