package com.zepto;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class z80 implements w12 {
    public static final String c;
    public static final String d;
    public static final String e;
    public static final Set f;
    public static final z80 g;
    public static final z80 h;
    public final String a;
    public final String b;

    static {
        String strA = b86.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = strA;
        String strA2 = b86.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        d = strA2;
        String strA3 = b86.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        e = strA3;
        f = Collections.unmodifiableSet(new HashSet(Arrays.asList(c22.b("proto"), c22.b("json"))));
        g = new z80(strA, null);
        h = new z80(strA2, strA3);
    }

    public z80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static z80 c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new z80(str2, str3);
    }

    @Override // com.zepto.w12
    public Set a() {
        return f;
    }

    public byte[] b() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    @Override // com.zepto.ri1
    public byte[] getExtras() {
        return b();
    }

    @Override // com.zepto.ri1
    public String getName() {
        return "cct";
    }
}
