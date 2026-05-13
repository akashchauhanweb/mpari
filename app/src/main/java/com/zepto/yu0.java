package com.zepto;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public abstract class yu0 {

    public class a implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ CompoundButton.OnCheckedChangeListener a;
        public final /* synthetic */ g13 b;

        public a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, g13 g13Var) {
            this.a = onCheckedChangeListener;
            this.b = g13Var;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
            this.b.a();
        }
    }

    public static void a(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }

    public static void b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, g13 g13Var) {
        if (g13Var == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new a(onCheckedChangeListener, g13Var));
        }
    }
}
