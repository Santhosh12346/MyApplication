package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText nameEditText;//adding text
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.editTextTextPersonName2);

    }
    public void handleclick(View view){
        String name = nameEditText.getText().toString();
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
        Intent hIntent = new Intent(MainActivity.this,Secondactivity.class);
        hIntent.putExtra("harmankey",name);
        startActivity(hIntent);

    }
}