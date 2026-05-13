package com.zepto;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class a32 extends DialogFragment {
    public Dialog a;
    public DialogInterface.OnCancelListener b;
    public Dialog c;

    public static a32 a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        a32 a32Var = new a32();
        Dialog dialog2 = (Dialog) iu4.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        a32Var.a = dialog2;
        if (onCancelListener != null) {
            a32Var.b = onCancelListener;
        }
        return a32Var;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.c == null) {
            this.c = new AlertDialog.Builder((Context) iu4.i(getActivity())).create();
        }
        return this.c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
