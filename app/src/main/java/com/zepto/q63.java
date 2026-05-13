package com.zepto;

import com.zepto.x03;

/* JADX INFO: loaded from: classes.dex */
public enum q63 implements x03.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final x03.b j = new x03.b() { // from class: com.zepto.q63.a
    };
    public final int c;

    q63(int i) {
        this.c = i;
    }

    public static q63 a(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.c;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
