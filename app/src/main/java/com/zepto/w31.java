package com.zepto;

import java.util.Currency;

/* JADX INFO: loaded from: classes3.dex */
public class w31 implements xm6 {
    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Currency b(String str) {
        return Currency.getInstance(str);
    }

    @Override // com.zepto.xm6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String a(Currency currency) {
        return currency.toString();
    }
}
