package com.wine.to.up.recommendation.service.messaging;

import com.wine.to.up.commonlib.messaging.KafkaMessageHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@Slf4j
public class SmopikTopicKafkaMessageHandler implements KafkaMessageHandler<String> {
    private final AtomicInteger counter = new AtomicInteger(0);

    /**
     * Message handler that shows information about count of messages and their content via log
     * @param message is a string description of message content
     */
    @Override
    public void handle(String message) {
        counter.incrementAndGet();
        log.info("MMMMMMMMMmmmmmmmmessage received from test topic: test, number of messages: {}", counter.get());
    }
}
