package com.example.First_Mock.RestApiController;

import com.example.First_Mock.Metods.POST;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @GetMapping("/data")
    public ResponseEntity<String> get() {
        String json = "{\"login\":\"example\",\"password\":\"password\"}";
        return new ResponseEntity<>(json, HttpStatus.OK);
    }

    @PostMapping("/data")
    ResponseEntity<POST> postData(
            @RequestParam(value = "login", required = true) String login,
            @RequestParam(value = "password", required = true) String password
    ) {
        return new ResponseEntity<>(new POST(login, password), HttpStatus.OK);
    }
}
