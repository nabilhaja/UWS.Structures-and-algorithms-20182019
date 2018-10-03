package com.uws.saa.unit3.chocolates;

public class ChocolateCoin {
	private String wrapperColour;
	private boolean hasWrapper;
	private boolean hasChocolate;
	private int size = 0;
	
	
	
	public ChocolateCoin(String aColour, int _size) {
		this.hasChocolate = true;
		this.hasWrapper = true;
		this.wrapperColour = aColour;
		this.size = _size;
	}
	
	public String getWrappercolour() {
		return this.wrapperColour;
	}
	
	public boolean getChocolate() {
		if (!this.hasWrapper) {
			return false; 
		}
		else {
			this.hasChocolate = false;
			return true;
		}
		
	}
	
	public void open() {
		this.hasWrapper = false;
	}
}
