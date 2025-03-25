package com.talasila.estimate.service;

import com.talasila.estimate.repositories.UserRepository;
import com.talasila.estimate.repositories.entity.TUser;
import com.talasila.estimate.shared.dto.UserInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository  userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserInfo getUserInfo(Long userId){
        Optional<TUser> userEntity = userRepository.findById(userId);
        if(userEntity.isPresent()) {
            TUser user = userEntity.get();
            UserInfo userInfo = new UserInfo();
            userInfo.setName(user.getFullName());
            userInfo.setEmail(user.getEmail());
            userInfo.setBusinessInfoList(new ArrayList<>());
            userInfo.setUserRoles(new ArrayList<>());
            return userInfo;
        }
        return null;
    }
}
