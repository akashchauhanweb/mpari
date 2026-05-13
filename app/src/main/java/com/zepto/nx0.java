package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class nx0 {

    public static final class a extends nx0 {
        public static final a a = new a();

        public a() {
            super(null);
        }
    }

    public static final class b extends nx0 {
        public final int a;

        public b(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.a + ')';
        }
    }

    public nx0() {
    }

    public /* synthetic */ nx0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
