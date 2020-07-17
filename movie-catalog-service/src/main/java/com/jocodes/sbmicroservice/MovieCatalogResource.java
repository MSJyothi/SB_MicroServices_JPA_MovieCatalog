package com.jocodes.sbmicroservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jocode.sbmicroservice.model.CatalogItem;
import com.jocode.sbmicroservice.model.Movie;
import com.jocode.sbmicroservice.model.Rating;
import com.jocode.sbmicroservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/{userName}")
	public List<CatalogItem> getCatalog(@PathVariable String userName) {

		List<Rating> ratings = restTemplate
				.getForObject("http://rating-data-service/rating/" + userName, UserRating.class).getRatings();

		return ratings.stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movie/" + rating.getMoviename(),
					Movie.class);
			return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
		}).collect(Collectors.toList());

	}

}
