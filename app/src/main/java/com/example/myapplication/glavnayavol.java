package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class glavnayavol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavnayavol);


    }
    public void onClickRead(View view)
    {
        Intent i = new Intent(glavnayavol.this, podacha.class);
        startActivity(i);
    }
}