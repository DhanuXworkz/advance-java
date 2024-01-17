package com.xworkz.task.boot;

import com.xworkz.task.entity.Shop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
      EntityManager em= emf.createEntityManager();
        System.out.println("EM:"+em);
      EntityTransaction et= em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("Starts");
        Shop shop=new Shop(2,"Flowershop","345","Bhasham",354365);
        em.persist(shop);
        System.out.println("Completed");
        et.commit();
        em.close();
        emf.close();
    }
}
