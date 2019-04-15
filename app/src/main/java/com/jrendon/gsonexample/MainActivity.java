package com.jrendon.gsonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        /*
        Address address = new Address("Canada", "Montreal");
        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 24));
        family.add(new FamilyMember("Daugther", 2));

        Employee employee = new Employee("Toto", 25, "toto@gson.com", address, family);

        // Serialization in the context of Gson means mapping a Java object to its JSON representation
        String json = gson.toJson(employee);
        */

        /*
        String json = "{\"address\":{\"mCity\":\"Montreal\",\"mCountry\":\"Canada\"},\"mAge\":25,\"mFamily\":[{\"mAge\":24,\"mRole\":\"Wife\"},{\"mAge\":2,\"mRole\":\"Daugther\"}],\"mFirstName\":\"Toto\",\"mMail\":\"toto@gson.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);
        */

        /*
        // Test only passing the family Array
        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 24));
        family.add(new FamilyMember("Daugther", 2));

        String json = gson.toJson(family);
        */

        /*
        // Deserializing into a List
        String json = "[{\"mAge\":24,\"mRole\":\"Wife\"},{\"mAge\":2,\"mRole\":\"Daugther\"}]";
        FamilyMember[] family = gson.fromJson(json, FamilyMember[].class);
        */

        // Deserializing directly into an ArrayList creating a Type
        String json = "[{\"mAge\":24,\"mRole\":\"Wife\"},{\"mAge\":2,\"mRole\":\"Daugther\"}]";
        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json, familyType);

    }
}
