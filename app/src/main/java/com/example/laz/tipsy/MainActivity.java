package com.example.laz.tipsy;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText brand, name, region, vintage, producer, type,
            aroma, taste, calories, volume, temperature;
    WineDatabaseAdapter wineHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brand=(EditText) findViewById(R.id.brandValue);
        name=(EditText) findViewById(R.id.nameValue);
        region=(EditText) findViewById(R.id.regionValue);
        vintage=(EditText) findViewById(R.id.vintageValue);
        producer=(EditText) findViewById(R.id.producerValue);
        type=(EditText) findViewById(R.id.typeValue);
        aroma=(EditText) findViewById(R.id.aromaValue);
        taste=(EditText) findViewById(R.id.tasteValue);
        calories=(EditText) findViewById(R.id.caloriesValue);
        volume=(EditText) findViewById(R.id.volumeValue);
        temperature=(EditText) findViewById(R.id.temperatureValue);

        wineHelper=new WineDatabaseAdapter(this);

    }

    public void addWine(View view) {
        String Brand = brand.getText().toString();
        String Name = name.getText().toString();
        String Region = region.getText().toString();
        String Vintage = vintage.getText().toString();
        String Producer = producer.getText().toString();
        String Type = type.getText().toString();
        String Aroma = aroma.getText().toString();
        String Taste = taste.getText().toString();
        String Calories = calories.getText().toString();
        String Volume = volume.getText().toString();
        String Temperature = temperature.getText().toString();

        long id = wineHelper.insertData(Brand, Name, Region, Vintage, Producer, Type, Aroma,
                Taste, Calories, Volume, Temperature);

    }


}
