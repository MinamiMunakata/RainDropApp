package com.bignerdranch.android.raindropapp;

import android.graphics.Paint;

/**
 * Created by Minami on 2018-07-03.
 */

public class RainDropsColor {
    public Paint paint;
    public RainDropsColor(int r, int g, int b) {
        paint = new Paint();
        paint.setARGB(255, r, g, b);
    }
}
