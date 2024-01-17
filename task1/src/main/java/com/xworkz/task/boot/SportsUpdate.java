package com.xworkz.task.boot;

import com.xworkz.task.entity.Sports;
import com.xworkz.task.entity.TrafficFine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsUpdate {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("EM:" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("ET" + et);
        et.begin();
        System.out.println("Operation starts");
        Sports sports = em.find(Sports.class, 1);
        if (sports != null) {
            sports.setCaptainName("Rakesh");
            em.merge(sports);
            System.out.println("Update done");
        }
        else
            System.out.println("Not Done");
        et.commit();
        em.close();
        emf.close();
    }
}
