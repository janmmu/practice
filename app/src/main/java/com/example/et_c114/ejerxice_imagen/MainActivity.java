package com.example.et_c114.ejerxice_imagen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;
    RadioGroup migrupo;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen= findViewById(R.id.miimagen);
        migrupo = findViewById(R.id.base);
        rb1 = findViewById(R.id.eeuu);
        rb2 = findViewById(R.id.cuba);
        rb3 = findViewById(R.id.canada);
        rb4 = findViewById(R.id.venezuela);

        migrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i)
                {
                    case R.id.eeuu:
                        imagen.setImageResource(R.drawable.eeuu);
                        break;
                    case R.id.cuba:
                        imagen.setImageResource(R.drawable.cuba);
                        break;
                    case R.id.canada:
                        imagen.setImageResource(R.drawable.canada);
                        break;
                    case R.id.venezuela:
                        imagen.setImageResource(R.drawable.venezuela);
                        break;
                }
            }
        });



    }
}
