package com.nenofetch.authenticationpagepab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.nenofetch.authenticationpagepab.ui.login.LoginFragment;
import com.nenofetch.authenticationpagepab.ui.login.RegisterFragment;

public class MainActivity extends AppCompatActivity {

    Button loginFragment, registerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginFragment = findViewById(R.id.login_fragment_btn);
        registerFragment = findViewById(R.id.register_fragment_btn);


        loginFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new LoginFragment());
            }
        });

        registerFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new RegisterFragment());
            }
        });

    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();

    }
}