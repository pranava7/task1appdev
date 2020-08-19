package com.example.task1appdev;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.Rectangle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class fragment1 extends Fragment {

    public canvas_fragment1 canvas_fragment1;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
  //      View rootview = inflater.inflate(R.layout.fragment_1, container, false);
//        RelativeLayout relativelayout =(RelativeLayout) rootview.findViewById(R.id.path1);
//        relativelayout.addView(new rectangle(getActivity()));


        canvas_fragment1 = new canvas_fragment1(container.getContext());
        return canvas_fragment1;
}

}
//          private class rectangle extends View{
//              public  Paint paint;
//              public  Path path;
//
//              public rectangle(Context context) {
//                  super(context);
//              }
//
//              public rectangle(Context context, @Nullable AttributeSet attrs) {
//                  super(context, attrs);
//              }
//
//              public rectangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//                  super(context, attrs, defStyleAttr);
//              }
//
//              public rectangle(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//                  super(context, attrs, defStyleAttr, defStyleRes);
//              }
//              private void init(@Nullable AttributeSet set) {
//
//
//
//                  paint = new Paint();
//                  path = new Path();
//
//                  paint.setAntiAlias(true);
//                  paint.setColor(Color.RED);
//                  paint.setStrokeJoin(Paint.Join.ROUND);
//                  paint.setStyle(Paint.Style.STROKE);
//                  paint.setStrokeWidth(5f);
//
//
//
//
//              }
//              @Override
//              protected void onDraw(Canvas canvas) {
//                  super.onDraw(canvas);
//                  canvas.drawPath(path,paint);
//
//
//              }
//
//
//              @Override
//              public boolean onTouchEvent(MotionEvent event) {
//                  super.onTouchEvent(event);
//
//                  float x = event.getX();
//                  float y = event.getY();
//
//
//                  switch (event.getAction()) {
//                      case MotionEvent.ACTION_DOWN:
//                          path.moveTo(x, y);
//
//
//
//
//
//
//
//                          return true;
//
//                      case MotionEvent.ACTION_MOVE:
//                          path.lineTo(x, y);
//
//                          break;
//
//                      case MotionEvent.ACTION_UP:
//                          return false;
//
//
//                  }
//                  postInvalidate();
//                  return true;
//              }
//
//
//          }
//}
