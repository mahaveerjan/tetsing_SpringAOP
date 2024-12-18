package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.PrintWriter;

public class UserService {

    @Getter
    @Setter
    @AllArgsConstructor
    public class User{
        private String name;
        private int age;
        private String address;
    }

    private User user;

    public UserService(){

        user = new User("Mahaveer",20,"Belgavi" );
    }

    public void login(){
        System.out.println("Logging user in");
    }

    public void logout() throws Exception{
        System.out.println("logging user out");
        throw new Exception("Unable to logout the user");
    }


}
