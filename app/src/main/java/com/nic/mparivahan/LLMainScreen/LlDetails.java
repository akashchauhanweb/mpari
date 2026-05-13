package com.nic.mparivahan.LLMainScreen;

import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.vc;
import com.zepto.wl5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/LlDetails;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/vc;", "C", "Lcom/zepto/vc;", "r1", "()Lcom/zepto/vc;", "C1", "(Lcom/zepto/vc;)V", "mBinding", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "D", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "q1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "B1", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "Lcom/zepto/wl5;", "E", "Lcom/zepto/wl5;", "s1", "()Lcom/zepto/wl5;", "D1", "(Lcom/zepto/wl5;)V", "sarathiSession", "", "F", "Ljava/lang/String;", "getCov", "()Ljava/lang/String;", "setCov", "(Ljava/lang/String;)V", "cov", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LlDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public vc mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String cov = "";

    public static final void A1(LlDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1().w0.setVisibility(0);
        this$0.r1().x0.setVisibility(8);
        this$0.r1().K.setVisibility(8);
    }

    public static final void t1(LlDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void u1(LlDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void v1(LlDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1().N.setVisibility(8);
        this$0.r1().O.setVisibility(0);
        this$0.r1().J.setVisibility(0);
    }

    public static final void w1(LlDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1().N.setVisibility(0);
        this$0.r1().O.setVisibility(8);
        this$0.r1().J.setVisibility(8);
    }

    public static final void x1(LlDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1().z.setVisibility(8);
        this$0.r1().C.setVisibility(0);
        this$0.r1().I.setVisibility(0);
    }

    public static final void y1(LlDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1().C.setVisibility(8);
        this$0.r1().z.setVisibility(0);
        this$0.r1().I.setVisibility(8);
    }

    public static final void z1(LlDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1().w0.setVisibility(8);
        this$0.r1().x0.setVisibility(0);
        this$0.r1().K.setVisibility(0);
    }

    public final void B1(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void C1(vc vcVar) {
        Intrinsics.checkNotNullParameter(vcVar, "<set-?>");
        this.mBinding = vcVar;
    }

    public final void D1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vc vcVarX = vc.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(vcVarX, "inflate(...)");
        C1(vcVarX);
        setContentView(r1().m());
        D1(new wl5(this));
        ta3.a.g1(this, r1());
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            B1((FetchLlDetails) serializableExtra);
        } catch (Exception unused) {
        }
        try {
            r1().v0.g.setText(s1().k());
            r1().t0.setText("LL No. : " + StringsKt__StringsKt.trim((CharSequence) q1().getLearningLicence()).toString());
            r1().p0.setText(StringsKt__StringsKt.trim((CharSequence) q1().getFullName()).toString());
            r1().n0.setText(q1().getApplicantAddress().getSwdFullName());
            r1().o0.setText(StringsKt__StringsKt.trim((CharSequence) q1().getDateOfBirth()).toString());
            r1().m0.setText(StringsKt__StringsKt.trim((CharSequence) q1().getBloodgroup()).toString());
            r1().q0.setText(StringsKt__StringsKt.trim((CharSequence) q1().getDateOfIssue()).toString());
            r1().s0.setText(q1().getState().getStateName());
            r1().r0.setText(q1().getRTO().getRTOName());
            int size = q1().getCovobj().size();
            for (int i = 0; i < size; i++) {
                this.cov += StringsKt__StringsKt.trim((CharSequence) q1().getCovobj().get(i).getCovAbbr()).toString();
            }
            r1().k0.setText(this.cov);
        } catch (Exception unused2) {
        }
        r1().M.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ah3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDetails.t1(this.a, view);
            }
        });
        r1().G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDetails.u1(this.a, view);
            }
        });
        r1().N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ch3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDetails.v1(this.a, view);
            }
        });
        r1().O.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDetails.w1(this.a, view);
            }
        });
        r1().z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDetails.x1(this.a, view);
            }
        });
        r1().C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDetails.y1(this.a, view);
            }
        });
        r1().w0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDetails.z1(this.a, view);
            }
        });
        r1().x0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlDetails.A1(this.a, view);
            }
        });
    }

    public final FetchLlDetails q1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final vc r1() {
        vc vcVar = this.mBinding;
        if (vcVar != null) {
            return vcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final wl5 s1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }
}
