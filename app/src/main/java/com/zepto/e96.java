package com.zepto;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class e96 extends sj1 {
    public Dialog t0;
    public DialogInterface.OnCancelListener u0;
    public Dialog v0;

    public static e96 l2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        e96 e96Var = new e96();
        Dialog dialog2 = (Dialog) iu4.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        e96Var.t0 = dialog2;
        if (onCancelListener != null) {
            e96Var.u0 = onCancelListener;
        }
        return e96Var;
    }

    @Override // com.zepto.sj1
    public Dialog d2(Bundle bundle) {
        Dialog dialog = this.t0;
        if (dialog != null) {
            return dialog;
        }
        i2(false);
        if (this.v0 == null) {
            this.v0 = new AlertDialog.Builder((Context) iu4.i(v())).create();
        }
        return this.v0;
    }

    @Override // com.zepto.sj1
    public void k2(mg2 mg2Var, String str) {
        super.k2(mg2Var, str);
    }

    @Override // com.zepto.sj1, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.u0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
