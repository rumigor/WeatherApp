package com.lenecoproekt.weatherapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.lenecoproekt.weatherapp.Constants.*;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {
    TextView frDTemp;
    TextView frNTemp;
    TextView stDTemp;
    TextView stNTemp;
    TextView sunDTemp;
    TextView sunNTemp;
    ImageView fw;
    ImageView stw;
    ImageView sunW;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forecast, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        frDTemp = view.findViewById(R.id.firstdt);
        frNTemp = view.findViewById(R.id.firstnt);
        stDTemp = view.findViewById(R.id.secdt);
        stNTemp = view.findViewById(R.id.secnt);
        sunDTemp = view.findViewById(R.id.thirddt);
        sunNTemp = view.findViewById(R.id.thirdnt);
        fw = view.findViewById(R.id.frImg);
        stw = view.findViewById(R.id.satImg);
        sunW = view.findViewById(R.id.sunImg);
        Button chgCity = view.findViewById(R.id.chgCity);
        Button goToWeb = view.findViewById(R.id.openInternet);
//        goToWeb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url="";
//                if (city.getText().toString().equals(getString(R.string.city))){
//                    url = "https://www.gismeteo.ru/weather-sankt-peterburg-4079/";
//                }
//                else if (city.getText().toString().equals(getString(R.string.cityV))){
//                    url = "https://www.gismeteo.ru/weather-vilnius-4230/";
//                }
//                else if (city.getText().toString().equals(getString(R.string.cityT))){
//                    url = "https://www.gismeteo.ru/weather-adeje-50201/";
//                }
//                Uri uri = Uri.parse(url);
//                Intent browser = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(browser);
//
//            }
//        });

        chgCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cityIntent = new Intent(getContext(), CityActivity.class);
                startActivity(cityIntent);
            }
        });
//        Button settings = view.findViewById(R.id.settings);
//        settings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent settingsIntent = new Intent(getContext(), SettingsActivity.class);
//                startActivity(settingsIntent);
//            }
//        });
    }
}