package com.zepto;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class mn6 {
    public View b;
    public final Map a = new HashMap();
    public final ArrayList c = new ArrayList();

    public mn6(View view) {
        this.b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mn6)) {
            return false;
        }
        mn6 mn6Var = (mn6) obj;
        return this.b == mn6Var.b && this.a.equals(mn6Var.a);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }
}
