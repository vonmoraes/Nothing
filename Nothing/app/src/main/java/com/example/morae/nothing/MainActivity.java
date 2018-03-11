package com.example.morae.nothing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SET AND CONFIGURE TEXTBOX
        textBox = findViewById(R.id.textView);
    }

    public void brazil(View arg0){
        textBox.setText(R.string.ptbr);
    }
    public void usa(View arg0){
        textBox.setText(R.string.en);
    }
    public void italy(View arg0){
        textBox.setText(R.string.it);
    }
    public void spain(View arg0){
        textBox.setText(R.string.es);
    }

}
