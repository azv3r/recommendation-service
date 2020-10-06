package com.wine.to.up.recommendation.service.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "messages")
@Setter
@Getter
@NoArgsConstructor
public class Message {
    /**
     * id is unique identifier for a certain Message
     */
    @Id
    private UUID id = UUID.randomUUID();

    /**
     * content is a string that keeps inforamtion about the content of a certain Message
     */
    private String content;

    /**
     * simple constructor
     * @param content is a string
     */
    public Message(String content) {
        this.content = content;
    }
}
