package com.cl.youngri.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        String id = loginRequest.getid();
        String password = loginRequest.getPassword();

        // 여기서 실제 인증 로직을 구현합니다.
        if (id.equals("admin") && password.equals("password")) {
            return ResponseEntity.ok("Welcome, " + id + "!");
        } else {
            return ResponseEntity.status(401).body("Unauthorized");
        }
    }
}


class LoginRequest {
    private String id;
    private String password;

    // getters and setters
    public String getid() { return id; }
    public void setid(String id) { this.id = id; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
/*
   @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String id, String password) {


        if (id.equals("admin") && password.equals("password")) {
            return ResponseEntity.ok("Welcome, " + id + "!");
        } else {
            return ResponseEntity.status(401).body("Unauthorized");
        }
    }
 */