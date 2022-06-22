package com.data.emsjsp.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@NoArgsConstructor
@Setter
@Getter
public class APIResponse {
    private Object data;
    private String success;
    private String token;
    private String message;
    private HttpStatus status;
    private APIResponse(HttpStatus status,String success,Object data,String message, String token){
        this.status = status;
        this.success = success;
        this.data = data;
        this.message = message;
        this.token =token;
    }

    public APIResponse(ResponseEntity<String> responseEntity) {
        this.data = responseEntity;
    }
}
