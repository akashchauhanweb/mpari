package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.zepto.e31;
import com.zepto.pn6;
import com.zepto.r30;
import com.zepto.sb0;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements r30 {
    @Override // com.zepto.r30
    public pn6 create(e31 e31Var) {
        return new sb0(e31Var.b(), e31Var.e(), e31Var.d());
    }
}
