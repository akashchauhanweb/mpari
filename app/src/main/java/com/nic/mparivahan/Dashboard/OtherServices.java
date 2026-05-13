package com.nic.mparivahan.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.Checkpost.CheckPostReceiptStatus;
import com.nic.mparivahan.Checkpost.DownloadCheckPostReceipt2;
import com.nic.mparivahan.Dashboard.OtherServices;
import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyNumberStatus;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeeReceipt;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateDownload;
import com.zepto.pi4;
import com.zepto.pq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/nic/mparivahan/Dashboard/OtherServices;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/pi4;", "C", "Lcom/zepto/pi4;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class OtherServices extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public pi4 binding;

    public static final void q1(OtherServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void r1(OtherServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) AvailableFancyNumberStatus.class);
        intent.putExtra("ServiceName", "Available Fancy No. Status");
        this$0.startActivity(intent);
    }

    public static final void s1(OtherServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) AuctionStatusActivity.class);
        intent.putExtra("ServiceName", "Auction Status");
        this$0.startActivity(intent);
    }

    public static final void t1(OtherServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) FancyFeeReceipt.class);
        intent.putExtra("ServiceName", "View Fancy No. Fee Receipt");
        this$0.startActivity(intent);
    }

    public static final void u1(OtherServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) AllotmentLetterActivity.class);
        intent.putExtra("ServiceName", "View Allotment Letter");
        this$0.startActivity(intent);
    }

    public static final void v1(OtherServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) PUCCCertificateDownload.class);
        intent.putExtra("ServiceName", "Download PUC Certificate");
        this$0.startActivity(intent);
    }

    public static final void w1(OtherServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) CheckPostReceiptStatus.class);
        intent.putExtra("ServiceName", "CheckPost Receipt Status");
        this$0.startActivity(intent);
    }

    public static final void x1(OtherServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DownloadCheckPostReceipt2.class);
        intent.putExtra("ServiceName", "View CheckPost Tax Receipt");
        this$0.startActivity(intent);
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pi4 pi4VarC = pi4.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(pi4VarC, "inflate(...)");
        this.binding = pi4VarC;
        pi4 pi4Var = null;
        if (pi4VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi4VarC = null;
        }
        setContentView(pi4VarC.b());
        pi4 pi4Var2 = this.binding;
        if (pi4Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi4Var2 = null;
        }
        pi4Var2.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtherServices.q1(this.a, view);
            }
        });
        pi4 pi4Var3 = this.binding;
        if (pi4Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi4Var3 = null;
        }
        pi4Var3.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtherServices.r1(this.a, view);
            }
        });
        pi4 pi4Var4 = this.binding;
        if (pi4Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi4Var4 = null;
        }
        pi4Var4.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ai4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtherServices.s1(this.a, view);
            }
        });
        pi4 pi4Var5 = this.binding;
        if (pi4Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi4Var5 = null;
        }
        pi4Var5.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtherServices.t1(this.a, view);
            }
        });
        pi4 pi4Var6 = this.binding;
        if (pi4Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi4Var6 = null;
        }
        pi4Var6.l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ci4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtherServices.u1(this.a, view);
            }
        });
        pi4 pi4Var7 = this.binding;
        if (pi4Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi4Var7 = null;
        }
        pi4Var7.j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.di4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtherServices.v1(this.a, view);
            }
        });
        pi4 pi4Var8 = this.binding;
        if (pi4Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            pi4Var8 = null;
        }
        pi4Var8.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ei4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtherServices.w1(this.a, view);
            }
        });
        pi4 pi4Var9 = this.binding;
        if (pi4Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            pi4Var = pi4Var9;
        }
        pi4Var.m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OtherServices.x1(this.a, view);
            }
        });
    }
}
