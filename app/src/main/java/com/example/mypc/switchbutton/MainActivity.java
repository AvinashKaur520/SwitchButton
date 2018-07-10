package com.example.mypc.switchbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import static android.R.attr.checked;

public class MainActivity extends AppCompatActivity {
    Switch sch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sch = (Switch) findViewById(R.id.switch1);
        sch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked==true)
                {
                    Toast.makeText(MainActivity.this,"ON",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"OFF",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
