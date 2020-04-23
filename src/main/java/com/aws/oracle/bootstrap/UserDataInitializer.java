package com.aws.oracle.bootstrap;

import com.aws.oracle.domain.CleonUser;
import com.aws.oracle.repositories.CleonUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: UserDataInitializer
 * Inside the package - com.aws.oracle.bootstrap
 * Created Date: 4/13/2020
 * Created Time: 6:21 AM
 **/
@Component
public class UserDataInitializer implements CommandLineRunner {

    @Autowired
    CleonUserRepository cleonUserRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("About to insert a user");
        loadUsers();
        System.out.println("After inserting a user");
    }

    private void loadUsers(){
        saveUser(createUser("Balaji Varadharajan"));
        saveUser(createUser("Pooja Mohanakrishnan"));
        saveUser(createUser("Jiana Balaji"));
        saveUser(createUser("Joy Varadharajan Balaji"));
    }

    private CleonUser createUser(String name){
        return new CleonUser(name);
    }
    private void saveUser(CleonUser cleonUser){
        cleonUserRepository.save(cleonUser);
    }
}
