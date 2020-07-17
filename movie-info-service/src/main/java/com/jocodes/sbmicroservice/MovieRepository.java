package com.jocodes.sbmicroservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jocodes.sbmicroservice.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, String>{
	
	

}
