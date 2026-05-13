package com.zepto;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nd5 implements Closeable {
    public static final b Companion = new b(null);
    private Reader reader;

    public static final class a extends Reader {
        public boolean c;
        public Reader e;
        public final a80 f;
        public final Charset g;

        public a(a80 source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f = source;
            this.g = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.c = true;
            Reader reader = this.e;
            if (reader != null) {
                reader.close();
            } else {
                this.f.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.e;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f.u0(), et6.G(this.f, this.g));
                this.e = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i2);
        }
    }

    public static final class b {

        public static final class a extends nd5 {
            public final /* synthetic */ a80 c;
            public final /* synthetic */ ls3 e;
            public final /* synthetic */ long f;

            public a(a80 a80Var, ls3 ls3Var, long j) {
                this.c = a80Var;
                this.e = ls3Var;
                this.f = j;
            }

            @Override // com.zepto.nd5
            public long contentLength() {
                return this.f;
            }

            @Override // com.zepto.nd5
            public ls3 contentType() {
                return this.e;
            }

            @Override // com.zepto.nd5
            public a80 source() {
                return this.c;
            }
        }

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ nd5 i(b bVar, byte[] bArr, ls3 ls3Var, int i, Object obj) {
            if ((i & 1) != 0) {
                ls3Var = null;
            }
            return bVar.h(bArr, ls3Var);
        }

        public final nd5 a(a80 asResponseBody, ls3 ls3Var, long j) {
            Intrinsics.checkNotNullParameter(asResponseBody, "$this$asResponseBody");
            return new a(asResponseBody, ls3Var, j);
        }

        public final nd5 b(t80 toResponseBody, ls3 ls3Var) {
            Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
            return a(new u70().h0(toResponseBody), ls3Var, toResponseBody.t());
        }

        public final nd5 c(ls3 ls3Var, long j, a80 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return a(content, ls3Var, j);
        }

        public final nd5 d(ls3 ls3Var, t80 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return b(content, ls3Var);
        }

        public final nd5 e(ls3 ls3Var, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return g(content, ls3Var);
        }

        public final nd5 f(ls3 ls3Var, byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return h(content, ls3Var);
        }

        public final nd5 g(String toResponseBody, ls3 ls3Var) {
            Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
            Charset charset = Charsets.UTF_8;
            if (ls3Var != null) {
                Charset charsetD = ls3.d(ls3Var, null, 1, null);
                if (charsetD == null) {
                    ls3Var = ls3.g.b(ls3Var + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            u70 u70VarY0 = new u70().Y0(toResponseBody, charset);
            return a(u70VarY0, ls3Var, u70VarY0.L0());
        }

        public final nd5 h(byte[] toResponseBody, ls3 ls3Var) {
            Intrinsics.checkNotNullParameter(toResponseBody, "$this$toResponseBody");
            return a(new u70().O(toResponseBody), ls3Var, toResponseBody.length);
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final nd5 create(a80 a80Var, ls3 ls3Var, long j) {
        return Companion.a(a80Var, ls3Var, j);
    }

    public final InputStream byteStream() {
        return source().u0();
    }

    public final t80 byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > IntCompanionObject.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        a80 a80VarSource = source();
        try {
            t80 t80VarP = a80VarSource.p();
            CloseableKt.closeFinally(a80VarSource, null);
            int iT = t80VarP.t();
            if (jContentLength == -1 || jContentLength == iT) {
                return t80VarP;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iT + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > IntCompanionObject.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        a80 a80VarSource = source();
        try {
            byte[] bArrG = a80VarSource.G();
            CloseableKt.closeFinally(a80VarSource, null);
            int length = bArrG.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrG;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), d());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        et6.j(source());
    }

    public abstract long contentLength();

    public abstract ls3 contentType();

    public final Charset d() {
        Charset charsetC;
        ls3 ls3VarContentType = contentType();
        return (ls3VarContentType == null || (charsetC = ls3VarContentType.c(Charsets.UTF_8)) == null) ? Charsets.UTF_8 : charsetC;
    }

    public abstract a80 source();

    public final String string() throws IOException {
        a80 a80VarSource = source();
        try {
            String strT0 = a80VarSource.t0(et6.G(a80VarSource, d()));
            CloseableKt.closeFinally(a80VarSource, null);
            return strT0;
        } finally {
        }
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final nd5 create(t80 t80Var, ls3 ls3Var) {
        return Companion.b(t80Var, ls3Var);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    public static final nd5 create(ls3 ls3Var, long j, a80 a80Var) {
        return Companion.c(ls3Var, j, a80Var);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final nd5 create(ls3 ls3Var, t80 t80Var) {
        return Companion.d(ls3Var, t80Var);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final nd5 create(ls3 ls3Var, String str) {
        return Companion.e(ls3Var, str);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    public static final nd5 create(ls3 ls3Var, byte[] bArr) {
        return Companion.f(ls3Var, bArr);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final nd5 create(String str, ls3 ls3Var) {
        return Companion.g(str, ls3Var);
    }

    @JvmStatic
    @JvmName(name = "create")
    public static final nd5 create(byte[] bArr, ls3 ls3Var) {
        return Companion.h(bArr, ls3Var);
    }
}
