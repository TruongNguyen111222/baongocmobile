package com.web.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenDto {

    private String token;

    private UserDto user;
}
