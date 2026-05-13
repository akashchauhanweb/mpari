package com.zepto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mn3 {
    public static final mn3 c = new a().a();
    public final String a;
    public final List b;

    public static final class a {
        public String a = "";
        public List b = new ArrayList();

        public mn3 a() {
            return new mn3(this.a, Collections.unmodifiableList(this.b));
        }

        public a b(List list) {
            this.b = list;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    public mn3(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}
