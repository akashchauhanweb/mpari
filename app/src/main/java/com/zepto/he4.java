package com.zepto;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class he4 extends ProxySelector {
    public static final he4 a = new he4();

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List select(URI uri) {
        if (uri != null) {
            return CollectionsKt__CollectionsJVMKt.listOf(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
