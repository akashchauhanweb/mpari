package com.zepto;

import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class xb0 {
    public static xb0 a(BigInteger bigInteger, m53 m53Var) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("serialNumber cannot be null");
        }
        String lowerCase = bigInteger.toString(16).toLowerCase();
        if (!m53Var.d0(lowerCase)) {
            return null;
        }
        wb0.a(new Gson().fromJson(m53Var.T(lowerCase), xb0.class));
        return null;
    }

    public static m53 b(InputStream inputStream, String str) {
        return p53.c(new InputStreamReader(inputStream)).m().a0(str);
    }
}
