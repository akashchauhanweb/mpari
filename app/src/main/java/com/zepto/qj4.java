package com.zepto;

import com.zepto.x03;

/* JADX INFO: loaded from: classes.dex */
public enum qj4 implements x03.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public static final x03.b k = new x03.b() { // from class: com.zepto.qj4.a
    };
    public final int c;

    qj4(int i) {
        this.c = i;
    }

    public static qj4 a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.c;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
