package com.uws.saa.unit3.chocolates;

import java.util.ArrayList;

public class TestBagOfChocolates {

	public static void main(String[] args) {
		
		
		ArrayList<ChocolateCoin> tempList = new ArrayList<ChocolateCoin>();
		
		tempList.add(new ChocolateCoin("Yellow", 2));
		tempList.add(new ChocolateCoin("Yellow", 2));
		tempList.add(new ChocolateCoin("Pink", 1));
		tempList.add(new ChocolateCoin("Pink", 1));
		tempList.add(new ChocolateCoin("Pink", 1));
		tempList.add(new ChocolateCoin("Purpule", 1));
		tempList.add(new ChocolateCoin("Purpule", 1));
		tempList.add(new ChocolateCoin("blue", 2));
		
		ChocolateBag cb = new ChocolateBag(tempList);
		
		Person santiago = new Person("Santiago");
		String text = santiago.eat(cb.getOne());
		System.out.println(text);
		
	}

}
