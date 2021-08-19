package com.example.welcomeclient.models;

import com.example.welcomeclient.enums.GreetingType;
import lombok.Getter;
import java.sql.Timestamp;

@Getter
public class ResponseDTO {

    private String message;

    private GreetingType greetingType;

    private Timestamp datetime;

    private String endpoint;

    public ResponseDTO() {
        //
    }

    public ResponseDTO(String message, GreetingType greetingType, String endpoint, Timestamp timestamp) {
        this.message = message;
        this.greetingType = greetingType;
        this.endpoint = endpoint;
        this.datetime = timestamp;
    }
}
