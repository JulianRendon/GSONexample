package com.jrendon.gsonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        /*
        Employee employee = new Employee("Toto", 25, "toto@gson.com");
        String json = gson.toJson(employee);
        */

        String json = "{\"mAge\": 25,\"mFirstName\": \"Toto\",\"mMail\": \"toto@gson.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);

    }
}
