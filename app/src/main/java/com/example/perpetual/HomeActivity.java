package com.example.perpetual;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bnView=findViewById(R.id.bnView);
        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.nav_home){
                    loadFrag(new AFragment(),true);

                }
                else if(id==R.id.nav_shop){
                    loadFrag(new BFragment(), false);

                }
                else if(id==R.id.nav_search){
                    loadFrag(new CFragment(),false);

                }
                else{
                    loadFrag(new DFragment(),false);

                }

                return true;
            }
        });

        bnView.setSelectedItemId(R.id.nav_home);
    }
    public void loadFrag(Fragment fragment, boolean flag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(flag)
             ft.add(R.id.container,new AFragment());
        else
            ft.replace(R.id.container,fragment);
        ft.commit();

    }
}