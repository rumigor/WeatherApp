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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    TextView city;
    ImageView mainImage;
    TextView temp;
    TextView humid;
    TextView press;
    TextView precip;

    TextView wind;
    TextView sunrise;
    TextView sunset;
    TextView prPob;
    TextView uv;
    TextView windP;
    TextView sunriseT;
    TextView sunsetT;
    TextView uvL;
    TextView prProbP;

    WeatherParameters weatherParameters;
    private final static int REQUEST_CODE = 0x1FAB;
    private final static int REQUEST_CODE_SET = 0xCDFE;
    boolean nightTheme = false;
    boolean celsius = true;
    boolean isWindCheck = false;
    boolean isSunriseSunsetCheck = false;
    boolean isPrecProbCheck = false;
    boolean isUVcheck = false;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
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
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        city = view.findViewById(R.id.textView2);
        mainImage = view.findViewById(R.id.imageView2);
        temp = view.findViewById(R.id.temp);
        humid = view.findViewById(R.id.humid);
        press = view.findViewById(R.id.pressure);
        precip = view.findViewById(R.id.precip);

        wind = view.findViewById(R.id.wind);
        sunrise = view.findViewById(R.id.sunrise);
        sunset = view.findViewById(R.id.sunset);
        prPob = view.findViewById(R.id.precipProb);
        uv = view.findViewById(R.id.uv);
        windP = view.findViewById(R.id.windP);
        sunriseT = view.findViewById(R.id.sunriseTime);
        sunsetT = view.findViewById(R.id.sunsetTime);
        uvL = view.findViewById(R.id.uvL);
        prProbP = view.findViewById(R.id.pP);




    }
}