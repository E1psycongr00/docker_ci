package com.example.docker_ci.dto;

import lombok.Data;

@Data
public class ResponseMemberDto {

    private final Long id;
    private final String email;
    private final String name;
    private final String phoneNumber;

}
