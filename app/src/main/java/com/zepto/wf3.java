package com.zepto;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf3 {

    public static class a {
        public static boolean a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        public static void b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    public static void a(ListView listView, int i) {
        a.b(listView, i);
    }
}
