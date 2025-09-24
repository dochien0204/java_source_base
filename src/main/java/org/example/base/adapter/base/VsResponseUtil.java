package org.example.base.adapter.base;


import org.example.base.domain.entity.Pagination;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class VsResponseUtil {

    public static ResponseEntity<RestData<?>> ok(HttpHeaders headers, HttpStatus status, String userMessage, Object data) {
        RestData<?> response = new RestData<>(data, userMessage);
        return new ResponseEntity<>(response, headers, status);
    }

    public static ResponseEntity<RestData<?>> ok(HttpHeaders headers, HttpStatus status, String userMessage, Object data, Pagination pagination) {
        RestData<?> response = new RestData<>(data, pagination, userMessage);
        return new ResponseEntity<>(response, headers, status);
    }

    public static ResponseEntity<RestData<?>> ok(Object data, String userMessage) {
        return ok(null, HttpStatus.OK, userMessage, data);
    }

    public static ResponseEntity<RestData<?>> ok(Object data, Pagination pagination, String userMessage) {
        return ok(null, HttpStatus.OK, userMessage, data, pagination);
    }

    public static ResponseEntity<RestData<?>> error(HttpStatus status, String userMessage, String devMessage) {
        RestData<?> response = new RestData<>(devMessage, userMessage);
        return new ResponseEntity<>(response, status);
    }
}
