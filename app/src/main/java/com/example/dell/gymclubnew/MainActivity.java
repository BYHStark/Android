package com.example.dell.gymclubnew;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.login_btn_register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,register.class);
                startActivity(intent);
            }
        });

        Button btn1 = (Button)findViewById(R.id.login_btn_login);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText per_name_edit = findViewById(R.id.login_edit_account);
                EditText per_pwd_edit = findViewById(R.id.login_edit_pwd);
                String name = per_name_edit.getText().toString();
                String pwd = per_pwd_edit.getText().toString();
                if(name.equals("byh")&&pwd.equals("yzramour")){
                    Intent intent1 = new Intent(MainActivity.this,index.class);
                    startActivity(intent1);
                }
                else{
                    Intent intent1 = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent1);
                }
            }
        });

    }

}
