package com.example.wendy.durban_tour_guide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.wendy.durban_tour_guide.R.drawable.g;

/**
 * Created by Wendy on 2017/08/17.
 */

public class ContentRecyclerView extends RecyclerView.Adapter<ContentRecyclerView.ViewHolder> {

    Context context;

    //declaring variable for array list
    List<Contact> mContactlist;

    public ContentRecyclerView(Context context, List<Contact> mContactlist) {
        this.context = context;
        this.mContactlist = mContactlist;
    }

    @Override
    public ContentRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ContentRecyclerView.ViewHolder holder, final int position) {
        final Contact contact = mContactlist.get(position);
        holder.category.setText(contact.getCategory());
        holder.description.setText(contact.getDescription());
        holder.image.setImageResource(contact.getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(context,Second_Activity.class);
                x.getStringExtra("HI");
                System.out.print("Hello");
            }
        });

//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, Display_Info.class);
//
//
//                if (position == 0) {
//                    intent.putExtra("information", contact.getCategory());
//
//                } else if (position == 1) {
//                    intent.putExtra("information", contact.getCategory());
//                } else if (position == 2) {
//                    intent.putExtra("information", contact.getCategory());
//                } else if (position == 3) {
//                    intent.putExtra("information", contact.getCategory());
//                } else if (position == 4) {
//                    intent.putExtra("information", contact.getCategory());
//                }
//
//
//            }
//
//        });
    }

    @Override
    //shows you the number of item you going to see on your screen (how big is your arraylist
    public int getItemCount() {

        return mContactlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;
        TextView category;
        ImageView image;
        CardView cardView;
        String address, full_description;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            category = (TextView) itemView.findViewById(R.id.location);
            cardView = (CardView) itemView.findViewById(R.id.CardView_Contact);
            description=(TextView)itemView.findViewById(R.id.description);

        }
    }
}
