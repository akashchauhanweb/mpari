package com.zepto;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bs2 {
    private final InputStream mContent;
    private final byte[] mContentBytes;
    private final int mContentLength;
    private final List<ml2> mHeaders;
    private final int mStatusCode;

    public bs2(int i, List<ml2> list) {
        this(i, list, -1, null);
    }

    public final InputStream getContent() {
        InputStream inputStream = this.mContent;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.mContentBytes != null) {
            return new ByteArrayInputStream(this.mContentBytes);
        }
        return null;
    }

    public final byte[] getContentBytes() {
        return this.mContentBytes;
    }

    public final int getContentLength() {
        return this.mContentLength;
    }

    public final List<ml2> getHeaders() {
        return Collections.unmodifiableList(this.mHeaders);
    }

    public final int getStatusCode() {
        return this.mStatusCode;
    }

    public bs2(int i, List<ml2> list, int i2, InputStream inputStream) {
        this.mStatusCode = i;
        this.mHeaders = list;
        this.mContentLength = i2;
        this.mContent = inputStream;
        this.mContentBytes = null;
    }

    public bs2(int i, List<ml2> list, byte[] bArr) {
        this.mStatusCode = i;
        this.mHeaders = list;
        this.mContentLength = bArr.length;
        this.mContentBytes = bArr;
        this.mContent = null;
    }
}
