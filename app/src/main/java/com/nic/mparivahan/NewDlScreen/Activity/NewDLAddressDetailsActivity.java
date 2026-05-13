package com.nic.mparivahan.NewDlScreen.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.NewDlScreen.Activity.NewDLAddressDetailsActivity;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.c9;
import com.zepto.kt6;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00022\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0003J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR&\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%¨\u0006+"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Activity/NewDLAddressDetailsActivity;", "Lcom/zepto/pq;", "", "m1", "k1", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/NewDlScreen/Modal/LLDetailsResultModal;", "Lkotlin/collections/ArrayList;", "llDetails", "p1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/c9;", "C", "Lcom/zepto/c9;", "binding", "D", "Ljava/util/ArrayList;", "Lcom/zepto/wa3;", "E", "Lcom/zepto/wa3;", "getLangSession", "()Lcom/zepto/wa3;", "q1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "F", "Lcom/zepto/wl5;", "l1", "()Lcom/zepto/wl5;", "r1", "(Lcom/zepto/wl5;)V", "sarthiSession", "", "G", "Ljava/lang/String;", "llNo", "H", "dob", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NewDLAddressDetailsActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public c9 binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList llDetails = new ArrayList();

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String llNo = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dob = "";

    private final void k1() {
        if (getIntent().hasExtra("LLDetails")) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("LLDetails");
            Intrinsics.checkNotNull(parcelableArrayListExtra);
            this.llDetails = parcelableArrayListExtra;
        }
        if (getIntent().hasExtra("llNo")) {
            String stringExtra = getIntent().getStringExtra("llNo");
            Intrinsics.checkNotNull(stringExtra);
            this.llNo = stringExtra;
        }
        if (getIntent().hasExtra("dob")) {
            String stringExtra2 = getIntent().getStringExtra("dob");
            Intrinsics.checkNotNull(stringExtra2);
            this.dob = stringExtra2;
        }
        if (this.llDetails.size() > 0) {
            p1(this.llDetails);
        }
    }

    private final void m1() {
        r1(new wl5(this));
        q1(new wa3(this));
        c9 c9Var = this.binding;
        c9 c9Var2 = null;
        if (c9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var = null;
        }
        c9Var.U.f.setText(l1().k());
        c9 c9Var3 = this.binding;
        if (c9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var3 = null;
        }
        c9Var3.s0.setEnabled(false);
        c9 c9Var4 = this.binding;
        if (c9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var4 = null;
        }
        c9Var4.r0.setEnabled(false);
        c9 c9Var5 = this.binding;
        if (c9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var5 = null;
        }
        c9Var5.a0.setEnabled(false);
        c9 c9Var6 = this.binding;
        if (c9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var6 = null;
        }
        c9Var6.L.setFocusable(false);
        c9 c9Var7 = this.binding;
        if (c9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var7 = null;
        }
        c9Var7.P.setFocusable(false);
        c9 c9Var8 = this.binding;
        if (c9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var8 = null;
        }
        c9Var8.N.setFocusable(false);
        c9 c9Var9 = this.binding;
        if (c9Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var9 = null;
        }
        c9Var9.O.setFocusable(false);
        c9 c9Var10 = this.binding;
        if (c9Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var10 = null;
        }
        c9Var10.t0.setFocusable(false);
        c9 c9Var11 = this.binding;
        if (c9Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var11 = null;
        }
        c9Var11.V.setFocusable(false);
        c9 c9Var12 = this.binding;
        if (c9Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var12 = null;
        }
        c9Var12.X.setEnabled(false);
        c9 c9Var13 = this.binding;
        if (c9Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var13 = null;
        }
        c9Var13.K.setEnabled(false);
        c9 c9Var14 = this.binding;
        if (c9Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var14 = null;
        }
        c9Var14.J.setEnabled(false);
        c9 c9Var15 = this.binding;
        if (c9Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var15 = null;
        }
        c9Var15.I.setEnabled(false);
        c9 c9Var16 = this.binding;
        if (c9Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var16 = null;
        }
        c9Var16.Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDLAddressDetailsActivity.n1(this.a, view);
            }
        });
        c9 c9Var17 = this.binding;
        if (c9Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var17 = null;
        }
        c9Var17.U.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDLAddressDetailsActivity.o1(this.a, view);
            }
        });
        c9 c9Var18 = this.binding;
        if (c9Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var18 = null;
        }
        c9Var18.A.setFocusable(false);
        c9 c9Var19 = this.binding;
        if (c9Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var19 = null;
        }
        c9Var19.D.setFocusable(false);
        c9 c9Var20 = this.binding;
        if (c9Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9Var20 = null;
        }
        c9Var20.B.setFocusable(false);
        c9 c9Var21 = this.binding;
        if (c9Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c9Var2 = c9Var21;
        }
        c9Var2.C.setFocusable(false);
    }

    public static final void n1(NewDLAddressDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) NewCovActivity.class);
        intent.putParcelableArrayListExtra("LLDetails", this$0.llDetails);
        intent.putExtra("llNo", this$0.llNo);
        intent.putExtra("dob", this$0.dob);
        this$0.startActivity(intent);
    }

    public static final void o1(NewDLAddressDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    private final void p1(ArrayList llDetails) {
        c9 c9Var = null;
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresState().get(0).getPresStateName())) {
            c9 c9Var2 = this.binding;
            if (c9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var2 = null;
            }
            c9Var2.y.setText(((LLDetailsResultModal) llDetails.get(0)).getPresState().get(0).getPresStateName());
        } else {
            c9 c9Var3 = this.binding;
            if (c9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var3 = null;
            }
            c9Var3.y.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresDistrict().get(0).getPresDistName())) {
            c9 c9Var4 = this.binding;
            if (c9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var4 = null;
            }
            c9Var4.x.setText(((LLDetailsResultModal) llDetails.get(0)).getPresDistrict().get(0).getPresDistName());
        } else {
            c9 c9Var5 = this.binding;
            if (c9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var5 = null;
            }
            c9Var5.x.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresSubDistrict().get(0).getPresSubDistName())) {
            c9 c9Var6 = this.binding;
            if (c9Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var6 = null;
            }
            c9Var6.z.setText(((LLDetailsResultModal) llDetails.get(0)).getPresSubDistrict().get(0).getPresSubDistName());
        } else {
            c9 c9Var7 = this.binding;
            if (c9Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var7 = null;
            }
            c9Var7.z.setText("");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresVillageOrTown())) {
            if (Intrinsics.areEqual(((LLDetailsResultModal) llDetails.get(0)).getPresVillageOrTown(), VContant.MAINSCREEN)) {
                c9 c9Var8 = this.binding;
                if (c9Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c9Var8 = null;
                }
                c9Var8.r0.setChecked(true);
            } else {
                c9 c9Var9 = this.binding;
                if (c9Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c9Var9 = null;
                }
                c9Var9.a0.setChecked(false);
            }
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresCity().get(0).getPresVillName())) {
            c9 c9Var10 = this.binding;
            if (c9Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var10 = null;
            }
            c9Var10.M.setText(((LLDetailsResultModal) llDetails.get(0)).getPresCity().get(0).getPresVillName());
        } else {
            c9 c9Var11 = this.binding;
            if (c9Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var11 = null;
            }
            c9Var11.M.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresHouseNo())) {
            c9 c9Var12 = this.binding;
            if (c9Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var12 = null;
            }
            c9Var12.L.setText(((LLDetailsResultModal) llDetails.get(0)).getPresHouseNo());
        } else {
            c9 c9Var13 = this.binding;
            if (c9Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var13 = null;
            }
            c9Var13.L.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresStreet())) {
            c9 c9Var14 = this.binding;
            if (c9Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var14 = null;
            }
            c9Var14.P.setText(((LLDetailsResultModal) llDetails.get(0)).getPresStreet());
        } else {
            c9 c9Var15 = this.binding;
            if (c9Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var15 = null;
            }
            c9Var15.P.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresLocation())) {
            c9 c9Var16 = this.binding;
            if (c9Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var16 = null;
            }
            c9Var16.N.setText(((LLDetailsResultModal) llDetails.get(0)).getPresLocation());
        } else {
            c9 c9Var17 = this.binding;
            if (c9Var17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var17 = null;
            }
            c9Var17.N.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresPinCode())) {
            c9 c9Var18 = this.binding;
            if (c9Var18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var18 = null;
            }
            c9Var18.O.setText(((LLDetailsResultModal) llDetails.get(0)).getPresPinCode());
        } else {
            c9 c9Var19 = this.binding;
            if (c9Var19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var19 = null;
            }
            c9Var19.O.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresStayYears())) {
            c9 c9Var20 = this.binding;
            if (c9Var20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var20 = null;
            }
            c9Var20.t0.setText(((LLDetailsResultModal) llDetails.get(0)).getPresStayYears());
        } else {
            c9 c9Var21 = this.binding;
            if (c9Var21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var21 = null;
            }
            c9Var21.t0.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresStayMonths())) {
            c9 c9Var22 = this.binding;
            if (c9Var22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var22 = null;
            }
            c9Var22.V.setText(((LLDetailsResultModal) llDetails.get(0)).getPresStayMonths());
        } else {
            c9 c9Var23 = this.binding;
            if (c9Var23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var23 = null;
            }
            c9Var23.V.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPresSameAsPerm())) {
            c9 c9Var24 = this.binding;
            if (c9Var24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var24 = null;
            }
            c9Var24.X.setChecked(StringsKt__StringsJVMKt.equals(((LLDetailsResultModal) llDetails.get(0)).getPresSameAsPerm(), "true", true));
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPermState().get(0).getPermStateName())) {
            c9 c9Var25 = this.binding;
            if (c9Var25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var25 = null;
            }
            c9Var25.G.setText(((LLDetailsResultModal) llDetails.get(0)).getPermState().get(0).getPermStateName());
        } else {
            c9 c9Var26 = this.binding;
            if (c9Var26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var26 = null;
            }
            c9Var26.G.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPermDistrict().get(0).getPermDistName())) {
            c9 c9Var27 = this.binding;
            if (c9Var27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var27 = null;
            }
            c9Var27.F.setText(((LLDetailsResultModal) llDetails.get(0)).getPermDistrict().get(0).getPermDistName());
        } else {
            c9 c9Var28 = this.binding;
            if (c9Var28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var28 = null;
            }
            c9Var28.F.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPermSubDistrict().get(0).getPermSubDistName())) {
            c9 c9Var29 = this.binding;
            if (c9Var29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var29 = null;
            }
            c9Var29.E.setText(((LLDetailsResultModal) llDetails.get(0)).getPermSubDistrict().get(0).getPermSubDistName());
        } else {
            c9 c9Var30 = this.binding;
            if (c9Var30 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var30 = null;
            }
            c9Var30.E.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPermVillageOrTown())) {
            if (Intrinsics.areEqual(((LLDetailsResultModal) llDetails.get(0)).getPermVillageOrTown(), VContant.MAINSCREEN)) {
                c9 c9Var31 = this.binding;
                if (c9Var31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c9Var31 = null;
                }
                c9Var31.J.setChecked(true);
            } else {
                c9 c9Var32 = this.binding;
                if (c9Var32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c9Var32 = null;
                }
                c9Var32.I.setChecked(false);
            }
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPermCity().get(0).getPermVillName())) {
            c9 c9Var33 = this.binding;
            if (c9Var33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var33 = null;
            }
            c9Var33.H.setText(((LLDetailsResultModal) llDetails.get(0)).getPermCity().get(0).getPermVillName());
        } else {
            c9 c9Var34 = this.binding;
            if (c9Var34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var34 = null;
            }
            c9Var34.H.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPermHouseNo())) {
            c9 c9Var35 = this.binding;
            if (c9Var35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var35 = null;
            }
            c9Var35.A.setText(((LLDetailsResultModal) llDetails.get(0)).getPermHouseNo());
        } else {
            c9 c9Var36 = this.binding;
            if (c9Var36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var36 = null;
            }
            c9Var36.A.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPermStreet())) {
            c9 c9Var37 = this.binding;
            if (c9Var37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var37 = null;
            }
            c9Var37.D.setText(((LLDetailsResultModal) llDetails.get(0)).getPermStreet());
        } else {
            c9 c9Var38 = this.binding;
            if (c9Var38 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var38 = null;
            }
            c9Var38.D.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPermLocation())) {
            c9 c9Var39 = this.binding;
            if (c9Var39 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var39 = null;
            }
            c9Var39.B.setText(((LLDetailsResultModal) llDetails.get(0)).getPermLocation());
        } else {
            c9 c9Var40 = this.binding;
            if (c9Var40 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c9Var40 = null;
            }
            c9Var40.B.setText("");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPermPinCode())) {
            c9 c9Var41 = this.binding;
            if (c9Var41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c9Var = c9Var41;
            }
            c9Var.C.setText(((LLDetailsResultModal) llDetails.get(0)).getPermPinCode());
            return;
        }
        c9 c9Var42 = this.binding;
        if (c9Var42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c9Var = c9Var42;
        }
        c9Var.C.setText("NA");
    }

    public final wl5 l1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c9 c9VarX = c9.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c9VarX, "inflate(...)");
        this.binding = c9VarX;
        c9 c9Var = null;
        if (c9VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c9VarX = null;
        }
        setContentView(c9VarX.m());
        ta3.a aVar = ta3.a;
        c9 c9Var2 = this.binding;
        if (c9Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c9Var = c9Var2;
        }
        aVar.q0(this, c9Var);
        k1();
        m1();
    }

    public final void q1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void r1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }
}
