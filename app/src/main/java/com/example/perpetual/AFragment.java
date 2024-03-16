package com.example.perpetual;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class AFragment extends Fragment {

    TextView textView;
    TextView textView2,textView3,textView4,textView5;
    ImageView imageView,imageView2,imageView3,imageView4;


    public AFragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        textView=v.findViewById(R.id.text1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),firstline.class);
                startActivity(intent);
            }
        });
        textView2=v.findViewById(R.id.text2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),first_watch.class);
                startActivity(intent);
            }
        });

        imageView=v.findViewById(R.id.image1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),first_watch.class);
                startActivity(intent);
            }
        });

        textView3=v.findViewById(R.id.text3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),first_watch.class);
                startActivity(intent);
            }
        });
        imageView2=v.findViewById(R.id.image2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),first_watch.class);
                startActivity(intent);
            }
        });
        textView4=v.findViewById(R.id.text4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),first_watch.class);
                startActivity(intent);
            }
        });
        imageView3=v.findViewById(R.id.image3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),first_watch.class);
                startActivity(intent);
            }
        });

        textView5=v.findViewById(R.id.text5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),first_watch.class);
                startActivity(intent);
            }
        });
        imageView4=v.findViewById(R.id.image4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),first_watch.class);
                startActivity(intent);
            }
        });
        return v;
    }
}