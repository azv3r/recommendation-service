package com.wine.to.up.recommendation.service.controller;

import com.wine.to.up.recommendation.service.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller of the service
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/message")
@Validated
@Slf4j
public class MessageController {
    public final MessageRepository messageRepository;

    /*
        * Method that returns list of all sent messages
        * @return returns list of sent messages
        *
     */
    @GetMapping
    public List<String> getSentMessages() {
        return messageRepository.findDistinctContent();
    }
}
