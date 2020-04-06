package com.example.javatask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List list = new ArrayList();
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list_view);

        list.add("FootBall(like)");
        list.add("Chess(like)");
        list.add("Games(like)");
        list.add("Books(like)");
        list.add("Technology(like)");
        list.add("Dishonesty(Dislike)");
        list.add("Laziness(Dislike)");
        list.add("Pain(Dislike)");
        list.add("ExtremeSports(Dislike)");
        list.add("Swimming(Dislike)");
        list.add("Playing Football(Hubby)");
        list.add("Playing Chess(Hubby)");
        list.add("Reading Novels(Hubby)");
        list.add("Watching Movies(Hubby)");
        list.add("Playing VideoGames(Hubby)");
        list.add("Relaxing(Hubby)");


        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);


    }
}
