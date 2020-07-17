package com.jocodes.sbmicroservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rating {

	@Id
	private int rid;
	private String username;
	private String moviename;
	private int rating;

	public Rating() {

	}
	
	

	public Rating(int rid, String username, String moviename, int rating) {
		super();
		this.rid = rid;
		this.username = username;
		this.moviename = moviename;
		this.rating = rating;
	}



	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}


}
