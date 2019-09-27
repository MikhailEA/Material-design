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

        BottomNavigationView bottomNav = findViewById(R.id.navigation_view);
        bottomNav.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemReselectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    replaceFragment(new Fragment1());
                    return true;
                case R.id.nav_favorites:
                    replaceFragment(new Fragment2());
                    return true;
                case R.id.nav_search:
                    replaceFragment(new Fragment3());
                    return true;
            }
            return false;
        }
    };

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
    }
}






