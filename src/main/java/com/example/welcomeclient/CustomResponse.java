package com.example.welcome;

import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import java.util.Date;

public class CustomResponse {
    @Getter
    @Setter
    private String content;

    @Getter
    @Setter
    private Timestamp datetime;

    @Getter
    @Setter
    private String endpoint;

    CustomResponse(String content, String endpoint) {
        Date date = new Date();

        this.content = content;
        this.endpoint = endpoint;
        this.datetime = new Timestamp(date.getTime());
    }
}
