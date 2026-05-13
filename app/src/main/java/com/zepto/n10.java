package com.zepto;

import com.zepto.qn6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n10 extends qn6 {
    public final String a;
    public final byte[] b;
    public final mv4 c;

    public static final class b extends qn6.a {
        public String a;
        public byte[] b;
        public mv4 c;

        @Override // com.zepto.qn6.a
        public qn6 a() {
            String str = "";
            if (this.a == null) {
                str = " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new n10(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.zepto.qn6.a
        public qn6.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.a = str;
            return this;
        }

        @Override // com.zepto.qn6.a
        public qn6.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // com.zepto.qn6.a
        public qn6.a d(mv4 mv4Var) {
            if (mv4Var == null) {
                throw new NullPointerException("Null priority");
            }
            this.c = mv4Var;
            return this;
        }
    }

    @Override // com.zepto.qn6
    public String b() {
        return this.a;
    }

    @Override // com.zepto.qn6
    public byte[] c() {
        return this.b;
    }

    @Override // com.zepto.qn6
    public mv4 d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qn6)) {
            return false;
        }
        qn6 qn6Var = (qn6) obj;
        if (this.a.equals(qn6Var.b())) {
            if (Arrays.equals(this.b, qn6Var instanceof n10 ? ((n10) qn6Var).b : qn6Var.c()) && this.c.equals(qn6Var.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public n10(String str, byte[] bArr, mv4 mv4Var) {
        this.a = str;
        this.b = bArr;
        this.c = mv4Var;
    }
}
