package com.bsiback.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tarcisio on 13-02-2017.
 */
public abstract class GenericDao<T, I extends Serializable> {

    @Inject
    protected EntityManager entityManager;

    private Class<T> persistedClass;

    protected GenericDao() {
    }

    protected GenericDao(Class<T> persistedClass) {
        this();
        this.persistedClass = persistedClass;
    }

    public T save(T entity) {
        EntityTransaction t = entityManager.getTransaction();
        t.begin();
        entityManager.persist(entity);
        entityManager.flush();
        t.commit();
        return entity;
    }

    public T update(T entity) {
        EntityTransaction t = entityManager.getTransaction();
        t.begin();
        entityManager.merge(entity);
        entityManager.flush();
        t.commit();
        return entity;
    }

    public void delete(I id) {
        T entity = encontrar(id);
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        T mergedEntity = entityManager.merge(entity);
        entityManager.remove(mergedEntity);
        entityManager.flush();
        tx.commit();
    }

    public List<T> getList() {

        System.out.println(entityManager);

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(persistedClass);
        query.from(persistedClass);
        return entityManager.createQuery(query).getResultList();

    }

    public T encontrar(I id) {
        return entityManager.find(persistedClass, id);
    }
}