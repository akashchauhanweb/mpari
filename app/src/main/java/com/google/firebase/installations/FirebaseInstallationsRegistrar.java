package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.zepto.c70;
import com.zepto.cu0;
import com.zepto.hc2;
import com.zepto.hi1;
import com.zepto.iu0;
import com.zepto.ky4;
import com.zepto.nc2;
import com.zepto.sl2;
import com.zepto.tc2;
import com.zepto.tl2;
import com.zepto.uc2;
import com.zepto.ut0;
import com.zepto.v30;
import com.zepto.we3;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ uc2 lambda$getComponents$0(cu0 cu0Var) {
        return new tc2((hc2) cu0Var.a(hc2.class), cu0Var.g(tl2.class), (ExecutorService) cu0Var.f(ky4.a(v30.class, ExecutorService.class)), nc2.a((Executor) cu0Var.f(ky4.a(c70.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ut0> getComponents() {
        return Arrays.asList(ut0.e(uc2.class).g(LIBRARY_NAME).b(hi1.j(hc2.class)).b(hi1.h(tl2.class)).b(hi1.i(ky4.a(v30.class, ExecutorService.class))).b(hi1.i(ky4.a(c70.class, Executor.class))).e(new iu0() { // from class: com.zepto.wc2
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(cu0Var);
            }
        }).d(), sl2.a(), we3.b(LIBRARY_NAME, "17.2.0"));
    }
}
