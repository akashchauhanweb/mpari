package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.zepto.ut0;
import com.zepto.we3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonLegacyRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lcom/zepto/ut0;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common-ktx"}, k = 1, mv = {1, 7, 1})
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ut0> getComponents() {
        return CollectionsKt__CollectionsJVMKt.listOf(we3.b("fire-core-ktx", "20.4.2"));
    }
}
