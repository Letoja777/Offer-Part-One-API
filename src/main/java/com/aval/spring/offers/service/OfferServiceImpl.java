package com.aval.spring.offers.service;

import com.aval.spring.offers.dao.OffersDAO;
import com.aval.spring.offers.entity.Offers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OfferServiceImpl implements OfferService{

    @Autowired
    private OffersDAO offersDAO;

    @Override
    @Transactional
    public List<Offers> getAllOffers() {
        return offersDAO.getAllOffers();
    }
}
