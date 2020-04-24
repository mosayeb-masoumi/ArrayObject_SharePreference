package com.example.arrayobj_sharepreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btn_save_array(View view) {

        ArrayList<Model> arrayList = new ArrayList<>();
        arrayList.add(new Model("miald",20));
        arrayList.add(new Model("ali",35));

        Cache.saveArray(this,"ARRAY_KEY",arrayList);
    }


    public void btn_save_object(View view) {
        Model model = new Model("ali", 20);
        Cache.saveObject(this, "OBJECT_KEY", model);
    }

    public void btn_goto_second(View view) {
        startActivity(new Intent(MainActivity.this, SecondActivity.class));
    }



}
