package com.asksef.customer;


//public class CustomerRequest {
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
    //return null;
}
//}