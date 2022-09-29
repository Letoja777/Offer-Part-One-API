package com.aval.spring.offers.dao;

import com.aval.spring.offers.entity.Offers;
//import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class OffersDAOImpl implements OffersDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List <Offers> getAllOffers() {
        Query query = entityManager.createQuery("from Offers");
        List<Offers> allOffers = query.getResultList();
        return allOffers;
    }
}
