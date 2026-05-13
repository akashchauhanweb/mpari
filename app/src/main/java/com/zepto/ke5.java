package com.zepto;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ke5 {
    public static final ke5 a = new ke5();

    public static final String a(String hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
