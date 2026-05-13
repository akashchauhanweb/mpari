package com.zepto;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ou4 implements nu4 {
    public final je5 a;
    public final u22 b;

    public class a extends u22 {
        public a(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // com.zepto.u22
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(r96 r96Var, mu4 mu4Var) {
            if (mu4Var.a() == null) {
                r96Var.C(1);
            } else {
                r96Var.s(1, mu4Var.a());
            }
            if (mu4Var.b() == null) {
                r96Var.C(2);
            } else {
                r96Var.X(2, mu4Var.b().longValue());
            }
        }
    }

    public ou4(je5 je5Var) {
        this.a = je5Var;
        this.b = new a(je5Var);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // com.zepto.nu4
    public Long a(String str) {
        me5 me5VarJ = me5.j("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            me5VarJ.C(1);
        } else {
            me5VarJ.s(1, str);
        }
        this.a.d();
        Long lValueOf = null;
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.nu4
    public void b(mu4 mu4Var) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(mu4Var);
            this.a.A();
        } finally {
            this.a.i();
        }
    }
}
