package com.zepto;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.zepto.cu7;
import com.zepto.g90;
import com.zepto.id5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public abstract class ic5 implements Comparable {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private g90.a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private id5.a mErrorListener;
    private final cu7.a mEventLog;
    private final Object mLock;
    private final int mMethod;
    private b mRequestCompleteListener;
    private tc5 mRequestQueue;
    private boolean mResponseDelivered;
    private be5 mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public class a implements Runnable {
        final /* synthetic */ String val$tag;
        final /* synthetic */ long val$threadId;

        public a(String str, long j) {
            this.val$tag = str;
            this.val$threadId = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ic5.this.mEventLog.add(this.val$tag, this.val$threadId);
            ic5.this.mEventLog.finish(ic5.this.toString());
        }
    }

    public interface b {
        void onNoUsableResponseReceived(ic5 ic5Var);

        void onResponseReceived(ic5 ic5Var, id5 id5Var);
    }

    public enum c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public ic5(String str, id5.a aVar) {
        this(-1, str, aVar);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append(Typography.amp);
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void addMarker(String str) {
        if (cu7.a.ENABLED) {
            this.mEventLog.add(str, Thread.currentThread().getId());
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    public void deliverError(bu7 bu7Var) {
        id5.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        if (aVar != null) {
            aVar.onErrorResponse(bu7Var);
        }
    }

    public abstract void deliverResponse(Object obj);

    public void finish(String str) {
        tc5 tc5Var = this.mRequestQueue;
        if (tc5Var != null) {
            tc5Var.finish(this);
        }
        if (cu7.a.ENABLED) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id));
            } else {
                this.mEventLog.add(str, id);
                this.mEventLog.finish(toString());
            }
        }
    }

    public byte[] getBody() throws sz {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public g90.a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    public id5.a getErrorListener() {
        id5.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        return aVar;
    }

    public Map<String, String> getHeaders() throws sz {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.mMethod;
    }

    public Map<String, String> getParams() throws sz {
        return null;
    }

    public String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    @Deprecated
    public byte[] getPostBody() throws sz {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    public Map<String, String> getPostParams() throws sz {
        return getParams();
    }

    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public c getPriority() {
        return c.NORMAL;
    }

    public be5 getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().getCurrentTimeout();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            bVar.onNoUsableResponseReceived(this);
        }
    }

    public void notifyListenerResponseReceived(id5 id5Var) {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            bVar.onResponseReceived(this, id5Var);
        }
    }

    public bu7 parseNetworkError(bu7 bu7Var) {
        return bu7Var;
    }

    public abstract id5 parseNetworkResponse(m44 m44Var);

    public void sendEvent(int i) {
        tc5 tc5Var = this.mRequestQueue;
        if (tc5Var != null) {
            tc5Var.sendRequestEvent(this, i);
        }
    }

    public ic5 setCacheEntry(g90.a aVar) {
        this.mCacheEntry = aVar;
        return this;
    }

    public void setNetworkRequestCompleteListener(b bVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = bVar;
        }
    }

    public ic5 setRequestQueue(tc5 tc5Var) {
        this.mRequestQueue = tc5Var;
        return this;
    }

    public ic5 setRetryPolicy(be5 be5Var) {
        this.mRetryPolicy = be5Var;
        return this;
    }

    public final ic5 setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    public final ic5 setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    public final ic5 setShouldRetryConnectionErrors(boolean z) {
        this.mShouldRetryConnectionErrors = z;
        return this;
    }

    public final ic5 setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    public ic5 setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "[X] " : "[ ] ");
        sb.append(getUrl());
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(getPriority());
        sb.append(" ");
        sb.append(this.mSequence);
        return sb.toString();
    }

    public ic5(int i, String str, id5.a aVar) {
        this.mEventLog = cu7.a.ENABLED ? new cu7.a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mErrorListener = aVar;
        setRetryPolicy(new tf1());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(ic5 ic5Var) {
        c priority = getPriority();
        c priority2 = ic5Var.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - ic5Var.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }
}
