package com.xworkz.task.boot;

import com.xworkz.task.entity.Shop;
import com.xworkz.task.entity.TrafficFine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopRead {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em= emf.createEntityManager();
        System.out.println("EM"+em);
        EntityTransaction et= em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("Operation Starts");


        Shop shop= em.find(Shop.class,2);
        System.out.println("Entity Found:"+shop);
        em.persist(shop);
        et.commit();
        em.close();
        emf.close();
    }
}
