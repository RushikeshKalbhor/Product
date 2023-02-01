package com.algodomainsolution.testproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomainsolution.testproject.model.ProductInfo;
import com.algodomainsolution.testproject.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public void addProduct(ProductInfo p){
		repository.save(p);
	}
	public List<ProductInfo> displayAll(){
	return	repository.findAll();
	}
}
