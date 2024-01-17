package com.xworkz.task.boot;

import com.xworkz.task.entity.TrafficFine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficDelete {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
      EntityManager em= emf.createEntityManager();
        System.out.println("EM:"+em);
       EntityTransaction et= em.getTransaction();
        System.out.println("ET:"+et);
        et.begin();
        System.out.println("Starts");
      TrafficFine trafficFine=  em.find(TrafficFine.class,2);
      if (trafficFine!=null){
          em.remove(trafficFine);
          System.out.println("Removed");

      }
      else
          System.out.println("Not removed");
      et.commit();
      em.close();
      emf.close();



    }
}
