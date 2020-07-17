package com.jocodes.sbmicroservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jocodes.sbmicroservice.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer>{
	
	public  List<Rating> findByUsername(String username);
	
	

}
