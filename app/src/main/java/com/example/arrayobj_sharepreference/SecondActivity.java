package com.example.arrayobj_sharepreference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        // to get ArrayList
        Gson gson1 = new Gson();
        String json1 = Cache.getJson(this, "ARRAY_KEY");
        Type type1 = new TypeToken<List<Model>>() {
        }.getType();
        List<Model> arrayList = gson1.fromJson(json1, type1);


        // to get Model
        Gson gson2 = new Gson();
        String json2 = Cache.getJson(this, "OBJECT_KEY");
        Type type = new TypeToken<Model>() {
        }.getType();
        Model model = gson2.fromJson(json2, type);

    }
}
