package com.zepto;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class t78 extends p78 {
    public t78(i88 i88Var, rh8 rh8Var) {
        super(i88Var, rh8Var);
    }

    @Override // com.zepto.p78, com.zepto.pm8
    public final void l(Bundle bundle, Bundle bundle2) {
        super.l(bundle, bundle2);
        this.a.e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
