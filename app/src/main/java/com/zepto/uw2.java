package com.zepto;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class uw2 {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
