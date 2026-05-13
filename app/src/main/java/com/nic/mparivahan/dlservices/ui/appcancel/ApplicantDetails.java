package com.nic.mparivahan.dlservices.ui.appcancel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.appcancel.ApplicantDetails;
import com.nic.mparivahan.dlservices.ui.appcancel.Pojo.CancelApplSlotDetailsPojo;
import com.zepto.mc;
import com.zepto.o40;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J \u0010\u000b\u001a\u00020\u00022\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR&\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/appcancel/ApplicantDetails;", "Lcom/zepto/o40;", "", "E1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/ui/appcancel/Pojo/CancelApplSlotDetailsPojo;", "Lkotlin/collections/ArrayList;", "dlDetailsDataModal", "H1", "K1", "Lcom/zepto/mc;", "F", "Lcom/zepto/mc;", "binding", "G", "Ljava/util/ArrayList;", "", "H", "Ljava/lang/String;", "appNo", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "C1", "()Lcom/zepto/wa3;", "F1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "J", "Lcom/zepto/wl5;", "D1", "()Lcom/zepto/wl5;", "G1", "(Lcom/zepto/wl5;)V", "sarathiSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ApplicantDetails extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public mc binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ArrayList dlDetailsDataModal = new ArrayList();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String appNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wl5 sarathiSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                Intent intent = new Intent(ApplicantDetails.this, (Class<?>) VerifyMobileScreen.class);
                intent.putExtra("applNo", ApplicantDetails.this.appNo);
                mc mcVar = ApplicantDetails.this.binding;
                if (mcVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    mcVar = null;
                }
                intent.putExtra("dob", mcVar.e.getText().toString());
                ApplicantDetails.this.startActivity(intent);
            }
        }
    }

    private final void E1() {
        H1(this.dlDetailsDataModal);
    }

    public static final void I1(ApplicantDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K1();
    }

    public static final void J1(ApplicantDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public final wa3 C1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final wl5 D1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final void F1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void G1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void H1(ArrayList dlDetailsDataModal) {
        mc mcVar = null;
        if (((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getApplName().length() > 0) {
            mc mcVar2 = this.binding;
            if (mcVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mcVar2 = null;
            }
            mcVar2.k.setText(((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getApplName());
        }
        if (((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getSwdName().length() > 0) {
            mc mcVar3 = this.binding;
            if (mcVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mcVar3 = null;
            }
            mcVar3.j.setText(((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getSwdName());
        }
        if (((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getDob().length() > 0) {
            mc mcVar4 = this.binding;
            if (mcVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mcVar4 = null;
            }
            mcVar4.e.setText(((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getDob());
        }
        if (((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getGender().length() > 0) {
            mc mcVar5 = this.binding;
            if (mcVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mcVar5 = null;
            }
            mcVar5.h.setText(((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getGender());
        }
        if (((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getAge().length() > 0) {
            mc mcVar6 = this.binding;
            if (mcVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mcVar6 = null;
            }
            mcVar6.c.setText(((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getAge());
        }
        if (((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getSlotDate().length() > 0) {
            mc mcVar7 = this.binding;
            if (mcVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mcVar7 = null;
            }
            mcVar7.o.setText(((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getSlotDate());
        }
        if (((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getSlotTimings().length() > 0) {
            mc mcVar8 = this.binding;
            if (mcVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                mcVar8 = null;
            }
            mcVar8.r.setText(((CancelApplSlotDetailsPojo) dlDetailsDataModal.get(0)).getSlotTimings());
        }
        mc mcVar9 = this.binding;
        if (mcVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mcVar9 = null;
        }
        mcVar9.n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicantDetails.I1(this.a, view);
            }
        });
        mc mcVar10 = this.binding;
        if (mcVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mcVar = mcVar10;
        }
        mcVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicantDetails.J1(this.a, view);
            }
        });
    }

    public final void K1() {
        String strB = C1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = C1().b("label_want_to_proceed", getString(R.string.are_you_want_to_proceed));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, strB2, 0, null, null, new a(), 24, null);
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mc mcVarC = mc.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(mcVarC, "inflate(...)");
        this.binding = mcVarC;
        mc mcVar = null;
        if (mcVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mcVarC = null;
        }
        setContentView(mcVarC.b());
        F1(new wa3(this));
        G1(new wl5(this));
        ta3.a aVar = ta3.a;
        mc mcVar2 = this.binding;
        if (mcVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mcVar2 = null;
        }
        aVar.G(this, mcVar2);
        if (getIntent().hasExtra("slotData")) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("slotData");
            Intrinsics.checkNotNull(parcelableArrayListExtra);
            this.dlDetailsDataModal = parcelableArrayListExtra;
        }
        String stringExtra = getIntent().getStringExtra("applNo");
        Intrinsics.checkNotNull(stringExtra);
        this.appNo = stringExtra;
        mc mcVar3 = this.binding;
        if (mcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            mcVar = mcVar3;
        }
        mcVar.l.f.setText(D1().k());
        E1();
    }
}
