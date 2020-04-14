package com.aws.oracle.repositories;

import com.aws.oracle.domain.CleonUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: UserRepository
 * Inside the package - com.aws.oracle.repositories
 * Created Date: 4/13/2020
 * Created Time: 6:21 AM
 **/
@Repository
public interface CleonUserRepository extends JpaRepository<CleonUser, Long> {
}