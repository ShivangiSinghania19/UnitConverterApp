package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hi click listener worked! ", Toast.LENGTH_SHORT).show();
    }

                public void calculate(View view){
                    String s =editText.getText().toString();
                    int kg = Integer.parseInt(s);
                    double pound = 2.205 * kg;
                    textView2.setText("           The corresponding value in pounds is " + pound);
                    Toast.makeText(MainActivity.this, "Thanks for using this app", Toast.LENGTH_SHORT).show();

                }


            }

