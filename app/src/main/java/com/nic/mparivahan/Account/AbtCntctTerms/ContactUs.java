package com.nic.mparivahan.Account.AbtCntctTerms;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nic.mparivahan.AbtCntctTerms.ComplaintActivity;
import com.nic.mparivahan.Account.AbtCntctTerms.ContactUs;
import com.nic.mparivahan.R;
import com.zepto.l8;
import com.zepto.pq;
import com.zepto.q8;
import com.zepto.ta3;
import com.zepto.yy0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0006\u001a\u00020\u0004J/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u00101R\"\u00106\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u0010\u001e\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00108¨\u0006<"}, d2 = {"Lcom/nic/mparivahan/Account/AbtCntctTerms/ContactUs;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "m1", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "r1", "", "x1", "n1", "Landroidx/constraintlayout/widget/ConstraintLayout;", "C", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o1", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "y1", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "callNumber", "Landroid/widget/LinearLayout;", "D", "Landroid/widget/LinearLayout;", "getTimings", "()Landroid/widget/LinearLayout;", "C1", "(Landroid/widget/LinearLayout;)V", "timings", "E", "q1", "A1", "email", "Landroid/widget/ImageView;", "F", "Landroid/widget/ImageView;", "w1", "()Landroid/widget/ImageView;", "B1", "(Landroid/widget/ImageView;)V", "mvvm_back", "G", "I", "STORAGE_PERMISSION_CODE", "H", "p1", "z1", "complaint_ll", "Lcom/zepto/q8;", "Lcom/zepto/q8;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ContactUs extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ConstraintLayout callNumber;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public LinearLayout timings;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ConstraintLayout email;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ImageView mvvm_back;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final int STORAGE_PERMISSION_CODE = 23;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public LinearLayout complaint_ll;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public q8 binding;

    public static final void s1(ContactUs this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void t1(ContactUs this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.x1()) {
            this$0.m1();
        } else {
            this$0.n1();
        }
    }

    public static final void u1(ContactUs this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "helpdesk-mparivahan@gov.in", null));
        intent.putExtra("android.intent.extra.SUBJECT", "");
        intent.putExtra("android.intent.extra.TEXT", "");
        this$0.startActivity(Intent.createChooser(intent, ""));
    }

    public static final void v1(ContactUs this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) ComplaintActivity.class));
    }

    public final void A1(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.email = constraintLayout;
    }

    public final void B1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mvvm_back = imageView;
    }

    public final void C1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.timings = linearLayout;
    }

    public final void m1() {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:0120-4925505"));
        startActivity(intent);
    }

    public final void n1() {
        l8.u(this, "android.permission.CALL_PHONE");
        l8.s(this, new String[]{"android.permission.CALL_PHONE"}, this.STORAGE_PERMISSION_CODE);
    }

    public final ConstraintLayout o1() {
        ConstraintLayout constraintLayout = this.callNumber;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callNumber");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        q8 q8VarC = q8.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(q8VarC, "inflate(...)");
        this.binding = q8VarC;
        q8 q8Var = null;
        if (q8VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            q8VarC = null;
        }
        setContentView(q8VarC.b());
        ta3.a aVar = ta3.a;
        q8 q8Var2 = this.binding;
        if (q8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            q8Var = q8Var2;
        }
        aVar.j0(this, q8Var);
        r1();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.STORAGE_PERMISSION_CODE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                m1();
            } else {
                Toast.makeText(this, "Oops you just denied the permission", 1).show();
            }
        }
    }

    public final LinearLayout p1() {
        LinearLayout linearLayout = this.complaint_ll;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("complaint_ll");
        return null;
    }

    public final ConstraintLayout q1() {
        ConstraintLayout constraintLayout = this.email;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("email");
        return null;
    }

    public final void r1() {
        View viewFindViewById = findViewById(R.id.mvvm_Back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        B1((ImageView) viewFindViewById);
        w1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.by0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactUs.s1(this.a, view);
            }
        });
        View viewFindViewById2 = findViewById(R.id.text_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        y1((ConstraintLayout) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.layout_timing);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        C1((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.challan_help);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        A1((ConstraintLayout) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.raise_complaint_ll);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        z1((LinearLayout) viewFindViewById5);
        o1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactUs.t1(this.a, view);
            }
        });
        q1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactUs.u1(this.a, view);
            }
        });
        p1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ey0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactUs.v1(this.a, view);
            }
        });
    }

    public final ImageView w1() {
        ImageView imageView = this.mvvm_back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final boolean x1() {
        return yy0.a(this, "android.permission.CALL_PHONE") == 0;
    }

    public final void y1(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.callNumber = constraintLayout;
    }

    public final void z1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.complaint_ll = linearLayout;
    }
}
