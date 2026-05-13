package com.nic.mparivahan.VahanServices;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.SlotSuccessfulBookedActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.hz0;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.xh7;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001c\u0010\"\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/nic/mparivahan/VahanServices/SlotSuccessfulBookedActivity;", "Lcom/zepto/pq;", "", "o1", "t1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "C", "I", "PERMISSION_CODE_READ_EXTERNAL_STORAGE", "Lcom/zepto/xh7;", "D", "Lcom/zepto/xh7;", "m1", "()Lcom/zepto/xh7;", "u1", "(Lcom/zepto/xh7;)V", "binding", "", "E", "Ljava/lang/String;", "apptId", "F", "applNo", "G", "stateCd", "H", "offCd", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ExecutorService;", "myExecutor", "Landroid/os/Handler;", "J", "Landroid/os/Handler;", "myHandler", "K", "getReceiptUrl", "()Ljava/lang/String;", "setReceiptUrl", "(Ljava/lang/String;)V", "receiptUrl", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "n1", "()Lcom/zepto/wa3;", "v1", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SlotSuccessfulBookedActivity extends pq {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public xh7 binding;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final int PERMISSION_CODE_READ_EXTERNAL_STORAGE = 10210;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String apptId = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String offCd = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final ExecutorService myExecutor = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final Handler myHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String receiptUrl = "";

    private final void o1() {
        m1().g.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotSuccessfulBookedActivity.p1(this.a, view);
            }
        });
        m1().g.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotSuccessfulBookedActivity.q1(this.a, view);
            }
        });
        m1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotSuccessfulBookedActivity.r1(this.a, view);
            }
        });
        m1().b.setText(n1().b("label_slot_appointment_booked", "Your appointment has been Booked with Appointment ID is") + " : " + this.apptId + ' ' + n1().b("label_slot_booked_appointment_no", " for Application No.") + " : " + this.applNo);
        this.receiptUrl = APIController.a().getNapixBase1() + hz0.a.S() + this.apptId + '/' + this.stateCd + '/' + this.offCd;
        m1().f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlotSuccessfulBookedActivity.s1(this.a, view);
            }
        });
    }

    public static final void p1(SlotSuccessfulBookedActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
        VUtility.INSTANCE.y(this$0, this$0.n1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void q1(SlotSuccessfulBookedActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1();
    }

    public static final void r1(SlotSuccessfulBookedActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1();
    }

    public static final void s1(SlotSuccessfulBookedActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) PdfViewActivity.class);
        intent.putExtra("url", this$0.receiptUrl);
        intent.putExtra("formType", "Appointment Receipt");
        intent.putExtra("applNo", this$0.apptId);
        this$0.startActivity(intent);
    }

    private final void t1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final xh7 m1() {
        xh7 xh7Var = this.binding;
        if (xh7Var != null) {
            return xh7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 n1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, n1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_slot_success_booked);
        xh7 xh7VarC = xh7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(xh7VarC, "inflate(...)");
        u1(xh7VarC);
        setContentView(m1().b());
        ta3.a.W1(this, m1());
        v1(new wa3(this));
        if (getIntent() != null) {
            if (getIntent().hasExtra("appNo")) {
                String stringExtra = getIntent().getStringExtra("appNo");
                Intrinsics.checkNotNull(stringExtra);
                this.applNo = stringExtra;
            }
            if (getIntent().hasExtra("apptId")) {
                String stringExtra2 = getIntent().getStringExtra("apptId");
                Intrinsics.checkNotNull(stringExtra2);
                this.apptId = stringExtra2;
            }
            if (getIntent().hasExtra("stateCd")) {
                String stringExtra3 = getIntent().getStringExtra("stateCd");
                Intrinsics.checkNotNull(stringExtra3);
                this.stateCd = stringExtra3;
            }
            if (getIntent().hasExtra("offCd")) {
                String stringExtra4 = getIntent().getStringExtra("offCd");
                Intrinsics.checkNotNull(stringExtra4);
                this.offCd = stringExtra4;
            }
        }
        o1();
    }

    public final void u1(xh7 xh7Var) {
        Intrinsics.checkNotNullParameter(xh7Var, "<set-?>");
        this.binding = xh7Var;
    }

    public final void v1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }
}
