package com.astlaure.alloys.auth;

import com.astlaure.alloys.auth.models.ProfileDto;
import com.astlaure.alloys.users.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthController {
    @GetMapping("/profile")
    public ResponseEntity<?> getProfile(Authentication authentication) {
        var user = (User) authentication.getPrincipal();
        return ResponseEntity.status(200).body(
                ProfileDto.builder()
                        .id(user.getId())
                        .username(user.getUsername())
                        .build()
        );
    }
}
