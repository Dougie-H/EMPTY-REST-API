package com.dougie.api.service;

import com.dougie.api.exception.CNotFoundDataException;
import com.dougie.api.model.UserDto;
import com.dougie.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto findUser(String idx) {
        return UserDto.fromEntity(userRepository.findByIdx(Long.parseLong(idx))
                .orElseThrow(() -> new CNotFoundDataException.UserNotFoundException(idx))
        );
    }
}
