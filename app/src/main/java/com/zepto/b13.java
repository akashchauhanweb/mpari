package com.zepto;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class b13 extends IOException {
    public at3 c;
    public boolean e;

    public static class a extends b13 {
        public a(String str) {
            super(str);
        }
    }

    public b13(String str) {
        super(str);
        this.c = null;
    }

    public static b13 b() {
        return new b13("Protocol message end-group tag did not match expected tag.");
    }

    public static b13 c() {
        return new b13("Protocol message contained an invalid tag (zero).");
    }

    public static b13 d() {
        return new b13("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static b13 f() {
        return new b13("CodedInputStream encountered a malformed varint.");
    }

    public static b13 g() {
        return new b13("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static b13 h() {
        return new b13("Failed to parse the message.");
    }

    public static b13 i() {
        return new b13("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static b13 l() {
        return new b13("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static b13 m() {
        return new b13("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.e;
    }

    public void j() {
        this.e = true;
    }

    public b13 k(at3 at3Var) {
        this.c = at3Var;
        return this;
    }

    public b13(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.c = null;
    }
}
