package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edimie = findViewById(R.id.editimie);
    boolean pan, pani;

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
        Intent intentPan = new Intent(MainActivity.this, PaniActivity.class);
        Intent intentPani = new Intent(MainActivity.this, PanActivity.class);

        String imieS = edimie.getText().toString();

        if(imieS.length() > 0){
            validateName(imieS);

            if(pani){
                startActivity(intentPani);
            }

            if(pan){
                startActivity(intentPan);
            }
        }else{
            edimie.setError("Puste pole");
        }


    }
    public void validateName(String Name) {
        if(Name.matches(".{2,}a")){
            pani = true;
        }else{
            pan = true;
        }
}
}