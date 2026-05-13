package com.zepto;

import com.zepto.r43;

/* JADX INFO: loaded from: classes3.dex */
public class s43 implements r43 {
    public Object a;
    public Object b;
    public Object[] c;
    public r43.a d;

    public static class a implements r43.a {
        public String a;
        public r26 b;
        public z46 c;
        public int d;

        public a(int i, String str, r26 r26Var, z46 z46Var) {
            this.a = str;
            this.b = r26Var;
            this.c = z46Var;
            this.d = i;
        }

        public String a() {
            return this.a;
        }

        public r26 b() {
            return this.b;
        }

        public String c(a86 a86Var) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a86Var.d(a()));
            stringBuffer.append("(");
            stringBuffer.append(((u26) b()).k(a86Var));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override // com.zepto.r43.a
        public final String toString() {
            return c(a86.k);
        }
    }

    public s43(r43.a aVar, Object obj, Object obj2, Object[] objArr) {
        this.d = aVar;
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
    }

    @Override // com.zepto.r43
    public Object getTarget() {
        return this.b;
    }

    public final String toString() {
        return this.d.toString();
    }
}
