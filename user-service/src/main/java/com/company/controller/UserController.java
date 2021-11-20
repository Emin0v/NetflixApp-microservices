package com.company.controller;

import com.company.dto.UserCreateReqDTO;
import com.company.dto.UserRespDTO;
import com.company.dto.UserUpdateDTO;
import com.company.service.IUserService;
import com.company.util.ApiPaths;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiPaths.UserCTRL.CTRL)
@RequiredArgsConstructor
public class UserController {

    private final IUserService service;

    @GetMapping
    public ResponseEntity<UserRespDTO> getUser(@RequestParam String uuid){
        return ResponseEntity.ok(service.findByUuid(uuid));
    }

    @PostMapping("/add")
    public ResponseEntity<HttpStatus> addUser(@RequestBody UserCreateReqDTO dto){
        service.addUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<Object> updateUser(@RequestParam String uuid, @RequestBody UserUpdateDTO dto){
        service.updateUser(uuid,dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Object> deleteUser(@RequestParam String uuid){
        service.delete(uuid);
        return ResponseEntity.ok().build();
    }
}
