/*
Clase Principal.java creada el 29/03/2023
*/
package com.itson.proyecto2bda.principal;

import com.itson.proyecto2bda.dominio.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 233410_233023
 */
public class Principal {

    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("com.itson.proyecto2BDA"); //El nombre se saca de OtherSources/src/main/resources/META-INF/persistance.xml
       EntityManager entityManager = managerFactory.createEntityManager();
       entityManager.getTransaction().begin();
       Persona persona = new Persona();
       entityManager.persist(persona);
        entityManager.getTransaction().commit();
    }
    
}
