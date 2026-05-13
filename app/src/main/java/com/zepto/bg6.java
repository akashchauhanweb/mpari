package com.zepto;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class bg6 implements xm6 {
    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public TimeZone b(String str) {
        return TimeZone.getTimeZone(str);
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(TimeZone timeZone) {
        return timeZone.getID();
    }
}
