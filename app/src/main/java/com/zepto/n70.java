package com.zepto;

import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class n70 implements ox4 {
    public static Permission e = new px4("BC", "threadLocalEcImplicitlyCa");
    public static Permission f = new px4("BC", "ecImplicitlyCa");
    public static Permission g = new px4("BC", "threadLocalDhDefaultParams");
    public static Permission h = new px4("BC", "DhDefaultParams");
    public static Permission i = new px4("BC", "acceptableEcCurves");
    public static Permission j = new px4("BC", "additionalEcParameters");
    public ThreadLocal a = new ThreadLocal();
    public ThreadLocal b = new ThreadLocal();
    public volatile Set c = new HashSet();
    public volatile Map d = new HashMap();
}
