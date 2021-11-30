package com.luv2code.springdemo.mvc2;

import java.util.LinkedHashMap;


public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	//private LinkedHashMap<String, String> countryOptions;
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	/*public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}*/

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Student() {
		/*countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");*/
		favoriteLanguageOptions = new LinkedHashMap<String, String>();
		
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C++", "C++");
		favoriteLanguageOptions.put("C", "C");
		favoriteLanguageOptions.put("Python", "Python");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
