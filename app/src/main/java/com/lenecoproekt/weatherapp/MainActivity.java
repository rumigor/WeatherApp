package com.lenecoproekt.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    FrameLayout container;
    FrameLayout container2;
    FrameLayout container3;
    FragmentManager myFragmentManager;
    MainFragment mainFragment;
    SettingsFragment settingsFragment;
    CityChangerFragment cityChangerFragment;
    ForecastFragment forecastFragment;
    TestFragment testFragment;
    final static String TAG_1 = "MAIN_WINDOW";
    final static String TAG_2 = "SETTINGS";
    final static String TAG_3 = "CITY_CHANGER";
    final static String TAG_4 = "WEATHER_FORECAST";
    final static String KEY_MSG_1 = "FRAGMENT1_MSG";
    final static String KEY_MSG_2 = "FRAGMENT2_MSG";
    final static String KEY_MSG_3 = "FRAGMENT3_MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = findViewById(R.id.container);
        container2 = findViewById(R.id.container2);
        container3 = findViewById(R.id.container3);
        myFragmentManager = getSupportFragmentManager();
        mainFragment = new MainFragment();
        settingsFragment = new SettingsFragment();
        cityChangerFragment = new CityChangerFragment();
        forecastFragment = new ForecastFragment();

        if (savedInstanceState == null) {
            // при первом запуске программы
            FragmentTransaction fragmentTransaction = myFragmentManager
                    .beginTransaction();
            // добавляем в контейнер при помощи метода add()
            fragmentTransaction.add(R.id.container, mainFragment, TAG_1);
            fragmentTransaction.add(R.id.container2, forecastFragment, TAG_4);
            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                fragmentTransaction.add(R.id.container3, cityChangerFragment, TAG_3);
            }
            fragmentTransaction.commit();

        }

    }
}