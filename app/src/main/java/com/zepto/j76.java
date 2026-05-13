package com.zepto;

import java.net.ProtocolException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class j76 {
    public static final a d = new a(null);
    public final kx4 a;
    public final int b;
    public final String c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j76 a(String statusLine) throws ProtocolException {
            kx4 kx4Var;
            int i;
            String strSubstring;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (StringsKt__StringsJVMKt.startsWith$default(statusLine, "HTTP/1.", false, 2, null)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    kx4Var = kx4.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    kx4Var = kx4.HTTP_1_1;
                }
            } else {
                if (!StringsKt__StringsJVMKt.startsWith$default(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                kx4Var = kx4.HTTP_1_0;
                i = 4;
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int i3 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i2) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i2) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i + 4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                }
                return new j76(kx4Var, i3, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }
    }

    public j76(kx4 protocol, int i, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = protocol;
        this.b = i;
        this.c = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == kx4.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
