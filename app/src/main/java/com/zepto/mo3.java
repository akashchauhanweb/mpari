package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes2.dex */
public final class mo3 implements h90 {
    public final LruCache a;

    public class a extends LruCache {
        public a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.b;
        }
    }

    public static final class b {
        public final Bitmap a;
        public final int b;

        public b(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    public mo3(Context context) {
        this(nt6.b(context));
    }

    @Override // com.zepto.h90
    public int a() {
        return this.a.maxSize();
    }

    @Override // com.zepto.h90
    public void b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int i = nt6.i(bitmap);
        if (i > a()) {
            this.a.remove(str);
        } else {
            this.a.put(str, new b(bitmap, i));
        }
    }

    @Override // com.zepto.h90
    public Bitmap get(String str) {
        b bVar = (b) this.a.get(str);
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    @Override // com.zepto.h90
    public int size() {
        return this.a.size();
    }

    public mo3(int i) {
        this.a = new a(i);
    }
}
