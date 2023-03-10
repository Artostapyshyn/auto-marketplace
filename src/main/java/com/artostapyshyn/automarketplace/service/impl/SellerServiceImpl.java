package com.artostapyshyn.automarketplace.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.artostapyshyn.automarketplace.entity.Seller;
import com.artostapyshyn.automarketplace.repository.SellerRepository;
import com.artostapyshyn.automarketplace.service.SellerService;

@Service
public class SellerServiceImpl implements SellerService{

	@Autowired
	private SellerRepository sellerRepository;
	
	@Override
	public Optional<Seller> findById(Long id) {
		return sellerRepository.findById(id);
	}

	@Override
	public Seller findByEmail(String email) {
		return sellerRepository.findByEmail(email);
	}

	@Override
	public Seller findByPhoneNumber(String phoneNumber) {
		return sellerRepository.findByPhoneNumber(phoneNumber);
	}

	@Override
	public Seller save(Seller seller) {
		return sellerRepository.save(seller);
	}

	@Override
	public List<Seller> findAll(Sort sort) {
		 return sellerRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		sellerRepository.deleteById(id);		
	}

}
