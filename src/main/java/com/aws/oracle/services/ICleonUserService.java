package com.aws.oracle.services;

import com.aws.oracle.domain.CleonUser;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ICleonUserService
 * Inside the package - com.aws.oracle.services
 * Created Date: 4/13/2020
 * Created Time: 7:48 PM
 **/
public interface ICleonUserService{
    List<CleonUser> getAllCleonUsers();
}
