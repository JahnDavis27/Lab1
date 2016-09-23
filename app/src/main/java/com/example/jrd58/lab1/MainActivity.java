package com.example.jrd58.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = new Toast(this);
        Toast.makeText(this, "Hello jrd58!", toast.LENGTH_LONG).show();
    }
}
