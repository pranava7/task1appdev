package com.example.task1appdev;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class canvas_fragment2 extends View {


    public Path path;
    public Paint paint;


    public canvas_fragment2(Context context) {

        super(context);
        paint = new Paint();
        path=new Path();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5f);
    }

    public canvas_fragment2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public canvas_fragment2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public canvas_fragment2(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

//    private void init(@Nullable AttributeSet set) {
//
//
//
//        paint = new Paint();
//        path=new Path();
//        paint.setAntiAlias(true);
//        paint.setColor(Color.RED);
//        paint.setStrokeJoin(Paint.Join.ROUND);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(5f);
//
//
//
//
//    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        canvas.drawPath(path, paint);

    }



//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        super.onTouchEvent(event);
//
//        float x = event.getX();
//        float y = event.getY();
//
//
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                path.moveTo(x, y);
//                postInvalidate();
//                return true;
//
//            case MotionEvent.ACTION_MOVE:
//                path.lineTo(x, y);
//
//                break;
//
//            case MotionEvent.ACTION_UP:
//                return false;
//
//
//        }
//        postInvalidate();
//        return true;
//    }





}
