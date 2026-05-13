package com.zepto;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public class so4 extends hq4 {
    public static final int[] l = {1, 4, 0, 2, 2, -1, 5, 2, 0, 11, 2, 0, 12, 2, 0, 13, 2, 0};

    public so4(Calendar calendar) {
        StringBuffer stringBuffer = new StringBuffer("D:");
        stringBuffer.append(m(calendar.get(1), 4));
        stringBuffer.append(m(calendar.get(2) + 1, 2));
        stringBuffer.append(m(calendar.get(5), 2));
        stringBuffer.append(m(calendar.get(11), 2));
        stringBuffer.append(m(calendar.get(12), 2));
        stringBuffer.append(m(calendar.get(13), 2));
        int i = (calendar.get(15) + calendar.get(16)) / 3600000;
        if (i == 0) {
            stringBuffer.append('Z');
        } else if (i < 0) {
            stringBuffer.append('-');
            i = -i;
        } else {
            stringBuffer.append('+');
        }
        if (i != 0) {
            stringBuffer.append(m(i, 2));
            stringBuffer.append('\'');
            stringBuffer.append(m(Math.abs((calendar.get(15) + calendar.get(16)) / 60000) - (i * 60), 2));
            stringBuffer.append('\'');
        }
        this.f = stringBuffer.toString();
    }

    public final String m(int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i);
        while (stringBuffer.length() < i2) {
            stringBuffer.insert(0, "0");
        }
        stringBuffer.setLength(i2);
        return stringBuffer.toString();
    }

    public so4() {
        this(new GregorianCalendar());
    }
}
