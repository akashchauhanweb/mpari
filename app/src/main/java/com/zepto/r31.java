package com.zepto;

import com.zepto.a73;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class r31 {
    public static final byte[] a = new byte[0];

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[qj4.values().length];
            a = iArr;
            try {
                iArr[qj4.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[qj4.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[qj4.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[qj4.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(a73.c cVar) throws GeneralSecurityException {
        int i = a.a[cVar.b0().ordinal()];
        if (i == 1 || i == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(cVar.a0()).array();
        }
        if (i == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(cVar.a0()).array();
        }
        if (i == 4) {
            return a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
