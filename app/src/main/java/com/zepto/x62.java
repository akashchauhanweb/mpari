package com.zepto;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface x62 {
    boolean deserialize() default true;

    boolean serialize() default true;
}
