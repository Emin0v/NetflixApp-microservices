package com.company.service;

import com.company.dto.UserCreateReqDTO;
import com.company.dto.UserDTO;
import com.company.dto.UserRespDTO;
import com.company.dto.UserUpdateDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {

     UserRespDTO findByUuid(String uuid);
     UserDTO findByUsername(String username);
     UserDetails loadUserByUsername(String username);
     void addUser(UserCreateReqDTO createReqDTO);
     void updateUser(String uuid, UserUpdateDTO updateDTO);
     void delete(String uuid);

}
