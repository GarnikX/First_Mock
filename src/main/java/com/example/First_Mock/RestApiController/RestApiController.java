package com.example.First_Mock.RestApiController;
import com.example.First_Mock.Metods.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.Map;

@RestController
public class RestApiController {

    @GetMapping("/getUser")
    public ResponseEntity<?> LoginPage() {
        return ResponseEntity.ok(new User("aaa", "bbb"));
    }

    @PostMapping(value = "/postUser")
    ResponseEntity<?> Authenticate(@RequestBody Map<String, String> request) {
        try {
            if ((request.size() > 2) || (!request.containsKey("login")) || (!request.containsKey("password")) || (request.get("login") == null) || (request.get("password") == null)) {
                throw new Exception("Bad JSON!");
            }
            User user = new User(request.get("login"), request.get("password"));
            return ResponseEntity.ok(user.toString());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }
}
