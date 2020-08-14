package com.example.resturant_customer;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class TopMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topmenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_res, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Menu:
                Toast.makeText(this, "Menu selected", Toast.LENGTH_SHORT).show();
                Intent menu = new Intent(TopMenuActivity.this,menuActivity.class);
                startActivity(menu);
                return true;
            case R.id.MyOrder:
                Toast.makeText(this, "My Order selected", Toast.LENGTH_SHORT).show();
                Intent myorder = new Intent(TopMenuActivity.this,MyOrderActivity.class);
                startActivity(myorder);
                return true;
            case R.id.Help:
                Toast.makeText(this, "Help is on the way", Toast.LENGTH_SHORT).show();
                // insert the webservice method here
                return true;
            case R.id.settings:
                Toast.makeText(this, "you are entering settings", Toast.LENGTH_SHORT).show();
             Intent settings = new Intent(TopMenuActivity.this,SettingsActivity.class);
             startActivity(settings);
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
