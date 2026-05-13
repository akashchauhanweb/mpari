package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.zepto.cu0;
import com.zepto.hi1;
import com.zepto.iu0;
import com.zepto.rn6;
import com.zepto.ut0;
import com.zepto.we3;
import com.zepto.xn6;
import com.zepto.z80;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ rn6 lambda$getComponents$0(cu0 cu0Var) {
        xn6.f((Context) cu0Var.a(Context.class));
        return xn6.c().g(z80.h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ut0> getComponents() {
        return Arrays.asList(ut0.e(rn6.class).g(LIBRARY_NAME).b(hi1.j(Context.class)).e(new iu0() { // from class: com.zepto.wn6
            @Override // com.zepto.iu0
            public final Object a(cu0 cu0Var) {
                return TransportRegistrar.lambda$getComponents$0(cu0Var);
            }
        }).d(), we3.b(LIBRARY_NAME, "18.1.7"));
    }
}
