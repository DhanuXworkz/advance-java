package com.xworkz.task.boot;

import com.xworkz.task.entity.TrafficFine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficUpdate {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
     EntityManager em= emf.createEntityManager();
        System.out.println("EM:"+em);
      EntityTransaction et= em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("Operation starts");
       TrafficFine trafficFine= em.find(TrafficFine.class,1);
       if(trafficFine !=null){
           trafficFine.setVechicleOwner("Rakesh");
           em.merge(trafficFine);
           System.out.println("Update done");

       }
       else
           System.out.println("Not Done");
       et.commit();
       em.close();
       emf.close();
    }

}
