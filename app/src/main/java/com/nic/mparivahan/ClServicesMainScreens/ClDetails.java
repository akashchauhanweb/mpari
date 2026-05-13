package com.nic.mparivahan.ClServicesMainScreens;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.GetClPojo;
import com.nic.mparivahan.ClServicesMainScreens.ClDetails;
import com.nic.mparivahan.R;
import com.zepto.jl0;
import com.zepto.kd1;
import com.zepto.kl0;
import com.zepto.kt6;
import com.zepto.lq7;
import com.zepto.m7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b,\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bi\u0010jJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0007R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010M\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010H\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR\"\u0010U\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010H\u001a\u0004\bS\u0010J\"\u0004\bT\u0010LR\"\u0010Y\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010H\u001a\u0004\bW\u0010J\"\u0004\bX\u0010LR\"\u0010]\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010H\u001a\u0004\b[\u0010J\"\u0004\b\\\u0010LR\"\u0010a\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010H\u001a\u0004\b_\u0010J\"\u0004\b`\u0010LR\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010H\u001a\u0004\bc\u0010J\"\u0004\bd\u0010LR\"\u0010h\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010H\u001a\u0004\bf\u0010J\"\u0004\bg\u0010L¨\u0006k"}, d2 = {"Lcom/nic/mparivahan/ClServicesMainScreens/ClDetails;", "Lcom/zepto/pq;", "", "H1", "I1", "r1", "", "message", "S1", "Q1", "validity", "", "U1", "x1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "date", "w1", "Lcom/zepto/m7;", "C", "Lcom/zepto/m7;", "mActivityClDetailsBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "E1", "()Landroid/content/Context;", "e2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "F1", "()Landroid/app/ProgressDialog;", "g2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "B1", "()Lcom/zepto/wa3;", "b2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "G1", "()Lcom/zepto/wl5;", "h2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/zepto/kl0;", "H", "Lcom/zepto/kl0;", "C1", "()Lcom/zepto/kl0;", "c2", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "I", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "D1", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "d2", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "J", "Ljava/lang/String;", "z1", "()Ljava/lang/String;", "Y1", "(Ljava/lang/String;)V", "dlValue", "K", "A1", "Z1", "dobValue", "L", "getMobileNumber", "f2", "mobileNumber", "M", "y1", "W1", "clPhoto", "N", "getAddress", "V1", "address", "O", "getIssuing_authority", "a2", "issuing_authority", "P", "getValidity", "i2", "Q", "getCl_Status", "X1", "cl_Status", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ClDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public m7 mActivityClDetailsBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String mobileNumber = "NA";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String clPhoto = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String validity = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String cl_Status = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetClPojo getClPojo) {
            ClDetails.this.F1().dismiss();
            try {
                String cl_No = getClPojo.getCl_No();
                m7 m7Var = null;
                if (cl_No != null && cl_No.length() != 0) {
                    ClDetails.this.V1(getClPojo.getAddress());
                    ClDetails.this.i2(getClPojo.getValidity());
                    ClDetails.this.a2(getClPojo.getIssuing_authority());
                    ClDetails.this.X1(getClPojo.getCl_Status());
                    if (!Intrinsics.areEqual(ClDetails.this.G1().b(), "552")) {
                        if (!ClDetails.this.x1(getClPojo.getValidity())) {
                            m7 m7Var2 = ClDetails.this.mActivityClDetailsBinding;
                            if (m7Var2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            } else {
                                m7Var = m7Var2;
                            }
                            m7Var.D.setVisibility(8);
                            ClDetails.this.Q1(ClDetails.this.B1().b("cm_not_eligible", "Your Licence is expired hence") + ' ' + ClDetails.this.G1().k() + ' ' + ClDetails.this.B1().b("cl_service_not_allowed", " Service is not allowed for your Licence."));
                            return;
                        }
                        m7 m7Var3 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            m7Var3 = null;
                        }
                        m7Var3.D.setVisibility(0);
                        m7 m7Var4 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            m7Var4 = null;
                        }
                        m7Var4.q0.setText(StringsKt__StringsKt.trim((CharSequence) getClPojo.getName()).toString());
                        m7 m7Var5 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            m7Var5 = null;
                        }
                        m7Var5.h0.setText(StringsKt__StringsKt.trim((CharSequence) getClPojo.getFather_Name()).toString());
                        String mobile_No = getClPojo.getMobile_No();
                        if (mobile_No == null || mobile_No.length() == 0) {
                            m7 m7Var6 = ClDetails.this.mActivityClDetailsBinding;
                            if (m7Var6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                                m7Var6 = null;
                            }
                            m7Var6.n0.setText("NA");
                            ClDetails.this.f2("NA");
                        } else {
                            m7 m7Var7 = ClDetails.this.mActivityClDetailsBinding;
                            if (m7Var7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                                m7Var7 = null;
                            }
                            m7Var7.n0.setText(StringsKt__StringsKt.trim((CharSequence) getClPojo.getMobile_No()).toString());
                            ClDetails.this.f2(StringsKt__StringsKt.trim((CharSequence) getClPojo.getMobile_No()).toString());
                        }
                        m7 m7Var8 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            m7Var8 = null;
                        }
                        m7Var8.b0.setText(StringsKt__StringsKt.trim((CharSequence) getClPojo.getAddress()).toString());
                        m7 m7Var9 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            m7Var9 = null;
                        }
                        m7Var9.j0.setText(StringsKt__StringsKt.trim((CharSequence) getClPojo.getCl_No()).toString());
                        m7 m7Var10 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            m7Var10 = null;
                        }
                        m7Var10.l0.setText(ClDetails.this.w1(getClPojo.getValidity()));
                        m7 m7Var11 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            m7Var11 = null;
                        }
                        m7Var11.e0.setText("NA");
                        ClDetails.this.W1(getClPojo.getPhoto());
                        String clPhoto = ClDetails.this.getClPhoto();
                        if (clPhoto != null && clPhoto.length() != 0 && !Intrinsics.areEqual(ClDetails.this.getClPhoto(), "")) {
                            m7 m7Var12 = ClDetails.this.mActivityClDetailsBinding;
                            if (m7Var12 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                                m7Var12 = null;
                            }
                            m7Var12.J.f.setVisibility(0);
                            m7 m7Var13 = ClDetails.this.mActivityClDetailsBinding;
                            if (m7Var13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            } else {
                                m7Var = m7Var13;
                            }
                            m7Var.J.b.setImageBitmap(kt6.a(ClDetails.this.getClPhoto()));
                            return;
                        }
                        m7 m7Var14 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                        } else {
                            m7Var = m7Var14;
                        }
                        m7Var.J.f.setVisibility(8);
                        return;
                    }
                    if (ClDetails.this.U1(getClPojo.getValidity())) {
                        m7 m7Var15 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                        } else {
                            m7Var = m7Var15;
                        }
                        m7Var.D.setVisibility(8);
                        ClDetails clDetails = ClDetails.this;
                        clDetails.Q1(clDetails.B1().b("cl_is_valid_till", "Your CL is valid till " + ClDetails.this.w1(getClPojo.getValidity()) + ' ' + ClDetails.this.G1().k() + ClDetails.this.B1().b("cl_service_not_allowed", " Service is not allowed for your Licence.")));
                        return;
                    }
                    m7 m7Var16 = ClDetails.this.mActivityClDetailsBinding;
                    if (m7Var16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                        m7Var16 = null;
                    }
                    m7Var16.D.setVisibility(0);
                    m7 m7Var17 = ClDetails.this.mActivityClDetailsBinding;
                    if (m7Var17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                        m7Var17 = null;
                    }
                    m7Var17.q0.setText(StringsKt__StringsKt.trim((CharSequence) getClPojo.getName()).toString());
                    m7 m7Var18 = ClDetails.this.mActivityClDetailsBinding;
                    if (m7Var18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                        m7Var18 = null;
                    }
                    m7Var18.h0.setText(StringsKt__StringsKt.trim((CharSequence) getClPojo.getFather_Name()).toString());
                    String mobile_No2 = getClPojo.getMobile_No();
                    if (mobile_No2 == null || mobile_No2.length() == 0) {
                        m7 m7Var19 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            m7Var19 = null;
                        }
                        m7Var19.n0.setText("NA");
                        ClDetails.this.f2("NA");
                    } else {
                        m7 m7Var20 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var20 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            m7Var20 = null;
                        }
                        m7Var20.n0.setText(StringsKt__StringsKt.trim((CharSequence) getClPojo.getMobile_No()).toString());
                        ClDetails.this.f2(StringsKt__StringsKt.trim((CharSequence) getClPojo.getMobile_No()).toString());
                    }
                    m7 m7Var21 = ClDetails.this.mActivityClDetailsBinding;
                    if (m7Var21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                        m7Var21 = null;
                    }
                    m7Var21.b0.setText(StringsKt__StringsKt.trim((CharSequence) getClPojo.getAddress()).toString());
                    m7 m7Var22 = ClDetails.this.mActivityClDetailsBinding;
                    if (m7Var22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                        m7Var22 = null;
                    }
                    m7Var22.j0.setText(StringsKt__StringsKt.trim((CharSequence) getClPojo.getCl_No()).toString());
                    m7 m7Var23 = ClDetails.this.mActivityClDetailsBinding;
                    if (m7Var23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                        m7Var23 = null;
                    }
                    m7Var23.l0.setText(ClDetails.this.w1(getClPojo.getValidity()));
                    m7 m7Var24 = ClDetails.this.mActivityClDetailsBinding;
                    if (m7Var24 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                        m7Var24 = null;
                    }
                    m7Var24.e0.setText("NA");
                    ClDetails.this.W1(getClPojo.getPhoto());
                    String clPhoto2 = ClDetails.this.getClPhoto();
                    if (clPhoto2 != null && clPhoto2.length() != 0 && !Intrinsics.areEqual(ClDetails.this.getClPhoto(), "")) {
                        m7 m7Var25 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var25 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                            m7Var25 = null;
                        }
                        m7Var25.J.f.setVisibility(0);
                        m7 m7Var26 = ClDetails.this.mActivityClDetailsBinding;
                        if (m7Var26 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                        } else {
                            m7Var = m7Var26;
                        }
                        m7Var.J.b.setImageBitmap(kt6.a(ClDetails.this.getClPhoto()));
                        return;
                    }
                    m7 m7Var27 = ClDetails.this.mActivityClDetailsBinding;
                    if (m7Var27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                    } else {
                        m7Var = m7Var27;
                    }
                    m7Var.J.f.setVisibility(8);
                    return;
                }
                ClDetails.this.Q1("Details are not available.");
                m7 m7Var28 = ClDetails.this.mActivityClDetailsBinding;
                if (m7Var28 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                } else {
                    m7Var = m7Var28;
                }
                m7Var.D.setVisibility(8);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetClPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ClDetails.this.F1().dismiss();
            Log.d("mGetClPojo_error", "error");
            ClDetails.this.Q1("Details are not available.");
            m7 m7Var = ClDetails.this.mActivityClDetailsBinding;
            if (m7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                m7Var = null;
            }
            m7Var.D.setVisibility(8);
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private final void H1() {
        e2(this);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_cl_details);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mActivityClDetailsBinding = (m7) lq7VarF;
        b2(new wa3(E1()));
        h2(new wl5(E1()));
        g2(new ProgressDialog(E1()));
        F1().setMessage(B1().b("label_challan_please_wait", getString(R.string.please_wait)));
        F1().setCancelable(false);
        F1().setCanceledOnTouchOutside(false);
        d2(ClInter.INSTANCE.a(E1()));
        c2((kl0) new z(this, new sn0(new jl0(D1()))).a(kl0.class));
        try {
            Z1(String.valueOf(getIntent().getStringExtra("dobValue")));
            Y1(String.valueOf(getIntent().getStringExtra("dlValue")));
            m7 m7Var = this.mActivityClDetailsBinding;
            m7 m7Var2 = null;
            if (m7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                m7Var = null;
            }
            m7Var.T.setText("CL No. : " + z1());
            m7 m7Var3 = this.mActivityClDetailsBinding;
            if (m7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            } else {
                m7Var2 = m7Var3;
            }
            m7Var2.J.g.setText(G1().k());
            F1().show();
            String string = StringsKt__StringsKt.trim((CharSequence) z1()).toString();
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
            byte[] bytes = string.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            String strEncodeToString = Base64.encodeToString(bytes, 0);
            String strA1 = A1();
            Charset charsetForName2 = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
            byte[] bytes2 = strA1.getBytes(charsetForName2);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            String strEncodeToString2 = Base64.encodeToString(bytes2, 0);
            kl0 kl0VarC1 = C1();
            Intrinsics.checkNotNull(strEncodeToString);
            Intrinsics.checkNotNull(strEncodeToString2);
            kl0VarC1.j(this, strEncodeToString, strEncodeToString2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void I1() {
        m7 m7Var = this.mActivityClDetailsBinding;
        m7 m7Var2 = null;
        if (m7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var = null;
        }
        m7Var.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetails.J1(this.a, view);
            }
        });
        m7 m7Var3 = this.mActivityClDetailsBinding;
        if (m7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var3 = null;
        }
        m7Var3.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetails.K1(this.a, view);
            }
        });
        m7 m7Var4 = this.mActivityClDetailsBinding;
        if (m7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var4 = null;
        }
        m7Var4.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetails.L1(this.a, view);
            }
        });
        m7 m7Var5 = this.mActivityClDetailsBinding;
        if (m7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var5 = null;
        }
        m7Var5.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetails.M1(this.a, view);
            }
        });
        m7 m7Var6 = this.mActivityClDetailsBinding;
        if (m7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var6 = null;
        }
        m7Var6.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetails.N1(this.a, view);
            }
        });
        m7 m7Var7 = this.mActivityClDetailsBinding;
        if (m7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var7 = null;
        }
        m7Var7.J.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetails.O1(this.a, view);
            }
        });
        m7 m7Var8 = this.mActivityClDetailsBinding;
        if (m7Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
        } else {
            m7Var2 = m7Var8;
        }
        m7Var2.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.al0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetails.P1(this.a, view);
            }
        });
    }

    public static final void J1(ClDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m7 m7Var = this$0.mActivityClDetailsBinding;
        m7 m7Var2 = null;
        if (m7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var = null;
        }
        m7Var.I.setVisibility(0);
        m7 m7Var3 = this$0.mActivityClDetailsBinding;
        if (m7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var3 = null;
        }
        m7Var3.y.setVisibility(0);
        m7 m7Var4 = this$0.mActivityClDetailsBinding;
        if (m7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
        } else {
            m7Var2 = m7Var4;
        }
        m7Var2.w.setVisibility(8);
    }

    public static final void K1(ClDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m7 m7Var = this$0.mActivityClDetailsBinding;
        m7 m7Var2 = null;
        if (m7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var = null;
        }
        m7Var.I.setVisibility(8);
        m7 m7Var3 = this$0.mActivityClDetailsBinding;
        if (m7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var3 = null;
        }
        m7Var3.y.setVisibility(8);
        m7 m7Var4 = this$0.mActivityClDetailsBinding;
        if (m7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
        } else {
            m7Var2 = m7Var4;
        }
        m7Var2.w.setVisibility(0);
    }

    public static final void L1(ClDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m7 m7Var = this$0.mActivityClDetailsBinding;
        m7 m7Var2 = null;
        if (m7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var = null;
        }
        m7Var.H.setVisibility(0);
        m7 m7Var3 = this$0.mActivityClDetailsBinding;
        if (m7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var3 = null;
        }
        m7Var3.x.setVisibility(8);
        m7 m7Var4 = this$0.mActivityClDetailsBinding;
        if (m7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
        } else {
            m7Var2 = m7Var4;
        }
        m7Var2.z.setVisibility(0);
    }

    public static final void M1(ClDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m7 m7Var = this$0.mActivityClDetailsBinding;
        m7 m7Var2 = null;
        if (m7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var = null;
        }
        m7Var.H.setVisibility(8);
        m7 m7Var3 = this$0.mActivityClDetailsBinding;
        if (m7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var3 = null;
        }
        m7Var3.x.setVisibility(0);
        m7 m7Var4 = this$0.mActivityClDetailsBinding;
        if (m7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
        } else {
            m7Var2 = m7Var4;
        }
        m7Var2.z.setVisibility(8);
    }

    public static final void N1(ClDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void O1(ClDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void P1(ClDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m7 m7Var = this$0.mActivityClDetailsBinding;
        if (m7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var = null;
        }
        Editable text = m7Var.r0.getText();
        if (text == null || text.length() == 0) {
            Toast.makeText(this$0, this$0.B1().b("duration_year", "Please enter duration year"), 0).show();
            return;
        }
        m7 m7Var2 = this$0.mActivityClDetailsBinding;
        if (m7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var2 = null;
        }
        Editable text2 = m7Var2.o0.getText();
        if (text2 == null || text2.length() == 0) {
            Toast.makeText(this$0, this$0.B1().b("duration_monht", "Please enter duration month"), 0).show();
            return;
        }
        m7 m7Var3 = this$0.mActivityClDetailsBinding;
        if (m7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var3 = null;
        }
        if (Integer.parseInt(m7Var3.o0.getText().toString()) > 12) {
            Toast.makeText(this$0, this$0.B1().b("duration_month_0_12", "Month duration should be 0 to 12"), 0).show();
            return;
        }
        m7 m7Var4 = this$0.mActivityClDetailsBinding;
        if (m7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var4 = null;
        }
        if (StringsKt__StringsJVMKt.equals(m7Var4.P.getSelectedItem().toString(), "Select Marital Status", true)) {
            Toast.makeText(this$0, this$0.B1().b("plz_select_ms", "Please select marital status"), 0).show();
            return;
        }
        m7 m7Var5 = this$0.mActivityClDetailsBinding;
        if (m7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var5 = null;
        }
        if (StringsKt__StringsJVMKt.equals(m7Var5.O.getSelectedItem().toString(), "Select Religion", true)) {
            Toast.makeText(this$0, this$0.B1().b("PLEASE_SELECT_REGION", "Please select religion"), 0).show();
            return;
        }
        m7 m7Var6 = this$0.mActivityClDetailsBinding;
        if (m7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var6 = null;
        }
        if (m7Var6.F.getText().length() < 3) {
            Toast.makeText(this$0, this$0.B1().b("edit_dl_serv_enter_birth_plac", "Please enter birth place"), 0).show();
            return;
        }
        m7 m7Var7 = this$0.mActivityClDetailsBinding;
        if (m7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var7 = null;
        }
        Editable text3 = m7Var7.G.getText();
        if (text3 == null || text3.length() == 0) {
            Toast.makeText(this$0, this$0.B1().b("plz_enter_ps_name", "Please enter police station name"), 0).show();
            return;
        }
        m7 m7Var8 = this$0.mActivityClDetailsBinding;
        if (m7Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var8 = null;
        }
        if (m7Var8.G.getText().length() < 3) {
            Toast.makeText(this$0, this$0.B1().b("plz_enter_valid_ps_name", "Please enter valid police station name"), 0).show();
            return;
        }
        m7 m7Var9 = this$0.mActivityClDetailsBinding;
        if (m7Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var9 = null;
        }
        if (StringsKt__StringsJVMKt.equals(m7Var9.N.getSelectedItem().toString(), "Select Criminal History", true)) {
            Toast.makeText(this$0, this$0.B1().b("pls_select_cm", "Please select criminal history"), 0).show();
            return;
        }
        m7 m7Var10 = this$0.mActivityClDetailsBinding;
        if (m7Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var10 = null;
        }
        if (StringsKt__StringsJVMKt.equals(m7Var10.N.getSelectedItem().toString(), "Yes", true)) {
            this$0.S1(this$0.B1().b("cm_not_eligible", "You are not eligible to apply application because of your criminal history"));
            return;
        }
        m7 m7Var11 = this$0.mActivityClDetailsBinding;
        if (m7Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var11 = null;
        }
        try {
            if (Integer.parseInt(m7Var11.r0.getText().toString()) >= 1) {
                Intent intent = new Intent(this$0, (Class<?>) ClRtoSelect.class);
                intent.putExtra("dlValue", this$0.z1());
                intent.putExtra("dobValue", this$0.A1());
                m7 m7Var12 = this$0.mActivityClDetailsBinding;
                if (m7Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                    m7Var12 = null;
                }
                intent.putExtra("fatherName", m7Var12.h0.getText());
                m7 m7Var13 = this$0.mActivityClDetailsBinding;
                if (m7Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                    m7Var13 = null;
                }
                intent.putExtra("clName", m7Var13.q0.getText());
                intent.putExtra("clPhoto", this$0.clPhoto);
                intent.putExtra("mobileNumber", this$0.mobileNumber);
                intent.putExtra("address", this$0.address);
                intent.putExtra("validity", this$0.validity);
                intent.putExtra("issuing_authority", this$0.issuing_authority);
                intent.putExtra("cl_Status", this$0.cl_Status);
                this$0.startActivity(intent);
                this$0.finish();
                return;
            }
            m7 m7Var14 = this$0.mActivityClDetailsBinding;
            if (m7Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                m7Var14 = null;
            }
            if (Integer.parseInt(m7Var14.o0.getText().toString()) < 1) {
                Toast.makeText(this$0, this$0.B1().b("valid_duration_year", "Please enter valid stay of duration"), 0).show();
                return;
            }
            Intent intent2 = new Intent(this$0, (Class<?>) ClRtoSelect.class);
            intent2.putExtra("dlValue", this$0.z1());
            intent2.putExtra("dobValue", this$0.A1());
            m7 m7Var15 = this$0.mActivityClDetailsBinding;
            if (m7Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                m7Var15 = null;
            }
            intent2.putExtra("fatherName", m7Var15.h0.getText());
            m7 m7Var16 = this$0.mActivityClDetailsBinding;
            if (m7Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
                m7Var16 = null;
            }
            intent2.putExtra("clName", m7Var16.q0.getText());
            intent2.putExtra("clPhoto", this$0.clPhoto);
            intent2.putExtra("mobileNumber", this$0.mobileNumber);
            intent2.putExtra("address", this$0.address);
            intent2.putExtra("validity", this$0.validity);
            intent2.putExtra("issuing_authority", this$0.issuing_authority);
            intent2.putExtra("cl_Status", this$0.cl_Status);
            this$0.startActivity(intent2);
            this$0.finish();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(B1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(B1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(B1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetails.R1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void R1(Dialog d, ClDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    private final void S1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(B1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(B1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(B1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetails.T1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void T1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final String A1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final wa3 B1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final kl0 C1() {
        kl0 kl0Var = this.mClDlViewModel;
        if (kl0Var != null) {
            return kl0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClDlViewModel");
        return null;
    }

    public final ClInter D1() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final Context E1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ProgressDialog F1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wl5 G1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final boolean U1(String validity) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Date date = simpleDateFormat.parse(str);
            Log.d("date_date1", date.toString());
            LocalDate localDate = LocalDate.parse(validity);
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            Log.d("date_mLocalDate", localDate.toString());
            LocalDate localDateMinusDays = localDate.minusDays(0L);
            Log.d("date_newCurrentLocalDate", localDateMinusDays.toString());
            Date date2 = simpleDateFormat.parse(localDateMinusDays.toString());
            Log.d("date_newCurrentDate", date2.toString());
            return date2.compareTo(date) >= 0;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cl_Status = str;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.issuing_authority = str;
    }

    public final void b2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void c2(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void d2(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void e2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void f2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void g2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void h2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.validity = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        H1();
        I1();
        r1();
        ta3.a aVar = ta3.a;
        m7 m7Var = this.mActivityClDetailsBinding;
        if (m7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivityClDetailsBinding");
            m7Var = null;
        }
        aVar.Z(this, m7Var);
    }

    public final void r1() {
        C1().p().g(this, new c(new a()));
        C1().l().g(this, new c(new b()));
    }

    public final String w1(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            String str = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(date));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return w1(date);
        }
    }

    public final boolean x1(String validity) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return simpleDateFormat.parse(validity).compareTo(simpleDateFormat.parse(str)) >= 0;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final String getClPhoto() {
        return this.clPhoto;
    }

    public final String z1() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }
}
