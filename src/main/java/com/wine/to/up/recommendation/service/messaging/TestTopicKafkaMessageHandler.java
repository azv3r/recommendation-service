package com.wine.to.up.recommendation.service.messaging;

import com.wine.to.up.commonlib.messaging.KafkaMessageHandler;
import com.wine.to.up.recommendation.service.api.message.KafkaMessageSentEventOuterClass.KafkaMessageSentEvent;
import com.wine.to.up.recommendation.service.domain.entity.Message;
import com.wine.to.up.recommendation.service.repository.MessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@Slf4j
public class TestTopicKafkaMessageHandler implements KafkaMessageHandler<KafkaMessageSentEvent> {
    private final MessageRepository messageRepository;

    private final AtomicInteger counter = new AtomicInteger(0);

    @Autowired
    public TestTopicKafkaMessageHandler(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    /**
     * Message handler that keeps information about count of messages and their content
     * @param message is a KafkaMessageSentEvent object
     */
    @Override
    public void handle(KafkaMessageSentEvent message) {
        counter.incrementAndGet();
        log.info("Message received message of type {}, number of messages: {}", message.getClass().getSimpleName(), counter.get());
        messageRepository.save(new Message(message.getMessage()));
    }
}