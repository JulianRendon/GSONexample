package com.jrendon.gsonexample;

import com.google.gson.annotations.SerializedName;

public class Employee {
    private String mFirstName;
    private int mAge;
    private String mMail;
    private Address address;

    public Employee(String firstName, int age, String mail, Address address) {
        this.mFirstName = firstName;
        this.mAge = age;
        this.mMail = mail;
        this.address = address;
    }
}
