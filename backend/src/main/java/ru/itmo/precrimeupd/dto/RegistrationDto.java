package ru.itmo.precrimeupd.dto;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class RegistrationDto {
    private Long id;
    @NotEmpty
    private String login;
    @NotEmpty
    private String password;
    @NotEmpty
    private String confirmPassword;
    private String email;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private List<String> roles;
    private int telegramId;
}
