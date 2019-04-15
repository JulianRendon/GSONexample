package com.jrendon.gsonexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    private String mFirstName;
    private int mAge;
    private String mMail;
    private Address address;
    private List<FamilyMember> mFamily;

    public Employee(String firstName, int age, String mail, Address address, List<FamilyMember> mFamily) {
        this.mFirstName = firstName;
        this.mAge = age;
        this.mMail = mail;
        this.address = address;
        this.mFamily = mFamily;
    }
}
