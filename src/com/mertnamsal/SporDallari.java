package com.mertnamsal;

import java.util.Scanner;

public abstract class SporDallari implements IEylemler{

	private String takim1;
	private String takim2;
	static Scanner scan = new Scanner(System.in);
	
	public abstract void skorDurumu();

	public SporDallari(String takim1, String takim2) {
		super();
		this.takim1 = takim1;
		this.takim2 = takim2;
	}

	public String getTakim1() {
		return takim1;
	}

	public void setTakim1(String takim1) {
		this.takim1 = takim1;
	}

	public String getTakim2() {
		return takim2;
	}

	public void setTakim2(String takim2) {
		this.takim2 = takim2;
	} 
	
	
	
	
}
