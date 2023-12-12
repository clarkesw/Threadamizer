/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.shopping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

//Notice no strategy classes. Look at Payment class.
public class ShoppingCartLambdas {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

        //money -> Payment.payByCreditCard(money)
	public PaymentStatus pay(Function<BigDecimal, PaymentStatus> payment) {

            Function<BigDecimal, PaymentStatus> requireNonNull = Objects.requireNonNull(payment);

		BigDecimal total = getTotal();
		
		//no strategy classes
		return payment.apply(total);
	}

	private BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Item item : items) {
			total = total.add(item.getPrice());
		}
		return total;
	}
}
