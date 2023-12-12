/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.shopping;

import java.math.BigDecimal;

public class ShoppingCartLambdasTest {
	
	public static void main(String[] args) {
		Item item1 = new Item("Phone",BigDecimal.valueOf(200.00));
		Item item2 = new Item("Laptop",BigDecimal.valueOf(800.00));
		Item item3 = new Item("Paper",BigDecimal.valueOf(10.00));
		
		ShoppingCartLambdas shoppingCart = new ShoppingCartLambdas();
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		shoppingCart.addItem(item3);
	
		//Testing with lambdas (can be improved)
		System.out.println(shoppingCart.pay(money -> Payment.payByCreditCard(money)));
	}

}
