package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1 = (EditText) findViewById(R.id.digitar);

        TextView t2 = (TextView) findViewById(R.id.holamundo);

        t2.setText(e1.getText());

        Button b1 = (Button) findViewById(R.id.bt1);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                t2.setText(e1.getText());
            }
        });






    }
}