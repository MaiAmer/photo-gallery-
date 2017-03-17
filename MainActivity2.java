package com.example.mayouza.myapplication2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;

public class MainActivity2 extends Activity implements View.OnTouchListener {
    public ImageView image, image1, image2, imag3, image4;
    int[] drawableIds = {R.drawable.im, R.drawable.im1, R.drawable.im2, R.drawable.im3, R.drawable.im4};

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        image1 = (ImageView) findViewById(R.id.image1);
        image1.setOnTouchListener(this);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            counter++;
            image.setImageResource(drawableIds[drawableIds.length % counter]);
            return true;

        }
        return false;
    }
}
