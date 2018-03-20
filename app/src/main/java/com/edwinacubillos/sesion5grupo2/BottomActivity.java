package com.edwinacubillos.sesion5grupo2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        BottomNavigationView navigation =  findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        SupermanFragment frag = new SupermanFragment();
        ft.add(R.id.frame, frag).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            ft = fm.beginTransaction();
            switch (item.getItemId()) {
                case R.id.mBatman:
                    BatmanFragment frag2 = new BatmanFragment();
                    ft.replace(R.id.frame, frag2).commit();
                    return true;
                case R.id.mSuperman:
                    SupermanFragment frag = new SupermanFragment();
                    ft.replace(R.id.frame, frag).commit();
                    return true;
                case R.id.mFlash:
                    FlashFragment frag3 = new FlashFragment();
                    ft.replace(R.id.frame, frag3).commit();
                    return true;
            }
            return false;
        }
    };
}
