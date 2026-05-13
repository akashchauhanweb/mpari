package com.nic.mparivahan.NewDlScreen.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SpinnerAdapter;
import com.nic.mparivahan.NewDlScreen.Activity.NewDLPersonalDetailsActivity;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.Relationship;
import com.zepto.b85;
import com.zepto.kt6;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.x9;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0005j\b\u0012\u0004\u0012\u00020\u0016`\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*¨\u00060"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Activity/NewDLPersonalDetailsActivity;", "Lcom/zepto/pq;", "", "n1", "l1", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/NewDlScreen/Modal/LLDetailsResultModal;", "llDetails", "q1", "", "relationType", "k1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/x9;", "C", "Lcom/zepto/x9;", "binding", "Lkotlin/collections/ArrayList;", "D", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/ui/newlearner/DataClass/Relationship;", "E", "relationList", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "getLangSession", "()Lcom/zepto/wa3;", "r1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "m1", "()Lcom/zepto/wl5;", "s1", "(Lcom/zepto/wl5;)V", "sarthiSession", "H", "Ljava/lang/String;", "llNo", "I", "dob", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NewDLPersonalDetailsActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public x9 binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList llDetails = new ArrayList();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ArrayList relationList = new ArrayList();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String llNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dob = "";

    private final void k1(String relationType) {
        this.relationList.add(0, new Relationship("0", "Select relation"));
        this.relationList.add(1, new Relationship("F", "Father"));
        this.relationList.add(2, new Relationship("M", "Mother"));
        this.relationList.add(3, new Relationship("H", "Husband"));
        this.relationList.add(4, new Relationship("G", "Guardian"));
        int size = this.relationList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt__StringsJVMKt.equals(((Relationship) this.relationList.get(i2)).getRelationCode(), relationType, true)) {
                i = i2;
            }
        }
        b85 b85Var = new b85(this, this.relationList);
        x9 x9Var = this.binding;
        x9 x9Var2 = null;
        if (x9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var = null;
        }
        x9Var.Q.setAdapter((SpinnerAdapter) b85Var);
        x9 x9Var3 = this.binding;
        if (x9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x9Var2 = x9Var3;
        }
        x9Var2.Q.setSelection(i);
    }

    private final void l1() {
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
            q1(this.llDetails);
        }
    }

    private final void n1() {
        s1(new wl5(this));
        r1(new wa3(this));
        x9 x9Var = this.binding;
        x9 x9Var2 = null;
        if (x9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var = null;
        }
        x9Var.N.f.setText(m1().k());
        x9 x9Var3 = this.binding;
        if (x9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var3 = null;
        }
        x9Var3.z.setFocusable(false);
        x9 x9Var4 = this.binding;
        if (x9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var4 = null;
        }
        x9Var4.B.setFocusable(false);
        x9 x9Var5 = this.binding;
        if (x9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var5 = null;
        }
        x9Var5.A.setFocusable(false);
        x9 x9Var6 = this.binding;
        if (x9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var6 = null;
        }
        x9Var6.j0.setFocusable(false);
        x9 x9Var7 = this.binding;
        if (x9Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var7 = null;
        }
        x9Var7.l0.setFocusable(false);
        x9 x9Var8 = this.binding;
        if (x9Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var8 = null;
        }
        x9Var8.k0.setFocusable(false);
        x9 x9Var9 = this.binding;
        if (x9Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var9 = null;
        }
        x9Var9.a0.setFocusable(false);
        x9 x9Var10 = this.binding;
        if (x9Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var10 = null;
        }
        x9Var10.M.setEnabled(false);
        x9 x9Var11 = this.binding;
        if (x9Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var11 = null;
        }
        x9Var11.M.setClickable(false);
        x9 x9Var12 = this.binding;
        if (x9Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var12 = null;
        }
        x9Var12.E.setFocusable(false);
        x9 x9Var13 = this.binding;
        if (x9Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var13 = null;
        }
        x9Var13.F.setFocusable(false);
        x9 x9Var14 = this.binding;
        if (x9Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var14 = null;
        }
        x9Var14.D.setFocusable(false);
        x9 x9Var15 = this.binding;
        if (x9Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var15 = null;
        }
        x9Var15.J.setFocusable(false);
        x9 x9Var16 = this.binding;
        if (x9Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var16 = null;
        }
        x9Var16.y.setFocusable(false);
        x9 x9Var17 = this.binding;
        if (x9Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var17 = null;
        }
        x9Var17.H.setFocusable(false);
        x9 x9Var18 = this.binding;
        if (x9Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var18 = null;
        }
        x9Var18.I.setFocusable(false);
        x9 x9Var19 = this.binding;
        if (x9Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var19 = null;
        }
        x9Var19.O.setEnabled(false);
        x9 x9Var20 = this.binding;
        if (x9Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var20 = null;
        }
        x9Var20.L.setEnabled(false);
        x9 x9Var21 = this.binding;
        if (x9Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var21 = null;
        }
        x9Var21.R.setEnabled(false);
        x9 x9Var22 = this.binding;
        if (x9Var22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var22 = null;
        }
        x9Var22.Q.setEnabled(false);
        x9 x9Var23 = this.binding;
        if (x9Var23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var23 = null;
        }
        x9Var23.G.setFocusable(false);
        x9 x9Var24 = this.binding;
        if (x9Var24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var24 = null;
        }
        x9Var24.C.setFocusable(false);
        x9 x9Var25 = this.binding;
        if (x9Var25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9Var25 = null;
        }
        x9Var25.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDLPersonalDetailsActivity.o1(this.a, view);
            }
        });
        x9 x9Var26 = this.binding;
        if (x9Var26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x9Var2 = x9Var26;
        }
        x9Var2.N.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDLPersonalDetailsActivity.p1(this.a, view);
            }
        });
    }

    public static final void o1(NewDLPersonalDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) NewDLAddressDetailsActivity.class);
        intent.putParcelableArrayListExtra("LLDetails", this$0.llDetails);
        intent.putExtra("llNo", this$0.llNo);
        intent.putExtra("dob", this$0.dob);
        this$0.startActivity(intent);
    }

    public static final void p1(NewDLPersonalDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    private final void q1(ArrayList llDetails) {
        x9 x9Var = null;
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getFname())) {
            x9 x9Var2 = this.binding;
            if (x9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var2 = null;
            }
            x9Var2.z.setText(((LLDetailsResultModal) llDetails.get(0)).getFname());
        } else {
            x9 x9Var3 = this.binding;
            if (x9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var3 = null;
            }
            x9Var3.z.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getMname())) {
            x9 x9Var4 = this.binding;
            if (x9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var4 = null;
            }
            x9Var4.B.setText(((LLDetailsResultModal) llDetails.get(0)).getMname());
        } else {
            x9 x9Var5 = this.binding;
            if (x9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var5 = null;
            }
            x9Var5.B.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getLname())) {
            x9 x9Var6 = this.binding;
            if (x9Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var6 = null;
            }
            x9Var6.A.setText(((LLDetailsResultModal) llDetails.get(0)).getLname());
        } else {
            x9 x9Var7 = this.binding;
            if (x9Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var7 = null;
            }
            x9Var7.A.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getRelationType().get(0).getRelationCode())) {
            x9 x9Var8 = this.binding;
            if (x9Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var8 = null;
            }
            x9Var8.P.setText(((LLDetailsResultModal) llDetails.get(0)).getRelationType().get(0).getRelationDesc() + " 's Name");
            k1(((LLDetailsResultModal) llDetails.get(0)).getRelationType().get(0).getRelationCode());
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getSwdfName())) {
            x9 x9Var9 = this.binding;
            if (x9Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var9 = null;
            }
            x9Var9.j0.setText(((LLDetailsResultModal) llDetails.get(0)).getSwdfName());
        } else {
            x9 x9Var10 = this.binding;
            if (x9Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var10 = null;
            }
            x9Var10.j0.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getSwdmName())) {
            x9 x9Var11 = this.binding;
            if (x9Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var11 = null;
            }
            x9Var11.l0.setText(((LLDetailsResultModal) llDetails.get(0)).getSwdmName());
        } else {
            x9 x9Var12 = this.binding;
            if (x9Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var12 = null;
            }
            x9Var12.l0.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getSwdlName())) {
            x9 x9Var13 = this.binding;
            if (x9Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var13 = null;
            }
            x9Var13.k0.setText(((LLDetailsResultModal) llDetails.get(0)).getSwdlName());
        } else {
            x9 x9Var14 = this.binding;
            if (x9Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var14 = null;
            }
            x9Var14.k0.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getNewFullName())) {
            x9 x9Var15 = this.binding;
            if (x9Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var15 = null;
            }
            x9Var15.a0.setText(((LLDetailsResultModal) llDetails.get(0)).getNewFullName());
        } else {
            x9 x9Var16 = this.binding;
            if (x9Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var16 = null;
            }
            x9Var16.a0.setText("NA");
        }
        int genderCode = ((LLDetailsResultModal) llDetails.get(0)).getGender().get(0).getGenderCode();
        if (genderCode == 1) {
            x9 x9Var17 = this.binding;
            if (x9Var17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var17 = null;
            }
            x9Var17.O.setChecked(true);
        } else if (genderCode != 2) {
            x9 x9Var18 = this.binding;
            if (x9Var18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var18 = null;
            }
            x9Var18.R.setChecked(true);
        } else {
            x9 x9Var19 = this.binding;
            if (x9Var19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var19 = null;
            }
            x9Var19.L.setChecked(true);
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getDateOfBirth())) {
            x9 x9Var20 = this.binding;
            if (x9Var20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var20 = null;
            }
            x9Var20.x.setText(((LLDetailsResultModal) llDetails.get(0)).getDateOfBirth());
        } else {
            x9 x9Var21 = this.binding;
            if (x9Var21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var21 = null;
            }
            x9Var21.x.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getPlaceOfBirth())) {
            x9 x9Var22 = this.binding;
            if (x9Var22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var22 = null;
            }
            x9Var22.C.setText(((LLDetailsResultModal) llDetails.get(0)).getPlaceOfBirth());
        } else {
            x9 x9Var23 = this.binding;
            if (x9Var23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var23 = null;
            }
            x9Var23.C.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getCountryOfBirth().get(0).getCountryOfBirthName())) {
            x9 x9Var24 = this.binding;
            if (x9Var24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var24 = null;
            }
            x9Var24.E.setText(((LLDetailsResultModal) llDetails.get(0)).getCountryOfBirth().get(0).getCountryOfBirthName());
        } else {
            x9 x9Var25 = this.binding;
            if (x9Var25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var25 = null;
            }
            x9Var25.E.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getEduQual().get(0).getQualDesc())) {
            x9 x9Var26 = this.binding;
            if (x9Var26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var26 = null;
            }
            x9Var26.F.setText(((LLDetailsResultModal) llDetails.get(0)).getEduQual().get(0).getQualDesc());
        } else {
            x9 x9Var27 = this.binding;
            if (x9Var27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var27 = null;
            }
            x9Var27.F.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getBloodGroup().get(0).getBloodGroupDesc())) {
            x9 x9Var28 = this.binding;
            if (x9Var28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var28 = null;
            }
            x9Var28.D.setText(((LLDetailsResultModal) llDetails.get(0)).getBloodGroup().get(0).getBloodGroupDesc());
        } else {
            x9 x9Var29 = this.binding;
            if (x9Var29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var29 = null;
            }
            x9Var29.D.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getEmail())) {
            x9 x9Var30 = this.binding;
            if (x9Var30 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var30 = null;
            }
            x9Var30.G.setText(((LLDetailsResultModal) llDetails.get(0)).getEmail());
        } else {
            x9 x9Var31 = this.binding;
            if (x9Var31 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var31 = null;
            }
            x9Var31.G.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getMobileNumber())) {
            x9 x9Var32 = this.binding;
            if (x9Var32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var32 = null;
            }
            x9Var32.J.setText(((LLDetailsResultModal) llDetails.get(0)).getMobileNumber());
        } else {
            x9 x9Var33 = this.binding;
            if (x9Var33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var33 = null;
            }
            x9Var33.J.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getAlternatemobileNumber())) {
            x9 x9Var34 = this.binding;
            if (x9Var34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var34 = null;
            }
            x9Var34.y.setText(((LLDetailsResultModal) llDetails.get(0)).getAlternatemobileNumber());
        } else {
            x9 x9Var35 = this.binding;
            if (x9Var35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var35 = null;
            }
            x9Var35.y.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getIdMarks1())) {
            x9 x9Var36 = this.binding;
            if (x9Var36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var36 = null;
            }
            x9Var36.H.setText(((LLDetailsResultModal) llDetails.get(0)).getIdMarks1());
        } else {
            x9 x9Var37 = this.binding;
            if (x9Var37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                x9Var37 = null;
            }
            x9Var37.H.setText("NA");
        }
        if (kt6.d(((LLDetailsResultModal) llDetails.get(0)).getIdMarks2())) {
            x9 x9Var38 = this.binding;
            if (x9Var38 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                x9Var = x9Var38;
            }
            x9Var.I.setText(((LLDetailsResultModal) llDetails.get(0)).getIdMarks2());
            return;
        }
        x9 x9Var39 = this.binding;
        if (x9Var39 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x9Var = x9Var39;
        }
        x9Var.I.setText("NA");
    }

    public final wl5 m1() {
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
        x9 x9VarX = x9.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(x9VarX, "inflate(...)");
        this.binding = x9VarX;
        x9 x9Var = null;
        if (x9VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x9VarX = null;
        }
        setContentView(x9VarX.m());
        ta3.a aVar = ta3.a;
        x9 x9Var2 = this.binding;
        if (x9Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            x9Var = x9Var2;
        }
        aVar.v0(this, x9Var);
        l1();
        n1();
    }

    public final void r1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void s1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }
}
