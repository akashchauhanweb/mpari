package com.zepto;

import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public class fs2 extends u40 {
    private static final int HTTP_CONTINUE = 100;
    private final SSLSocketFactory mSslSocketFactory;
    private final b mUrlRewriter;

    public static class a extends FilterInputStream {
        private final HttpURLConnection mConnection;

        public a(HttpURLConnection httpURLConnection) {
            super(fs2.inputStreamFromConnection(httpURLConnection));
            this.mConnection = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.mConnection.disconnect();
        }
    }

    public interface b {
    }

    public fs2() {
        this(null);
    }

    private void addBody(HttpURLConnection httpURLConnection, ic5 ic5Var, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey(xr2.HEADER_CONTENT_TYPE)) {
            httpURLConnection.setRequestProperty(xr2.HEADER_CONTENT_TYPE, ic5Var.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(createOutputStream(ic5Var, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private void addBodyIfExists(HttpURLConnection httpURLConnection, ic5 ic5Var) throws sz, IOException {
        byte[] body = ic5Var.getBody();
        if (body != null) {
            addBody(httpURLConnection, ic5Var, body);
        }
    }

    public static List<ml2> convertHeaders(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new ml2(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private static boolean hasResponseBody(int i, int i2) {
        return (i == 4 || (HTTP_CONTINUE <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream inputStreamFromConnection(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection openConnection(URL url, ic5 ic5Var) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnectionCreateConnection = createConnection(url);
        int timeoutMs = ic5Var.getTimeoutMs();
        httpURLConnectionCreateConnection.setConnectTimeout(timeoutMs);
        httpURLConnectionCreateConnection.setReadTimeout(timeoutMs);
        httpURLConnectionCreateConnection.setUseCaches(false);
        httpURLConnectionCreateConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.mSslSocketFactory) != null) {
            ((HttpsURLConnection) httpURLConnectionCreateConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnectionCreateConnection;
    }

    public HttpURLConnection createConnection(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    public InputStream createInputStream(ic5 ic5Var, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    public OutputStream createOutputStream(ic5 ic5Var, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.zepto.u40
    public bs2 executeRequest(ic5 ic5Var, Map<String, String> map) throws sz, IOException {
        String url = ic5Var.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(ic5Var.getHeaders());
        HttpURLConnection httpURLConnectionOpenConnection = openConnection(new URL(url), ic5Var);
        try {
            for (String str : map2.keySet()) {
                httpURLConnectionOpenConnection.setRequestProperty(str, (String) map2.get(str));
            }
            setConnectionParametersForRequest(httpURLConnectionOpenConnection, ic5Var);
            int responseCode = httpURLConnectionOpenConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (hasResponseBody(ic5Var.getMethod(), responseCode)) {
                return new bs2(responseCode, convertHeaders(httpURLConnectionOpenConnection.getHeaderFields()), httpURLConnectionOpenConnection.getContentLength(), createInputStream(ic5Var, httpURLConnectionOpenConnection));
            }
            bs2 bs2Var = new bs2(responseCode, convertHeaders(httpURLConnectionOpenConnection.getHeaderFields()));
            httpURLConnectionOpenConnection.disconnect();
            return bs2Var;
        } catch (Throwable th) {
            if (0 == 0) {
                httpURLConnectionOpenConnection.disconnect();
            }
            throw th;
        }
    }

    public void setConnectionParametersForRequest(HttpURLConnection httpURLConnection, ic5 ic5Var) throws sz, IOException {
        switch (ic5Var.getMethod()) {
            case -1:
                byte[] postBody = ic5Var.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    addBody(httpURLConnection, ic5Var, postBody);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                addBodyIfExists(httpURLConnection, ic5Var);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                addBodyIfExists(httpURLConnection, ic5Var);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                addBodyIfExists(httpURLConnection, ic5Var);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public fs2(b bVar) {
        this(bVar, null);
    }

    public fs2(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.mSslSocketFactory = sSLSocketFactory;
    }
}
