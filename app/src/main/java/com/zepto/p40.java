package com.zepto;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public class p40 {
    public static final p40 b = new p40(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE);
    public static final p40 c = new p40(192, 192, 192);
    public static final p40 d = new p40(128, 128, 128);
    public static final p40 e = new p40(64, 64, 64);
    public static final p40 f = new p40(0, 0, 0);
    public static final p40 g = new p40(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0);
    public static final p40 h = new p40(KotlinVersion.MAX_COMPONENT_VALUE, 175, 175);
    public static final p40 i = new p40(KotlinVersion.MAX_COMPONENT_VALUE, 200, 0);
    public static final p40 j = new p40(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0);
    public static final p40 k = new p40(0, KotlinVersion.MAX_COMPONENT_VALUE, 0);
    public static final p40 l = new p40(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE);
    public static final p40 m = new p40(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE);
    public static final p40 n = new p40(0, 0, KotlinVersion.MAX_COMPONENT_VALUE);
    public int a;

    public p40(int i2, int i3, int i4, int i5) {
        e(i2);
        e(i3);
        e(i4);
        e(i5);
        this.a = ((i2 & KotlinVersion.MAX_COMPONENT_VALUE) << 16) | ((i5 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | ((i3 & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static void e(int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException(dt3.b("color.value.outside.range.0.255", new Object[0]));
        }
    }

    public int a() {
        return c() & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public int b() {
        return (c() >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return (c() >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p40) && ((p40) obj).a == this.a;
    }

    public int hashCode() {
        return this.a;
    }

    public p40(int i2, int i3, int i4) {
        this(i2, i3, i4, KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public p40(float f2, float f3, float f4, float f5) {
        this((int) (((double) (f2 * 255.0f)) + 0.5d), (int) (((double) (f3 * 255.0f)) + 0.5d), (int) (((double) (f4 * 255.0f)) + 0.5d), (int) (((double) (f5 * 255.0f)) + 0.5d));
    }

    public p40(float f2, float f3, float f4) {
        this(f2, f3, f4, 1.0f);
    }
}
