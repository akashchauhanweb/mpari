package com.zepto;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.zepto.f44;
import com.zepto.in3;
import com.zepto.kn3;
import com.zepto.rq0;
import com.zepto.sb0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class sb0 implements pn6 {
    public final nd1 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final uq0 e;
    public final uq0 f;
    public final int g;

    public static final class a {
        public final URL a;
        public final h50 b;
        public final String c;

        public a(URL url, h50 h50Var, String str) {
            this.a = url;
            this.b = h50Var;
            this.c = str;
        }

        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public sb0(Context context, uq0 uq0Var, uq0 uq0Var2, int i) {
        this.a = h50.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = n(z80.c);
        this.e = uq0Var2;
        this.f = uq0Var;
        this.g = i;
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return f44.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return f44.b.COMBINED.b();
        }
        if (f44.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? f44.c.NONE.b() : networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            yn3.c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        yn3.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    public static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // com.zepto.pn6
    public u42 a(u42 u42Var) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return u42Var.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.c).getSimOperator()).c("application_build", Integer.toString(h(this.c))).d();
    }

    @Override // com.zepto.pn6
    public u30 b(t30 t30Var) {
        h50 h50VarI = i(t30Var);
        URL urlN = this.d;
        if (t30Var.c() != null) {
            try {
                z80 z80VarC = z80.c(t30Var.c());
                strD = z80VarC.d() != null ? z80VarC.d() : null;
                if (z80VarC.e() != null) {
                    urlN = n(z80VarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return u30.a();
            }
        }
        try {
            b bVar = (b) zd5.a(5, new a(urlN, h50VarI, strD), new vh2() { // from class: com.zepto.qb0
                @Override // com.zepto.vh2
                public final Object a(Object obj) {
                    return this.a.e((sb0.a) obj);
                }
            }, new ce5() { // from class: com.zepto.rb0
                @Override // com.zepto.ce5
                public final Object a(Object obj, Object obj2) {
                    return sb0.l((sb0.a) obj, (sb0.b) obj2);
                }
            });
            int i = bVar.a;
            if (i == 200) {
                return u30.e(bVar.c);
            }
            if (i < 500 && i != 404) {
                return i == 400 ? u30.d() : u30.a();
            }
            return u30.f();
        } catch (IOException e) {
            yn3.c("CctTransportBackend", "Could not make request to the backend", e);
            return u30.f();
        }
    }

    public final b e(a aVar) throws IOException {
        yn3.e("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(xr2.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    yn3.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    yn3.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(xr2.HEADER_CONTENT_TYPE));
                    yn3.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, ln3.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (e22 e) {
            e = e;
            yn3.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            yn3.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            yn3.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            yn3.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final h50 i(t30 t30Var) {
        in3.a aVarJ;
        HashMap map = new HashMap();
        for (u42 u42Var : t30Var.b()) {
            String strJ = u42Var.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(u42Var);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(u42Var);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            u42 u42Var2 = (u42) ((List) entry.getValue()).get(0);
            kn3.a aVarB = kn3.a().f(jy4.DEFAULT).g(this.f.a()).h(this.e.a()).b(rq0.a().c(rq0.b.ANDROID_FIREBASE).b(zo.a().m(Integer.valueOf(u42Var2.g("sdk-version"))).j(u42Var2.b("model")).f(u42Var2.b("hardware")).d(u42Var2.b("device")).l(u42Var2.b("product")).k(u42Var2.b("os-uild")).h(u42Var2.b("manufacturer")).e(u42Var2.b("fingerprint")).c(u42Var2.b("country")).g(u42Var2.b("locale")).i(u42Var2.b("mcc_mnc")).b(u42Var2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (u42 u42Var3 : (List) entry.getValue()) {
                x12 x12VarE = u42Var3.e();
                c22 c22VarB = x12VarE.b();
                if (c22VarB.equals(c22.b("proto"))) {
                    aVarJ = in3.j(x12VarE.a());
                } else if (c22VarB.equals(c22.b("json"))) {
                    aVarJ = in3.i(new String(x12VarE.a(), Charset.forName("UTF-8")));
                } else {
                    yn3.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", c22VarB);
                }
                aVarJ.c(u42Var3.f()).d(u42Var3.k()).h(u42Var3.h("tz-offset")).e(f44.a().c(f44.c.a(u42Var3.g("net-type"))).b(f44.b.a(u42Var3.g("mobile-subtype"))).a());
                if (u42Var3.d() != null) {
                    aVarJ.b(u42Var3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return h50.a(arrayList2);
    }

    public sb0(Context context, uq0 uq0Var, uq0 uq0Var2) {
        this(context, uq0Var, uq0Var2, 130000);
    }
}
