package com.example.cryptocompare;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;
    TextView following,topVolume;
    ProgressBar progressBar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.watch_list_bar:
                {
                    following.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    following.setTextColor(getResources().getColor(R.color.colorWhite));
                    topVolume.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                    topVolume.setTextColor(getResources().getColor(R.color.colorBlack));
                    progressBar.setVisibility(View.GONE);

                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction
                            .replace(R.id.insertFragmentHere,new FragmentFollowing())
                            .commit();
                }
                    return true;
                case R.id.portfolio_bar:
                    return true;
                case R.id.newsBar:
                {
                    FragmentManager fragmentManager=getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction
                            .replace(R.id.insertFragmentHere,new FragmentNews())
                            .commit();
                }


                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topVolume=findViewById(R.id.top_volume);
        following=findViewById(R.id.following);
        progressBar=findViewById(R.id.progress_bar);



        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction
                .replace(R.id.insertFragmentHere,new FragmentFollowing())
                 .commit();

        following.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              following.setBackgroundColor(getResources().getColor(R.color.colorGreen));
              following.setTextColor(getResources().getColor(R.color.colorWhite));
                topVolume.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                topVolume.setTextColor(getResources().getColor(R.color.colorBlack));
                progressBar.setVisibility(View.GONE);

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction
                        .replace(R.id.insertFragmentHere,new FragmentFollowing())
                        .commit();
            }
        });
        topVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                following.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                following.setTextColor(getResources().getColor(R.color.colorBlack));
                topVolume.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                topVolume.setTextColor(getResources().getColor(R.color.colorWhite));
                 progressBar.setVisibility(View.VISIBLE);

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction
                        .replace(R.id.insertFragmentHere,new FragmentTopVolume())
                        .commit();
            }
        });
    }

}
