package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";



    ArrayList<MyRecyclerView> minTestText = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =findViewById(R.id.myRecyclerView);

        ArrayList<Mountain> mountainList = new ArrayList<>();
        mountainList.add(new Mountain("Hej", "Hejsan!", 2));

        setUpMyRecyclerView();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mountainList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        new JsonFile(this, this).execute(JSON_FILE);
    }

    private void setUpMyRecyclerView() {
        String[] testTexter = getResources().getStringArray(R.array.test_texter);

        for (int i = 0; i<testTexter.length; i++) {
            minTestText.add(new MyRecyclerView(testTexter[i]));
        }

    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }

}
