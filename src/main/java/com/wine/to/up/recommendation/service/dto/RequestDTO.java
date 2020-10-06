package com.wine.to.up.recommendation.service.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;


/**
 *  DTO class
 * @author Kamran
 * @version 0.3.1
 */
@Data
@Builder
public class RequestDTO {
    /**
     * list of ids
     */
    private final List<Long> recommendedIds;
}
