package com.company.service.impl;

import com.company.dto.UserCreateReqDTO;
import com.company.dto.UserDTO;
import com.company.dto.UserRespDTO;
import com.company.dto.UserUpdateDTO;
import com.company.exception.UserAlreadyExistsException;
import com.company.exception.UserNotFoundException;
import com.company.model.User;
import com.company.repository.UserRepository;
import com.company.service.IUserService;
import com.company.service.adapter.UserAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final UserAdapter adapter;

    @Override
    public UserRespDTO findByUuid(String uuid) {
        User user = userRepository.findByUuid(uuid).orElseThrow(UserNotFoundException::new);
        return adapter.map(user);
    }

    @Override
    public UserDTO findByUsername(String username) {
        User user = userRepository.findByUsername(username).orElseThrow(UserNotFoundException::new);
        return adapter.mapToUserDTO(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username){
        User user = userRepository.findByUsername(username).orElseThrow(UserNotFoundException::new);
        return new org.springframework.security.core.userdetails.User(username, user.getPassword(), true, true, true, true, new ArrayList<GrantedAuthority>());
    }

    @Override
    @Transactional
    public void addUser(UserCreateReqDTO dto) {
        var found = userRepository.findByUsername(dto.getUsername());
        if (found.isPresent()){
            throw new UserAlreadyExistsException(dto.getUsername());
        }

        User user = adapter.map(dto);
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void updateUser(String uuid, UserUpdateDTO updateDTO) {
        User user = userRepository.findByUuid(uuid).orElseThrow(UserNotFoundException::new);
        user.setName(updateDTO.getName());
        user.setSurname(updateDTO.getSurname());
        user.setUsername(updateDTO.getUsername());
    }

    @Override
    public void delete(String uuid) {
        User user = userRepository.findByUuid(uuid).orElseThrow(UserNotFoundException::new);
        userRepository.delete(user);
    }
}
