package com.example.test;

public class Model {

    private String value;

     //The Program logic

    /**
     * in this method add valueInt with this.value
     * @params hello, world
     * @return concatenation
     */

    public String addStringOurValue (String hello, String world) {
        return value = hello + " "  + world;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
