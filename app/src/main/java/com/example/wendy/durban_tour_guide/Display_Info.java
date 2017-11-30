package com.example.wendy.durban_tour_guide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.wendy.durban_tour_guide.R.layout.contact;

public class Display_Info extends AppCompatActivity {

    String location, address, description;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__info);

        Intent intent = getIntent();
//        Contact contact = (Contact) intent.getSerializableExtra("information");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.display_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Contact> ContactArraylist = new ArrayList<>();
        //Contents for hotel category
        Contact contact1 = new Contact();
        Contact contact2 = new Contact();
        Contact contact3 = new Contact();
        Contact contact19=new Contact();

        //Contents for restaurants category
        Contact contact4 = new Contact();
        Contact contact5 = new Contact();
        Contact contact6=new Contact();
        Contact contact7=new Contact();

        //Content for Activities category
        Contact contact8=new Contact();
        Contact contact9=new Contact();
        Contact contact10=new Contact();
        Contact contact11=new Contact();
        Contact contact12=new Contact();
        Contact contact14=new Contact();



        //Content for beaches category
        Contact contact13=new Contact();
        Contact contact15=new Contact();
        Contact contact16=new Contact();
        Contact contact17=new Contact();


        //Content for places to hang out
        Contact contact18=new Contact();
        Contact contact20=new Contact();
        Contact contact21=new Contact();
        Contact contact22=new Contact();
        Contact contact23=new Contact();




//        Intent intent = getIntent();
//        Contact contact = (Contact) intent.getSerializableExtra("information");
//        //getSelectedInfo(contact);

//HOTELS IN DBN
        contact1.setLocation("Pavilion Hotel");
        contact1.setImage(R.drawable.pavilion);
        contact1.setAddress("0101 Durban 001");
        contact1.setFull_description("just 215 yards from the beach\n" +
                "has luxury accommodation and the hotel located a mere 3 minute walk from the beach \n" +
                "Rooms consist of 3 a queen bed, DSTV, Air conditioning and dressing table\n" +
                "included in trhis luxurious offering are tea and coffee facilities and an en-suite bathroom.\n" +
                "this accommodation has a large lobby.\n");

        contact2.setLocation("Endless Horizon Boutique Hotel");
        contact2.setAddress("108 Umhlanga Rocks Drive\n Durban North ");
        contact2.setImage(R.drawable.accomodation);
        contact2.setFull_description("Hotel located in Durban 108 Umhlanga Rocks Drive,Durban North\n" +
                " very nice\n" +
                " 2 beds\n" +
                "breakfast and lunch  served\n" +
                "bathroom\n");


        contact3.setLocation("African Pride Audacia Manor Boutique");
        contact3.setImage(R.drawable.africanpride);
        contact3.setAddress("201 Umzinyathi Inanda\n Durban ");
        contact3.setFull_description("Hotel located in 11 Sir Arthur Road Morningside\n" +
                "The African Pride hotel group of South Africa is Protea Hotels' Superior-Deluxe range of hotels, lodges and country houses." +
                "Established in 2001, the launch of African Pride Hotels, Lodges and Country Houses coincided with the beginning of a significant period of growth in the tourism industry in Southern Africa\n");

        contact19.setLocation("Parkview Hotel");
        contact19.setImage(R.drawable.acc);
        contact19.setAddress("2231 Phoenix Town \n Durban");
        contact19.setFull_description("Offers ecxellent holiday accommodatio to guest in the heart of Durban\n"+
        "8 Standard Suites and 8 Luxury Double suites all equiped with a kettle,microwaves and a toaster");



//RESTAURANT
        contact4.setLocation("BURGER");
        contact4.setImage(R.drawable.burger);
        contact4.setFull_description("Come and eat at our restaurant");

        contact5.setLocation("Restaurant");
        contact5.setImage(R.drawable.d);
        contact5.setFull_description("Come and eat at our restaurant");

        contact6.setLocation("BUNNY CHOW");
        contact6.setImage(R.drawable.bunny);
        contact6.setFull_description("If you have never tasted a bunny chow before,this is definitely the place to come at." +
                " This is a quarter hollowed out loaf of bread filled curry");

        contact7.setLocation("UPHUTHU");
        contact7.setImage(R.drawable.uphuthu);
        contact7.setFull_description("Enjoy uphuthu which is a maize-meal porridge stirred into a crumb like texture and ouer delicious cuury." +
                " this is definitely the place to come at.");


        //ACTIVITIES

        contact8.setLocation("RICHSHAW");
        contact8.setImage(R.drawable.rickshaw);
        contact8.setFull_description("Colourful and modern rickshaws offers a fun excursion for the whole family.Enjoy the beauty and scenery " +
                "of the Durban beach front and promenade as the driver enthralls you with his theatrics and anecdotes");

        contact9.setLocation("BIRDS FEEDING");
        contact9.setImage(R.drawable.birds);
        contact9.setFull_description("If you want to give your family a unique ,nature-based experience at Umngeni River Bird Park park" +
                "View beautiful birds and other animals. Play with them and learn more");

        contact10.setLocation("SUNCOAST CASINO");
        contact10.setImage(R.drawable.casino);
        contact10.setFull_description("Experience the thrill at Suncoast Casino,Hotel and Entertainment, shows,dinning,casino gaming and more");

        contact11.setLocation("GAMES");
        contact11.setImage(R.drawable.r);
        contact11.setFull_description("Experience the thrill at Suncoast Casino,Hotel and Entertainment, shows,dinning,casino gaming and more");

        contact12.setLocation("THEATRE SHOW");
        contact12.setImage(R.drawable.dace);
        contact12.setFull_description("Experience the thrill at Suncoast Casino,Hotel and Entertainment, shows,dinning,casino gaming and more");

        //BEACHES
        contact13.setLocation("SOUTH BEACHES");
        contact13.setImage(R.drawable.southbeach);
        contact13.setFull_description("another great one which need no introduction.Is right in the heart of the city's famous beachfront and is a great spot" +
                "for swimming or just lazing about people watching");

        contact14.setLocation("BEACH");
        contact14.setImage(R.drawable.ushaka);
        contact14.setFull_description("another great one which need no introduction.Is right in the heart of the city's famous beachfront and is a great spot" +
                "for swimming or just lazing about people watching");

        contact15.setLocation("BEACH");
        contact15.setImage(R.drawable.beach);
        contact15.setFull_description("");

        contact16.setLocation("GAMES");
        contact16.setImage(R.drawable.beachfront);
        contact16.setFull_description("");

        contact17.setLocation("GAMES");
        contact17.setImage(R.drawable.g);
        contact17.setFull_description("");

        //places to hang out

        contact18.setLocation("PLACES TO HANG OUT");
        contact18.setImage(R.drawable.drinks);
        contact18.setFull_description("");

        contact20.setLocation("EYADINI LOUGE");
        contact20.setImage(R.drawable.eyadin);
        contact20.setFull_description("");

        contact21.setLocation("EYADINI LOUGE");
        contact21.setImage(R.drawable.kwamax);
        contact21.setFull_description("");


        contact22.setLocation("MAXs PLACE");
        contact22.setImage(R.drawable.maxx);
        contact22.setFull_description("");

        contact23.setLocation("MAZ PLACE");
        contact23.setImage(R.drawable.phuza);
        contact23.setFull_description("");

        if (intent.getSerializableExtra("information").toString().equalsIgnoreCase("ACCOMMODATION")) {
            ContactArraylist.add(contact1);
            ContactArraylist.add(contact2);
            ContactArraylist.add(contact3);
            ContactArraylist.add(contact19);


        } else if(intent.getSerializableExtra("information").toString().equalsIgnoreCase("RESTAURANTS")) {
            ContactArraylist.add(contact4);
            ContactArraylist.add(contact5);
            ContactArraylist.add(contact6);
            ContactArraylist.add(contact7);

        } else if(intent.getSerializableExtra("information").toString().equalsIgnoreCase("ACTIVITIES")) {
            ContactArraylist.add(contact8);
            ContactArraylist.add(contact9);
            ContactArraylist.add(contact10);
            ContactArraylist.add(contact11);
            ContactArraylist.add(contact12);
        }else if(intent.getSerializableExtra("information").toString().equalsIgnoreCase("BEACHES")) {
            ContactArraylist.add(contact13);
            ContactArraylist.add(contact14);
            ContactArraylist.add(contact15);
            ContactArraylist.add(contact16);
            ContactArraylist.add(contact17);

        }else if(intent.getSerializableExtra("information").toString().equalsIgnoreCase("PLACES TO HANG OUT")) {
            ContactArraylist.add(contact18);
            ContactArraylist.add(contact20);
            ContactArraylist.add(contact21);
            ContactArraylist.add(contact22);
            ContactArraylist.add(contact23);
        }

        DisplayAdapter adapter = new DisplayAdapter(this, ContactArraylist);
        recyclerView.setAdapter(adapter);
    }

    public class DisplayAdapter extends RecyclerView.Adapter<Display_Info.ViewHolder> {
        Context context;
        List<Contact> mContactlist;

        public DisplayAdapter(Context context, List<Contact> mContactlist) {
            this.context = context;
            this.mContactlist = mContactlist;
        }

        @Override
        public Display_Info.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.display_content, parent, false);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(Display_Info.ViewHolder holder, int position) {
            Contact contact = mContactlist.get(position);
            holder.location.setText(contact.getLocation());
            holder.description.setText(contact.getFull_description());
            holder.image.setImageResource(contact.getImage());
            holder.address.setText(contact.getAddress());
        }

        @Override
        public int getItemCount() {
            return mContactlist.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;
        TextView location, address;
        ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            CardView cardView;
            image = (ImageView) itemView.findViewById(R.id.display_image);
            description = (TextView) itemView.findViewById(R.id.display_description);
            location = (TextView) itemView.findViewById(R.id.display_location);
            address = (TextView) itemView.findViewById(R.id.display_contact);
        }
    }
}
