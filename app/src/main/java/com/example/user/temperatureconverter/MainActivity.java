package com.example.user.temperatureconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText temp = (EditText)findViewById(R.id.editView1);
        final RadioButton cel2far = (RadioButton)findViewById(R.id.c2f);
        final RadioButton far2cel = (RadioButton)findViewById(R.id.f2c);
        final Button convert = (Button)findViewById(R.id.button);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = new Double(temp.getText().toString());
                if(far2cel.isChecked()){

                    result = Converter.cel2fahr(result);
                }
                else
                    result = Converter.fahr2cel(result);

                temp.setText(new Double(result).toString());
            }
        });

    }



}


