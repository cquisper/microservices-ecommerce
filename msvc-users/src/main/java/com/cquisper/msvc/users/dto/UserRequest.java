package com.cquisper.msvc.users.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record UserRequest(
        String username,

        String password,

        String photo,

        List<String> roles
) {
}
