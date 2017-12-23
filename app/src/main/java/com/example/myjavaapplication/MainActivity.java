package com.example.myjavaapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloWorld;
    EditText inputText;
    Button btnShow;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText) findViewById(R.id.input_text);
        btnShow = (Button) findViewById(R.id.btnShow);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newLine = inputText.getText().toString();
                inputText.setText(newLine);

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newLine = inputText.getText().toString();

                inputText.setText("");
            }
        });

    }
}