package com.zepto;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ha8 {
    public final lc8 a;

    public ha8(lc8 lc8Var) {
        this.a = lc8Var;
    }

    public final InputStream a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) fd6.a(((zm8) this.a.a()).e(i, str, str2, i2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new bc8(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e) {
            throw new bc8("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e2) {
            throw new bc8(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e2, i);
        }
    }
}
