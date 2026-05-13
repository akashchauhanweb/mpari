package com.zepto;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface g90 {

    public static class a {
        public List<ml2> allResponseHeaders;
        public byte[] data;
        public String etag;
        public long lastModified;
        public Map<String, String> responseHeaders = Collections.emptyMap();
        public long serverDate;
        public long softTtl;
        public long ttl;

        public boolean isExpired(long j) {
            return this.ttl < j;
        }

        public boolean refreshNeeded(long j) {
            return this.softTtl < j;
        }

        public boolean isExpired() {
            return isExpired(System.currentTimeMillis());
        }

        public boolean refreshNeeded() {
            return refreshNeeded(System.currentTimeMillis());
        }
    }

    void clear();

    a get(String str);

    void initialize();

    void invalidate(String str, boolean z);

    void put(String str, a aVar);

    void remove(String str);
}
