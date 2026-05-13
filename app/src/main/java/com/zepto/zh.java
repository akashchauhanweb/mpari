package com.zepto;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class zh extends u40 {
    private final cs2 mHttpStack;

    public zh(cs2 cs2Var) {
        this.mHttpStack = cs2Var;
    }

    @Override // com.zepto.u40
    public bs2 executeRequest(ic5 ic5Var, Map<String, String> map) throws sz, IOException {
        try {
            HttpResponse httpResponsePerformRequest = this.mHttpStack.performRequest(ic5Var, map);
            int statusCode = httpResponsePerformRequest.getStatusLine().getStatusCode();
            Header[] allHeaders = httpResponsePerformRequest.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new ml2(header.getName(), header.getValue()));
            }
            if (httpResponsePerformRequest.getEntity() == null) {
                return new bs2(statusCode, arrayList);
            }
            long contentLength = httpResponsePerformRequest.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new bs2(statusCode, arrayList, (int) httpResponsePerformRequest.getEntity().getContentLength(), httpResponsePerformRequest.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
