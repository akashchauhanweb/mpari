package com.zepto;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uw3 {
    public final sw3 a;
    public final List b;
    public final Integer c;

    public static final class b {
        public ArrayList a = new ArrayList();
        public sw3 b = sw3.b;
        public Integer c = null;

        public b a(p63 p63Var, int i, String str, String str2) {
            ArrayList arrayList = this.a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new c(p63Var, i, str, str2));
            return this;
        }

        public uw3 b() throws GeneralSecurityException {
            if (this.a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            uw3 uw3Var = new uw3(this.b, Collections.unmodifiableList(this.a), this.c);
            this.a = null;
            return uw3Var;
        }

        public final boolean c(int i) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                if (((c) it.next()).a() == i) {
                    return true;
                }
            }
            return false;
        }

        public b d(sw3 sw3Var) {
            if (this.a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.b = sw3Var;
            return this;
        }

        public b e(int i) {
            if (this.a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.c = Integer.valueOf(i);
            return this;
        }
    }

    public static final class c {
        public final p63 a;
        public final int b;
        public final String c;
        public final String d;

        public int a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c.equals(cVar.c) && this.d.equals(cVar.d);
        }

        public int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.a, Integer.valueOf(this.b), this.c, this.d);
        }

        public c(p63 p63Var, int i, String str, String str2) {
            this.a = p63Var;
            this.b = i;
            this.c = str;
            this.d = str2;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof uw3)) {
            return false;
        }
        uw3 uw3Var = (uw3) obj;
        return this.a.equals(uw3Var.a) && this.b.equals(uw3Var.b) && Objects.equals(this.c, uw3Var.c);
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }

    public uw3(sw3 sw3Var, List list, Integer num) {
        this.a = sw3Var;
        this.b = list;
        this.c = num;
    }
}
