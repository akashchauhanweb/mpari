package com.zepto;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s98 {
    public static final z68 c = new z68("AssetPackStorage");
    public static final long d;
    public static final long e;
    public final Context a;
    public final xf8 b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        d = timeUnit.toMillis(14L);
        e = timeUnit.toMillis(28L);
    }

    public s98(Context context, xf8 xf8Var) {
        this.a = context;
        this.b = xf8Var;
    }

    public static long g(File file, boolean z) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            c.e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e2) {
            c.c(e2, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static void n(File file) {
        if (file.listFiles() == null || file.listFiles().length <= 1) {
            return;
        }
        long jG = g(file, false);
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals(String.valueOf(jG)) && !file2.getName().equals("stale.tmp")) {
                o(file2);
            }
        }
    }

    public static boolean o(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zO = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zO &= o(file2);
            }
        }
        if (file.delete()) {
            return zO;
        }
        return false;
    }

    public final File A(String str, int i, long j, String str2) {
        return new File(B(str, i, j, str2), "checkpoint.dat");
    }

    public final File B(String str, int i, long j, String str2) {
        return new File(y(str, i, j), str2);
    }

    public final File C(String str, int i, long j, String str2) {
        return new File(new File(new File(j(str, i, j), "_slices"), "_unverified"), str2);
    }

    public final File D(String str, int i, long j, String str2) {
        return new File(new File(new File(j(str, i, j), "_slices"), "_verified"), str2);
    }

    public final String E(String str) {
        int length;
        File file = new File(k(), str);
        if (!file.exists()) {
            c.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.b.a()));
        if (!file2.exists()) {
            c.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.b.a()));
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            c.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.b.a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        c.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.b.a()));
        return null;
    }

    public final Map F() {
        HashMap map = new HashMap();
        Iterator it = m().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int iG = (int) g(h(name), true);
            long jG = g(t(name, iG), true);
            if (u(name, iG, jG).exists()) {
                map.put(name, Long.valueOf(jG));
            }
        }
        return map;
    }

    public final Map G() {
        HashMap map = new HashMap();
        for (String str : H().keySet()) {
            map.put(str, Long.valueOf(r(str)));
        }
        return map;
    }

    public final Map H() {
        HashMap map = new HashMap();
        try {
            for (File file : m()) {
                cy cyVarS = s(file.getName());
                if (cyVarS != null) {
                    map.put(file.getName(), cyVarS);
                }
            }
        } catch (IOException e2) {
            c.b("Could not process directory while scanning installed packs: %s", e2);
        }
        return map;
    }

    public final void I() {
        for (File file : m()) {
            if (file.listFiles() != null) {
                n(file);
                long jG = g(file, false);
                if (this.b.a() != jG) {
                    try {
                        new File(new File(file, String.valueOf(jG)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        c.b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File file2 : file.listFiles()) {
                    n(file2);
                }
            }
        }
    }

    public final void J() {
        o(k());
    }

    public final void a(String str, int i, long j, int i2) throws IOException {
        File fileI = i(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        fileI.getParentFile().mkdirs();
        fileI.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileI);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final void b(String str, int i, long j) {
        File fileH = h(str);
        if (fileH.exists()) {
            for (File file : fileH.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    o(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            o(file2);
                        }
                    }
                }
            }
        }
    }

    public final void c(List list) {
        int iA = this.b.a();
        for (File file : m()) {
            if (!list.contains(file.getName()) && g(file, true) != iA) {
                o(file);
            }
        }
    }

    public final boolean d(String str, int i, long j) {
        if (j(str, i, j).exists()) {
            return o(j(str, i, j));
        }
        return true;
    }

    public final boolean e(String str, int i, long j) {
        if (u(str, i, j).exists()) {
            return o(u(str, i, j));
        }
        return true;
    }

    public final boolean f(String str) {
        return E(str) != null;
    }

    public final File h(String str) {
        return new File(k(), str);
    }

    public final File i(String str, int i, long j) {
        return new File(w(str, i, j), "merge.tmp");
    }

    public final File j(String str, int i, long j) {
        return new File(new File(new File(l(), str), String.valueOf(i)), String.valueOf(j));
    }

    public final File k() {
        return new File(this.a.getFilesDir(), "assetpacks");
    }

    public final File l() {
        return new File(k(), "_tmp");
    }

    public final List m() {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (IOException e2) {
            c.b("Could not process directory while scanning installed packs. %s", e2);
        }
        if (k().exists() && k().listFiles() != null) {
            for (File file : k().listFiles()) {
                if (!file.getCanonicalPath().equals(l().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public final int p(String str) {
        return (int) g(h(str), true);
    }

    public final int q(String str, int i, long j) throws IOException {
        File fileI = i(str, i, j);
        if (!fileI.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileI);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new bc8("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e2) {
                throw new bc8("Merge checkpoint file corrupt.", e2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final long r(String str) {
        return g(t(str, (int) g(h(str), true)), true);
    }

    public final cy s(String str) {
        String strE = E(str);
        if (strE == null) {
            return null;
        }
        File file = new File(strE, "assets");
        if (file.isDirectory()) {
            return new x98(0, strE, file.getCanonicalPath());
        }
        c.b("Failed to find assets directory: %s", file);
        return null;
    }

    public final File t(String str, int i) {
        return new File(h(str), String.valueOf(i));
    }

    public final File u(String str, int i, long j) {
        return new File(t(str, i), String.valueOf(j));
    }

    public final File v(String str, int i, long j) {
        return new File(u(str, i, j), "_metadata");
    }

    public final File w(String str, int i, long j) {
        return new File(j(str, i, j), "_packs");
    }

    public final File x(String str, int i, long j) {
        return new File(v(str, i, j), "properties.dat");
    }

    public final File y(String str, int i, long j) {
        return new File(new File(j(str, i, j), "_slices"), "_metadata");
    }

    public final File z(String str, int i, long j, String str2) {
        return new File(B(str, i, j, str2), "checkpoint_ext.dat");
    }
}
