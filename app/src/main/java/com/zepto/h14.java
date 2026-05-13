package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.main.scan.ScanCore;
import ai.protectt.app.security.main.scan.ScanUtils;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.google.gson.Gson;
import com.zepto.jt;
import com.zepto.s06;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.UByte;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class h14 {
    public static final a b = new a(null);
    public static h14 c;
    public static Context d;
    public final String a = "NDKTrustInteractor";

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h14 a() {
            if (b() == null) {
                c(new h14());
            }
            return b();
        }

        public final h14 b() {
            return h14.c;
        }

        public final void c(h14 h14Var) {
            h14.c = h14Var;
        }
    }

    public final String a(Context context) {
        boolean z;
        Boolean boolValueOf;
        String strReplace$default;
        try {
            String str = context.getApplicationInfo().sourceDir;
            Intrinsics.checkNotNullExpressionValue(str, "context.applicationInfo.sourceDir");
            File file = new File(StringsKt__StringsKt.removeSuffix(str, (CharSequence) "base.apk"));
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                boolValueOf = null;
            } else {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    File file2 = fileArrListFiles[i];
                    i++;
                    String name = file2.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    if (StringsKt__StringsJVMKt.startsWith$default(name, "split", false, 2, null)) {
                        String name2 = file2.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "it.name");
                        if (StringsKt__StringsJVMKt.endsWith$default(name2, ".apk", false, 2, null)) {
                            z = true;
                            break;
                        }
                    }
                }
                boolValueOf = Boolean.valueOf(z);
            }
            Intrinsics.checkNotNull(boolValueOf);
            if (!boolValueOf.booleanValue()) {
                return "";
            }
            File[] fileArrListFiles2 = file.listFiles();
            Intrinsics.checkNotNull(fileArrListFiles2);
            int length2 = fileArrListFiles2.length;
            int i2 = 0;
            while (i2 < length2) {
                File file3 = fileArrListFiles2[i2];
                i2++;
                String[] strArr = Build.SUPPORTED_ABIS;
                String str2 = strArr[0];
                Intrinsics.checkNotNullExpressionValue(str2, "Build.SUPPORTED_ABIS[0]");
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "-", false, 2, (Object) null)) {
                    String str3 = strArr[0];
                    Intrinsics.checkNotNullExpressionValue(str3, "Build.SUPPORTED_ABIS[0]");
                    strReplace$default = StringsKt__StringsJVMKt.replace$default(str3, "-", "_", false, 4, (Object) null);
                } else {
                    strReplace$default = strArr[0];
                    Intrinsics.checkNotNullExpressionValue(strReplace$default, "{\n                      …                        }");
                }
                String name3 = file3.getName();
                Intrinsics.checkNotNullExpressionValue(name3, "i.name");
                if (StringsKt__StringsJVMKt.startsWith$default(name3, "split", false, 2, null)) {
                    String name4 = file3.getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "i.name");
                    if (StringsKt__StringsJVMKt.endsWith$default(name4, ".apk", false, 2, null)) {
                        String name5 = file3.getName();
                        Intrinsics.checkNotNullExpressionValue(name5, "i.name");
                        if (StringsKt__StringsKt.contains$default((CharSequence) name5, (CharSequence) strReplace$default, false, 2, (Object) null)) {
                            return i(new File(file3.getAbsolutePath()));
                        }
                    } else {
                        continue;
                    }
                }
            }
            return "";
        } catch (Exception e) {
            nn3.a.b(this.a, Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
            return "";
        }
    }

    public final String d(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Signature[] packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo.getSigningCertificateHistory();
                Intrinsics.checkNotNullExpressionValue(packageInfo, "packageInfo");
                if (packageInfo.length <= 0) {
                    return "";
                }
                String charsString = packageInfo[0].toCharsString();
                Intrinsics.checkNotNullExpressionValue(charsString, "i.toCharsString()");
                return charsString;
            }
            Signature[] packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            Intrinsics.checkNotNullExpressionValue(packageInfo2, "packageInfo");
            if (packageInfo2.length <= 0) {
                return "";
            }
            String charsString2 = packageInfo2[0].toCharsString();
            Intrinsics.checkNotNullExpressionValue(charsString2, "i.toCharsString()");
            return charsString2;
        } catch (Exception e) {
            nn3.a.f(this.a, e.toString());
            return "";
        }
    }

    public final String e() {
        jt.a aVar = jt.c;
        if (aVar.Q() == null) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            String strSubstring = StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null).substring(0, 16);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            aVar.N0(strSubstring);
        }
        String strQ = aVar.Q();
        Intrinsics.checkNotNull(strQ);
        return strQ;
    }

    public final String f() {
        jt.a aVar = jt.c;
        if (aVar.R() == null) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            aVar.O0(StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null));
        }
        String strR = aVar.R();
        Intrinsics.checkNotNull(strR);
        return strR;
    }

    public final String g(Context context, String nonce) {
        boolean zX;
        boolean zU0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            NativeInteractor nativeInteractor = NativeInteractor.a;
            ScanUtils scanUtils = ScanUtils.a;
            String strG = nativeInteractor.G(nonce, String.valueOf(scanUtils.s0(context)));
            String strG2 = nativeInteractor.G(nonce, String.valueOf(scanUtils.B0(context)));
            uu uuVar = new uu();
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            List listB = uuVar.b(packageManager, packageName);
            Intrinsics.checkNotNull(listB);
            String strValueOf = String.valueOf(listB.get(0));
            String strG3 = nativeInteractor.G(nonce, nativeInteractor.t(context));
            String strG4 = nativeInteractor.G(nonce, String.valueOf(scanUtils.c0(context).length() > 0));
            jt.a aVar = jt.c;
            String strG5 = nativeInteractor.G(nonce, String.valueOf((aVar.g0() && aVar.V()) ? false : true));
            aVar.K0(context);
            d = context;
            s06.a aVar2 = s06.m;
            aVar2.b(context);
            s06 s06VarA = aVar2.a();
            Intrinsics.checkNotNull(s06VarA);
            String strL = s06VarA.l();
            if (strL.length() > 0) {
                zX = co3.a.x(strL, context);
                zU0 = scanUtils.U0(strL);
            } else {
                ScanCore.a.d0();
                co3 co3Var = co3.a;
                s06 s06VarA2 = aVar2.a();
                Intrinsics.checkNotNull(s06VarA2);
                zX = co3Var.x(s06VarA2.l(), context);
                s06 s06VarA3 = aVar2.a();
                Intrinsics.checkNotNull(s06VarA3);
                zU0 = scanUtils.U0(s06VarA3.l());
            }
            String str = ((Object) string) + '#' + nativeInteractor.G(nonce, String.valueOf(zX)) + '#' + nativeInteractor.G(nonce, String.valueOf(zU0)) + '#' + strG3 + '#' + strG4 + '#' + strG + '#' + strG2 + '#' + strValueOf + '#' + h() + '#' + strG5;
            nn3.a.f("RASPResponse", Intrinsics.stringPlus("static value:-", str));
            return str;
        } catch (Exception e) {
            nn3.c(nn3.a, this.a, Intrinsics.stringPlus("", e), null, 4, null);
            return "NA";
        }
    }

    public final String h() {
        s06 s06VarA = s06.m.a();
        Intrinsics.checkNotNull(s06VarA);
        String strL = s06VarA.l();
        return (StringsKt__StringsKt.contains$default((CharSequence) strL, (CharSequence) "L1", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) strL, (CharSequence) "L2", false, 2, (Object) null)) ? "0c03058694" : StringsKt__StringsKt.contains$default((CharSequence) strL, (CharSequence) "L3", false, 2, (Object) null) ? "fd5b396c4c" : StringsKt__StringsKt.contains$default((CharSequence) strL, (CharSequence) "L4", false, 2, (Object) null) ? "551135b416" : StringsKt__StringsKt.contains$default((CharSequence) strL, (CharSequence) "L5", false, 2, (Object) null) ? "2692dafa94" : "b4fe3d529d";
    }

    public final String i(File file) throws Throwable {
        int i;
        FileInputStream fileInputStream = null;
        try {
            try {
                Intrinsics.checkNotNull(file);
                if (!file.exists()) {
                    return "";
                }
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    Ref.IntRef intRef = new Ref.IntRef();
                    while (true) {
                        int i2 = fileInputStream2.read(bArr);
                        intRef.element = i2;
                        if (i2 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i2);
                    }
                    byte[] bArrDigest = messageDigest.digest();
                    messageDigest.update(bArrDigest);
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : bArrDigest) {
                        String string = Integer.toString(b2 + UByte.MIN_VALUE, 16);
                        Intrinsics.checkNotNullExpressionValue(string, "toString((mdbytes[i] and…ff.toByte()) + 0x100, 16)");
                        String strSubstring = string.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        sb.append(strSubstring);
                    }
                    String string2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "sb.toString()");
                    fileInputStream2.close();
                    return string2;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                }
            } catch (Exception e) {
                nn3.a.b(this.a, e.toString(), e);
                return "";
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        throw th;
    }

    public final synchronized String j(String input, Context context, boolean z) {
        String strB;
        String string;
        try {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                if (z) {
                    String strD = d(context);
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) new lx3(context).c(), new String[]{"@"}, false, 0, 6, (Object) null);
                    String str = (String) listSplit$default.get(0);
                    l(context);
                    a(context);
                    i(new File("/data/data/" + ((Object) context.getPackageName()) + "/app_dex/temp.apk"));
                    String strStringPlus = Intrinsics.stringPlus(strD.length() == 0 ? "" : strD, str.length() == 0 ? "" : str);
                    nn3 nn3Var = nn3.a;
                    nn3Var.f(this.a, Intrinsics.stringPlus("addingHash:-", strStringPlus));
                    String strB2 = t12.b(strStringPlus);
                    nn3Var.f(this.a, Intrinsics.stringPlus("sha256OfAddingHash:-", strB2));
                    StringBuilder sb = new StringBuilder();
                    if (strD.length() == 0) {
                        strD = "-";
                    }
                    sb.append(strD);
                    sb.append('#');
                    if (str.length() == 0) {
                        str = "-";
                    }
                    sb.append(str);
                    sb.append('#');
                    CharSequence charSequence = (CharSequence) listSplit$default.get(1);
                    if (charSequence.length() == 0) {
                        charSequence = "-";
                    }
                    sb.append((String) charSequence);
                    String string2 = sb.toString();
                    nn3Var.f(this.a, Intrinsics.stringPlus("testtrut:-", string2));
                    string = ((Object) strB2) + '|' + string2;
                } else {
                    String strG = g(context, input);
                    if (k(context)) {
                        String strD2 = d(context);
                        String str2 = (String) StringsKt__StringsKt.split$default((CharSequence) new lx3(context).c(), new String[]{"@"}, false, 0, 6, (Object) null).get(0);
                        l(context);
                        a(context);
                        if (strD2.length() == 0) {
                            strD2 = "";
                        }
                        if (str2.length() == 0) {
                            str2 = "";
                        }
                        String strStringPlus2 = Intrinsics.stringPlus(strD2, str2);
                        nn3 nn3Var2 = nn3.a;
                        nn3Var2.f(this.a, Intrinsics.stringPlus("addingHash:-", strStringPlus2));
                        strB = t12.b(strStringPlus2);
                        Intrinsics.checkNotNullExpressionValue(strB, "getSha256Hash(addingHash)");
                        nn3Var2.f(this.a, Intrinsics.stringPlus("sha256OfAddingHash:-", strB));
                    } else {
                        strB = "NA";
                    }
                    String str3 = strB + '|' + input + '|' + strG;
                    nn3 nn3Var3 = nn3.a;
                    nn3Var3.f(this.a, Intrinsics.stringPlus("addBaseAppInputsha256:-", str3));
                    String strD3 = new mi2().d(str3, f(), e());
                    nn3Var3.f(this.a, Intrinsics.stringPlus("aesEncOfAddedHashWithInput:-", strD3));
                    String strB3 = t12.b(strD3);
                    nn3Var3.f(this.a, Intrinsics.stringPlus("sha256OfAESHash:-", strB3));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) strD3);
                    sb2.append('|');
                    sb2.append((Object) strB3);
                    string = sb2.toString();
                    nn3Var3.f(this.a, Intrinsics.stringPlus("finalOf1stPart:-", string));
                }
            } catch (Exception e) {
                nn3.a.b(this.a, e.toString(), e);
                return "";
            }
        } catch (Throwable th) {
            throw th;
        }
        return string;
    }

    public final boolean k(Context context) {
        try {
            jt.a aVar = jt.c;
            if (aVar.T() != null) {
                Boolean boolT = aVar.T();
                Intrinsics.checkNotNull(boolT);
                return boolT.booleanValue();
            }
            n(context);
            Boolean boolT2 = aVar.T();
            Intrinsics.checkNotNull(boolT2);
            return boolT2.booleanValue();
        } catch (Exception e) {
            nn3.c(nn3.a, this.a, e.toString(), null, 4, null);
            return true;
        }
    }

    public final String l(Context context) throws Throwable {
        File[] fileArrListFiles;
        int length;
        int i;
        int i2;
        try {
            String str = context.getApplicationInfo().sourceDir;
            Intrinsics.checkNotNullExpressionValue(str, "context.applicationInfo.sourceDir");
            fileArrListFiles = new File(Intrinsics.stringPlus(StringsKt__StringsKt.removeSuffix(str, (CharSequence) "base.apk"), "lib")).listFiles();
            Intrinsics.checkNotNull(fileArrListFiles);
            length = fileArrListFiles.length;
            i = 0;
            i2 = 0;
        } catch (Exception e) {
            nn3.a.b(this.a, Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
        }
        while (i2 < length) {
            File file = fileArrListFiles[i2];
            i2++;
            File[] fileArrListFiles2 = file.listFiles();
            Intrinsics.checkNotNull(fileArrListFiles2);
            if (!(fileArrListFiles2.length == 0)) {
                File[] fileArrListFiles3 = file.listFiles();
                Intrinsics.checkNotNull(fileArrListFiles3);
                int length2 = fileArrListFiles3.length;
                String strI = "";
                String strI2 = strI;
                while (i < length2) {
                    File file2 = fileArrListFiles3[i];
                    i++;
                    if (file2.getName().equals("libapp-protectt-native-lib.so")) {
                        strI = i(new File(file2.getAbsolutePath()));
                    }
                    if (file2.getName().equals("libprotectt-native-lib.so")) {
                        strI2 = i(new File(file2.getAbsolutePath()));
                    }
                }
                String strB = t12.b(Intrinsics.stringPlus(strI, strI2));
                Intrinsics.checkNotNullExpressionValue(strB, "getSha256Hash(completeMD5)");
                return strB;
            }
            return "";
        }
        return "";
    }

    public final String m(String str) {
        return t12.b(str);
    }

    public final String n(Context context) {
        int identifier;
        BufferedReader bufferedReader;
        Object next;
        File file = new File(context.getDir("dex", 0), "details.json");
        try {
            try {
                Log.e(this.a, "key empty so do image dec");
                jt.a aVar = jt.c;
                if (StringsKt__StringsJVMKt.equals(aVar.i(), "nonprod", true)) {
                    Resources resources = context.getResources();
                    NativeInteractor nativeInteractor = NativeInteractor.a;
                    identifier = resources.getIdentifier(nativeInteractor.N0(), nativeInteractor.R0(), context.getPackageName());
                } else if (StringsKt__StringsJVMKt.equals(aVar.i(), "prod", true)) {
                    Resources resources2 = context.getResources();
                    NativeInteractor nativeInteractor2 = NativeInteractor.a;
                    identifier = resources2.getIdentifier(nativeInteractor2.Q0(), nativeInteractor2.R0(), context.getPackageName());
                } else {
                    identifier = 0;
                }
                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
                Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "context.resources.openRawResource(feature)");
                ye1 ye1Var = ye1.a;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(ye1Var.b(ye1Var.f(inputStreamOpenRawResource))));
                bufferedInputStream.available();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
                Ref.IntRef intRef = new Ref.IntRef();
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    intRef.element = i;
                    if (i == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, i);
                }
                bufferedOutputStream.close();
                bufferedInputStream.close();
                Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charsets.UTF_8);
                bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, ConstantsKt.DEFAULT_BUFFER_SIZE);
            } catch (IOException e) {
                nn3.a.b(this.a, Intrinsics.stringPlus("Exception :: ", e.getMessage()), e);
                if (file.exists()) {
                }
            }
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                Object obj = null;
                CloseableKt.closeFinally(bufferedReader, null);
                jf5 jf5Var = (jf5) new Gson().fromJson(text, jf5.class);
                List<if5> ruleList = jf5Var.getRuleList();
                Intrinsics.checkNotNull(ruleList);
                Iterator<T> it = ruleList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((if5) next).getRuleid() == 1004) {
                        break;
                    }
                }
                if5 if5Var = (if5) next;
                jt.a aVar2 = jt.c;
                ni0 channelDtls = jf5Var.getChannelDtls();
                Intrinsics.checkNotNull(channelDtls);
                aVar2.M0(channelDtls.getCloudprojectnum());
                nn3.a.f(this.a, "" + if5Var + ':' + aVar2.I());
                aVar2.R0(Boolean.valueOf(if5Var != null && aVar2.I().length() > 0));
                List<if5> ruleList2 = jf5Var.getRuleList();
                Intrinsics.checkNotNull(ruleList2);
                Iterator<T> it2 = ruleList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((if5) next2).getRuleid() == 1006) {
                        obj = next2;
                        break;
                    }
                }
                jt.c.S0(Boolean.valueOf(((if5) obj) != null));
                if (jf5Var.getChannelDtls() == null) {
                    if (file.exists()) {
                        file.delete();
                    }
                    return "";
                }
                NativeInteractor nativeInteractor3 = NativeInteractor.a;
                ni0 channelDtls2 = jf5Var.getChannelDtls();
                Intrinsics.checkNotNull(channelDtls2);
                String exttrustpublickey = channelDtls2.getExttrustpublickey();
                Intrinsics.checkNotNull(exttrustpublickey);
                nativeInteractor3.z0(exttrustpublickey);
                ni0 channelDtls3 = jf5Var.getChannelDtls();
                Intrinsics.checkNotNull(channelDtls3);
                String exttrustpublickey2 = channelDtls3.getExttrustpublickey();
                Intrinsics.checkNotNull(exttrustpublickey2);
                if (file.exists()) {
                    file.delete();
                }
                return exttrustpublickey2;
            } finally {
            }
        } catch (Throwable th) {
            if (file.exists()) {
                file.delete();
            }
            throw th;
        }
    }
}
