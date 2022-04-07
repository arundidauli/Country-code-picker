package com.arun.countrycodepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.arun.country_code_picker.PhoneUtil;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "Country Code : "+ PhoneUtil.GetCountryZipCode(this));
        Log.e(TAG, "Country Code : +"+ PhoneUtil.GetCountryZipCode(this));

    }
}