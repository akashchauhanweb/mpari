package com.zepto;

import java.io.File;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lc5 {
    public static final a Companion = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.lc5$a$a, reason: collision with other inner class name */
        public static final class C0101a extends lc5 {
            public final /* synthetic */ File a;
            public final /* synthetic */ ls3 b;

            public C0101a(File file, ls3 ls3Var) {
                this.a = file;
                this.b = ls3Var;
            }

            @Override // com.zepto.lc5
            public long contentLength() {
                return this.a.length();
            }

            @Override // com.zepto.lc5
            public ls3 contentType() {
                return this.b;
            }

            @Override // com.zepto.lc5
            public void writeTo(z70 sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                y46 y46VarJ = zf4.j(this.a);
                try {
                    sink.H(y46VarJ);
                    CloseableKt.closeFinally(y46VarJ, null);
                } finally {
                }
            }
        }

        public static final class b extends lc5 {
            public final /* synthetic */ t80 a;
            public final /* synthetic */ ls3 b;

            public b(t80 t80Var, ls3 ls3Var) {
                this.a = t80Var;
                this.b = ls3Var;
            }

            @Override // com.zepto.lc5
            public long contentLength() {
                return this.a.t();
            }

            @Override // com.zepto.lc5
            public ls3 contentType() {
                return this.b;
            }

            @Override // com.zepto.lc5
            public void writeTo(z70 sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.h0(this.a);
            }
        }

        public static final class c extends lc5 {
            public final /* synthetic */ byte[] a;
            public final /* synthetic */ ls3 b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public c(byte[] bArr, ls3 ls3Var, int i, int i2) {
                this.a = bArr;
                this.b = ls3Var;
                this.c = i;
                this.d = i2;
            }

            @Override // com.zepto.lc5
            public long contentLength() {
                return this.c;
            }

            @Override // com.zepto.lc5
            public ls3 contentType() {
                return this.b;
            }

            @Override // com.zepto.lc5
            public void writeTo(z70 sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.a(this.a, this.d, this.c);
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ lc5 i(a aVar, ls3 ls3Var, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return aVar.e(ls3Var, bArr, i, i2);
        }

        public static /* synthetic */ lc5 j(a aVar, byte[] bArr, ls3 ls3Var, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                ls3Var = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.h(bArr, ls3Var, i, i2);
        }

        public final lc5 a(t80 toRequestBody, ls3 ls3Var) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            return new b(toRequestBody, ls3Var);
        }

        public final lc5 b(ls3 ls3Var, t80 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return a(content, ls3Var);
        }

        public final lc5 c(ls3 ls3Var, File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return f(file, ls3Var);
        }

        public final lc5 d(ls3 ls3Var, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return g(content, ls3Var);
        }

        public final lc5 e(ls3 ls3Var, byte[] content, int i, int i2) {
            Intrinsics.checkNotNullParameter(content, "content");
            return h(content, ls3Var, i, i2);
        }

        public final lc5 f(File asRequestBody, ls3 ls3Var) {
            Intrinsics.checkNotNullParameter(asRequestBody, "$this$asRequestBody");
            return new C0101a(asRequestBody, ls3Var);
        }

        public final lc5 g(String toRequestBody, ls3 ls3Var) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            Charset charset = Charsets.UTF_8;
            if (ls3Var != null) {
                Charset charsetD = ls3.d(ls3Var, null, 1, null);
                if (charsetD == null) {
                    ls3Var = ls3.g.b(ls3Var + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            byte[] bytes = toRequestBody.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return h(bytes, ls3Var, 0, bytes.length);
        }

        public final lc5 h(byte[] toRequestBody, ls3 ls3Var, int i, int i2) {
            Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
            et6.i(toRequestBody.length, i, i2);
            return new c(toRequestBody, ls3Var, i2, i);
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final lc5 create(t80 t80Var, ls3 ls3Var) {
        return Companion.a(t80Var, ls3Var);
    }

    public abstract long contentLength();

    public abstract ls3 contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(z70 z70Var);

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final lc5 create(ls3 ls3Var, t80 t80Var) {
        return Companion.b(ls3Var, t80Var);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @ReplaceWith(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @JvmStatic
    public static final lc5 create(ls3 ls3Var, File file) {
        return Companion.c(ls3Var, file);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    public static final lc5 create(ls3 ls3Var, String str) {
        return Companion.d(ls3Var, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final lc5 create(ls3 ls3Var, byte[] bArr) {
        return a.i(Companion, ls3Var, bArr, 0, 0, 12, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final lc5 create(ls3 ls3Var, byte[] bArr, int i) {
        return a.i(Companion, ls3Var, bArr, i, 0, 8, null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @JvmStatic
    @JvmOverloads
    public static final lc5 create(ls3 ls3Var, byte[] bArr, int i, int i2) {
        return Companion.e(ls3Var, bArr, i, i2);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final lc5 create(File file, ls3 ls3Var) {
        return Companion.f(file, ls3Var);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final lc5 create(String str, ls3 ls3Var) {
        return Companion.g(str, ls3Var);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final lc5 create(byte[] bArr) {
        return a.j(Companion, bArr, null, 0, 0, 7, null);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final lc5 create(byte[] bArr, ls3 ls3Var) {
        return a.j(Companion, bArr, ls3Var, 0, 0, 6, null);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final lc5 create(byte[] bArr, ls3 ls3Var, int i) {
        return a.j(Companion, bArr, ls3Var, i, 0, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    @JvmName(name = "create")
    public static final lc5 create(byte[] bArr, ls3 ls3Var, int i, int i2) {
        return Companion.h(bArr, ls3Var, i, i2);
    }
}
