package com.xworkz.jpa.boot;


import com.xworkz.jpa.entity.SuperheroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       // System.out.println(emf);
        EntityManager em =emf.createEntityManager();
        System.out.println("EM"+em);
     EntityTransaction et= em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("ET begins");
        System.out.println("operation Starts");

        SuperheroEntity superheroEntity=new SuperheroEntity(3,"sams ","IRON Man","Strengh","USA","Magnet");
        em.persist(superheroEntity);
        et.commit();
        em.close();
        emf.close();
    }
}
