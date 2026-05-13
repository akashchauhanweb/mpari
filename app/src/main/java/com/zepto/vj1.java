package com.zepto;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 {
    public static final vj1 a = new vj1();

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ wd5 a;
        public final /* synthetic */ androidx.appcompat.app.a b;

        public a(wd5 wd5Var, androidx.appcompat.app.a aVar) {
            this.a = wd5Var;
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.a(qx2.CAMERA);
            this.b.dismiss();
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ wd5 a;
        public final /* synthetic */ androidx.appcompat.app.a b;

        public b(wd5 wd5Var, androidx.appcompat.app.a aVar) {
            this.a = wd5Var;
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.a(qx2.GALLERY);
            this.b.dismiss();
        }
    }

    public static final class c implements DialogInterface.OnCancelListener {
        public final /* synthetic */ wd5 a;

        public c(wd5 wd5Var) {
            this.a = wd5Var;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            this.a.a(null);
        }
    }

    public static final class d implements DialogInterface.OnClickListener {
        public final /* synthetic */ wd5 a;

        public d(wd5 wd5Var) {
            this.a = wd5Var;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.a.a(null);
        }
    }

    public static final class e implements DialogInterface.OnDismissListener {
        public e(ik1 ik1Var) {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public final void a(Context context, wd5 listener, ik1 ik1Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        View viewInflate = LayoutInflater.from(context).inflate(o05.a, (ViewGroup) null);
        androidx.appcompat.app.a aVarQ = new a.C0001a(context).n(y05.j).p(viewInflate).i(new c(listener)).g(y05.a, new d(listener)).j(new e(ik1Var)).q();
        viewInflate.findViewById(yz4.a).setOnClickListener(new a(listener, aVarQ));
        viewInflate.findViewById(yz4.b).setOnClickListener(new b(listener, aVarQ));
    }
}
