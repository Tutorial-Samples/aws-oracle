package com.aws.oracle.services;

import com.aws.oracle.domain.CleonUser;
import com.aws.oracle.repositories.CleonUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: CleonUserServiceImpl
 * Inside the package - com.aws.oracle.services
 * Created Date: 4/13/2020
 * Created Time: 7:49 PM
 **/
@Service
@RequiredArgsConstructor
public class CleonUserServiceImpl implements ICleonUserService{

    private final CleonUserRepository cleonUserRepository;

    @Override
    public List<CleonUser> getAllCleonUsers() {
        return cleonUserRepository.findAll();
    }
}
