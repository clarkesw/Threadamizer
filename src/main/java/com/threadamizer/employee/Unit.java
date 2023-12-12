/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.employee;

/**
 *
 * @author Clarke S.
 */
public enum Unit {

	FS("Financial Services"), 
	EDC("Extended Centre"), 
	OIL_GAS("Oil & Gas");

	private String unitName;

	private Unit(String name) {
		this.unitName = name;
	}
	
	public String getUnitName() {
		return unitName;
	}

}
