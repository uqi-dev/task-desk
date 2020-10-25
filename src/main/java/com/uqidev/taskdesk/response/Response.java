package com.uqidev.taskdesk.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Response implements Serializable {
    private Integer statusCode;
    private String desc;

    public Response(Integer statusCode, String desc) {
        this.statusCode = statusCode;
        this.desc = desc;
    }
}
