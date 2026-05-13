package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.zepto.cu0;
import com.zepto.hc2;
import com.zepto.hi1;
import com.zepto.iu0;
import com.zepto.rn6;
import com.zepto.u86;
import com.zepto.uc2;
import com.zepto.ul2;
import com.zepto.ut0;
import com.zepto.vr6;
import com.zepto.wb0;
import com.zepto.we3;
import com.zepto.xc2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(cu0 cu0Var) {
        hc2 hc2Var = (hc2) cu0Var.a(hc2.class);
        wb0.a(cu0Var.a(xc2.class));
        return new FirebaseMessaging(hc2Var, null, cu0Var.g(vr6.class), cu0Var.g(ul2.class), (uc2) cu0Var.a(uc2.class), (rn6) cu0Var.a(rn6.class), (u86) cu0Var.a(u86.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<ut0> getComponents() {
        return Arrays.asList(ut0.e(FirebaseMessaging.class).g(LIBRARY_NAME).b(hi1.j(hc2.class)).b(hi1.g(xc2.class)).b(hi1.h(vr6.class)).b(hi1.h(ul2.class)).b(hi1.g(rn6.class)).b(hi1.j(uc2.class)).b(hi1.j(u86.class)).e(new iu0() { // from class: com.zepto.fd2
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(cu0Var);
            }
        }).c().d(), we3.b(LIBRARY_NAME, "23.4.0"));
    }
}
