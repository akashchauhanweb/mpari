package com.zepto;

import android.content.Context;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class lx3 {
    public final Context a;
    public String b;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default((String) ((Pair) obj).getFirst(), "classes", "", false, 4, (Object) null), ".dex", "", false, 4, (Object) null));
            if (intOrNull == null) {
                intOrNull = num;
            }
            Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default((String) ((Pair) obj2).getFirst(), "classes", "", false, 4, (Object) null), ".dex", "", false, 4, (Object) null));
            return ComparisonsKt__ComparisonsKt.compareValues(intOrNull, intOrNull2 != null ? intOrNull2 : 0);
        }
    }

    public lx3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = "MultiDexHasher";
    }

    public final String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            String strA = t12.a(messageDigest.digest(bArr));
            Intrinsics.checkNotNullExpressionValue(strA, "{\n            digest = M….digest(bytes))\n        }");
            return strA;
        } catch (NoSuchAlgorithmException e) {
            nn3.c(nn3.a, this.b, e.toString(), null, 4, null);
            return "";
        }
    }

    public final LinkedHashMap b(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Regex regex = new Regex("classes(\\d*)\\.dex");
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
            try {
                ArrayList<Pair> arrayList = new ArrayList();
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    if (Intrinsics.areEqual(nextEntry.getName(), "AndroidManifest.xml")) {
                        linkedHashMap.put("AndroidManifest.xml", ByteStreamsKt.readBytes(zipInputStream));
                    } else {
                        String name = nextEntry.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "entry.name");
                        if (regex.matches(name)) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                            arrayList.add(TuplesKt.to(nextEntry.getName(), byteArrayOutputStream.toByteArray()));
                        }
                    }
                }
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new a());
                for (Pair pair : arrayList) {
                    linkedHashMap.put((String) pair.component1(), (byte[]) pair.component2());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipInputStream, null);
                if (!linkedHashMap.containsKey("AndroidManifest.xml")) {
                    throw new IllegalStateException("AndroidManifest.xml not found in APK");
                }
                if (linkedHashMap.size() != 1) {
                    return linkedHashMap;
                }
                throw new IllegalStateException("No classes*.dex files found in APK");
            } finally {
            }
        } catch (Exception e) {
            nn3.c(nn3.a, this.b, e.toString(), null, 4, null);
            return null;
        } catch (OutOfMemoryError e2) {
            nn3.c(nn3.a, this.b, e2.toString(), null, 4, null);
            return null;
        }
    }

    public final synchronized String c() {
        StringBuilder sb;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strStringPlus = "";
            String strA = "";
            try {
                LinkedHashMap linkedHashMapB = b(d());
                if (linkedHashMapB != null) {
                    for (Map.Entry entry : linkedHashMapB.entrySet()) {
                        String str = (String) entry.getKey();
                        byte[] bArr = (byte[]) entry.getValue();
                        linkedHashMap.put(str, a(bArr));
                        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "AndroidManifest.xml", false, 2, (Object) null)) {
                            strA = a(bArr);
                        } else {
                            strStringPlus = Intrinsics.stringPlus(strStringPlus, a(bArr));
                        }
                    }
                }
                String strB = t12.b(strStringPlus);
                nn3.a.f(this.b, "OutputHash:-" + ((Object) strB) + "->" + strA);
                sb = new StringBuilder();
                sb.append((Object) strB);
                sb.append('@');
                sb.append((Object) new Gson().toJson(linkedHashMap));
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    public final String d() {
        try {
            String str = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).applicationInfo.sourceDir;
            Intrinsics.checkNotNullExpressionValue(str, "{\n            val packag…nInfo.sourceDir\n        }");
            return str;
        } catch (Exception e) {
            nn3.c(nn3.a, this.b, e.toString(), null, 4, null);
            return "";
        }
    }
}
