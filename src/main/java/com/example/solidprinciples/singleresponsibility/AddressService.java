package com.example.solidprinciples.singleresponsibility;

public class AddressService {
    public void changeAddress(Address address) {
        // Sadece addressle ilgileniyorum ve ondan sorumluyum account daki değişiklikler beni etkilemez.
        //logic
    }
}
