package com.zepto;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class f50 implements t34 {
    private static final int DEFAULT_POOL_SIZE = 4096;
    private final u40 mBaseHttpStack;

    @Deprecated
    protected final cs2 mHttpStack;
    protected final n80 mPool;

    @Deprecated
    public f50(cs2 cs2Var) {
        this(cs2Var, new n80(4096));
    }

    @Deprecated
    public static Map<String, String> convertHeaders(ml2[] ml2VarArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < ml2VarArr.length; i++) {
            treeMap.put(ml2VarArr[i].getName(), ml2VarArr[i].getValue());
        }
        return treeMap;
    }

    @Override // com.zepto.t34
    public m44 performRequest(ic5 ic5Var) throws bu7 {
        IOException iOException;
        bs2 bs2Var;
        byte[] bArr;
        bs2 bs2VarExecuteRequest;
        int statusCode;
        List<ml2> headers;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                bs2VarExecuteRequest = this.mBaseHttpStack.executeRequest(ic5Var, xr2.getCacheHeaders(ic5Var.getCacheEntry()));
                try {
                    statusCode = bs2VarExecuteRequest.getStatusCode();
                    headers = bs2VarExecuteRequest.getHeaders();
                    break;
                } catch (IOException e) {
                    bArr = null;
                    bs2Var = bs2VarExecuteRequest;
                    iOException = e;
                }
            } catch (IOException e2) {
                iOException = e2;
                bs2Var = null;
                bArr = null;
            }
            u44.attemptRetryOnException(ic5Var, u44.shouldRetryException(ic5Var, iOException, jElapsedRealtime, bs2Var, bArr));
        }
        if (statusCode == 304) {
            return u44.getNotModifiedNetworkResponse(ic5Var, SystemClock.elapsedRealtime() - jElapsedRealtime, headers);
        }
        InputStream content = bs2VarExecuteRequest.getContent();
        byte[] bArrInputStreamToBytes = content != null ? u44.inputStreamToBytes(content, bs2VarExecuteRequest.getContentLength(), this.mPool) : new byte[0];
        u44.logSlowRequests(SystemClock.elapsedRealtime() - jElapsedRealtime, ic5Var, bArrInputStreamToBytes, statusCode);
        if (statusCode < 200 || statusCode > 299) {
            throw new IOException();
        }
        return new m44(statusCode, bArrInputStreamToBytes, false, SystemClock.elapsedRealtime() - jElapsedRealtime, headers);
    }

    @Deprecated
    public f50(cs2 cs2Var, n80 n80Var) {
        this.mHttpStack = cs2Var;
        this.mBaseHttpStack = new zh(cs2Var);
        this.mPool = n80Var;
    }

    public f50(u40 u40Var) {
        this(u40Var, new n80(4096));
    }

    public f50(u40 u40Var, n80 n80Var) {
        this.mBaseHttpStack = u40Var;
        this.mHttpStack = u40Var;
        this.mPool = n80Var;
    }
}
