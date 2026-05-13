package com.zepto;

import android.database.Cursor;
import com.zepto.dz7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ez7 implements dz7 {
    public final je5 a;
    public final u22 b;
    public final f16 c;

    public class a extends u22 {
        public a(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.zepto.u22
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(r96 r96Var, cz7 cz7Var) {
            if (cz7Var.a() == null) {
                r96Var.C(1);
            } else {
                r96Var.s(1, cz7Var.a());
            }
            if (cz7Var.b() == null) {
                r96Var.C(2);
            } else {
                r96Var.s(2, cz7Var.b());
            }
        }
    }

    public class b extends f16 {
        public b(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public ez7(je5 je5Var) {
        this.a = je5Var;
        this.b = new a(je5Var);
        this.c = new b(je5Var);
    }

    public static List e() {
        return Collections.emptyList();
    }

    @Override // com.zepto.dz7
    public void a(cz7 cz7Var) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(cz7Var);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // com.zepto.dz7
    public void b(String str, Set set) {
        dz7.a.a(this, str, set);
    }

    @Override // com.zepto.dz7
    public List d(String str) {
        me5 me5VarJ = me5.j("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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
