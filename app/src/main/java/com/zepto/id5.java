package com.zepto;

import com.zepto.g90;

/* JADX INFO: loaded from: classes.dex */
public class id5 {
    public final g90.a cacheEntry;
    public final bu7 error;
    public boolean intermediate;
    public final Object result;

    public interface a {
        void onErrorResponse(bu7 bu7Var);
    }

    public interface b {
        void onResponse(Object obj);
    }

    private id5(Object obj, g90.a aVar) {
        this.intermediate = false;
        this.result = obj;
        this.cacheEntry = aVar;
        this.error = null;
    }

    public static <T> id5 error(bu7 bu7Var) {
        return new id5(bu7Var);
    }

    public static <T> id5 success(T t, g90.a aVar) {
        return new id5(t, aVar);
    }

    public boolean isSuccess() {
        return this.error == null;
    }

    private id5(bu7 bu7Var) {
        this.intermediate = false;
        this.result = null;
        this.cacheEntry = null;
        this.error = bu7Var;
    }
}
