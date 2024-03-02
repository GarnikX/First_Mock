package com.example.First_Mock.RestApiController;

import com.example.First_Mock.Metods.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiController {

    @GetMapping("/getUser")
    public ResponseEntity<?> LoginPage() {
        return ResponseEntity.ok(new User("aaa", "bbb"));
    }


    @PostMapping(value = "/postUser", consumes = {"*/*"})
    ResponseEntity<?> Authenticate(@Validated @RequestBody User user) {
        if ((user.getLogin() == null) || (user.getPassword() == null))
            return ResponseEntity.internalServerError().build();
        return ResponseEntity.ok(user);
    }
}
