package com.teamsankya.naturebandhuproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.teamsankya.naturebandhuproject.dao.NatureBandhuDao;
import com.teamsankya.naturebandhuproject.dto.ProductCategoryBean;
import com.teamsankya.naturebandhuproject.dto.ProductDetailsBean;
import com.teamsankya.naturebandhuproject.util.NatureBandhuUtil;

@Service
public class NatureBandhuServiceImpl implements NatureBandhuService {
	
	@Autowired
	@Qualifier("dao")
	private NatureBandhuDao dao;
	private NatureBandhuUtil util=new NatureBandhuUtil();

	/**
	 * Default Constructor
	 */
	public NatureBandhuServiceImpl() {
		
	}
	
	public List<ProductDetailsBean> getProduct(String productName)
	{
		System.out.println("inside NatureBandhuServiceImpl and calling getProduct");
		return dao.getProduct(productName);
	}

}
