/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView

    TextView mWeatherTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView

        mWeatherTextView  = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data

        String[] dummyWeatherData = {
                "Today, Jan 23 - Clear - 17Â°C / 15Â°C",
                "Tomorrow - Cloudy - 19Â°C / 15Â°C",
                "Thursday - Rainy- 30Â°C / 11Â°C",
                "Friday - Thunderstorms - 21Â°C / 9Â°C",
                "Saturday - Thunderstorms - 16Â°C / 7Â°C",
                "Sunday - Rainy - 16Â°C / 8Â°C",
                "Monday - Partly Cloudy - 15Â°C / 10Â°C",
                "Tue, Jan 30 - Rainy - 16Â°C / 18Â°C",
                "Wed, Jan 31 - Cloudy - 19Â°C / 15Â°C",
                "Thu, Feb 1 - Sunny - 30Â°C / 11Â°C",
                "Fri, Feb 2 - Rainy - 21Â°C / 9Â°C",
                "Sat, Feb 3 - Sunny - 16Â°C / 7Â°C",
                "Sun, Feb 4 - Clear - 16Â°C / 8Â°C",
                "Mon, Feb 5 - Cloudy - 15Â°C / 10Â°C",
        };


        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String dummyweatherData : dummyWeatherData) { mWeatherTextView .append(dummyweatherData + "\n\n\n");}
    }
}