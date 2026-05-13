package com.zepto;

import com.zepto.cx4;

/* JADX INFO: loaded from: classes.dex */
public final class iy {
    public int a;
    public cx4.a b = cx4.a.DEFAULT;

    public static final class a implements cx4 {
        public final int a;
        public final cx4.a b;

        public a(int i, cx4.a aVar) {
            this.a = i;
            this.b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return cx4.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof cx4)) {
                return false;
            }
            cx4 cx4Var = (cx4) obj;
            return this.a == cx4Var.tag() && this.b.equals(cx4Var.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // com.zepto.cx4
        public cx4.a intEncoding() {
            return this.b;
        }

        @Override // com.zepto.cx4
        public int tag() {
            return this.a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
        }
    }

    public static iy b() {
        return new iy();
    }

    public cx4 a() {
        return new a(this.a, this.b);
    }

    public iy c(int i) {
        this.a = i;
        return this;
    }
}
