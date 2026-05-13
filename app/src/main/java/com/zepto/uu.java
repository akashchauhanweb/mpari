package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.zepto.jt;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class uu {
    public final String a = "AppSignature";

    public static final class a extends Lambda implements Function1 {
        public static final a c = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(ZipEntry zipEntry) {
            return Boolean.valueOf(!zipEntry.isDirectory());
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ String f;
        public final /* synthetic */ if5 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.f = str;
            this.g = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return uu.this.new b(this.f, this.g, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                uu.g(uu.this, new File(jt.c.C().getApplicationInfo().sourceDir), this.f, this.g, null, 4, null);
            } catch (Exception e) {
                nn3.c(nn3.a, uu.this.c(), e.toString(), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void g(uu uuVar, File file, String str, if5 if5Var, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        uuVar.f(file, str, if5Var, str2);
    }

    public static final void h(if5 rule) {
        Intrinsics.checkNotNullParameter(rule, "$rule");
        qn3.a.d(String.valueOf(rule.getTitle()), String.valueOf(rule.getMsg()));
    }

    public final List b(PackageManager pm, String packageName) {
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = pm.getPackageInfo(packageName, 134217728);
                if ((packageInfo == null ? null : packageInfo.signingInfo) == null) {
                    return null;
                }
                if (packageInfo.signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners();
                    Intrinsics.checkNotNullExpressionValue(apkContentsSigners, "packageInfo.signingInfo.apkContentsSigners");
                    return e(apkContentsSigners);
                }
                Signature[] signingCertificateHistory = packageInfo.signingInfo.getSigningCertificateHistory();
                Intrinsics.checkNotNullExpressionValue(signingCertificateHistory, "packageInfo.signingInfo.signingCertificateHistory");
                return e(signingCertificateHistory);
            }
            PackageInfo packageInfo2 = pm.getPackageInfo(packageName, 64);
            if ((packageInfo2 == null ? null : packageInfo2.signatures) == null) {
                return null;
            }
            Signature[] signatureArr = packageInfo2.signatures;
            Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return null;
            }
            Signature[] signatureArr2 = packageInfo2.signatures;
            if (signatureArr2[0] == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(signatureArr2, "packageInfo.signatures");
            return e(signatureArr2);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final String c() {
        return this.a;
    }

    public final String d(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "sig.toByteArray()");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(\"SHA-512\")");
            messageDigest.update(byteArray);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "md.digest()");
            StringBuilder sb = new StringBuilder();
            int length = bArrDigest.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(":");
                }
                String hexString = Integer.toHexString(bArrDigest[i] & UByte.MAX_VALUE);
                if (hexString.length() == 1) {
                    sb.append("0");
                }
                sb.append(hexString);
                i = i2;
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final List e(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        int length = signatureArr.length;
        int i = 0;
        while (i < length) {
            Signature signature = signatureArr[i];
            i++;
            arrayList.add(d(signature));
        }
        return arrayList;
    }

    public final synchronized void f(File file, String from, final if5 rule, String str) {
        String str2;
        String string;
        ZipFile zipFile;
        try {
            Intrinsics.checkNotNullParameter(file, "<this>");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(rule, "rule");
            try {
                str2 = "";
                string = "";
                zipFile = new ZipFile(file);
            } catch (Exception e) {
                nn3.c(nn3.a, this.a, e.toString(), null, 4, null);
            }
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                Intrinsics.checkNotNullExpressionValue(enumerationEntries, "zipFile.entries()");
                boolean z = true;
                long j = 0;
                long j2 = Long.MIN_VALUE;
                int i = 0;
                for (Object obj : SequencesKt___SequencesKt.filter(SequencesKt__SequencesKt.asSequence(CollectionsKt__IteratorsJVMKt.iterator(enumerationEntries)), a.c)) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    ZipEntry zipEntry = (ZipEntry) obj;
                    String entryName = zipEntry.getName();
                    long millis = zipEntry.getLastModifiedTime().toMillis();
                    if (i == 0) {
                        j = millis;
                    } else if (millis != j) {
                        Intrinsics.checkNotNullExpressionValue(entryName, "entryName");
                        string = zipEntry.getLastModifiedTime().toString();
                        Intrinsics.checkNotNullExpressionValue(string, "zipEntry.lastModifiedTime.toString()");
                        str2 = entryName;
                        i = i2;
                        j2 = millis;
                        z = false;
                    }
                    i = i2;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipFile, null);
                if (z) {
                    nn3.a.f(this.a, "All files have the same modification time.");
                } else {
                    nn3.a.f(this.a, "Latest modified entry: " + str2 + ", Time: " + j2 + " , FileTime :" + string);
                    String str3 = str2 + '#' + j2 + '#' + string + '#' + j;
                    if (str != null) {
                        str3 = str2 + '#' + j2 + '#' + string + '#' + j + '#' + ((Object) str);
                    }
                    if (Intrinsics.areEqual(from, "Dex")) {
                        ScanUtils.a.b0(rule, str3);
                    } else {
                        Activity activityR = jt.c.r();
                        Intrinsics.checkNotNull(activityR);
                        activityR.runOnUiThread(new Runnable() { // from class: com.zepto.tu
                            @Override // java.lang.Runnable
                            public final void run() {
                                uu.h(rule);
                            }
                        });
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(String localTrust, if5 rule, String from) {
        Intrinsics.checkNotNullParameter(localTrust, "localTrust");
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(from, "from");
        try {
            NativeInteractor nativeInteractor = NativeInteractor.a;
            jt.a aVar = jt.c;
            Object objE = nativeInteractor.e(aVar.C());
            if (objE == null) {
                f80.d(qj2.c, null, null, new b(from, rule, null), 3, null);
            } else {
                String strD = d((Signature) objE);
                Intrinsics.checkNotNull(strD);
                if (!StringsKt__StringsKt.contains$default((CharSequence) localTrust, (CharSequence) strD, false, 2, (Object) null)) {
                    boolean zContains$default = StringsKt__StringsKt.contains$default((CharSequence) localTrust, (CharSequence) strD, false, 2, (Object) null);
                    f(new File(aVar.C().getApplicationInfo().sourceDir), from, rule, ((Object) strD) + "|AppSignatureTrustCheck:-" + zContains$default + '|' + localTrust);
                }
            }
        } catch (Exception e) {
            nn3.a.b(this.a, Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
        }
    }
}
