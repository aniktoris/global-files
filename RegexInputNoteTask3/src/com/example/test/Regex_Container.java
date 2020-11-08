package com.example.test;

public interface Regex_Container {
    // Latin name
    String REGEX_SURNAME_LAT = "^[A-Z][a-z]{1,20}$";

    // Latin nickname
    String REGEX_NICKNAME_LAT = "^[A-Za-z0-9_-]{8,20}$";

    // Phone number
    String REGEX_PHONE_NUMBER = "(\\d{3})-(\\d{3}-\\d\\d-\\d\\d)";
}
