package com.example.handlinggesture;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener
{
    private TextView raimaTextView;
    private GestureDetectorCompat gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        raimaTextView=(TextView)findViewById(R.id.raimaTextView);
        this.gestureDetector=new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);


        /////////////handling button//////////////////

        Button raimaButton=(Button)findViewById(R.id.raimaButton);
        raimaButton.setOnClickListener(new Button.OnClickListener()
                                       {
                                           public void onClick(View v)
                                           {
                                               TextView raimaTextView=(TextView)findViewById(R.id.raimaTextView);
                                               raimaTextView.setText("Button has been touched");
                                           }
                                       }
        );

        raimaButton.setOnLongClickListener(new Button.OnLongClickListener()
                                           {
                                               public boolean onLongClick(View v)
                                               {
                                                   TextView raimaTextView=(TextView)findViewById(R.id.raimaTextView);
                                                   raimaTextView.setText("Long click event of Button successfully handled");
                                                   return true;
                                               }
                                           }
        );




        ////////////end handling button///////////////

    }

    @Override
    public boolean onTouchEvent(MotionEvent event)//default function when user touches the screen
    {
        this.gestureDetector.onTouchEvent(event);//detect if touch is a gesture like scroll or fling ,but if it is not then continue
        return super.onTouchEvent(event);
    }



    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        raimaTextView.setText("Single Tap Motion Confirmed");
        return true;//to show event has been handled
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        raimaTextView.setText("Double Tap Motion confirmed");
        return true;//to show event has been handled
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        raimaTextView.setText("Double Tap Motion confirmed");
        return true;//to show event has been handled
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        raimaTextView.setText("on Down Motion Confirmed");
        return true;//to show event has been handled
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        raimaTextView.setText("on Press Motion Confirmed");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        raimaTextView.setText("Single Tap Motion Confirmed");
        return true;//to show event has been handled
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        raimaTextView.setText("Scroll Motion Confirmed");
        return true;//to show event has been handled
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        raimaTextView.setText("Long Press Motion Confirmed");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        raimaTextView.setText("Fling Motion Confirmed");
        return true;//to show event has been handled
    }
}
