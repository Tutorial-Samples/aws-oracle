package com.aws.oracle.controllers;

import com.aws.oracle.domain.CleonUser;
import com.aws.oracle.services.ICleonUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: CleonUserController
 * Inside the package - com.aws.oracle.controllers
 * Created Date: 4/13/2020
 * Created Time: 7:47 PM
 **/
@RestController
@RequiredArgsConstructor
public class CleonUserController {

    private final ICleonUserService cleonUserService;

    @GetMapping("/api/v1/users")
    public ResponseEntity<CleonUser> getAllCleonUsers(){
        List<CleonUser> users = cleonUserService.getAllCleonUsers();
        return new ResponseEntity(users, HttpStatus.OK);
    }
}
