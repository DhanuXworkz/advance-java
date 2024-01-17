package com.xworkz.task.boot;

import com.xworkz.task.entity.Shop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopUpdate {
    public static void main(String[] args) {
     EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
    EntityManager em= emf.createEntityManager();
        System.out.println("EM"+em);
       EntityTransaction et= em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("Starts");
       Shop shop= em.find(Shop.class,1);
       if (shop!=null){
           shop.setName("PanShop");
           em.merge(shop);
           System.out.println("Updated");
       }
       else System.out.println("Not Updated");
       et.commit();
       em.close();
       emf.close();
    }
}
