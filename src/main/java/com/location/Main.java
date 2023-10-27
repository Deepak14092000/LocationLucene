package com.location;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        /* Create a new Postgres database

        PostgresTableCreator postgresTableCreator = new PostgresTableCreator();
        postgresTableCreator.createTables();

         */

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("YourPersistenceUnitName");
        EntityManager em = emf.createEntityManager();

        em.close();
        emf.close();

        System.out.println("Hello world!");
    }
}