package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class registrashion extends AppCompatActivity {
    private EditText edName, edSurname, edEmail;
    private DatabaseReference mDataBase;
    private String USER_KEY = "User";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrashion);
        init();

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switcher = new Intent(registrashion.this, MainActivity.class);
                registrashion.this.startActivity(switcher);
            }

        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switcher = new Intent(registrashion.this, MainActivity.class);
                registrashion.this.startActivity(switcher);
            }

        });
    }
    private void init()
    {
      edName = findViewById(R.id.edName);
      edSurname = findViewById(R.id.edSurname);
      edEmail = findViewById(R.id.edEmail);
      mDataBase = FirebaseDatabase.getInstance().getReference(USER_KEY);
    }

    public void onClickSave(View view)
    {
     String id = mDataBase.getKey();
     String name = edName.getText().toString();
     String surname = edSurname.getText().toString();
     String email = edEmail.getText().toString();
     User newUser = new User(id,name,surname,email);
     mDataBase.push().setValue(newUser);
    }
}