package com.zepto;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class li1 implements ki1 {
    public final je5 a;
    public final u22 b;

    public class a extends u22 {
        public a(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // com.zepto.u22
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(r96 r96Var, gi1 gi1Var) {
            if (gi1Var.b() == null) {
                r96Var.C(1);
            } else {
                r96Var.s(1, gi1Var.b());
            }
            if (gi1Var.a() == null) {
                r96Var.C(2);
            } else {
                r96Var.s(2, gi1Var.a());
            }
        }
    }

    public li1(je5 je5Var) {
        this.a = je5Var;
        this.b = new a(je5Var);
    }

    public static List e() {
        return Collections.emptyList();
    }

    @Override // com.zepto.ki1
    public boolean a(String str) {
        me5 me5VarJ = me5.j("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            me5VarJ.C(1);
        } else {
            me5VarJ.s(1, str);
        }
        this.a.d();
        boolean z = false;
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z = cursorB.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.ki1
    public void b(gi1 gi1Var) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(gi1Var);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // com.zepto.ki1
    public boolean c(String str) {
        me5 me5VarJ = me5.j("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            me5VarJ.C(1);
        } else {
            me5VarJ.s(1, str);
        }
        this.a.d();
        boolean z = false;
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z = cursorB.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.ki1
    public List d(String str) {
        me5 me5VarJ = me5.j("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            me5VarJ.C(1);
        } else {
            me5VarJ.s(1, str);
        }
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
}
