package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class re8 implements zm8 {
    public static final z68 i = new z68("FakeAssetPackService");
    public static final AtomicInteger j = new AtomicInteger(1);
    public final String a;
    public final k98 b;
    public final mc8 c;
    public final Context d;
    public final xf8 e;
    public final lc8 f;
    public final vf8 g;
    public final Handler h = new Handler(Looper.getMainLooper());

    public re8(File file, k98 k98Var, mc8 mc8Var, Context context, xf8 xf8Var, lc8 lc8Var, vf8 vf8Var) {
        this.a = file.getAbsolutePath();
        this.b = k98Var;
        this.c = mc8Var;
        this.d = context;
        this.e = xf8Var;
        this.f = lc8Var;
        this.g = vf8Var;
    }

    public static long h(int i2, long j2) {
        if (i2 == 2) {
            return j2 / 2;
        }
        if (i2 == 3 || i2 == 4) {
            return j2;
        }
        return 0L;
    }

    public static String l(File file) throws km3 {
        try {
            return ve8.a(Arrays.asList(file));
        } catch (IOException e) {
            throw new km3(String.format("Could not digest file: %s.", file), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new km3("SHA256 algorithm not supported.", e2);
        }
    }

    @Override // com.zepto.zm8
    public final void a(int i2, String str, String str2, int i3) {
        i.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.zepto.zm8
    public final void b(int i2) {
        i.d("notifySessionFailed", new Object[0]);
    }

    @Override // com.zepto.zm8
    public final void c(final int i2, final String str) {
        i.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f.a()).execute(new Runnable() { // from class: com.zepto.le8
            @Override // java.lang.Runnable
            public final void run() {
                this.c.j(i2, str);
            }
        });
    }

    @Override // com.zepto.zm8
    public final pc6 d(Map map) {
        i.d("syncPacks()", new Object[0]);
        return fd6.c(new ArrayList());
    }

    @Override // com.zepto.zm8
    public final pc6 e(int i2, String str, String str2, int i3) {
        int i4;
        i.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i2), str, str2, Integer.valueOf(i3));
        rh8 rh8Var = new rh8();
        try {
        } catch (km3 e) {
            i.e("getChunkFileDescriptor failed", e);
            rh8Var.b(e);
        } catch (FileNotFoundException e2) {
            i.e("getChunkFileDescriptor failed", e2);
            rh8Var.b(new km3("Asset Slice file not found.", e2));
        }
        for (File file : m(str)) {
            if (yb8.a(file).equals(str2)) {
                rh8Var.c(ParcelFileDescriptor.open(file, 268435456));
                return rh8Var.a();
            }
        }
        throw new km3(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.zepto.zm8
    public final void f(List list) {
        i.d("cancelDownload(%s)", list);
    }

    @Override // com.zepto.zm8
    public final void g() {
        i.d("keepAlive", new Object[0]);
    }

    public final /* synthetic */ void i(Intent intent) {
        this.b.a(this.d, intent);
    }

    public final /* synthetic */ void j(int i2, String str) {
        try {
            k(i2, str, 4);
        } catch (km3 e) {
            i.e("notifyModuleCompleted failed", e);
        }
    }

    public final Bundle k(int i2, String str, int i3) throws km3 {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.e.a());
        bundle.putInt("session_id", i2);
        File[] fileArrM = m(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long length = 0;
        for (File file : fileArrM) {
            length += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i3 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String strA = yb8.a(file);
            bundle.putParcelableArrayList(v88.b("chunk_intents", str, strA), arrayList2);
            bundle.putString(v88.b("uncompressed_hash_sha256", str, strA), l(file));
            bundle.putLong(v88.b("uncompressed_size", str, strA), file.length());
            arrayList.add(strA);
        }
        bundle.putStringArrayList(v88.a("slice_ids", str), arrayList);
        bundle.putLong(v88.a("pack_version", str), this.e.a());
        bundle.putInt(v88.a("status", str), i3);
        bundle.putInt(v88.a("error_code", str), 0);
        bundle.putLong(v88.a("bytes_downloaded", str), h(i3, length));
        bundle.putLong(v88.a("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", h(i3, length));
        bundle.putLong("total_bytes_to_download", length);
        final Intent intentPutExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.h.post(new Runnable() { // from class: com.zepto.ne8
            @Override // java.lang.Runnable
            public final void run() {
                this.c.i(intentPutExtra);
            }
        });
        return bundle;
    }

    public final File[] m(final String str) throws km3 {
        File file = new File(this.a);
        if (!file.isDirectory()) {
            throw new km3(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.zepto.je8
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new km3(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (fileArrListFiles.length == 0) {
            throw new km3(String.format("No APKs available for pack '%s'.", str));
        }
        for (File file2 : fileArrListFiles) {
            if (yb8.a(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new km3(String.format("No main slice available for pack '%s'.", str));
    }
}
