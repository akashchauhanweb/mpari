package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public class zu4 implements eq3 {
    @Override // com.zepto.eq3
    public xm6 a(Class cls) {
        if (cls == Integer.TYPE) {
            return new p03();
        }
        if (cls == Boolean.TYPE) {
            return new f70();
        }
        if (cls == Long.TYPE) {
            return new jo3();
        }
        if (cls == Double.TYPE) {
            return new ju1();
        }
        if (cls == Float.TYPE) {
            return new kd2();
        }
        if (cls == Short.TYPE) {
            return new l16();
        }
        if (cls == Byte.TYPE) {
            return new v80();
        }
        if (cls == Character.TYPE) {
            return new zi0();
        }
        return null;
    }
}
