package com.example.wendy.durban_tour_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Second_Activity extends AppCompatActivity {
    Contact contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        //passing info from the recycler view to the acivity
        Intent intent=getIntent();
        contact= (Contact) intent.getSerializableExtra("name");


        Toast.makeText(Second_Activity.this,contact.getLocation(),Toast.LENGTH_SHORT).show();
    }
    }

