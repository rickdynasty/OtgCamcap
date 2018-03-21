package de.xeqo.camcapdemo;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.lang.reflect.Array;

final class bl implements OnTouchListener {
    private /* synthetic */ RemoteCaptureActivity a;

    bl(RemoteCaptureActivity remoteCaptureActivity) {
        this.a = remoteCaptureActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        "x: " + motionEvent.getX();
        "y: " + motionEvent.getY();
        int x = (int) (((double) motionEvent.getX()) / 54.54545454545455d);
        int y = (int) (((double) motionEvent.getY()) / 85.2d);
        "Row: " + y;
        "Column: " + x;
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 11});
        iArr[0][4] = 13;
        iArr[0][5] = 3;
        iArr[0][6] = 8;
        iArr[1][0] = 38;
        iArr[1][1] = 35;
        iArr[1][2] = 32;
        iArr[1][3] = 29;
        iArr[1][4] = 12;
        iArr[1][5] = 2;
        iArr[1][6] = 7;
        iArr[1][7] = 17;
        iArr[1][8] = 20;
        iArr[1][9] = 23;
        iArr[1][10] = 26;
        iArr[2][0] = 37;
        iArr[2][1] = 34;
        iArr[2][2] = 31;
        iArr[2][3] = 28;
        iArr[2][4] = 11;
        iArr[2][5] = 1;
        iArr[2][6] = 6;
        iArr[2][7] = 16;
        iArr[2][8] = 19;
        iArr[2][9] = 22;
        iArr[2][10] = 25;
        iArr[3][0] = 39;
        iArr[3][1] = 36;
        iArr[3][2] = 33;
        iArr[3][3] = 30;
        iArr[3][4] = 14;
        iArr[3][5] = 4;
        iArr[3][6] = 9;
        iArr[3][7] = 18;
        iArr[3][8] = 21;
        iArr[3][9] = 24;
        iArr[3][10] = 27;
        iArr[4][4] = 15;
        iArr[4][5] = 5;
        iArr[4][6] = 10;
        int i = iArr[y][x];
        "Area: " + i;
        if (i > 0) {
            this.a.A.c((char) i);
        }
        return false;
    }
}
