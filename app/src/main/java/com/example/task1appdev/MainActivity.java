package com.example.task1appdev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.graphics.Path;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements fragment1.FragmentAlistener , fragment2.FragmentBlistener {
    private fragment1 Fragment1;
    private fragment2 Fragment2;
    public Path mpath;

    public MainActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Fragment1 = new fragment1();
         Fragment2 = new fragment2();

        getSupportFragmentManager().beginTransaction().replace(R.id.layout_1,Fragment1).replace(R.id.layout_2, Fragment2).commit();


    }


    @Override
    public  void oninputAsent(Path path) {
//        mpath=pAth;
//        c.path=mpath;
//        c.postInvalidate();
        Fragment2.pathupdate(path);


    }

    @Override
    public void oninputBsent(Path path) {
        Fragment1.pathupdate(path);

    }
}