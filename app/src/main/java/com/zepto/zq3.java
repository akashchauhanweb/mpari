package com.zepto;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class zq3<S> extends gs4 {
    public int e0;
    public com.google.android.material.datepicker.a f0;

    public class a extends bh4 {
        public a() {
        }
    }

    public static zq3 X1(yd1 yd1Var, int i, com.google.android.material.datepicker.a aVar) {
        zq3 zq3Var = new zq3();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", yd1Var);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        zq3Var.L1(bundle);
        return zq3Var;
    }

    @Override // com.zepto.sf2
    public void C0(Bundle bundle) {
        super.C0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.e0 = bundle.getInt("THEME_RES_ID_KEY");
        wb0.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // com.zepto.sf2
    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(v(), this.e0));
        new a();
        throw null;
    }

    @Override // com.zepto.sf2
    public void Y0(Bundle bundle) {
        super.Y0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f0);
    }
}
