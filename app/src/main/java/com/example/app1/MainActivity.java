package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edimie = findViewById(R.id.editimie);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dal = findViewById(R.id.dalej);
        CheckBox chim = findViewById(R.id.checkimie);


        chim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    dal.setEnabled(true);
                }else
                    {
                        dal.setEnabled(false);
                    }
            }
        });
    }
    public void dajel(View view)
    {
        String edtimie = edimie.getText().toString();


    }
    public void takk(String Name)
    {
        if(edimie.matches(".{2,}e"))
        {
            tak na wszelki
        }
    }
}