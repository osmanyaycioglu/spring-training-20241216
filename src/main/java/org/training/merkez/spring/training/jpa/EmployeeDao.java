package org.training.merkez.spring.training.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// @Repository
public class EmployeeDao {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Transactional
    public void insert(Employee employeeParam){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.joinTransaction();
        entityManager.persist(employeeParam);
        entityManager.close();
    }

}
