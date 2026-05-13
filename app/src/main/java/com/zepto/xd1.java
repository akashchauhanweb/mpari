package com.zepto;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public abstract class xd1 {
    public static long a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date b(long j) {
        return new Date((j - 2082844800) * 1000);
    }
}
