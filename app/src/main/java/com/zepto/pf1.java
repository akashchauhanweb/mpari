package com.zepto;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class pf1 implements wr2 {
    public URLConnection c;

    @Override // com.zepto.wr2
    public String B(String str) {
        return this.c.getHeaderField(str);
    }

    @Override // com.zepto.wr2
    public void P(nw1 nw1Var) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(nw1Var.y()).openConnection();
        this.c = uRLConnectionOpenConnection;
        uRLConnectionOpenConnection.setReadTimeout(nw1Var.t());
        this.c.setConnectTimeout(nw1Var.k());
        this.c.addRequestProperty("Range", String.format(Locale.ENGLISH, "bytes=%d-", Long.valueOf(nw1Var.o())));
        this.c.addRequestProperty("User-Agent", nw1Var.z());
        a(nw1Var);
        this.c.connect();
    }

    public final void a(nw1 nw1Var) {
        HashMap mapQ = nw1Var.q();
        if (mapQ != null) {
            for (Map.Entry entry : mapQ.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.c.addRequestProperty(str, (String) it.next());
                    }
                }
            }
        }
    }

    @Override // com.zepto.wr2
    public void close() {
    }

    @Override // com.zepto.wr2
    public Map d0() {
        return this.c.getHeaderFields();
    }

    @Override // com.zepto.wr2
    public long e0() {
        try {
            return Long.parseLong(this.c.getHeaderField("Content-Length"));
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // com.zepto.wr2
    public InputStream j() {
        URLConnection uRLConnection = this.c;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getErrorStream();
        }
        return null;
    }

    @Override // com.zepto.wr2
    public InputStream m() {
        return this.c.getInputStream();
    }

    @Override // com.zepto.wr2
    public int w() {
        URLConnection uRLConnection = this.c;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    @Override // com.zepto.wr2
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public wr2 m0clone() {
        return new pf1();
    }
}
