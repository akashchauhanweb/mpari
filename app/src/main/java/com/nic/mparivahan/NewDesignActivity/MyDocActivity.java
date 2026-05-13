package com.nic.mparivahan.NewDesignActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.FetchVahanTransactions;
import com.nic.mparivahan.NewDesignActivity.MyDocActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RcSearchHistory;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.l94;
import com.zepto.pq;
import com.zepto.ta3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\b\u0010\n\u001a\u00020\u0002H\u0002R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/nic/mparivahan/NewDesignActivity/MyDocActivity;", "Lcom/zepto/pq;", "", "M1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "message", "G1", "N1", "Lcom/zepto/l94;", "C", "Lcom/zepto/l94;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MyDocActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public l94 binding;

    public static final void H1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void I1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) RcSearchHistory.class);
        intent.putExtra("RC", 1);
        this$0.startActivity(intent);
    }

    public static final void J1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) RcSearchHistory.class);
        intent.putExtra("RC", 1);
        this$0.startActivity(intent);
    }

    public static final void K1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) RcSearchHistory.class);
        intent.putExtra("RC", 2);
        this$0.startActivity(intent);
    }

    public static final void L1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) RcSearchHistory.class);
        intent.putExtra("RC", 2);
        this$0.startActivity(intent);
    }

    private final void M1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void O1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) FetchVahanTransactions.class);
        intent.putExtra("trans_val", VContant.MAINSCREEN);
        this$0.startActivity(intent);
    }

    public static final void P1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) FetchVahanTransactions.class);
        intent.putExtra("trans_val", VContant.APPLICATION_SCREEN);
        this$0.startActivity(intent);
    }

    public static final void Q1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) FetchVahanTransactions.class);
        intent.putExtra("trans_val", "3");
        this$0.startActivity(intent);
    }

    public static final void R1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1("No Record available");
    }

    public static final void S1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1("No Record available");
    }

    public static final void T1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1("No Record available");
    }

    public static final void U1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1("No Record available");
    }

    public static final void V1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1("No Record available");
    }

    public static final void W1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1("No Record available");
    }

    public static final void X1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1("No Record available");
    }

    public static final void Y1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.G1("No Record available");
    }

    public static final void Z1(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void a2(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1();
    }

    public static final void b2(final MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.wz3
            @Override // java.lang.Runnable
            public final void run() {
                MyDocActivity.c2(this.c);
            }
        }, 500L);
    }

    public static final void c2(MyDocActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VirtualRcActivity.class));
    }

    public static final void d2(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VirtualRcActivity.class));
    }

    public static final void e2(final MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Looper looperMyLooper = Looper.myLooper();
        Intrinsics.checkNotNull(looperMyLooper);
        new Handler(looperMyLooper).postDelayed(new Runnable() { // from class: com.zepto.uz3
            @Override // java.lang.Runnable
            public final void run() {
                MyDocActivity.f2(this.c);
            }
        }, 500L);
    }

    public static final void f2(MyDocActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VirtualDlActivity.class));
    }

    public static final void g2(MyDocActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VirtualDlActivity.class));
    }

    public final void G1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.H1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void N1() {
        l94 l94Var = this.binding;
        l94 l94Var2 = null;
        if (l94Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var = null;
        }
        l94Var.M.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.b2(this.a, view);
            }
        });
        l94 l94Var3 = this.binding;
        if (l94Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var3 = null;
        }
        l94Var3.N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.d2(this.a, view);
            }
        });
        l94 l94Var4 = this.binding;
        if (l94Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var4 = null;
        }
        l94Var4.K.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.e2(this.a, view);
            }
        });
        l94 l94Var5 = this.binding;
        if (l94Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var5 = null;
        }
        l94Var5.L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.g2(this.a, view);
            }
        });
        l94 l94Var6 = this.binding;
        if (l94Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var6 = null;
        }
        l94Var6.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.O1(this.a, view);
            }
        });
        l94 l94Var7 = this.binding;
        if (l94Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var7 = null;
        }
        l94Var7.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.P1(this.a, view);
            }
        });
        l94 l94Var8 = this.binding;
        if (l94Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var8 = null;
        }
        l94Var8.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.Q1(this.a, view);
            }
        });
        l94 l94Var9 = this.binding;
        if (l94Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var9 = null;
        }
        l94Var9.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.R1(this.a, view);
            }
        });
        l94 l94Var10 = this.binding;
        if (l94Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var10 = null;
        }
        l94Var10.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.S1(this.a, view);
            }
        });
        l94 l94Var11 = this.binding;
        if (l94Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var11 = null;
        }
        l94Var11.u.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.T1(this.a, view);
            }
        });
        l94 l94Var12 = this.binding;
        if (l94Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var12 = null;
        }
        l94Var12.v.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.U1(this.a, view);
            }
        });
        l94 l94Var13 = this.binding;
        if (l94Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var13 = null;
        }
        l94Var13.s.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.V1(this.a, view);
            }
        });
        l94 l94Var14 = this.binding;
        if (l94Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var14 = null;
        }
        l94Var14.t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.W1(this.a, view);
            }
        });
        l94 l94Var15 = this.binding;
        if (l94Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var15 = null;
        }
        l94Var15.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.X1(this.a, view);
            }
        });
        l94 l94Var16 = this.binding;
        if (l94Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var16 = null;
        }
        l94Var16.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.Y1(this.a, view);
            }
        });
        l94 l94Var17 = this.binding;
        if (l94Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var17 = null;
        }
        l94Var17.I.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.Z1(this.a, view);
            }
        });
        l94 l94Var18 = this.binding;
        if (l94Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            l94Var2 = l94Var18;
        }
        l94Var2.I.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.a2(this.a, view);
            }
        });
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_my_doc_activity);
        l94 l94VarC = l94.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(l94VarC, "inflate(...)");
        this.binding = l94VarC;
        l94 l94Var = null;
        if (l94VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94VarC = null;
        }
        setContentView(l94VarC.b());
        ta3.a aVar = ta3.a;
        l94 l94Var2 = this.binding;
        if (l94Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var2 = null;
        }
        aVar.u1(this, l94Var2);
        try {
            N1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        l94 l94Var3 = this.binding;
        if (l94Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var3 = null;
        }
        l94Var3.D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.I1(this.a, view);
            }
        });
        l94 l94Var4 = this.binding;
        if (l94Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var4 = null;
        }
        l94Var4.C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.J1(this.a, view);
            }
        });
        l94 l94Var5 = this.binding;
        if (l94Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            l94Var5 = null;
        }
        l94Var5.o.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.K1(this.a, view);
            }
        });
        l94 l94Var6 = this.binding;
        if (l94Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            l94Var = l94Var6;
        }
        l94Var.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyDocActivity.L1(this.a, view);
            }
        });
    }
}
