package com.company.service;

import com.company.dto.UserCreateReqDTO;
import com.company.dto.UserRespDTO;
import com.company.dto.UserUpdateDTO;

public interface IUserService {

     UserRespDTO findByUuid(String uuid);
     void addUser(UserCreateReqDTO createReqDTO);
     void updateUser(String uuid, UserUpdateDTO updateDTO);
     void delete(String uuid);

}
