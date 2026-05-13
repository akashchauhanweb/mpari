package com.zepto;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.zepto.je2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ee2 {
    public static final Comparator a = new Comparator() { // from class: com.zepto.de2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ee2.g((byte[]) obj, (byte[]) obj2);
        }
    };

    public static class a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List d(fe2 fe2Var, Resources resources) {
        return fe2Var.b() != null ? fe2Var.b() : ie2.c(resources, fe2Var.c());
    }

    public static je2.a e(Context context, fe2 fe2Var, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), fe2Var, context.getResources());
        return providerInfoF == null ? je2.a.a(1, null) : je2.a.a(0, h(context, fe2Var, providerInfoF.authority, cancellationSignal));
    }

    public static ProviderInfo f(PackageManager packageManager, fe2 fe2Var, Resources resources) throws PackageManager.NameNotFoundException {
        String strE = fe2Var.e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(fe2Var.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + fe2Var.f());
        }
        List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, a);
        List listD = d(fe2Var, resources);
        for (int i = 0; i < listD.size(); i++) {
            ArrayList arrayList = new ArrayList((Collection) listD.get(i));
            Collections.sort(arrayList, a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public static je2.b[] h(Context context, fe2 fe2Var, String str, CancellationSignal cancellationSignal) throws Throwable {
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor cursorA = a.a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{fe2Var.g()}, null, cancellationSignal);
            if (cursorA != null) {
                try {
                    if (cursorA.getCount() > 0) {
                        int columnIndex = cursorA.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursorA.getColumnIndex("_id");
                        int columnIndex3 = cursorA.getColumnIndex("file_id");
                        int columnIndex4 = cursorA.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorA.getColumnIndex("font_weight");
                        int columnIndex6 = cursorA.getColumnIndex("font_italic");
                        while (cursorA.moveToNext()) {
                            int i = columnIndex != -1 ? cursorA.getInt(columnIndex) : 0;
                            arrayList.add(je2.b.a(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3)), columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorA.getInt(columnIndex6) == 1, i));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return (je2.b[]) arrayList.toArray(new je2.b[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
