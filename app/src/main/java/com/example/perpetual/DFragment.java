package com.example.perpetual;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class DFragment extends Fragment {
    TextView logout;
    ImageView imageView;
    Button button1;
    FloatingActionButton button;
    private final int GALLERY_REQ_CODE = 1000;


    public DFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_d, container, false);
        //Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getColor(R.color.Blue)));
        imageView = v.findViewById(R.id.profile_img);
        button = v.findViewById(R.id.floatingActionButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iGallery = new Intent(Intent.ACTION_PICK);
                iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(iGallery, GALLERY_REQ_CODE);

            }

            protected void startActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
               DFragment.super.onActivityResult(requestCode, resultCode, data);
                if (resultCode == RESULT_OK) {
                    if (requestCode == GALLERY_REQ_CODE) {
                        imageView.setImageURI(data.getData());
                    }
                }
            }
        });


        logout = v.findViewById(R.id.profile_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
        return v;

    }


}
