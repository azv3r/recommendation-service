package com.wine.to.up.recommendation.service.service;

import com.wine.to.up.recommendation.service.dto.RequestDTO;

/**
 * Interface which is implmented via DTO
 * @version 0.3.1
 */
public interface RecommendationService {
    RequestDTO findById(Long id);
}
