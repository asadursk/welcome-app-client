package com.example.welcomeclient;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
public class ResponseDTO {

    private String content;

    private Timestamp datetime;

    private String endpoint;

    ResponseDTO() {
        //
    }

    ResponseDTO(String content, String endpoint) {
        Date date = new Date();

        this.content = content;
        this.endpoint = endpoint;
        this.datetime = new Timestamp(date.getTime());
    }
}
