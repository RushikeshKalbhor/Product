package com.algodomainsolution.testproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algodomainsolution.testproject.model.ProductInfo;
import com.algodomainsolution.testproject.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping("/api/add")
	public void addProduct(@RequestBody ProductInfo p){
		service.addProduct(p);
	}
	@GetMapping("/api/display")
	public List<ProductInfo> displayAll(){
		List<ProductInfo> productList=service.displayAll();
		return productList;
	}
}
