package com.company.service.adapter;

import com.company.dto.UserCreateReqDTO;
import com.company.dto.UserDTO;
import com.company.dto.UserRespDTO;
import com.company.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserAdapter {

    User map(UserCreateReqDTO dto);

    UserRespDTO map(User user);

    UserDTO mapToUserDTO(User user);
}
