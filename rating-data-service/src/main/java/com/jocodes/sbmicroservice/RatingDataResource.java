package com.jocodes.sbmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jocodes.sbmicroservice.model.Rating;
import com.jocodes.sbmicroservice.model.UserRating;

@RestController
public class RatingDataResource {

	@Autowired
	RatingRepository ratingRepository;

	@RequestMapping("/rating/{username}")
	@ResponseBody
	public Object getRatings(@PathVariable String username) {

		UserRating userRatings = new UserRating();
		userRatings.setRatings(ratingRepository.findByUsername(username));
		return userRatings;


	}

	@PostMapping("/ratings")
	public void addRatings(@RequestBody Rating rating) {
		ratingRepository.save(rating);

	}

	@DeleteMapping("/rating/{id}")
	public void deleteRatings(@PathVariable int rid) {
		ratingRepository.deleteById(rid);

	}

	@PutMapping("/rating")
	public void updateRatings(@RequestBody Rating rating) {
		ratingRepository.save(rating);

	}

}
