/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.trade;

/**
 *
 * @author Clarke S.
 */
class Stock {
 	private String name;
	private String symbol;
	private double price;

	public Stock(String symbol, String name, double price) {
		this.symbol = symbol;
		this.name = name;
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}   
}
