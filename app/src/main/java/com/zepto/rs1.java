package com.zepto;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface rs1 {
    public static final a b = new a(null);
    public static final rs1 a = new a.C0118a();

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.rs1$a$a, reason: collision with other inner class name */
        public static final class C0118a implements rs1 {
            @Override // com.zepto.rs1
            public List a(String hostname) throws UnknownHostException {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "InetAddress.getAllByName(hostname)");
                    return ArraysKt___ArraysKt.toList(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    List a(String str);
}
