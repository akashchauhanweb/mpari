package com.zepto;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class xy2 {
    public final b a;

    public static final class a implements b {
        public final InputContentInfo a;

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // com.zepto.xy2.b
        public Object a() {
            return this.a;
        }

        @Override // com.zepto.xy2.b
        public Uri b() {
            return this.a.getContentUri();
        }

        @Override // com.zepto.xy2.b
        public void c() {
            this.a.requestPermission();
        }

        @Override // com.zepto.xy2.b
        public Uri d() {
            return this.a.getLinkUri();
        }

        @Override // com.zepto.xy2.b
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }
    }

    public interface b {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public xy2(b bVar) {
        this.a = bVar;
    }

    public static xy2 f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new xy2(new a(obj));
    }

    public Uri a() {
        return this.a.b();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.d();
    }

    public void d() {
        this.a.c();
    }

    public Object e() {
        return this.a.a();
    }
}
