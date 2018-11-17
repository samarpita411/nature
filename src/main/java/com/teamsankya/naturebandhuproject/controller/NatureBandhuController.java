package com.teamsankya.naturebandhuproject.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.teamsankya.naturebandhuproject.dto.ProductDetailsBean;
import com.teamsankya.naturebandhuproject.service.NatureBandhuService;
import com.teamsankya.naturebandhuproject.util.NatureBandhuUtil;

@Controller
public class NatureBandhuController {
	@Autowired
	@Qualifier("service")
	private NatureBandhuService service;
	private NatureBandhuUtil util = new NatureBandhuUtil();

	final static Logger LOGGER = Logger.getLogger(NatureBandhuController.class);

	@RequestMapping(path = "/getproduct", method = RequestMethod.POST)
	public String getProduct(ModelMap map, String productName) throws IOException {
		LOGGER.info("inside NatureBandhu Controller");
		LOGGER.info(productName);

		List<ProductDetailsBean> productList = service.getProduct(productName);

		map.addAttribute("productbean", productList);
		if(productList == null) {

			System.out.println(" inside controller failure block");
			return "failure";
		}
		System.out.println("The product : "+productList);
		System.out.println("inside controller success block");
		return "success";

	}

}
