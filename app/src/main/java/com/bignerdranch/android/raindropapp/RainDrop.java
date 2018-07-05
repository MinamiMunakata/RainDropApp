package com.bignerdranch.android.raindropapp;

import android.graphics.Paint;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Minami on 2018-07-03.
 */

public class RainDrop {
    public Paint color;
    public float dropX;
    public float dropY;
    private ArrayList<RainDropsColor> colors;

    public RainDrop(int width) {
        Random random = new Random();
        dropY = 0;
        dropX = Canvas.SIZE + random.nextInt(width - Canvas.SIZE * 2);
        colors = new ArrayList<>();
        colors.add(new RainDropsColor(255, 0, 0));
        colors.add(new RainDropsColor(0, 255, 255));
        colors.add(new RainDropsColor(0, 0, 255));
        colors.add(new RainDropsColor(0, 0, 0));
        colors.add(new RainDropsColor(255, 255, 0));
        colors.add(new RainDropsColor(0, 255, 0));
        colors.add(new RainDropsColor(255, 0, 255));
        colors.add(new RainDropsColor(255, 95, 135));
        color = (colors.get(random.nextInt(colors.size()))).paint;
    }
}
