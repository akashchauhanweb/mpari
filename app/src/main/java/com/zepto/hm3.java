package com.zepto;

import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class hm3 extends gm3 {
    public final df3 a;
    public final a b;

    public static class a extends zq7 {
        public static final z.b f = new C0088a();
        public e56 d = new e56();
        public boolean e = false;

        /* JADX INFO: renamed from: com.zepto.hm3$a$a, reason: collision with other inner class name */
        public static class C0088a implements z.b {
            @Override // androidx.lifecycle.z.b
            public zq7 a(Class cls) {
                return new a();
            }
        }

        public static a h(cr7 cr7Var) {
            return (a) new androidx.lifecycle.z(cr7Var, f).a(a.class);
        }

        @Override // com.zepto.zq7
        public void e() {
            super.e();
            if (this.d.q() <= 0) {
                this.d.b();
            } else {
                wb0.a(this.d.r(0));
                throw null;
            }
        }

        public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.d.q() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.d.q() <= 0) {
                    return;
                }
                wb0.a(this.d.r(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.d.k(0));
                printWriter.print(": ");
                throw null;
            }
        }

        public void i() {
            if (this.d.q() <= 0) {
                return;
            }
            wb0.a(this.d.r(0));
            throw null;
        }
    }

    public hm3(df3 df3Var, cr7 cr7Var) {
        this.a = df3Var;
        this.b = a.h(cr7Var);
    }

    @Override // com.zepto.gm3
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.g(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.zepto.gm3
    public void c() {
        this.b.i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ne1.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
