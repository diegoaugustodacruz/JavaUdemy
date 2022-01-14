package model.dao;

import java.util.List;

import application.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	
	void update(Seller obj);
	
	void deleteById(Seller id);
	
	Seller findById(Seller id);
	
	List<Seller> findAll();

}