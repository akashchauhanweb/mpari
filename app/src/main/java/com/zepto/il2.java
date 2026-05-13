package com.zepto;

import com.zepto.x03;

/* JADX INFO: loaded from: classes.dex */
public enum il2 implements x03.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final x03.b l = new x03.b() { // from class: com.zepto.il2.a
    };
    public final int c;

    il2(int i) {
        this.c = i;
    }

    public static il2 a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.c;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
