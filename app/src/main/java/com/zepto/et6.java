package com.zepto;

import android.support.v4.media.session.PlaybackStateCompat;
import com.zepto.lc5;
import com.zepto.nd5;
import com.zepto.pl2;
import com.zepto.t80;
import com.zepto.th4;
import com.zepto.v42;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class et6 {
    public static final byte[] a;
    public static final pl2 b = pl2.e.g(new String[0]);
    public static final nd5 c;
    public static final lc5 d;
    public static final th4 e;
    public static final TimeZone f;
    public static final Regex g;
    public static final boolean h;
    public static final String i;

    public static final class a implements v42.c {
        public final /* synthetic */ v42 a;

        public a(v42 v42Var) {
            this.a = v42Var;
        }

        @Override // com.zepto.v42.c
        public final v42 a(da0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.a;
        }
    }

    public static final class b implements ThreadFactory {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        c = nd5.b.i(nd5.Companion, bArr, null, 1, null);
        d = lc5.a.j(lc5.Companion, bArr, null, 0, 0, 7, null);
        th4.a aVar = th4.f;
        t80.a aVar2 = t80.h;
        e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        f = timeZone;
        g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        h = false;
        String name = yf4.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        i = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final int A(String indexOfNonWhitespace, int i2) {
        Intrinsics.checkNotNullParameter(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
        int length = indexOfNonWhitespace.length();
        while (i2 < length) {
            char cCharAt = indexOfNonWhitespace.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i2;
            }
            i2++;
        }
        return indexOfNonWhitespace.length();
    }

    public static final String[] B(String[] intersect, String[] other, Comparator comparator) {
        Intrinsics.checkNotNullParameter(intersect, "$this$intersect");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean C(tb2 isCivilized, File file) {
        Intrinsics.checkNotNullParameter(isCivilized, "$this$isCivilized");
        Intrinsics.checkNotNullParameter(file, "file");
        d36 d36VarC = isCivilized.c(file);
        try {
            try {
                isCivilized.a(file);
                CloseableKt.closeFinally(d36VarC, null);
                return true;
            } finally {
            }
        } catch (IOException unused) {
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(d36VarC, null);
            isCivilized.a(file);
            return false;
        }
    }

    public static final boolean D(Socket isHealthy, a80 source) {
        Intrinsics.checkNotNullParameter(isHealthy, "$this$isHealthy");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                boolean z = !source.I();
                isHealthy.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                isHealthy.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean E(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt__StringsJVMKt.equals(name, "Authorization", true) || StringsKt__StringsJVMKt.equals(name, "Cookie", true) || StringsKt__StringsJVMKt.equals(name, "Proxy-Authorization", true) || StringsKt__StringsJVMKt.equals(name, "Set-Cookie", true);
    }

    public static final int F(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        return -1;
    }

    public static final Charset G(a80 readBomAsCharset, Charset charset) {
        Intrinsics.checkNotNullParameter(readBomAsCharset, "$this$readBomAsCharset");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iV0 = readBomAsCharset.v0(e);
        if (iV0 == -1) {
            return charset;
        }
        if (iV0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iV0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iV0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iV0 == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        if (iV0 == 4) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    public static final int H(a80 readMedium) {
        Intrinsics.checkNotNullParameter(readMedium, "$this$readMedium");
        return b(readMedium.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) | (b(readMedium.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (b(readMedium.readByte(), KotlinVersion.MAX_COMPONENT_VALUE) << 8);
    }

    public static final int I(u70 skipAll, byte b2) throws EOFException {
        Intrinsics.checkNotNullParameter(skipAll, "$this$skipAll");
        int i2 = 0;
        while (!skipAll.I() && skipAll.x0(0L) == b2) {
            i2++;
            skipAll.readByte();
        }
        return i2;
    }

    public static final boolean J(y46 skipAll, int i2, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(skipAll, "$this$skipAll");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = skipAll.timeout().e() ? skipAll.timeout().c() - jNanoTime : Long.MAX_VALUE;
        skipAll.timeout().d(Math.min(jC, timeUnit.toNanos(i2)) + jNanoTime);
        try {
            u70 u70Var = new u70();
            while (skipAll.read(u70Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                u70Var.d();
            }
            if (jC == LongCompanionObject.MAX_VALUE) {
                skipAll.timeout().a();
            } else {
                skipAll.timeout().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == LongCompanionObject.MAX_VALUE) {
                skipAll.timeout().a();
            } else {
                skipAll.timeout().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == LongCompanionObject.MAX_VALUE) {
                skipAll.timeout().a();
            } else {
                skipAll.timeout().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ThreadFactory K(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new b(name, z);
    }

    public static final List L(pl2 toHeaderList) {
        Intrinsics.checkNotNullParameter(toHeaderList, "$this$toHeaderList");
        IntRange intRangeUntil = RangesKt___RangesKt.until(0, toHeaderList.size());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new ll2(toHeaderList.m(iNextInt), toHeaderList.u(iNextInt)));
        }
        return arrayList;
    }

    public static final pl2 M(List toHeaders) {
        Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
        pl2.a aVar = new pl2.a();
        Iterator it = toHeaders.iterator();
        while (it.hasNext()) {
            ll2 ll2Var = (ll2) it.next();
            aVar.d(ll2Var.a().w(), ll2Var.b().w());
        }
        return aVar.e();
    }

    public static final String N(ds2 toHostHeader, boolean z) {
        String strI;
        Intrinsics.checkNotNullParameter(toHostHeader, "$this$toHostHeader");
        if (StringsKt__StringsKt.contains$default((CharSequence) toHostHeader.i(), (CharSequence) ":", false, 2, (Object) null)) {
            strI = '[' + toHostHeader.i() + ']';
        } else {
            strI = toHostHeader.i();
        }
        if (!z && toHostHeader.n() == ds2.l.c(toHostHeader.r())) {
            return strI;
        }
        return strI + ':' + toHostHeader.n();
    }

    public static /* synthetic */ String O(ds2 ds2Var, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return N(ds2Var, z);
    }

    public static final List P(List toImmutableList) {
        Intrinsics.checkNotNullParameter(toImmutableList, "$this$toImmutableList");
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.toMutableList((Collection) toImmutableList));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Map Q(Map toImmutableMap) {
        Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            return MapsKt__MapsKt.emptyMap();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return mapUnmodifiableMap;
    }

    public static final long R(String toLongOrDefault, long j) {
        Intrinsics.checkNotNullParameter(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int S(String str, int i2) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > IntCompanionObject.MAX_VALUE) {
                    return IntCompanionObject.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public static final String T(String trimSubstring, int i2, int i3) {
        Intrinsics.checkNotNullParameter(trimSubstring, "$this$trimSubstring");
        int iW = w(trimSubstring, i2, i3);
        String strSubstring = trimSubstring.substring(iW, y(trimSubstring, iW, i3));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String U(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return T(str, i2, i3);
    }

    public static final Throwable V(Exception withSuppressed, List suppressed) {
        Intrinsics.checkNotNullParameter(withSuppressed, "$this$withSuppressed");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt__ExceptionsKt.addSuppressed(withSuppressed, (Exception) it.next());
        }
        return withSuppressed;
    }

    public static final void W(z70 writeMedium, int i2) {
        Intrinsics.checkNotNullParameter(writeMedium, "$this$writeMedium");
        writeMedium.J((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeMedium.J((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeMedium.J(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static final void a(List addIfAbsent, Object obj) {
        Intrinsics.checkNotNullParameter(addIfAbsent, "$this$addIfAbsent");
        if (addIfAbsent.contains(obj)) {
            return;
        }
        addIfAbsent.add(obj);
    }

    public static final int b(byte b2, int i2) {
        return b2 & i2;
    }

    public static final int c(short s, int i2) {
        return s & i2;
    }

    public static final long d(int i2, long j) {
        return ((long) i2) & j;
    }

    public static final v42.c e(v42 asFactory) {
        Intrinsics.checkNotNullParameter(asFactory, "$this$asFactory");
        return new a(asFactory);
    }

    public static final boolean f(String canParseAsIpAddress) {
        Intrinsics.checkNotNullParameter(canParseAsIpAddress, "$this$canParseAsIpAddress");
        return g.matches(canParseAsIpAddress);
    }

    public static final boolean g(ds2 canReuseConnectionFor, ds2 other) {
        Intrinsics.checkNotNullParameter(canReuseConnectionFor, "$this$canReuseConnectionFor");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(canReuseConnectionFor.i(), other.i()) && canReuseConnectionFor.n() == other.n() && Intrinsics.areEqual(canReuseConnectionFor.r(), other.r());
    }

    public static final int h(String name, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!(j >= 0)) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (!(millis <= ((long) IntCompanionObject.MAX_VALUE))) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void i(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void j(Closeable closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void k(Socket closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Intrinsics.areEqual(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] l(String[] concat, String value) {
        Intrinsics.checkNotNullParameter(concat, "$this$concat");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(concat, concat.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) objArrCopyOf;
        strArr[ArraysKt___ArraysKt.getLastIndex(strArr)] = value;
        return strArr;
    }

    public static final int m(String delimiterOffset, char c2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        while (i2 < i3) {
            if (delimiterOffset.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final int n(String delimiterOffset, String delimiters, int i2, int i3) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i2 < i3) {
            if (StringsKt__StringsKt.contains$default((CharSequence) delimiters, delimiterOffset.charAt(i2), false, 2, (Object) null)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int o(String str, char c2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return m(str, c2, i2, i3);
    }

    public static final boolean p(y46 discard, int i2, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(discard, "$this$discard");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return J(discard, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String q(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }

    public static final boolean r(String[] hasIntersection, String[] strArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(hasIntersection, "$this$hasIntersection");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (hasIntersection.length != 0 && strArr != null && strArr.length != 0) {
            for (String str : hasIntersection) {
                for (String str2 : strArr) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long s(ld5 headersContentLength) {
        Intrinsics.checkNotNullParameter(headersContentLength, "$this$headersContentLength");
        String strJ = headersContentLength.U().j("Content-Length");
        if (strJ != null) {
            return R(strJ, -1L);
        }
        return -1L;
    }

    public static final List t(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int u(String[] indexOf, String value, Comparator comparator) {
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = indexOf.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(indexOf[i2], value) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int v(String indexOfControlOrNonAscii) {
        Intrinsics.checkNotNullParameter(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = indexOfControlOrNonAscii.charAt(i2);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int w(String indexOfFirstNonAsciiWhitespace, int i2, int i3) {
        Intrinsics.checkNotNullParameter(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i2 < i3) {
            char cCharAt = indexOfFirstNonAsciiWhitespace.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static /* synthetic */ int x(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return w(str, i2, i3);
    }

    public static final int y(String indexOfLastNonAsciiWhitespace, int i2, int i3) {
        Intrinsics.checkNotNullParameter(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i4 = i3 - 1;
        if (i4 >= i2) {
            while (true) {
                char cCharAt = indexOfLastNonAsciiWhitespace.charAt(i4);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        return i2;
    }

    public static /* synthetic */ int z(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return y(str, i2, i3);
    }
}
