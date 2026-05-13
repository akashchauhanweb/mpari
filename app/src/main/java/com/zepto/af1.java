package com.zepto;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface af1 {
    boolean required() default true;

    mg1 value() default mg1.FIELD;
}
