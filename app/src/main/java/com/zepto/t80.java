package com.zepto;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public class t80 implements Serializable, Comparable {
    public transient int c;
    public transient String e;
    public final byte[] f;
    public static final a h = new a(null);
    public static final t80 g = new t80(new byte[0]);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ t80 f(a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.e(bArr, i, i2);
        }

        public final t80 a(String decodeBase64) {
            Intrinsics.checkNotNullParameter(decodeBase64, "$this$decodeBase64");
            byte[] bArrA = e.a(decodeBase64);
            if (bArrA != null) {
                return new t80(bArrA);
            }
            return null;
        }

        public final t80 b(String decodeHex) {
            Intrinsics.checkNotNullParameter(decodeHex, "$this$decodeHex");
            if (!(decodeHex.length() % 2 == 0)) {
                throw new IllegalArgumentException(("Unexpected hex string: " + decodeHex).toString());
            }
            int length = decodeHex.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((u80.e(decodeHex.charAt(i2)) << 4) + u80.e(decodeHex.charAt(i2 + 1)));
            }
            return new t80(bArr);
        }

        public final t80 c(String encode, Charset charset) {
            Intrinsics.checkNotNullParameter(encode, "$this$encode");
            Intrinsics.checkNotNullParameter(charset, "charset");
            byte[] bytes = encode.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return new t80(bytes);
        }

        public final t80 d(String encodeUtf8) {
            Intrinsics.checkNotNullParameter(encodeUtf8, "$this$encodeUtf8");
            t80 t80Var = new t80(f.a(encodeUtf8));
            t80Var.q(encodeUtf8);
            return t80Var;
        }

        public final t80 e(byte[] toByteString, int i, int i2) {
            Intrinsics.checkNotNullParameter(toByteString, "$this$toByteString");
            g.b(toByteString.length, i, i2);
            return new t80(ArraysKt___ArraysJvmKt.copyOfRange(toByteString, i, i2 + i));
        }
    }

    public t80(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f = data;
    }

    public static final t80 d(String str) {
        return h.d(str);
    }

    public String a() {
        return e.c(f(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(com.zepto.t80 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.t()
            int r1 = r10.t()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.e(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.e(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.t80.compareTo(com.zepto.t80):int");
    }

    public t80 c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        byte[] bArrDigest = MessageDigest.getInstance(algorithm).digest(this.f);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new t80(bArrDigest);
    }

    public final byte e(int i) {
        return l(i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t80) {
            t80 t80Var = (t80) obj;
            if (t80Var.t() == f().length && t80Var.o(0, f(), 0, f().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte[] f() {
        return this.f;
    }

    public final int g() {
        return this.c;
    }

    public int h() {
        return f().length;
    }

    public int hashCode() {
        int iG = g();
        if (iG != 0) {
            return iG;
        }
        int iHashCode = Arrays.hashCode(f());
        p(iHashCode);
        return iHashCode;
    }

    public final String i() {
        return this.e;
    }

    public String j() {
        char[] cArr = new char[f().length * 2];
        int i = 0;
        for (byte b : f()) {
            int i2 = i + 1;
            cArr[i] = u80.f()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = u80.f()[b & 15];
        }
        return new String(cArr);
    }

    public byte[] k() {
        return f();
    }

    public byte l(int i) {
        return f()[i];
    }

    public t80 m() {
        return c("MD5");
    }

    public boolean n(int i, t80 other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.o(i2, f(), i, i3);
    }

    public boolean o(int i, byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i >= 0 && i <= f().length - i3 && i2 >= 0 && i2 <= other.length - i3 && g.a(f(), i, other, i2, i3);
    }

    public final void p(int i) {
        this.c = i;
    }

    public final void q(String str) {
        this.e = str;
    }

    public t80 r() {
        return c("SHA-1");
    }

    public t80 s() {
        return c("SHA-256");
    }

    public final int t() {
        return h();
    }

    public String toString() {
        if (f().length == 0) {
            return "[size=0]";
        }
        int iC = u80.c(f(), 64);
        if (iC == -1) {
            if (f().length <= 64) {
                return "[hex=" + j() + ']';
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[size=");
            sb.append(f().length);
            sb.append(" hex=");
            if (64 <= f().length) {
                sb.append((64 == f().length ? this : new t80(ArraysKt___ArraysJvmKt.copyOfRange(f(), 0, 64))).j());
                sb.append("…]");
                return sb.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + f().length + ')').toString());
        }
        String strW = w();
        if (strW == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = strW.substring(0, iC);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
        if (iC >= strW.length()) {
            return "[text=" + strReplace$default + ']';
        }
        return "[size=" + f().length + " text=" + strReplace$default + "…]";
    }

    public final boolean u(t80 prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return n(0, prefix, 0, prefix.t());
    }

    public t80 v() {
        byte b;
        for (int i = 0; i < f().length; i++) {
            byte b2 = f()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] bArrF = f();
                byte[] bArrCopyOf = Arrays.copyOf(bArrF, bArrF.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b4 = bArrCopyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        bArrCopyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new t80(bArrCopyOf);
            }
        }
        return this;
    }

    public String w() {
        String strI = i();
        if (strI != null) {
            return strI;
        }
        String strB = f.b(k());
        q(strB);
        return strB;
    }

    public void x(u70 buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        u80.d(this, buffer, i, i2);
    }
}
