package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class sozdatmerop extends AppCompatActivity {
    private EditText edNazvanie, edMesto, edDate, edOtvet;
    private DatabaseReference mDataBase;
    private String CREATE_KEY ="Create";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sozdatmerop);
        init();
    }
    private void init()
    {
        edNazvanie = findViewById(R.id.edNazvanie);
        edMesto = findViewById(R.id.edMesto);
        edDate = findViewById(R.id.edDate);
        edOtvet = findViewById(R.id.edOtvet);
        mDataBase = FirebaseDatabase.getInstance().getReference(CREATE_KEY);
    }

    public void onClicksozr(View view)
    {
        String id = mDataBase.getKey();
        String name = edNazvanie.getText().toString();
        String mesto = edMesto.getText().toString();
        String date = edDate.getText().toString();
        String otvet = edOtvet.getText().toString();
        create newCreate = new create(id,name,mesto,date,otvet);
        mDataBase.push().setValue(newCreate);


    }


}

