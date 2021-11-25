package com.company.service.adapter;

import com.company.dto.UserCreateReqDTO;
import com.company.dto.UserRespDTO;
import com.company.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-25T11:06:12+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class UserAdapterImpl implements UserAdapter {

    @Override
    public User map(UserCreateReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setName( dto.getName() );
        user.setSurname( dto.getSurname() );
        user.setUsername( dto.getUsername() );
        user.setPassword( dto.getPassword() );

        return user;
    }

    @Override
    public UserRespDTO map(User user) {
        if ( user == null ) {
            return null;
        }

        UserRespDTO userRespDTO = new UserRespDTO();

        return userRespDTO;
    }
}
