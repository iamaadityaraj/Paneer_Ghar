package com.example.pannerghar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


//here it is used to bind adapter class with adapter item view.
public class mycustomeradapter  extends RecyclerView.Adapter<mycustomeradapter.viewHolder> {
    public ClickListner itemclickListner;

    public void setItemclickListner(ClickListner itemclickListner) {
        this.itemclickListner = itemclickListner;
    }

    // It is a private list with model class object
    private List<paneerghar> paneergharList;

    // It is a Constructor of List
    public mycustomeradapter(List<paneerghar> paneergharList) {
        this.paneergharList = paneergharList;
    }


    // these are the essential method to bind the adapter class with adapter item view
    @NonNull
    @Override
    // this method is used to create a new viewholder when Recycler view need that item
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem= LayoutInflater.from(parent.getContext()).inflate(
                R.layout.card_view_layout,
                parent,
                false
        );

        return new viewHolder(viewItem);
    }


    // this method is used to bind the data with the specific position
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
       //we use this for getting the specific position of item from the Model class
       paneerghar p=paneergharList.get(position);
       holder.card_image.setImageResource(p.getCard_image());
       holder.recipe_text.setText(p.getRecipe_text());


    }

    // get the total number of count
    @Override
    public int getItemCount() {
        return paneergharList.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        // Intiallizing View
        ImageView card_image;
        TextView recipe_text;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);


            // finding view
            card_image=itemView.findViewById(R.id.card_image);
            recipe_text=itemView.findViewById(R.id.recipe_text);
        }

        @Override
        public void onClick(View view) {
            if(itemclickListner!=null){
                itemclickListner.onCLick(view,getAdapterPosition());
            }
        }
    }
}
