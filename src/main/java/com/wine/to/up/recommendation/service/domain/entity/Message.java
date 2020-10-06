package com.wine.to.up.recommendation.service.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

/*
    * @autor
    * @atribute id - UUID unique id
    * @atribute content - conetnt of a certain Message
    *
    *
 */
@Entity
@Table(name = "messages")
@Setter
@Getter
@NoArgsConstructor
public class Message {
    @Id
    private UUID id = UUID.randomUUID();
    private String content;

    /*
        Constructor - creating new object w/ certain params
     * @param content - content
     */
    public Message(String content) {
        this.content = content;
    }
}
