package com.zepto;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface qi1 {
    int objectTypeIndication() default -1;

    int[] tags();
}
