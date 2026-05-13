package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class zi0 implements xm6 {
    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Character b(String str) throws a13 {
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new a13("Cannot convert '%s' to a character", str);
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(Character ch) {
        return ch.toString();
    }
}
