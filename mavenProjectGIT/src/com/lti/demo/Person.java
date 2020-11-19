package com.lti.demo;

public class Person {
	
	private int personAge;
	private String personName;
	private double personScore;
	
	
	@Override
	public String toString() {
		return "Person [personAge=" + personAge + ", personName=" + personName + ", personScore=" + personScore + "]";
	}
	public Person(int personAge, String personName, double personScore) {
		super();
		this.personAge = personAge;
		this.personName = personName;
		this.personScore = personScore;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public double getPersonScore() {
		return personScore;
	}
	public void setPersonScore(double personScore) {
		this.personScore = personScore;
	}
	

}
