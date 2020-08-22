package com.example.task1appdev;

import android.content.Context;
import android.graphics.Path;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment2 extends Fragment implements canvas_fragment1.onCanvastouch{
    public canvas_fragment1 Canvas_fragment1;
    private FragmentBlistener Blistener;

    @Override
    public void onTouch(Path path) {
        Blistener.oninputBsent(path);

    }

    public interface FragmentBlistener{
        void oninputBsent(Path path);
    }
    public fragment2(){

    }
    public void pathupdate(Path path)
    {
        Canvas_fragment1.pathset(path);
    }





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootview= inflater.inflate(R.layout.fragment_2, container, false);

        Canvas_fragment1=rootview.findViewById(R.id.canvas2);
        Canvas_fragment1.settheMcallback(this);

        return rootview;
//        return new canvas_fragment2(container.getContext());
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof FragmentBlistener)
        {
            Blistener=(FragmentBlistener)context;
        }
        else
        {
            throw new RuntimeException(context.toString()+"must implement Fragmentalistener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Blistener =null;
    }
}
