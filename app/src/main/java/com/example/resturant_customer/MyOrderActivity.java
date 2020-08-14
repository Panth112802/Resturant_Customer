package com.example.resturant_customer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MyOrderActivity extends TopMenuActivity {

    Button paybtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myorder);

        paybtn = findViewById(R.id.buttonPay);
        paybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MyOrderActivity.this, firstPageActivity.class);
                startActivity(i);
            }
        });
    }
}

