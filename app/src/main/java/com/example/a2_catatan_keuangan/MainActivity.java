package com.example.a2_catatan_keuangan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigation;

    private homeFragment homeFragment;
    private profileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sembuyikan header/toolbar
        getSupportActionBar().hide();

        homeFragment = new homeFragment();
        profileFragment = new profileFragment();

        bottomNavigation = (BottomNavigationView) findViewById(R.id.bottomNav);

        //Untuk inisialisasi fragment pertama kali
        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, homeFragment).commit();

        //Memberikan listener saat menu item di bottom navigation diklik
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.nav_home:
                        System.out.println("sini");
                        fragment = homeFragment;
                        break;
                    case R.id.nav_profile:
                        System.out.println("sini2");
                        fragment = profileFragment;
                        break;
                }
                final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.main_container, fragment).commit();
                return true;
            }
        });
    }
}