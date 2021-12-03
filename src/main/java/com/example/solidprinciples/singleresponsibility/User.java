package com.example.solidprinciples.singleresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Long id;
    private Address name;

    public void changeAddress(String street, String city) {
        //logic
    }

    public void login(String username) {
        //logic
    }

    public void logout(String username) {
        //logic
    }
}