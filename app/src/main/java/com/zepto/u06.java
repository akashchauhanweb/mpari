package com.zepto;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u06 {
    public final SharedPreferences a;
    public final String b;
    public final String c;
    public final Executor e;
    public final ArrayDeque d = new ArrayDeque();
    public boolean f = false;

    public u06(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
        this.e = executor;
    }

    public static u06 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        u06 u06Var = new u06(sharedPreferences, str, str2, executor);
        u06Var.d();
        return u06Var;
    }

    public final boolean b(boolean z) {
        if (z && !this.f) {
            i();
        }
        return z;
    }

    public final void d() {
        synchronized (this.d) {
            try {
                this.d.clear();
                String string = this.a.getString(this.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.c)) {
                    String[] strArrSplit = string.split(this.c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public String e() {
        String str;
        synchronized (this.d) {
            str = (String) this.d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean zB;
        synchronized (this.d) {
            zB = b(this.d.remove(obj));
        }
        return zB;
    }

    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.c);
        }
        return sb.toString();
    }

    public final void h() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, g()).commit();
        }
    }

    public final void i() {
        this.e.execute(new Runnable() { // from class: com.zepto.t06
            @Override // java.lang.Runnable
            public final void run() {
                this.c.h();
            }
        });
    }
}
