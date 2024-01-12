package com.xworkz.jpa.entity;

import com.xworkz.jpa.entity.Film;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FilmRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em =emf.createEntityManager();
        System.out.println("EM"+em);
        EntityTransaction et =em.getTransaction();
        System.out.println("ET"+et);
        et.begin();
        System.out.println("et starts");
        System.out.println("operation Starts");

        Film film=new Film(3,"Galipata","Ganesh","Yogaraj Bhat","SRs");
        em.persist(film);
        et.commit();
        em.close();
        emf.close();

    }
}
