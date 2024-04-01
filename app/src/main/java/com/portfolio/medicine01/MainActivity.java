package com.portfolio.medicine01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button login_btn;
    EditText id, pw;
    TextView register_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_btn = findViewById(R.id.btn_login);
        id = findViewById(R.id.uid);
        pw = findViewById(R.id.upw);
        register_btn = findViewById(R.id.btn_register);


    }
}