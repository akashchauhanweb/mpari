package com.zepto;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class nm3 implements mm3 {
    public final LocaleList a;

    public nm3(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // com.zepto.mm3
    public String a() {
        return this.a.toLanguageTags();
    }

    @Override // com.zepto.mm3
    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((mm3) obj).b());
    }

    @Override // com.zepto.mm3
    public Locale get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.zepto.mm3
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // com.zepto.mm3
    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}
