package com.algodomainsolution.testproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algodomainsolution.testproject.model.ProductInfo;

@Repository
public interface ProductRepository extends JpaRepository<ProductInfo, Integer> {

}
