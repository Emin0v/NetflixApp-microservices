package com.company.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String uuid;
    private String name;
    private String surname;
    private String username;
    private String password;

}
