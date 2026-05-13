package com.zepto;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ou0 {
    public static final ou0 a = new ou0() { // from class: com.zepto.nu0
        @Override // com.zepto.ou0
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
