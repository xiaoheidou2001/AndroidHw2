package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyActivity.this,"Helloooo!",Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_bd = findViewById(R.id.btn_baidu);
        btn_bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Intent.ACTION_VIEW);
                it1.setData(Uri.parse("http://www.baidu.com"));
                startActivity(it1);
            }
        });

        Button btn_pb = findViewById(R.id.btn_phonebook);
        btn_pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(Intent.ACTION_CALL_BUTTON);
                startActivity(it1);
            }
        });

        Button btn_rv = findViewById(R.id.btn_rv);
        btn_rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(MyActivity.this,MyActivity2.class);
                startActivity(it1);
            }
        });

    }
}
