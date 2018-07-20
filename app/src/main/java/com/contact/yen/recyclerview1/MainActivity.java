package com.contact.yen.recyclerview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.contact.yen.recyclerview1.adapter.RecyclerAdapter;
import com.contact.yen.recyclerview1.model.ObjectImage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ObjectImage> arrayObjectImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_View);
        initData();
        RecyclerAdapter adapter = new RecyclerAdapter(this, arrayObjectImage);
        recyclerView.setAdapter(adapter);
    }
    public void initData(){
        arrayObjectImage = new ArrayList<>();
        ObjectImage objectImage1 = new ObjectImage(R.drawable.ironman, "ironman");
        ObjectImage objectImage2 = new ObjectImage(R.drawable.ironman3, "ironman");
        ObjectImage objectImage3 = new ObjectImage(R.drawable.captain, "captain");

        arrayObjectImage.add(objectImage1);
        arrayObjectImage.add(objectImage2);
        arrayObjectImage.add(objectImage3);
    }
}
