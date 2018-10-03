package com.uws.saa.unit3.chocolates;

public class Person {
	private String name;
	
	public Person(String aName){
		this.name = aName;
	}

	public String eat(ChocolateCoin oneChocolate) {
		StringBuffer sb = new StringBuffer();
		sb.append(this.name); sb.append(" is oppening the chocolate \n");
		oneChocolate.open();
		sb.append(this.name); sb.append(" is taking out the chocolate \n");
		oneChocolate.getChocolate();
		//sb.append(this.name); sb.append(" is eating the chocolate. Yumi!\n");
		sb.append(this.name); sb.append(" is eating the "); sb.append(oneChocolate);sb.append(" Yumi!\n");
		return sb.toString();
	}

}
