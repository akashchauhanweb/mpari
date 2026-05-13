package okhttp3.internal.publicsuffix;

import com.zepto.a80;
import com.zepto.et6;
import com.zepto.is4;
import com.zepto.uk2;
import com.zepto.zf4;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "c", "", "f", "domainLabels", "b", "", "e", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "<init>", "()V", "h", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final AtomicBoolean listRead = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public byte[] publicSuffixListBytes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public byte[] publicSuffixExceptionListBytes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final byte[] e = {(byte) 42};
    public static final List f = CollectionsKt__CollectionsJVMKt.listOf("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            int iB;
            boolean z;
            int iB2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != ((byte) 10)) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iB = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        iB = et6.b(bArr2[i8][i9], KotlinVersion.MAX_COMPONENT_VALUE);
                        z = z3;
                    }
                    iB2 = iB - et6.b(bArr[i5 + i10], KotlinVersion.MAX_COMPONENT_VALUE);
                    if (iB2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (iB2 >= 0) {
                    if (iB2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i5, i7, UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.g;
        }
    }

    public final List b(List domainLabels) {
        String str;
        String strB;
        String str2;
        List listEmptyList;
        List listEmptyList2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (!(this.publicSuffixListBytes != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str3 = (String) domainLabels.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            if (str3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str3.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                strB = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
            }
            strB = companion.b(bArr2, bArr, i2);
            if (strB != null) {
                break;
            }
            i2++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = e;
                Companion companion2 = INSTANCE;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                }
                String strB2 = companion2.b(bArr4, bArr3, i3);
                if (strB2 != null) {
                    str2 = strB2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i4 = size - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                }
                String strB3 = companion3.b(bArr5, bArr, i5);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return StringsKt__StringsKt.split$default((CharSequence) ('!' + str), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        if (strB == null && str2 == null) {
            return f;
        }
        if (strB == null || (listEmptyList = StringsKt__StringsKt.split$default((CharSequence) strB, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (str2 == null || (listEmptyList2 = StringsKt__StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        return listEmptyList.size() > listEmptyList2.size() ? listEmptyList : listEmptyList2;
    }

    public final String c(String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List listF = f(unicodeDomain);
        List listB = b(listF);
        if (listF.size() == listB.size() && ((String) listB.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listB.get(0)).charAt(0) == '!') {
            size = listF.size();
            size2 = listB.size();
        } else {
            size = listF.size();
            size2 = listB.size() + 1;
        }
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.drop(CollectionsKt___CollectionsKt.asSequence(f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void d() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        a80 a80VarD = zf4.d(new uk2(zf4.k(resourceAsStream)));
        try {
            byte[] bArrK = a80VarD.K(a80VarD.readInt());
            byte[] bArrK2 = a80VarD.K(a80VarD.readInt());
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(a80VarD, null);
            synchronized (this) {
                Intrinsics.checkNotNull(bArrK);
                this.publicSuffixListBytes = bArrK;
                Intrinsics.checkNotNull(bArrK2);
                this.publicSuffixExceptionListBytes = bArrK2;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    public final void e() {
        boolean z = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    is4.c.g().k("Failed to read public suffix list", 5, e2);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final List f(String domain) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) domain, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual((String) CollectionsKt___CollectionsKt.last(listSplit$default), "") ? CollectionsKt___CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }
}
