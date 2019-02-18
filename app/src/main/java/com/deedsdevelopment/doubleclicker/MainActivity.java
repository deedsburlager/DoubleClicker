package com.deedsdevelopment.doubleclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    Button btn;
    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        txv = (TextView) findViewById(R.id.tally);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                counter++;
                txv.setText(Integer.toString(counter));

            }

        });
    }
}
