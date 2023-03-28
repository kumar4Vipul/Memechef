package com.example.memechef;

import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class onDoubleTapListener implements View.OnTouchListener {

    private final GestureDetector gestureDetector;
    private static final String DEBUG_TAG = "Gestures";


    public onDoubleTapListener(Context ctx){
        gestureDetector = new GestureDetector(ctx, new GestureListener());
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onDoubleTap(MotionEvent e) {
            Log.d(DEBUG_TAG, "onDoubleTap: " );

            return true;
        }
    }

}

