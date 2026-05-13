package com.zepto;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class vf3 extends m00 {
    public final ListView s;

    public vf3(ListView listView) {
        super(listView);
        this.s = listView;
    }

    @Override // com.zepto.m00
    public boolean a(int i) {
        return false;
    }

    @Override // com.zepto.m00
    public boolean b(int i) {
        ListView listView = this.s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.zepto.m00
    public void j(int i, int i2) {
        wf3.a(this.s, i2);
    }
}
