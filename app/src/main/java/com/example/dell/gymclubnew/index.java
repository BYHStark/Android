package com.example.dell.gymclubnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class index extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        Button btn2 = (Button)findViewById(R.id.FindByGym);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(index.this,gym.class);
                startActivity(intent);
            }
        });

        Button btn3 = (Button)findViewById(R.id.FindBySports);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(index.this,sports.class);
                startActivity(intent);
            }
        });
    }
}