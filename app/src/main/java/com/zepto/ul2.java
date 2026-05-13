package com.zepto;

/* JADX INFO: loaded from: classes.dex */
public interface ul2 {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        public final int c;

        a(int i2) {
            this.c = i2;
        }

        public int a() {
            return this.c;
        }
    }

    a b(String str);
}
