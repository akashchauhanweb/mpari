package com.zepto;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
public final class ds2 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final List g;
    public final List h;
    public final String i;
    public final String j;
    public static final b l = new b(null);
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class a {
        public static final C0075a i = new C0075a(null);
        public String a;
        public String d;
        public final List f;
        public List g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;

        /* JADX INFO: renamed from: com.zepto.ds2$a$a, reason: collision with other inner class name */
        public static final class C0075a {
            public C0075a() {
            }

            public /* synthetic */ C0075a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int e(String str, int i, int i2) {
                try {
                    int i3 = Integer.parseInt(b.b(ds2.l, str, i, i2, "", false, false, false, false, null, 248, null));
                    if (1 <= i3 && 65535 >= i3) {
                        return i3;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int f(String str, int i, int i2) {
                while (i < i2) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == ':') {
                        return i;
                    }
                    if (cCharAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    }
                    i++;
                }
                return i2;
            }

            public final int g(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i);
                if ((Intrinsics.compare((int) cCharAt, 97) < 0 || Intrinsics.compare((int) cCharAt, 122) > 0) && (Intrinsics.compare((int) cCharAt, 65) < 0 || Intrinsics.compare((int) cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i);
                    if ('a' > cCharAt2 || 'z' < cCharAt2) {
                        if ('A' > cCharAt2 || 'Z' < cCharAt2) {
                            if ('0' > cCharAt2 || '9' < cCharAt2) {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public final int h(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final a a(String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.g == null) {
                this.g = new ArrayList();
            }
            List list = this.g;
            Intrinsics.checkNotNull(list);
            b bVar = ds2.l;
            list.add(b.b(bVar, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List list2 = this.g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? b.b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final a b(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.g == null) {
                this.g = new ArrayList();
            }
            List list = this.g;
            Intrinsics.checkNotNull(list);
            b bVar = ds2.l;
            list.add(b.b(bVar, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List list2 = this.g;
            Intrinsics.checkNotNull(list2);
            list2.add(str != null ? b.b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final ds2 c() {
            ArrayList arrayList;
            String str = this.a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = ds2.l;
            String strG = b.g(bVar, this.b, 0, 0, false, 7, null);
            String strG2 = b.g(bVar, this.c, 0, 0, false, 7, null);
            String str2 = this.d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iD = d();
            List list = this.f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.g(ds2.l, (String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.g;
            if (list2 != null) {
                List<String> list3 = list2;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList.add(str3 != null ? b.g(ds2.l, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.h;
            return new ds2(str, strG, strG2, str2, iD, arrayList2, arrayList, str4 != null ? b.g(ds2.l, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final int d() {
            int i2 = this.e;
            if (i2 != -1) {
                return i2;
            }
            b bVar = ds2.l;
            String str = this.a;
            Intrinsics.checkNotNull(str);
            return bVar.c(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.zepto.ds2.a e(java.lang.String r14) {
            /*
                r13 = this;
                if (r14 == 0) goto L1d
                com.zepto.ds2$b r12 = com.zepto.ds2.l
                r2 = 0
                r3 = 0
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 211(0xd3, float:2.96E-43)
                r11 = 0
                r0 = r12
                r1 = r14
                java.lang.String r14 = com.zepto.ds2.b.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 == 0) goto L1d
                java.util.List r14 = r12.i(r14)
                goto L1e
            L1d:
                r14 = 0
            L1e:
                r13.g = r14
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.ds2.a.e(java.lang.String):com.zepto.ds2$a");
        }

        public final List f() {
            return this.f;
        }

        public final a g(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strE = hr2.e(b.g(ds2.l, host, 0, 0, false, 7, null));
            if (strE != null) {
                this.d = strE;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final boolean h(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt__StringsJVMKt.equals(str, "%2e", true);
        }

        public final boolean i(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt__StringsJVMKt.equals(str, "%2e.", true) || StringsKt__StringsJVMKt.equals(str, ".%2e", true) || StringsKt__StringsJVMKt.equals(str, "%2e%2e", true);
        }

        public final a j(ds2 ds2Var, String input) {
            int iN;
            int i2;
            int i3;
            String str;
            boolean z;
            int i4;
            String str2;
            int i5;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(input, "input");
            int iX = et6.x(input, 0, 0, 3, null);
            int iZ = et6.z(input, iX, 0, 2, null);
            C0075a c0075a = i;
            int iG = c0075a.g(input, iX, iZ);
            String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            boolean z4 = true;
            byte b = -1;
            if (iG != -1) {
                if (StringsKt__StringsJVMKt.startsWith(input, "https:", iX, true)) {
                    this.a = "https";
                    iX += 6;
                } else {
                    if (!StringsKt__StringsJVMKt.startsWith(input, "http:", iX, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.a = "http";
                    iX += 5;
                }
            } else {
                if (ds2Var == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.a = ds2Var.r();
            }
            int iH = c0075a.h(input, iX, iZ);
            byte b2 = 63;
            byte b3 = 35;
            if (iH >= 2 || ds2Var == null || (!Intrinsics.areEqual(ds2Var.r(), this.a))) {
                int i6 = iX + iH;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    iN = et6.n(input, "@/\\?#", i6, iZ);
                    byte bCharAt = iN != iZ ? input.charAt(iN) : b;
                    if (bCharAt == b || bCharAt == b3 || bCharAt == 47 || bCharAt == 92 || bCharAt == b2) {
                        break;
                    }
                    if (bCharAt != 64) {
                        z = z4;
                        str2 = str3;
                        i4 = iZ;
                    } else {
                        if (z5) {
                            z = z4;
                            i4 = iZ;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.c);
                            sb2.append("%40");
                            str2 = str3;
                            i5 = iN;
                            sb2.append(b.b(ds2.l, input, i6, iN, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.c = sb2.toString();
                            z2 = z6;
                        } else {
                            int iM = et6.m(input, ':', i6, iN);
                            b bVar = ds2.l;
                            z = z4;
                            i4 = iZ;
                            String str4 = str3;
                            String strB = b.b(bVar, input, i6, iM, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z6) {
                                strB = this.b + "%40" + strB;
                            }
                            this.b = strB;
                            if (iM != iN) {
                                this.c = b.b(bVar, input, iM + 1, iN, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z3 = z;
                            } else {
                                z3 = z5;
                            }
                            z5 = z3;
                            str2 = str4;
                            z2 = z;
                            i5 = iN;
                        }
                        i6 = i5 + 1;
                        z6 = z2;
                    }
                    str3 = str2;
                    z4 = z;
                    iZ = i4;
                    b3 = 35;
                    b2 = 63;
                    b = -1;
                }
                boolean z7 = z4;
                String str5 = str3;
                i2 = iZ;
                C0075a c0075a2 = i;
                int iF = c0075a2.f(input, i6, iN);
                int i7 = iF + 1;
                if (i7 < iN) {
                    i3 = i6;
                    this.d = hr2.e(b.g(ds2.l, input, i6, iF, false, 4, null));
                    int iE = c0075a2.e(input, i7, iN);
                    this.e = iE;
                    if (!(iE != -1 ? z7 : false)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i7, iN);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, str5);
                        sb3.append(strSubstring2);
                        sb3.append(Typography.quote);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    str = str5;
                } else {
                    i3 = i6;
                    str = str5;
                    b bVar2 = ds2.l;
                    this.d = hr2.e(b.g(bVar2, input, i3, iF, false, 4, null));
                    String str6 = this.a;
                    Intrinsics.checkNotNull(str6);
                    this.e = bVar2.c(str6);
                }
                if (!(this.d != null ? z7 : false)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i3, iF);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, str);
                    sb4.append(strSubstring3);
                    sb4.append(Typography.quote);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iX = iN;
            } else {
                this.b = ds2Var.g();
                this.c = ds2Var.c();
                this.d = ds2Var.i();
                this.e = ds2Var.n();
                this.f.clear();
                this.f.addAll(ds2Var.e());
                if (iX == iZ || input.charAt(iX) == '#') {
                    e(ds2Var.f());
                }
                i2 = iZ;
            }
            int i8 = i2;
            int iN2 = et6.n(input, "?#", iX, i8);
            p(input, iX, iN2);
            if (iN2 < i8 && input.charAt(iN2) == '?') {
                int iM2 = et6.m(input, '#', iN2, i8);
                b bVar3 = ds2.l;
                this.g = bVar3.i(b.b(bVar3, input, iN2 + 1, iM2, " \"'<>#", true, false, true, false, null, 208, null));
                iN2 = iM2;
            }
            if (iN2 < i8 && input.charAt(iN2) == '#') {
                this.h = b.b(ds2.l, input, iN2 + 1, i8, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a k(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.c = b.b(ds2.l, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final void l() {
            if (((String) this.f.remove(r0.size() - 1)).length() != 0 || !(!this.f.isEmpty())) {
                this.f.add("");
            } else {
                this.f.set(r0.size() - 1, "");
            }
        }

        public final a m(int i2) {
            if (1 <= i2 && 65535 >= i2) {
                this.e = i2;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i2).toString());
        }

        public final void n(String str, int i2, int i3, boolean z, boolean z2) {
            String strB = b.b(ds2.l, str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (h(strB)) {
                return;
            }
            if (i(strB)) {
                l();
                return;
            }
            if (((CharSequence) this.f.get(r2.size() - 1)).length() == 0) {
                this.f.set(r2.size() - 1, strB);
            } else {
                this.f.add(strB);
            }
            if (z) {
                this.f.add("");
            }
        }

        public final a o() {
            String str = this.d;
            this.d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                List list = this.f;
                list.set(i2, b.b(ds2.l, (String) list.get(i2), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str2 = (String) list2.get(i3);
                    list2.set(i3, str2 != null ? b.b(ds2.l, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.h;
            this.h = str3 != null ? b.b(ds2.l, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final void p(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f.clear();
                this.f.add("");
                i2++;
            } else {
                List list = this.f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i4 = i2;
                if (i4 >= i3) {
                    return;
                }
                i2 = et6.n(str, "/\\", i4, i3);
                boolean z = i2 < i3;
                n(str, i4, i2, z, true);
                if (z) {
                    i2++;
                }
            }
        }

        public final a q(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt__StringsJVMKt.equals(scheme, "http", true)) {
                this.a = "http";
            } else {
                if (!StringsKt__StringsJVMKt.equals(scheme, "https", true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.a = "https";
            }
            return this;
        }

        public final void r(String str) {
            this.h = str;
        }

        public final void s(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.c = str;
        }

        public final void t(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.b
                r0.append(r1)
                java.lang.String r1 = r6.c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.d
                if (r1 == 0) goto L69
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.d
                r0.append(r1)
            L69:
                int r1 = r6.e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.d()
                java.lang.String r3 = r6.a
                if (r3 == 0) goto L85
                com.zepto.ds2$b r4 = com.zepto.ds2.l
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r3 = r4.c(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                com.zepto.ds2$b r1 = com.zepto.ds2.l
                java.util.List r2 = r6.f
                r1.h(r2, r0)
                java.util.List r2 = r6.g
                if (r2 == 0) goto La3
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.g
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r1.j(r2, r0)
            La3:
                java.lang.String r1 = r6.h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.h
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.ds2.a.toString():java.lang.String");
        }

        public final void u(String str) {
            this.d = str;
        }

        public final void v(int i2) {
            this.e = i2;
        }

        public final void w(String str) {
            this.a = str;
        }

        public final a x(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.b = b.b(ds2.l, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            return bVar.a(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        public static /* synthetic */ String g(b bVar, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return bVar.f(str, i, i2, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22) throws java.io.EOFException {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "$this$canonicalize"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L71
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L25
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L25
                r1 = 128(0x80, float:1.8E-43)
                if (r0 < r1) goto L27
                if (r21 == 0) goto L25
                goto L27
            L25:
                r11 = r13
                goto L4f
            L27:
                char r1 = (char) r0
                r6 = 2
                r7 = 0
                r8 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default(r5, r1, r8, r6, r7)
                if (r1 != 0) goto L25
                r1 = 37
                if (r0 != r1) goto L41
                if (r18 == 0) goto L25
                if (r19 == 0) goto L41
                r11 = r13
                boolean r1 = r13.e(r14, r3, r4)
                if (r1 == 0) goto L4f
                goto L42
            L41:
                r11 = r13
            L42:
                r1 = 43
                if (r0 != r1) goto L49
                if (r20 == 0) goto L49
                goto L4f
            L49:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4f:
                com.zepto.u70 r12 = new com.zepto.u70
                r12.<init>()
                r0 = r15
                r12.a1(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.H0()
                return r0
            L71:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.ds2.b.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        public final int c(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3213448) {
                if (iHashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final ds2 d(String toHttpUrl) {
            Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
            return new a().j(null, toHttpUrl).c();
        }

        public final boolean e(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && et6.F(str.charAt(i + 1)) != -1 && et6.F(str.charAt(i3)) != -1;
        }

        public final String f(String percentDecode, int i, int i2, boolean z) {
            Intrinsics.checkNotNullParameter(percentDecode, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char cCharAt = percentDecode.charAt(i3);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    u70 u70Var = new u70();
                    u70Var.a1(percentDecode, i, i3);
                    l(u70Var, percentDecode, i3, i2, z);
                    return u70Var.H0();
                }
            }
            String strSubstring = percentDecode.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void h(List toPathString, StringBuilder out) {
            Intrinsics.checkNotNullParameter(toPathString, "$this$toPathString");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = toPathString.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append((String) toPathString.get(i));
            }
        }

        public final List i(String toQueryNamesAndValues) {
            Intrinsics.checkNotNullParameter(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= toQueryNamesAndValues.length()) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) toQueryNamesAndValues, Typography.amp, i, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = toQueryNamesAndValues.length();
                }
                int i2 = iIndexOf$default;
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) toQueryNamesAndValues, '=', i, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > i2) {
                    String strSubstring = toQueryNamesAndValues.substring(i, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = toQueryNamesAndValues.substring(i, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = toQueryNamesAndValues.substring(iIndexOf$default2 + 1, i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        public final void j(List toQueryString, StringBuilder out) {
            Intrinsics.checkNotNullParameter(toQueryString, "$this$toQueryString");
            Intrinsics.checkNotNullParameter(out, "out");
            IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, toQueryString.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if (step >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                String str = (String) toQueryString.get(first);
                String str2 = (String) toQueryString.get(first + 1);
                if (first > 0) {
                    out.append(Typography.amp);
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0096 A[LOOP:1: B:52:0x0090->B:54:0x0096, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void k(com.zepto.u70 r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) throws java.io.EOFException {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.ds2.b.k(com.zepto.u70, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        public final void l(u70 u70Var, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                    int iF = et6.F(str.charAt(i + 1));
                    int iF2 = et6.F(str.charAt(i3));
                    if (iF == -1 || iF2 == -1) {
                        u70Var.b1(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    } else {
                        u70Var.J((iF << 4) + iF2);
                        i = Character.charCount(iCodePointAt) + i3;
                    }
                } else if (iCodePointAt == 43 && z) {
                    u70Var.J(32);
                    i++;
                } else {
                    u70Var.b1(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }
    }

    public ds2(String scheme, String username, String password, String host, int i, List pathSegments, List list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.b = scheme;
        this.c = username;
        this.d = password;
        this.e = host;
        this.f = i;
        this.g = pathSegments;
        this.h = list;
        this.i = str;
        this.j = url;
        this.a = Intrinsics.areEqual(scheme, "https");
    }

    public static final ds2 h(String str) {
        return l.d(str);
    }

    public final String b() {
        if (this.i == null) {
            return null;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.j, '#', 0, false, 6, (Object) null) + 1;
        String str = this.j;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String c() {
        if (this.d.length() == 0) {
            return "";
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.j, ':', this.b.length() + 3, false, 4, (Object) null) + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) this.j, '@', 0, false, 6, (Object) null);
        String str = this.j;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(iIndexOf$default, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String d() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.j, '/', this.b.length() + 3, false, 4, (Object) null);
        String str = this.j;
        int iN = et6.n(str, "?#", iIndexOf$default, str.length());
        String str2 = this.j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iIndexOf$default, iN);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List e() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.j, '/', this.b.length() + 3, false, 4, (Object) null);
        String str = this.j;
        int iN = et6.n(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iN) {
            int i = iIndexOf$default + 1;
            int iM = et6.m(this.j, '/', i, iN);
            String str2 = this.j;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = str2.substring(i, iM);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iM;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ds2) && Intrinsics.areEqual(((ds2) obj).j, this.j);
    }

    public final String f() {
        if (this.h == null) {
            return null;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.j, '?', 0, false, 6, (Object) null) + 1;
        String str = this.j;
        int iM = et6.m(str, '#', iIndexOf$default, str.length());
        String str2 = this.j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(iIndexOf$default, iM);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String g() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.j;
        int iN = et6.n(str, ":@", length, str.length());
        String str2 = this.j;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str2.substring(length, iN);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public final String i() {
        return this.e;
    }

    public final boolean j() {
        return this.a;
    }

    public final a k() {
        a aVar = new a();
        aVar.w(this.b);
        aVar.t(g());
        aVar.s(c());
        aVar.u(this.e);
        aVar.v(this.f != l.c(this.b) ? this.f : -1);
        aVar.f().clear();
        aVar.f().addAll(e());
        aVar.e(f());
        aVar.r(b());
        return aVar;
    }

    public final a l(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new a().j(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List m() {
        return this.g;
    }

    public final int n() {
        return this.f;
    }

    public final String o() {
        if (this.h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        l.j(this.h, sb);
        return sb.toString();
    }

    public final String p() {
        a aVarL = l("/...");
        Intrinsics.checkNotNull(aVarL);
        return aVarL.x("").k("").c().toString();
    }

    public final ds2 q(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        a aVarL = l(link);
        if (aVarL != null) {
            return aVarL.c();
        }
        return null;
    }

    public final String r() {
        return this.b;
    }

    public final URI s() {
        String string = k().o().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "try {\n        val stripp…e) // Unexpected!\n      }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL t() {
        try {
            return new URL(this.j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.j;
    }
}
