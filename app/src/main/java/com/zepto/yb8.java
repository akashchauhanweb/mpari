package com.zepto;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class yb8 {
    public static String a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        return (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) ? "" : strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }
}
