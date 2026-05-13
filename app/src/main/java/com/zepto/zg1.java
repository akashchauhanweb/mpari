package com.zepto;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zg1 {
    public static byte[] a(byte[] bArr) throws Throwable {
        Deflater deflater;
        DeflaterOutputStream deflaterOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream2 = null;
        try {
            deflater = new Deflater(8, true);
            try {
                deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            deflater = null;
        }
        try {
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th3) {
            th = th3;
            deflaterOutputStream2 = deflaterOutputStream;
            if (deflaterOutputStream2 != null) {
                deflaterOutputStream2.close();
            }
            if (deflater != null) {
                deflater.end();
            }
            throw th;
        }
    }
}
