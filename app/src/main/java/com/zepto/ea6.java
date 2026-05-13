package com.zepto;

import android.database.Cursor;
import com.zepto.da6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ea6 implements da6 {
    public final je5 a;
    public final u22 b;
    public final f16 c;
    public final f16 d;

    public class a extends u22 {
        public a(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // com.zepto.u22
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(r96 r96Var, ca6 ca6Var) {
            String str = ca6Var.a;
            if (str == null) {
                r96Var.C(1);
            } else {
                r96Var.s(1, str);
            }
            r96Var.X(2, ca6Var.a());
            r96Var.X(3, ca6Var.c);
        }
    }

    public class b extends f16 {
        public b(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    public class c extends f16 {
        public c(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public ea6(je5 je5Var) {
        this.a = je5Var;
        this.b = new a(je5Var);
        this.c = new b(je5Var);
        this.d = new c(je5Var);
    }

    public static List j() {
        return Collections.emptyList();
    }

    @Override // com.zepto.da6
    public List a() {
        me5 me5VarJ = me5.j("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.isNull(0) ? null : cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.da6
    public void b(ca6 ca6Var) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(ca6Var);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // com.zepto.da6
    public ca6 c(ay7 ay7Var) {
        return da6.a.a(this, ay7Var);
    }

    @Override // com.zepto.da6
    public void d(String str, int i) {
        this.a.d();
        r96 r96VarB = this.c.b();
        if (str == null) {
            r96VarB.C(1);
        } else {
            r96VarB.s(1, str);
        }
        r96VarB.X(2, i);
        this.a.e();
        try {
            r96VarB.x();
            this.a.A();
        } finally {
            this.a.i();
            this.c.h(r96VarB);
        }
    }

    @Override // com.zepto.da6
    public void f(String str) {
        this.a.d();
        r96 r96VarB = this.d.b();
        if (str == null) {
            r96VarB.C(1);
        } else {
            r96VarB.s(1, str);
        }
        this.a.e();
        try {
            r96VarB.x();
            this.a.A();
        } finally {
            this.a.i();
            this.d.h(r96VarB);
        }
    }

    @Override // com.zepto.da6
    public ca6 g(String str, int i) {
        me5 me5VarJ = me5.j("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            me5VarJ.C(1);
        } else {
            me5VarJ.s(1, str);
        }
        me5VarJ.X(2, i);
        this.a.d();
        ca6 ca6Var = null;
        String string = null;
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            int iD = b41.d(cursorB, "work_spec_id");
            int iD2 = b41.d(cursorB, "generation");
            int iD3 = b41.d(cursorB, "system_id");
            if (cursorB.moveToFirst()) {
                if (!cursorB.isNull(iD)) {
                    string = cursorB.getString(iD);
                }
                ca6Var = new ca6(string, cursorB.getInt(iD2), cursorB.getInt(iD3));
            }
            return ca6Var;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.da6
    public void h(ay7 ay7Var) {
        da6.a.b(this, ay7Var);
    }
}
