package com.nic.mparivahan.Citizen.Activities;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.nic.mparivahan.Citizen.Activities.MainActivity;
import com.nic.mparivahan.R;
import com.zepto.b4;
import com.zepto.dh2;
import com.zepto.jj6;
import com.zepto.l8;
import com.zepto.md;
import com.zepto.mg2;
import com.zepto.pb5;
import com.zepto.pq;
import com.zepto.sf2;
import com.zepto.va5;
import com.zepto.yy0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/nic/mparivahan/Citizen/Activities/MainActivity;", "Lcom/zepto/pq;", "", "message", "", "q1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onBackPressed", "o1", "", "n1", "Lcom/zepto/md;", "C", "Lcom/zepto/md;", "binding", "Lcom/zepto/sf2;", "D", "Lcom/zepto/sf2;", "l1", "()Lcom/zepto/sf2;", "t1", "(Lcom/zepto/sf2;)V", "frag", "E", "I", "LOCATION_PERMISSION_CODE", "Landroid/widget/ImageView;", "F", "Landroid/widget/ImageView;", "m1", "()Landroid/widget/ImageView;", "u1", "(Landroid/widget/ImageView;)V", "mvvm_back", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MainActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public md binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public sf2 frag;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final int LOCATION_PERMISSION_CODE = 23;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ImageView mvvm_back;

    public static final void p1(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void q1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.location_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_allow);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.r1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zo3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.s1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void r1(Dialog d, MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public static final void s1(Dialog d, MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        if (!this$0.n1()) {
            this$0.o1();
            return;
        }
        this$0.t1(new va5());
        mg2 mg2VarI0 = this$0.I0();
        Intrinsics.checkNotNullExpressionValue(mg2VarI0, "getSupportFragmentManager(...)");
        dh2 dh2VarN = mg2VarI0.n();
        Intrinsics.checkNotNullExpressionValue(dh2VarN, "beginTransaction(...)");
        dh2VarN.b(R.id.main_activity_fragmentContainer, this$0.l1());
        dh2VarN.h();
    }

    public final sf2 l1() {
        sf2 sf2Var = this.frag;
        if (sf2Var != null) {
            return sf2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("frag");
        return null;
    }

    public final ImageView m1() {
        ImageView imageView = this.mvvm_back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final boolean n1() {
        return yy0.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public final void o1() {
        l8.u(this, "android.permission.ACCESS_FINE_LOCATION");
        l8.s(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, this.LOCATION_PERMISSION_CODE);
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        md mdVarC = md.c(LayoutInflater.from(this));
        Intrinsics.checkNotNullExpressionValue(mdVarC, "inflate(...)");
        this.binding = mdVarC;
        if (mdVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mdVarC = null;
        }
        setContentView(mdVarC.b());
        View viewFindViewById = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        u1((ImageView) viewFindViewById);
        m1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ap3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.p1(this.a, view);
            }
        });
        if (!n1()) {
            o1();
            return;
        }
        int intExtra = getIntent().getIntExtra("Callflag", 0);
        if (intExtra == 0) {
            t1(new jj6());
        }
        if (intExtra == 1) {
            t1(new b4());
        }
        mg2 mg2VarI0 = I0();
        Intrinsics.checkNotNullExpressionValue(mg2VarI0, "getSupportFragmentManager(...)");
        dh2 dh2VarN = mg2VarI0.n();
        Intrinsics.checkNotNullExpressionValue(dh2VarN, "beginTransaction(...)");
        dh2VarN.b(R.id.main_activity_fragmentContainer, l1());
        dh2VarN.h();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.LOCATION_PERMISSION_CODE) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                q1("Location permission Required,Allow mParivahan App to detect your location");
                return;
            }
            int intExtra = getIntent().getIntExtra("Callflag", 0);
            if (intExtra == 0) {
                t1(new pb5());
            }
            if (intExtra == 1) {
                t1(new va5());
            }
            mg2 mg2VarI0 = I0();
            Intrinsics.checkNotNullExpressionValue(mg2VarI0, "getSupportFragmentManager(...)");
            dh2 dh2VarN = mg2VarI0.n();
            Intrinsics.checkNotNullExpressionValue(dh2VarN, "beginTransaction(...)");
            dh2VarN.b(R.id.main_activity_fragmentContainer, l1());
            dh2VarN.h();
        }
    }

    public final void t1(sf2 sf2Var) {
        Intrinsics.checkNotNullParameter(sf2Var, "<set-?>");
        this.frag = sf2Var;
    }

    public final void u1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mvvm_back = imageView;
    }
}
