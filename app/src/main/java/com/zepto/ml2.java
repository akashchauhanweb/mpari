package com.zepto;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ml2 {
    private final String mName;
    private final String mValue;

    public ml2(String str, String str2) {
        this.mName = str;
        this.mValue = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ml2.class != obj.getClass()) {
            return false;
        }
        ml2 ml2Var = (ml2) obj;
        return TextUtils.equals(this.mName, ml2Var.mName) && TextUtils.equals(this.mValue, ml2Var.mValue);
    }

    public final String getName() {
        return this.mName;
    }

    public final String getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (this.mName.hashCode() * 31) + this.mValue.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.mName + ",value=" + this.mValue + "]";
    }
}
