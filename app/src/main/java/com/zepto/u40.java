package com.zepto;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* JADX INFO: loaded from: classes.dex */
public abstract class u40 implements cs2 {
    public abstract bs2 executeRequest(ic5 ic5Var, Map<String, String> map) throws sz, IOException;

    @Override // com.zepto.cs2
    @Deprecated
    public final HttpResponse performRequest(ic5 ic5Var, Map<String, String> map) throws sz, IOException {
        bs2 bs2VarExecuteRequest = executeRequest(ic5Var, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), bs2VarExecuteRequest.getStatusCode(), ""));
        ArrayList arrayList = new ArrayList();
        for (ml2 ml2Var : bs2VarExecuteRequest.getHeaders()) {
            arrayList.add(new BasicHeader(ml2Var.getName(), ml2Var.getValue()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[0]));
        InputStream content = bs2VarExecuteRequest.getContent();
        if (content != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(content);
            basicHttpEntity.setContentLength(bs2VarExecuteRequest.getContentLength());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
