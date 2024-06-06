package com.example.zad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button pretvoriE, pretvoriD;
    EditText UIE, UID;
    TextView EUD,DUD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pretvoriE=(Button)findViewById(R.id.pretvoriE);
        pretvoriD=(Button)findViewById(R.id.pretvoriD);
        UIE=(EditText)findViewById(R.id.UIE);
        UID=(EditText)findViewById(R.id.UID);
        EUD=(TextView)findViewById(R.id.EUD);
        DUD=(TextView)findViewById(R.id.DUD);

        pretvoriE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double evri=Double.parseDouble(String.valueOf(UIE.getText()))*116;
                EUD.setText(String.valueOf(evri));
            }
        });
        pretvoriD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dolars=Double.parseDouble(String.valueOf(UID.getText()))*105;
                DUD.setText(String.valueOf(dolars));
            }
        });
    }

}