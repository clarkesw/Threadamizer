/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.bank;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BankTransaction {

	private String accNumber;
	private BigDecimal amount;
	private LocalDate date;

	public BankTransaction(String accNo, BigDecimal amount, LocalDate date) {
		this.accNumber = accNo;
		this.amount = amount;
		this.date = date;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public LocalDate getDate() {
		return date;
	}
}