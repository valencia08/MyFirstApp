package com.example.myfirstapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.myfirstapp2.MainActivity.EXTRA_MESSAGE;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}
