/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.shopping;

import java.math.BigDecimal;

public class Payment {
    	public static PaymentStatus payByCreditCard(BigDecimal money) {
		System.out.println("Paying by credit card : " + money);
		return PaymentStatus.SUCCESS;
	}

	public static PaymentStatus payByDebitCard(BigDecimal money) {
		System.out.println("Paying by debit card : " + money);
		return PaymentStatus.SUCCESS;
	}

	public static PaymentStatus cashOnDelivery(BigDecimal money) {
		System.out.println("Paying by cash on delivery : " + money);
		return PaymentStatus.PENDING;
	}
}
