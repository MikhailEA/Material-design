package com.example.homework7.bottom;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.homework7.R;
import com.example.homework7.fragments.Fragment1;
import com.example.homework7.fragments.Fragment2;
import com.example.homework7.fragments.Fragment3;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        replaceFragment(new Fragment1());

        BottomNavigationView bottomNav = findViewById(R.id.navigation_view);
        bottomNav.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemReselectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.nav_airplay:
                    replaceFragment(new Fragment1());
                    return;
                case R.id.nav_circle:
                    replaceFragment(new Fragment2());
                    return;
                case R.id.nav_cloud:
                    replaceFragment(new Fragment3());
            }
        }
    };

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
    }
}






