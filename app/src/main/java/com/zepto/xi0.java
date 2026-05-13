package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public abstract class xi0 {

    public static final class a extends c {
        public static final a b = new a();

        public a() {
            super("CharMatcher.ascii()");
        }

        @Override // com.zepto.xi0
        public boolean b(char c) {
            return c <= 127;
        }
    }

    public static abstract class b extends xi0 {
    }

    public static abstract class c extends b {
        public final String a;

        public c(String str) {
            this.a = (String) ju4.j(str);
        }

        public final String toString() {
            return this.a;
        }
    }

    public static xi0 a() {
        return a.b;
    }

    public abstract boolean b(char c2);

    public boolean c(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!b(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }
}
