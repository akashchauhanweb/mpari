package com.zepto;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ry7 implements qy7 {
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
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // com.zepto.u22
        public /* bridge */ /* synthetic */ void i(r96 r96Var, Object obj) {
            wb0.a(obj);
            k(r96Var, null);
        }

        public void k(r96 r96Var, py7 py7Var) {
            throw null;
        }
    }

    public class b extends f16 {
        public b(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends f16 {
        public c(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public ry7(je5 je5Var) {
        this.a = je5Var;
        this.b = new a(je5Var);
        this.c = new b(je5Var);
        this.d = new c(je5Var);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // com.zepto.qy7
    public void a(String str) {
        this.a.d();
        r96 r96VarB = this.c.b();
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
            this.c.h(r96VarB);
        }
    }

    @Override // com.zepto.qy7
    public void b() {
        this.a.d();
        r96 r96VarB = this.d.b();
        this.a.e();
        try {
            r96VarB.x();
            this.a.A();
        } finally {
            this.a.i();
            this.d.h(r96VarB);
        }
    }
}
