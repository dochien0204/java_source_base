package org.example.base.adapter.v1.controller;

import org.example.base.adapter.base.RestApiV1;
import org.example.base.adapter.base.RestData;
import org.example.base.adapter.base.VsResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestApiV1
public class TestController {

    @GetMapping("test/ok")
    public ResponseEntity<?> testOk() {
        RestData<?> response = new RestData<>("Test");
        return VsResponseUtil.ok(response, "SUCCESS");
    }

    @GetMapping("test/error")
    public ResponseEntity<RestData<?>> testError() {
        RestData<?> response = new RestData<>("Test");
        return VsResponseUtil.error(HttpStatus.BAD_REQUEST, "userMessage", "devMessage");
    }
}
