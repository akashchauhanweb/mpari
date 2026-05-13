package com.zepto;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class wk4 {
    public static final String a = rn3.i("PackageManagerHelper");

    public static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    public static boolean b(int i, boolean z) {
        return i == 0 ? z : i == 1;
    }

    public static void c(Context context, Class cls, boolean z) {
        try {
            if (z == b(a(context, cls.getName()), false)) {
                rn3.e().a(a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            rn3 rn3VarE = rn3.e();
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : "disabled");
            rn3VarE.a(str, sb.toString());
        } catch (Exception e) {
            rn3 rn3VarE2 = rn3.e();
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z ? "enabled" : "disabled");
            rn3VarE2.b(str2, sb2.toString(), e);
        }
    }
}
