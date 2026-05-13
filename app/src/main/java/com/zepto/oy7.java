package com.zepto;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oy7 implements ny7 {
    public final je5 a;
    public final u22 b;

    public class a extends u22 {
        public a(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.zepto.u22
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(r96 r96Var, my7 my7Var) {
            if (my7Var.a() == null) {
                r96Var.C(1);
            } else {
                r96Var.s(1, my7Var.a());
            }
            if (my7Var.b() == null) {
                r96Var.C(2);
            } else {
                r96Var.s(2, my7Var.b());
            }
        }
    }

    public oy7(je5 je5Var) {
        this.a = je5Var;
        this.b = new a(je5Var);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // com.zepto.ny7
    public void a(my7 my7Var) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(my7Var);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // com.zepto.ny7
    public List b(String str) {
        me5 me5VarJ = me5.j("SELECT name FROM workname WHERE work_spec_id=?", 1);
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
