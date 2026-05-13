package com.zepto;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public class k06 extends i06 {

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (k06.this.e.isEmpty()) {
                return;
            }
            outline.setPath(k06.this.e);
        }
    }

    public k06(View view) {
        k(view);
    }

    private void k(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // com.zepto.i06
    public void b(View view) {
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.zepto.i06
    public boolean i() {
        return this.a;
    }
}
