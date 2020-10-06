package com.wine.to.up.recommendation.service.logging;

import com.wine.to.up.commonlib.logging.NotableEvent;


public enum RecommendationServiceNotableEvents implements NotableEvent {
    RECOMMENDATION_EVENT("Something happened"),
    ANOTHER_RECOMMENDATION_EVENT("Something else happened");

    private final String template;

    /**
     * Constructor
     * @param template is a string template (w/ 2 options)
     */
    RecommendationServiceNotableEvents(String template) {
        this.template = template;
    }

    /**
     * getter
     * @return template (2 options)
     */
    public String getTemplate() {
        return template;
    }

    /**
     * setter
     * @return string name (impl in Enum)
     */
    @Override
    public String getName() {
        return name();
    }


}
