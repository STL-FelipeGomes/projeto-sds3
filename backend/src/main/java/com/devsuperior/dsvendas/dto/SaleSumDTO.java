package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String SellerName;
	private double sum;
	
	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, double sum) {
		SellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
	
	
}
