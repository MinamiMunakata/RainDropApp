package com.bignerdranch.android.raindropapp;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Minami on 2018-07-03.
 */

public class Canvas extends View {
    private int velocityY = 5;
    public static final int SIZE = 10;
    private ArrayList<RainDrop> rainDrops = new ArrayList<>();
    private int animationTic = 0;
    private static final int DROPS_PER_SEC = 2;
    public Canvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        for(RainDrop drop: rainDrops){
            Paint color = drop.color;
            color.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawCircle(drop.dropX, drop.dropY, SIZE, color);
            drop.dropY += velocityY;
        }
        animationTic++;
        if (animationTic % (50 / DROPS_PER_SEC) == 0){
            RainDrop rainDrop = new RainDrop(canvas.getWidth());
            rainDrops.add(rainDrop);
        }


    }
}
