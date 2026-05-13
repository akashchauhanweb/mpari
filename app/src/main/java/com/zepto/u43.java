package com.zepto;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface u43 {
    boolean nullSafe() default true;

    Class value();
}
