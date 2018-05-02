package com.msmolen.allegrotask;


/**
 * Class representing a Movie object
 *
 *@author Maciej Smolen
 */
public class Movie {

	private final int id;
	private final String name;
	private final int year;
	private final String director;
	private final String country;
	
	/**
	 * Movie object constructor
	 *
	 *@param id Movie ID number
	 *@param name Movie name
	 *@param year Movie production year
	 *@param director Movie director name
	 *@param country Mobie production country
	 */
	public Movie(int id, String name, int year, String director, String country){
		this.id = id;
		this.name = name;
		this.year = year;
		this.director = director;
		this.country = country;	
	}

	/**
	 * Getter method for movie ID
	 *
	 * @return Movie id
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * Getter method for movie name
	 *
	 * @return Movie name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Getter method for year
	 *
	 * @return Movie production year
	 */
	public int getYear(){
		return year;
	}
	
	/**
	 * Getter method for movie director
	 *
	 * @return Movie director
	 */
	public String getDirector(){
		return director;
	}
	
	/**
	 * Getter method for movie production country
	 *
	 * @return Movie production country
	 */
	public String getCountry(){
		return country;
	}
	
	
	

}