package com.example.enclaveit.sunshineapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // TODO Create a field to store the weather display TextView
    //ok
    private TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO Use findViewBy to get reference to the weather display TextView
        //ok
        mWeatherTextView=(TextView) findViewById(R.id.tv_weather_data);
        //TODO Create an arrays of string that contain the fake weather data

        //Create an array of String that contain fake weather data
        //delete the dummy weather data. you will be getting the Real data from the Internet in
        //in this lesson
//        String [] dummyWeatherData = {
//                "Today, May 17 - Clear - 17°C / 15°C",
//                "Tomorrow, May 17 - Clear - 17°C / 15°C",
//                "Thursday, May 17 - Clear - 17°C / 15°C",
//                "Sunday, May 17 - Clear - 17°C / 15°C",
//                "Tue, May 17 - Clear - 17°C / 15°C",
//                "Wed, May 17 - Clear - 17°C / 15°C"
//        };

        // Create a class that extends AsyncTask to perform network request
        //ok
         public class FetchWeatherTask extends AsyncTask<String, Void, String[]> {
             //Override the doIn
         }


        // Append each String from the fake weather to the Textview
        // delete the for loop that populates the Textview with dummmy data
        //ok

//        for(String dummyWeatherDay: dummyWeatherData){
//            mWeatherTextView.append(dummyWeatherDay);
//        }

    }
}
