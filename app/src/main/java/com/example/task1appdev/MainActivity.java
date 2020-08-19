package com.example.task1appdev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 Fragment1 = new fragment1();
        FragmentManager manager1 =getSupportFragmentManager();
        manager1.beginTransaction().replace(R.id.layout_1,Fragment1,Fragment1.getTag()).commit();
        fragment2 Fragment2 = new fragment2();
        FragmentManager manager2 =getSupportFragmentManager();
        manager2.beginTransaction().replace(R.id.layout_2,Fragment2,Fragment2.getTag()).commit();

    }

}