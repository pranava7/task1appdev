package com.example.task1appdev;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class canvas_fragment1 extends View {


    public static Path path;
    public static Paint paint;
    canvas_fragment2 canvasFragment2;



    public canvas_fragment1(Context context) {

        super(context);
        paint = new Paint();
        path=new Path();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5f);

        canvasFragment2 = new canvas_fragment2(getContext());
    }

    public canvas_fragment1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public canvas_fragment1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public canvas_fragment1(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(@Nullable AttributeSet set) {


        canvasFragment2 = new canvas_fragment2(getContext());

//        paint = new Paint();
//        path=new Path();
//        paint.setAntiAlias(true);
//        paint.setColor(Color.RED);
//        paint.setStrokeJoin(Paint.Join.ROUND);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(5f);




    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvasFragment2.postInvalidate();
        canvas.drawPath(path, paint);

    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);

        float x = event.getX();
        float y = event.getY();


        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x, y);
                postInvalidate();
                canvasFragment2.path.moveTo(x + 50, y + 50);
                canvasFragment2.postInvalidate();
                return true;

            case MotionEvent.ACTION_MOVE:
                path.lineTo(x, y);
                canvasFragment2.path.lineTo(x + 50, y + 50);
                canvasFragment2.postInvalidate();
                break;

            case MotionEvent.ACTION_UP:
                return false;


        }
        postInvalidate();
        canvasFragment2.postInvalidate();
        return true;
    }

    public void updateUIdown(float x, float y) {
        canvasFragment2.path.moveTo(x, y);
        canvasFragment2.postInvalidate();

    }

    public void updateUImove(float x, float y) {
        canvasFragment2.path.lineTo(x, y);
        canvasFragment2.postInvalidate();

    }




}
