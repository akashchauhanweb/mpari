package com.zepto;

import android.os.SystemClock;
import com.zepto.g90;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u44 {
    private static final int SLOW_REQUEST_THRESHOLD_MS = 3000;

    public static class b {
        private final bu7 errorToRetry;
        private final String logPrefix;

        private b(String str, bu7 bu7Var) {
            this.logPrefix = str;
            this.errorToRetry = bu7Var;
        }
    }

    private u44() {
    }

    public static void attemptRetryOnException(ic5 ic5Var, b bVar) throws bu7 {
        be5 retryPolicy = ic5Var.getRetryPolicy();
        int timeoutMs = ic5Var.getTimeoutMs();
        try {
            retryPolicy.retry(bVar.errorToRetry);
            ic5Var.addMarker(String.format("%s-retry [timeout=%s]", bVar.logPrefix, Integer.valueOf(timeoutMs)));
        } catch (bu7 e) {
            ic5Var.addMarker(String.format("%s-timeout-giveup [timeout=%s]", bVar.logPrefix, Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    public static m44 getNotModifiedNetworkResponse(ic5 ic5Var, long j, List<ml2> list) {
        g90.a cacheEntry = ic5Var.getCacheEntry();
        if (cacheEntry == null) {
            return new m44(304, (byte[]) null, true, j, list);
        }
        return new m44(304, cacheEntry.data, true, j, xr2.combineHeaders(list, cacheEntry));
    }

    public static byte[] inputStreamToBytes(InputStream inputStream, int i, n80 n80Var) throws Throwable {
        byte[] buf;
        vs4 vs4Var = new vs4(n80Var, i);
        try {
            buf = n80Var.getBuf(1024);
            while (true) {
                try {
                    int i2 = inputStream.read(buf);
                    if (i2 == -1) {
                        break;
                    }
                    vs4Var.write(buf, 0, i2);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            cu7.v("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    n80Var.returnBuf(buf);
                    vs4Var.close();
                    throw th;
                }
            }
            byte[] byteArray = vs4Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                cu7.v("Error occurred when closing InputStream", new Object[0]);
            }
            n80Var.returnBuf(buf);
            vs4Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            buf = null;
        }
    }

    public static void logSlowRequests(long j, ic5 ic5Var, byte[] bArr, int i) {
        if (cu7.DEBUG || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = ic5Var;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(ic5Var.getRetryPolicy().getCurrentRetryCount());
            cu7.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    public static b shouldRetryException(ic5 ic5Var, IOException iOException, long j, bs2 bs2Var, byte[] bArr) throws bu7 {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new dg6());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + ic5Var.getUrl(), iOException);
        }
        if (bs2Var == null) {
            if (!ic5Var.shouldRetryConnectionErrors()) {
                throw new n94(iOException);
            }
            return new b("connection", new n94());
        }
        int statusCode = bs2Var.getStatusCode();
        cu7.e("Unexpected response code %d for %s", Integer.valueOf(statusCode), ic5Var.getUrl());
        if (bArr == null) {
            return new b("network", new h44());
        }
        m44 m44Var = new m44(statusCode, bArr, false, SystemClock.elapsedRealtime() - j, bs2Var.getHeaders());
        if (statusCode == 401 || statusCode == 403) {
            return new b("auth", new sz(m44Var));
        }
        if (statusCode >= 400 && statusCode <= 499) {
            throw new nq0(m44Var);
        }
        if (statusCode < 500 || statusCode > 599 || !ic5Var.shouldRetryServerErrors()) {
            throw new zy5(m44Var);
        }
        return new b("server", new zy5(m44Var));
    }
}
