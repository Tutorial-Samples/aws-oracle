package com.aws.oracle.domain;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: User
 * Inside the package - com.aws.oracle.domain
 * Created Date: 4/13/2020
 * Created Time: 6:20 AM
 **/
@Entity
public class CleonUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_gen")
    @SequenceGenerator(name = "user_gen", sequenceName = "user_seq",initialValue = 10001, allocationSize = 1)
    private Long userId;
    private String userName;

    public CleonUser() {
    }

    public CleonUser(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
