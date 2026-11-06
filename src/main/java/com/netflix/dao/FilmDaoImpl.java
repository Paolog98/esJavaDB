package com.netflix.dao;

import com.netflix.model.Film;
import com.netflix.netflix.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class FilmDaoImpl implements FilmDao {


    public void save(Film f) {
        EntityManager em= JpaUtil.getFactory().createEntityManager();

        try{
            EntityTransaction t= em.getTransaction();
            t.begin();
            em.persist(f);
            t.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public List<Film> search(String regista) {
        EntityManager em= JpaUtil.getFactory().createEntityManager();

        Query q=em.createQuery("select f from Film f where f.regista= :r");

        q.setParameter("r",regista);

        List<Film> result=q.getResultList();

        return result;


    }
}
