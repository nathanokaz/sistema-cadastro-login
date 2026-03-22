package com.projects.devlink.domain.User.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record NewUserData(

        @NotBlank
        String name,

        @NotBlank
        String nickname,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String password

) {
}
