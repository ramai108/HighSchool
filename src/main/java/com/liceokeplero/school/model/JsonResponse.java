package com.liceokeplero.school.model;

import lombok.Data;

@Data
public class JsonResponse
{
    private Integer statusCode;
    private String code;
    private String error;
    private String message;

}
