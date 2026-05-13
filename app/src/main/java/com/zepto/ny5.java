package com.zepto;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ny5 extends Exception {
    public final int c;

    public ny5(String str) {
        super(str);
        this.c = a(str);
    }

    public final int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }
}
