package com.zepto;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* JADX INFO: loaded from: classes.dex */
public final class cp {
    public static final Object d = new Object();
    public static final String e = "cp";
    public final f73 a;
    public final rl b;
    public d73 c;

    public static final class b {
        public Context a = null;
        public String b = null;
        public String c = null;
        public String d = null;
        public rl e = null;
        public boolean f = true;
        public r63 g = null;
        public d73 h;

        public static byte[] h(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return bm2.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public synchronized cp f() {
            cp cpVar;
            try {
                if (this.b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (cp.d) {
                    try {
                        byte[] bArrH = h(this.a, this.b, this.c);
                        if (bArrH == null) {
                            if (this.d != null) {
                                this.e = k();
                            }
                            this.h = g();
                        } else if (this.d == null || !cp.e()) {
                            this.h = i(bArrH);
                        } else {
                            this.h = j(bArrH);
                        }
                        cpVar = new cp(this);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return cpVar;
        }

        public final d73 g() throws GeneralSecurityException {
            if (this.g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            d73 d73VarA = d73.i().a(this.g);
            d73 d73VarH = d73VarA.h(d73VarA.d().i().Z(0).Z());
            r06 r06Var = new r06(this.a, this.b, this.c);
            if (this.e != null) {
                d73VarH.d().r(r06Var, this.e);
            } else {
                mq0.b(d73VarH.d(), r06Var);
            }
            return d73VarH;
        }

        public final d73 i(byte[] bArr) {
            return d73.j(mq0.a(u50.b(bArr)));
        }

        public final d73 j(byte[] bArr) {
            try {
                this.e = new ep().a(this.d);
                try {
                    return d73.j(b73.n(u50.b(bArr), this.e));
                } catch (IOException | GeneralSecurityException e) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                try {
                    d73 d73VarI = i(bArr);
                    Log.w(cp.e, "cannot use Android Keystore, it'll be disabled", e2);
                    return d73VarI;
                } catch (IOException unused2) {
                    throw e2;
                }
            }
        }

        public final rl k() throws KeyStoreException {
            if (!cp.e()) {
                Log.w(cp.e, "Android Keystore requires at least Android M");
                return null;
            }
            ep epVar = new ep();
            try {
                boolean zD = ep.d(this.d);
                try {
                    return epVar.a(this.d);
                } catch (GeneralSecurityException | ProviderException e) {
                    if (!zD) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.d), e);
                    }
                    Log.w(cp.e, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                Log.w(cp.e, "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
        }

        public b l(r63 r63Var) {
            this.g = r63Var;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.a = context;
            this.b = str;
            this.c = str2;
            return this;
        }
    }

    public static boolean e() {
        return true;
    }

    public synchronized b73 d() {
        return this.c.d();
    }

    public cp(b bVar) {
        this.a = new r06(bVar.a, bVar.b, bVar.c);
        this.b = bVar.e;
        this.c = bVar.h;
    }
}
