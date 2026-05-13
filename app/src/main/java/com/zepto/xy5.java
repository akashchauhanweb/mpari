package com.zepto;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface xy5 {
    String[] alternate() default {};

    String value();
}
