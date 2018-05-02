package com.msmolen.allegrotask;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring controller for performing operations on RESTful Spring web service
 *
 *@author Maciej Smolen
 */
@RestController
public class MovieController{
	
	private ArrayList<Movie> movieList = new ArrayList<Movie>();
	
	/**
	 * Method responsible for adding a movie to the list
	 *
	 * @param name Movie name
	 * @param year Movie production year
	 * @param director Movie director
	 * @param country Movie production country
	 * @return A new created movie object
	 */
	@RequestMapping("/addMovie")
	public Movie addMovie(@RequestParam(value="name", defaultValue="unknown") String name, @RequestParam(value="year", required = false, defaultValue="0") int year, @RequestParam(value="director", defaultValue="unknown") String director, @RequestParam(value="country", defaultValue="unknown") String country){
		int size = movieList.size();
		int id = size+1;
		Movie temp = new Movie(id, name, year, director, country);
		movieList.add(temp);
		
		return temp;
	}
	
	/**
	 * Method responsible for listing movies in the set
	 *
	 * @return List of movies
	 */
	@RequestMapping("/listMovies")
	public ArrayList<Movie> listMovies(){		
		return movieList;
	}
	
	/**
	 * Method responsible for getting movie details
	 *
	 * @param id Movie ID
	 * @return Details of selected movie
	 */
	@RequestMapping("/getMovieDetails")
	public Movie getMovieDetails(@RequestParam(value = "id", required = false, defaultValue = "0") int id){
		if (id==0)
			return null;
		else
			return movieList.get(id-1);
		
	}
	
	/**
	 * Method responsible for getting list size
	 *
	 * @return Size of list
	 */
	@RequestMapping("/getSize")
	public int getSize(){
		return movieList.size();
	}
	
	
	
	
}