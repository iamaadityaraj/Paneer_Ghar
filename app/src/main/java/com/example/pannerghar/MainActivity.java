package com.example.pannerghar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ClickListner {
    ImageView imageView;
    RecyclerView recyclerView;
    private List<paneerghar>paneergharList;
    private mycustomeradapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        recyclerView=findViewById(R.id.recycler_view);
        paneergharList=new ArrayList<>();
        paneerghar p1=new paneerghar("Cottage Panner",R.drawable.cottagepanner);
        paneerghar p2=new paneerghar("Grilled Paneer",R.drawable.grilledpanner);
        paneerghar p3=new paneerghar("Kaju Paneer",R.drawable.kajupanner);
        paneerghar p4=new paneerghar("Matar Paneer",R.drawable.matarpanner);
        paneerghar p5=new paneerghar("Paneer Curry",R.drawable.paneercurry);
        paneerghar p6=new paneerghar("Paneer Tikka",R.drawable.paneertika);
        paneerghar p7= new paneerghar("Paneer Labaddar",R.drawable.pannerlabbadar);
        paneerghar p8= new paneerghar("Paneer 60",R.drawable.pannersixty);
        paneerghar p9=new paneerghar("Tofu Paneer Palak",R.drawable.tofupannerpalak);


        paneergharList.add(p1);
        paneergharList.add(p2);
        paneergharList.add(p3);
        paneergharList.add(p4);
        paneergharList.add(p5);
        paneergharList.add(p6);
        paneergharList.add(p7);
        paneergharList.add(p8);
        paneergharList.add(p9);

        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter=new mycustomeradapter(paneergharList);
        recyclerView.setAdapter(adapter);
        adapter.setItemclickListner(this);






    }

    @Override
    public void onCLick(View view, int pos) {
        Toast.makeText(this, "" +
                "You Selected"+" "+paneergharList.get(pos).getRecipe_text(),
                Toast.LENGTH_SHORT).show();

    }
}