package com.zepto;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class j86 {
    public static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
