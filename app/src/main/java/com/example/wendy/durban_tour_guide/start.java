package com.example.wendy.durban_tour_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class start extends AppCompatActivity {

    ContentRecyclerView adapter;
    Contact mContract = new Contact();
    Contact mContractor=new Contact();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Declare details of a card
        Contact contact = new Contact();
        Contact contact1 = new Contact();
        Contact contact2=new Contact();
        Contact contact3=new Contact();
        Contact contact4=new Contact();

        ArrayList<Contact>ContactArraylist = new ArrayList<>();

        contact.setCategory("ACCOMMODATION");
        contact.setDescription("These are reasonable places where you can sleep and enjoy");
        contact.setImage(R.drawable.pic);

        contact1.setCategory("RESTAURANTS");
        contact1.setDescription("places to relax and enjoy your food and bevearages");
        contact1.setImage(R.drawable.food);

        contact2.setCategory("ACTIVITIES");
        contact2.setDescription("Enjoy activities in durban");
        contact2.setImage(R.drawable.activities);

        contact3.setCategory("BEACHES");
        contact3.setDescription("Enjoy activities in durban");
        contact3.setImage(R.drawable.skyline);

        contact4.setCategory("PLACES TO HANG OUT");
        contact4.setDescription("Enjoy activities in durban");
        contact4.setImage(R.drawable.skyline);

        ContactArraylist.add(contact);
        ContactArraylist.add(contact1);
        ContactArraylist.add(contact2);
        ContactArraylist.add(contact3);
        ContactArraylist.add(contact4);

        adapter=new ContentRecyclerView(this,ContactArraylist);
        recyclerView.setAdapter(adapter);
    }
}
