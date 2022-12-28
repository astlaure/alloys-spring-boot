package com.astlaure.alloys.auth.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfileDto {
    private Long id;
    private String username;
}
