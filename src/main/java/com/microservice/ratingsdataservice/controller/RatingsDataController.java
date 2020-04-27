package com.microservice.ratingsdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.ratingsdataservice.model.Rating;
import com.microservice.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingsData")
public class RatingsDataController {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 5);
	}
	
	@GetMapping("/users/{movieId}")
	public UserRating getUserRating(@PathVariable("movieId") String movieId) {
		List<Rating> ratingList = Arrays.asList(
				new Rating("Don No. 1", 500),
				new Rating("Movie2", 4),
				new Rating("Movie3", 3));
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratingList);
		return userRating;
	}
	
}
