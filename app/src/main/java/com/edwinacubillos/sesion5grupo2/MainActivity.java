package com.edwinacubillos.sesion5grupo2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        SupermanFragment frag = new SupermanFragment();
        ft.add(android.R.id.content, frag).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        ft = fm.beginTransaction();
        switch(id){
            case R.id.mSuperman:
                SupermanFragment frag = new SupermanFragment();
                ft.replace(android.R.id.content, frag).commit();
                break;
            case R.id.mBatman:
                BatmanFragment frag2 = new BatmanFragment();
                ft.replace(android.R.id.content, frag2).commit();
                break;
            case R.id.mFlash:
                FlashFragment frag3 = new FlashFragment();
                ft.replace(android.R.id.content, frag3).commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
