package com.teamsankya.naturebandhuproject.service;

import java.util.List;

import com.teamsankya.naturebandhuproject.dto.ProductDetailsBean;



public interface NatureBandhuService {

	public List<ProductDetailsBean> getProduct(String productName);

}
