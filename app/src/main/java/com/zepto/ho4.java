package com.zepto;

import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class ho4 extends uo4 {
    public ho4() {
    }

    public static ho4 v(String str, ap4 ap4Var, String str2, gp4 gp4Var) {
        ho4 ho4Var = new ho4();
        ho4Var.r(lp4.E8, lp4.f8);
        ho4Var.r(lp4.T7, new dq4(str, ap4Var, str2));
        ho4Var.r(new lp4("OP"), new op4(0));
        ho4Var.r(new lp4("AN"), gp4Var);
        return ho4Var;
    }

    public ho4(URL url) {
        this(url.toExternalForm());
    }

    public ho4(String str) {
        this(str, false);
    }

    public ho4(String str, boolean z) {
        lp4 lp4Var = lp4.E8;
        lp4 lp4Var2 = lp4.Ca;
        r(lp4Var, lp4Var2);
        r(lp4Var2, new hq4(str));
        if (z) {
            r(lp4.O4, lo4.g);
        }
    }

    public ho4(gp4 gp4Var) {
        r(lp4.E8, lp4.R3);
        r(lp4.D1, gp4Var);
    }

    public ho4(String str, String str2) {
        r(lp4.E8, lp4.T3);
        r(lp4.Q2, new hq4(str));
        r(lp4.D1, new hq4(str2));
    }

    public ho4(String str, int i) {
        r(lp4.E8, lp4.T3);
        r(lp4.Q2, new hq4(str));
        lp4 lp4Var = lp4.D1;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i - 1);
        sb.append(" /FitH 10000]");
        r(lp4Var, new jp4(sb.toString()));
    }

    public ho4(int i) {
        lp4 lp4Var = lp4.E8;
        r(lp4Var, lp4.Y5);
        if (i == 1) {
            r(lp4.R5, lp4.f3);
            return;
        }
        if (i == 2) {
            r(lp4.R5, lp4.C7);
            return;
        }
        if (i == 3) {
            r(lp4.R5, lp4.g6);
            return;
        }
        if (i == 4) {
            r(lp4.R5, lp4.h5);
        } else {
            if (i == 5) {
                r(lp4Var, lp4.T4);
                r(lp4.X4, new hq4("this.print(true);\r"));
                return;
            }
            throw new RuntimeException(dt3.b("invalid.named.action", new Object[0]));
        }
    }

    public ho4(String str, String str2, String str3, String str4) {
        r(lp4.E8, lp4.i5);
        if (str2 == null && str3 == null && str4 == null) {
            r(lp4.Q2, new hq4(str));
            return;
        }
        uo4 uo4Var = new uo4();
        uo4Var.r(lp4.Q2, new hq4(str));
        if (str2 != null) {
            uo4Var.r(lp4.S6, new hq4(str2));
        }
        if (str3 != null) {
            uo4Var.r(lp4.p6, new hq4(str3));
        }
        if (str4 != null) {
            uo4Var.r(lp4.D1, new hq4(str4));
        }
        r(lp4.kb, uo4Var);
    }
}
