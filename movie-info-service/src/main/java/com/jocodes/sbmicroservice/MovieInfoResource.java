package com.jocodes.sbmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jocodes.sbmicroservice.model.Movie;

@RestController
public class MovieInfoResource {

	@Autowired
	MovieRepository movieRepository;

	@RequestMapping("/movie/{movieId}")
	@ResponseBody
	public Movie getMovieInfo(@PathVariable String movieId) {
		return movieRepository.findById(movieId).get();

	}

	@RequestMapping(method = RequestMethod.POST, value = "/movies")
	public void addMovieInfo(@RequestBody Movie movie) {
		movieRepository.save(movie);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/movie/{movieId}")
	public void updateMovieInfo(@PathVariable String movieId, @RequestBody Movie movie) {
		movieRepository.save(movie);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/movie/{movieId}")
	public void deleteMovie(@PathVariable String movieId) {
		movieRepository.deleteById(movieId);

	}

}
