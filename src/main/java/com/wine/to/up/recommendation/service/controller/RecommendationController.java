package com.wine.to.up.recommendation.service.controller;

import com.wine.to.up.recommendation.service.api.recommendation.vo.RecommendationResponse;
import com.wine.to.up.recommendation.service.dto.RequestDTO;
import com.wine.to.up.recommendation.service.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 * @version 0.3.1
 */
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class RecommendationController {

    private final RecommendationService recommendationService;

    /**
     * Constructor
     * @param recommendationService is an attribute that keeps list of ids
     */
    @Autowired
    public RecommendationController(final RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }


    /**
     * Method that returns RecommendationResponse by using Request id
     * @param userId is  unique identifier
     * @return RecommendationResponse
     */
    @GetMapping(path = "/recommendation/{userId:[\\d]+}")
    public RecommendationResponse getByRequest(@PathVariable final long userId) {
        final RequestDTO recommendation = recommendationService.findById(userId);
        return RecommendationResponse.builder().recommendedIds(recommendation.getRecommendedIds()).build();
    }

}
