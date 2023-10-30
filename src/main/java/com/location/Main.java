package com.location;

import com.location.entity.Pondicherry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("location-pu");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Create an instance of your entity class
            Pondicherry pondicherry = new Pondicherry();
            pondicherry.setPincode(605008);
            pondicherry.setArea("Lawspet");
            pondicherry.setState("Pondicherry");
            pondicherry.setDistrict("Pondicherry");

            // Persist the entity to the database
            em.persist(pondicherry);

            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
    }
}