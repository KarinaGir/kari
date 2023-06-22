package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class show extends AppCompatActivity {
    private TextView tvname, tvmesto, tvdate, tvotvet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        init();
        getIntentMain();

        Button button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switcher = new Intent(show.this, glavnayavol.class);
                show.this.startActivity(switcher);
            }

        });
    }
    private void init()
    {
        tvname = findViewById(R.id.tvname);
        tvmesto = findViewById(R.id.tvmesto);
        tvdate = findViewById(R.id.tvdate);
        tvotvet = findViewById(R.id.tvotvet);
    }
    private void getIntentMain()
    {
        Intent i = getIntent();
        if(i !=null)
        {
            tvname.setText(i.getStringExtra("create_name"));
            tvmesto.setText(i.getStringExtra("create_mesto"));
            tvdate.setText(i.getStringExtra("create_date"));
            tvotvet.setText(i.getStringExtra("create_otvet"));
        }
    }
}