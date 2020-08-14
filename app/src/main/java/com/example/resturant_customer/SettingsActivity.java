package com.example.resturant_customer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SettingsActivity extends TopMenuActivity {

    EditText tableNoET;
    Button settingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        tableNoET = findViewById(R.id.editTextTextTableNumber);
        settingBtn = findViewById(R.id.settingsbutton);

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SettingsActivity.this,"table numbers have been updated",Toast.LENGTH_SHORT).show();
                //add roomdatabase to this
            }
        });
    }
}
