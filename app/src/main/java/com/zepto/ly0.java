package com.zepto;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ly0 {
    public final f a;

    public static final class a {
        public final c a;

        public a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new b(clipData, i);
            } else {
                this.a = new d(clipData, i);
            }
        }

        public ly0 a() {
            return this.a.a();
        }

        public a b(Bundle bundle) {
            this.a.setExtras(bundle);
            return this;
        }

        public a c(int i) {
            this.a.setFlags(i);
            return this;
        }

        public a d(Uri uri) {
            this.a.b(uri);
            return this;
        }
    }

    public static final class b implements c {
        public final ContentInfo.Builder a;

        public b(ClipData clipData, int i) {
            this.a = oy0.a(clipData, i);
        }

        @Override // com.zepto.ly0.c
        public ly0 a() {
            return new ly0(new e(this.a.build()));
        }

        @Override // com.zepto.ly0.c
        public void b(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // com.zepto.ly0.c
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }

        @Override // com.zepto.ly0.c
        public void setFlags(int i) {
            this.a.setFlags(i);
        }
    }

    public interface c {
        ly0 a();

        void b(Uri uri);

        void setExtras(Bundle bundle);

        void setFlags(int i);
    }

    public static final class d implements c {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        public d(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // com.zepto.ly0.c
        public ly0 a() {
            return new ly0(new g(this));
        }

        @Override // com.zepto.ly0.c
        public void b(Uri uri) {
            this.d = uri;
        }

        @Override // com.zepto.ly0.c
        public void setExtras(Bundle bundle) {
            this.e = bundle;
        }

        @Override // com.zepto.ly0.c
        public void setFlags(int i) {
            this.c = i;
        }
    }

    public static final class e implements f {
        public final ContentInfo a;

        public e(ContentInfo contentInfo) {
            this.a = ky0.a(lu4.g(contentInfo));
        }

        @Override // com.zepto.ly0.f
        public int a() {
            return this.a.getSource();
        }

        @Override // com.zepto.ly0.f
        public ClipData b() {
            return this.a.getClip();
        }

        @Override // com.zepto.ly0.f
        public ContentInfo c() {
            return this.a;
        }

        @Override // com.zepto.ly0.f
        public int getFlags() {
            return this.a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    public interface f {
        int a();

        ClipData b();

        ContentInfo c();

        int getFlags();
    }

    public static final class g implements f {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public g(d dVar) {
            this.a = (ClipData) lu4.g(dVar.a);
            this.b = lu4.c(dVar.b, 0, 5, "source");
            this.c = lu4.f(dVar.c, 1);
            this.d = dVar.d;
            this.e = dVar.e;
        }

        @Override // com.zepto.ly0.f
        public int a() {
            return this.b;
        }

        @Override // com.zepto.ly0.f
        public ClipData b() {
            return this.a;
        }

        @Override // com.zepto.ly0.f
        public ContentInfo c() {
            return null;
        }

        @Override // com.zepto.ly0.f
        public int getFlags() {
            return this.c;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(ly0.e(this.b));
            sb.append(", flags=");
            sb.append(ly0.a(this.c));
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public ly0(f fVar) {
        this.a = fVar;
    }

    public static String a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    public static String e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static ly0 g(ContentInfo contentInfo) {
        return new ly0(new e(contentInfo));
    }

    public ClipData b() {
        return this.a.b();
    }

    public int c() {
        return this.a.getFlags();
    }

    public int d() {
        return this.a.a();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.a.c();
        Objects.requireNonNull(contentInfoC);
        return ky0.a(contentInfoC);
    }

    public String toString() {
        return this.a.toString();
    }
}
