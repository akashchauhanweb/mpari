package com.zepto;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface wy5 {
    String[] alternate() default {};

    String value();
}
