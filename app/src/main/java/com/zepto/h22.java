package com.zepto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.zepto.cp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class h22 implements SharedPreferences {
    public final SharedPreferences a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final String c;
    public final String d;
    public final rl e;
    public final wi1 f;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b implements SharedPreferences.Editor {
        public final h22 a;
        public final SharedPreferences.Editor b;
        public final AtomicBoolean d = new AtomicBoolean(false);
        public final List c = new CopyOnWriteArrayList();

        public b(h22 h22Var, SharedPreferences.Editor editor) {
            this.a = h22Var;
            this.b = editor;
        }

        public final void a() {
            if (this.d.getAndSet(false)) {
                for (String str : this.a.getAll().keySet()) {
                    if (!this.c.contains(str) && !this.a.g(str)) {
                        this.b.remove(this.a.d(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.b.apply();
            b();
            this.c.clear();
        }

        public final void b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.a.b) {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.a, (String) it.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            if (this.a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair pairE = this.a.e(str, bArr);
                this.b.putString((String) pairE.first, (String) pairE.second);
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.b.commit();
            } finally {
                b();
                this.c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(c.BOOLEAN.c());
            byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.FLOAT.c());
            byteBufferAllocate.putFloat(f);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(c.INT.c());
            byteBufferAllocate.putInt(i);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(c.LONG.c());
            byteBufferAllocate.putLong(j);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(c.STRING.c());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new qx();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(c.STRING_SET.c());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.a.g(str)) {
                this.b.remove(this.a.d(str));
                this.c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        public final int c;

        c(int i) {
            this.c = i;
        }

        public static c b(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int c() {
            return this.c;
        }
    }

    public enum d {
        AES256_SIV("AES256_SIV");

        public final String c;

        d(String str) {
            this.c = str;
        }

        public r63 b() {
            return t63.a(this.c);
        }
    }

    public enum e {
        AES256_GCM("AES256_GCM");

        public final String c;

        e(String str) {
            this.c = str;
        }

        public r63 b() {
            return t63.a(this.c);
        }
    }

    public h22(String str, String str2, SharedPreferences sharedPreferences, rl rlVar, wi1 wi1Var) {
        this.c = str;
        this.a = sharedPreferences;
        this.d = str2;
        this.e = rlVar;
        this.f = wi1Var;
    }

    public static SharedPreferences a(Context context, String str, bq3 bq3Var, d dVar, e eVar) {
        return b(str, bq3Var.a(), context, dVar, eVar);
    }

    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        xi1.a();
        sl.b();
        Context applicationContext = context.getApplicationContext();
        b73 b73VarD = new cp.b().l(dVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().d();
        b73 b73VarD2 = new cp.b().l(eVar.b()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().d();
        return new h22(str, str2, applicationContext.getSharedPreferences(str, 0), (rl) b73VarD2.k(rl.class), (wi1) b73VarD.k(wi1.class));
    }

    public String c(String str) {
        try {
            String str2 = new String(this.f.b(b40.a(str, 0), this.c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt key. " + e2.getMessage(), e2);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    public String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return b40.d(this.f.a(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    public Pair e(String str, byte[] bArr) {
        String strD = d(str);
        return new Pair(strD, b40.d(this.e.a(bArr, strD.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.a.edit());
    }

    public final Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strD = d(str);
            String string = this.a.getString(strD, null);
            if (string == null) {
                return null;
            }
            byte[] bArrA = b40.a(string, 0);
            rl rlVar = this.e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(rlVar.b(bArrA, strD.getBytes(charset)));
            byteBufferWrap.position(0);
            int i = byteBufferWrap.getInt();
            c cVarB = c.b(i);
            if (cVarB == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
            }
            switch (a.a[cVarB.ordinal()]) {
                case 1:
                    int i2 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i2);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (string2.equals("__NULL__")) {
                        return null;
                    }
                    return string2;
                case 2:
                    return Integer.valueOf(byteBufferWrap.getInt());
                case 3:
                    return Long.valueOf(byteBufferWrap.getLong());
                case 4:
                    return Float.valueOf(byteBufferWrap.getFloat());
                case 5:
                    return Boolean.valueOf(byteBufferWrap.get() != 0);
                case 6:
                    qx qxVar = new qx();
                    while (byteBufferWrap.hasRemaining()) {
                        int i3 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i3);
                        byteBufferWrap.position(byteBufferWrap.position() + i3);
                        qxVar.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (qxVar.size() == 1 && "__NULL__".equals(qxVar.B(0))) {
                        return null;
                    }
                    return qxVar;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + cVarB);
            }
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt value. " + e2.getMessage(), e2);
        }
    }

    public boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String strC = c(entry.getKey());
                map.put(strC, f(strC));
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object objF = f(str);
        return objF instanceof Boolean ? ((Boolean) objF).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object objF = f(str);
        return objF instanceof Float ? ((Float) objF).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object objF = f(str);
        return objF instanceof Integer ? ((Integer) objF).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object objF = f(str);
        return objF instanceof Long ? ((Long) objF).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object objF = f(str);
        return objF instanceof String ? (String) objF : str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object objF = f(str);
        Set qxVar = objF instanceof Set ? (Set) objF : new qx();
        return qxVar.size() > 0 ? qxVar : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
