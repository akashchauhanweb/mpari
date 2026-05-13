package com.nic.mparivahan.ClServices.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo;
import com.nic.mparivahan.ClServices.Pojo.ServiceSubmitResponse;
import com.nic.mparivahan.ClServices.View.ChangeNameCl;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem;
import com.zepto.d86;
import com.zepto.j54;
import com.zepto.jl0;
import com.zepto.kl0;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.rb1;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.w6;
import com.zepto.wa3;
import com.zepto.wl5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010A\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R\"\u0010E\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u00108\u001a\u0004\bC\u0010:\"\u0004\bD\u0010<R\"\u0010I\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u00108\u001a\u0004\bG\u0010:\"\u0004\bH\u0010<R\"\u0010M\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u00108\u001a\u0004\bK\u0010:\"\u0004\bL\u0010<R\"\u0010Q\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R\"\u0010U\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u00108\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R\"\u0010Y\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u00108\u001a\u0004\bW\u0010:\"\u0004\bX\u0010<R\"\u0010]\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u00108\u001a\u0004\b[\u0010:\"\u0004\b\\\u0010<R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010q\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u00108\u001a\u0004\bo\u0010:\"\u0004\bp\u0010<R\"\u0010u\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u00108\u001a\u0004\bs\u0010:\"\u0004\bt\u0010<R\"\u0010y\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u00108\u001a\u0004\bw\u0010:\"\u0004\bx\u0010<R\"\u0010}\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u00108\u001a\u0004\b{\u0010:\"\u0004\b|\u0010<R$\u0010\u0081\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u00108\u001a\u0004\b\u007f\u0010:\"\u0005\b\u0080\u0001\u0010<R&\u0010\u0085\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u00108\u001a\u0005\b\u0083\u0001\u0010:\"\u0005\b\u0084\u0001\u0010<R\u001a\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R%\u0010\u008e\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u0001\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R)\u0010\u0095\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0090\u0001\u0010>\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0099\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u00108\u001a\u0005\b\u0097\u0001\u0010:\"\u0005\b\u0098\u0001\u0010<¨\u0006\u009c\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/ChangeNameCl;", "Lcom/zepto/pq;", "", "V1", "S1", "R1", "", "message", "g2", "Landroid/content/Context;", "context", "d2", "c2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/w6;", "C", "Lcom/zepto/w6;", "F1", "()Lcom/zepto/w6;", "o2", "(Lcom/zepto/w6;)V", "mBinding", "D", "Landroid/content/Context;", "I1", "()Landroid/content/Context;", "r2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "K1", "()Landroid/app/ProgressDialog;", "t2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "O1", "()Lcom/zepto/wa3;", "y2", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "N1", "()Lcom/zepto/wl5;", "x2", "(Lcom/zepto/wl5;)V", "sarathiSession", "H", "Ljava/lang/String;", "B1", "()Ljava/lang/String;", "l2", "(Ljava/lang/String;)V", "dlValue", "I", "C1", "m2", "dobValue", "J", "D1", "n2", "fatherName", "K", "x1", "i2", "clName", "L", "y1", "j2", "clPhoto", "M", "L1", "v2", "rtoCode", "N", "P1", "z2", "stateCode", "O", "M1", "w2", "rtoName", "P", "J1", "s2", "Mobile_no", "Lcom/zepto/kl0;", "Q", "Lcom/zepto/kl0;", "G1", "()Lcom/zepto/kl0;", "p2", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "R", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "H1", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "q2", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "S", "getMiddleName", "setMiddleName", "middleName", "T", "getRelMiddleName", "setRelMiddleName", "relMiddleName", "U", "w1", "setAddress", "address", "V", "E1", "setIssuing_authority", "issuing_authority", "W", "Q1", "setValidity", "validity", "X", "z1", "setCl_Status", "cl_Status", "Lcom/zepto/rb1;", "Y", "Lcom/zepto/rb1;", "viewModel", "", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/ReasonsMasterItem;", "Z", "Ljava/util/List;", "mReasonList", "", "a0", "A1", "()I", "k2", "(I)V", "code", "b0", "getRelationCode", "u2", "relationCode", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nChangeNameCl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeNameCl.kt\ncom/nic/mparivahan/ClServices/View/ChangeNameCl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,695:1\n1855#2,2:696\n260#3:698\n*S KotlinDebug\n*F\n+ 1 ChangeNameCl.kt\ncom/nic/mparivahan/ClServices/View/ChangeNameCl\n*L\n675#1:696,2\n276#1:698\n*E\n"})
public final class ChangeNameCl extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public w6 mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String fatherName;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String clName;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String clPhoto;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public rb1 viewModel;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public List mReasonList;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public int code;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String middleName = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String relMiddleName = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String validity = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String cl_Status = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String relationCode = "";

    public static final class a implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Ref.ObjectRef b;

        public a(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            ChangeNameCl.this.u2(((SpinnerPojo) ((ArrayList) this.b.element).get(i)).getCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNull(charSequence);
            if (charSequence.length() > 0) {
                if (ChangeNameCl.this.F1().c0.getText().toString().length() <= 0) {
                    EditText editText = ChangeNameCl.this.F1().U;
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) charSequence);
                    sb.append(' ');
                    sb.append((Object) ChangeNameCl.this.F1().c0.getText());
                    sb.append((Object) ChangeNameCl.this.F1().W.getText());
                    editText.setText(sb.toString());
                    return;
                }
                EditText editText2 = ChangeNameCl.this.F1().U;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) charSequence);
                sb2.append(' ');
                sb2.append((Object) ChangeNameCl.this.F1().c0.getText());
                sb2.append(' ');
                sb2.append((Object) ChangeNameCl.this.F1().W.getText());
                editText2.setText(sb2.toString());
            }
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (String.valueOf(charSequence).length() > 0) {
                EditText editText = ChangeNameCl.this.F1().U;
                StringBuilder sb = new StringBuilder();
                sb.append((Object) ChangeNameCl.this.F1().S.getText());
                sb.append(' ');
                sb.append((Object) charSequence);
                sb.append(' ');
                sb.append((Object) ChangeNameCl.this.F1().W.getText());
                editText.setText(sb.toString());
            }
        }
    }

    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (String.valueOf(charSequence).length() > 0) {
                if (ChangeNameCl.this.F1().c0.getText().toString().length() <= 0) {
                    EditText editText = ChangeNameCl.this.F1().U;
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) ChangeNameCl.this.F1().S.getText());
                    sb.append(' ');
                    sb.append((Object) ChangeNameCl.this.F1().c0.getText());
                    sb.append((Object) charSequence);
                    editText.setText(sb.toString());
                    return;
                }
                EditText editText2 = ChangeNameCl.this.F1().U;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) ChangeNameCl.this.F1().S.getText());
                sb2.append(' ');
                sb2.append((Object) ChangeNameCl.this.F1().c0.getText());
                sb2.append(' ');
                sb2.append((Object) charSequence);
                editText2.setText(sb2.toString());
            }
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(ServiceSubmitResponse serviceSubmitResponse) {
            String str = "Something went wrong,Please try after some time!";
            String cl_Status = "service_is_not_present";
            Log.d("nameResponse", serviceSubmitResponse.toString());
            ChangeNameCl.this.K1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(serviceSubmitResponse.getStatus_code(), "00", true)) {
                    String applicationNo = serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo();
                    if (applicationNo == null || applicationNo.length() == 0) {
                        ChangeNameCl changeNameCl = ChangeNameCl.this;
                        changeNameCl.g2(changeNameCl.O1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                        str = str;
                    } else {
                        try {
                            Intent intent = new Intent(ChangeNameCl.this, (Class<?>) ClSubmitScreen.class);
                            intent.putExtra("appNumber", serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dlValue", ChangeNameCl.this.B1());
                            intent.putExtra("dobValue", ChangeNameCl.this.C1());
                            intent.putExtra("fatherName", ChangeNameCl.this.D1());
                            intent.putExtra("clName", ChangeNameCl.this.x1());
                            intent.putExtra("clPhoto", ChangeNameCl.this.y1());
                            intent.putExtra("stateCode", ChangeNameCl.this.P1());
                            intent.putExtra("rtoCode", ChangeNameCl.this.L1());
                            intent.putExtra("rtoName", ChangeNameCl.this.M1());
                            intent.putExtra("Mobile_no", ChangeNameCl.this.J1());
                            intent.putExtra("address", ChangeNameCl.this.getAddress()).toString();
                            intent.putExtra("issuing_authority", ChangeNameCl.this.getIssuing_authority()).toString();
                            intent.putExtra("validity", ChangeNameCl.this.getValidity()).toString();
                            cl_Status = ChangeNameCl.this.getCl_Status();
                            intent.putExtra("cl_Status", cl_Status).toString();
                            ChangeNameCl.this.startActivity(intent);
                            str = intent;
                        } catch (Exception unused) {
                        }
                    }
                } else if (StringsKt__StringsJVMKt.equals(serviceSubmitResponse.getStatus_code(), "01", true)) {
                    ChangeNameCl.this.g2(serviceSubmitResponse.getStatus_desc());
                    str = str;
                } else {
                    ChangeNameCl changeNameCl2 = ChangeNameCl.this;
                    changeNameCl2.g2(changeNameCl2.O1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                    str = str;
                }
            } catch (Exception unused2) {
                ChangeNameCl changeNameCl3 = ChangeNameCl.this;
                changeNameCl3.g2(changeNameCl3.O1().b(cl_Status, str));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ServiceSubmitResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            try {
                if (StringsKt__StringsJVMKt.equals$default(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, null)) {
                    ChangeNameCl.this.mReasonList = getReasonsTransWiseResponse.getReasonsMaster();
                } else {
                    ChangeNameCl.this.g2(getReasonsTransWiseResponse.getStatusDesc());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetReasonsTransWiseResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g implements d86.b {
        public g() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            ReasonsMasterItem reasonsMasterItem;
            ChangeNameCl changeNameCl = ChangeNameCl.this;
            List list = changeNameCl.mReasonList;
            Integer reasonCode = (list == null || (reasonsMasterItem = (ReasonsMasterItem) list.get(i)) == null) ? null : reasonsMasterItem.getReasonCode();
            Intrinsics.checkNotNull(reasonCode);
            changeNameCl.k2(reasonCode.intValue());
            ChangeNameCl.this.F1().y.setText(str);
            ChangeNameCl.this.F1().y.setContentDescription("" + ChangeNameCl.this.getCode());
            if (StringsKt__StringsJVMKt.equals(ChangeNameCl.this.F1().y.getText().toString(), "Miscellaneous", true)) {
                ChangeNameCl.this.F1().z.setVisibility(0);
            } else {
                ChangeNameCl.this.F1().z.setVisibility(8);
            }
        }
    }

    public static final class h implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public h(Function1 function) {
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

    public static final void T1(ChangeNameCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) ClDetailsTop.class);
        intent.putExtra("dlValue", this$0.B1());
        intent.putExtra("dobValue", this$0.C1());
        intent.putExtra("fatherName", this$0.D1());
        intent.putExtra("clName", this$0.x1());
        intent.putExtra("clPhoto", this$0.y1());
        intent.putExtra("address", this$0.address).toString();
        intent.putExtra("issuing_authority", this$0.issuing_authority).toString();
        intent.putExtra("validity", this$0.validity).toString();
        intent.putExtra("cl_Status", this$0.cl_Status).toString();
        this$0.startActivity(intent);
    }

    public static final void U1(ChangeNameCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.I1(), this$0.O1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        if (this$0.code == 0) {
            Toast.makeText(this$0, this$0.O1().b("label_select_reason", this$0.getString(R.string.sel_rsn)), 1).show();
            return;
        }
        LinearLayout idDupdl = this$0.F1().z;
        Intrinsics.checkNotNullExpressionValue(idDupdl, "idDupdl");
        if (idDupdl.getVisibility() == 0 && this$0.F1().w.getText().length() < 3) {
            Toast.makeText(this$0, this$0.O1().b("label_dl_serv_enter_reas_manul", this$0.getString(R.string.enter_Reason)), 1).show();
            return;
        }
        Editable text = this$0.F1().S.getText();
        if (text == null || text.length() == 0) {
            Toast.makeText(this$0, this$0.O1().b("PLEASE_ENTER_FIRST_NAME", this$0.getString(R.string.enter_first_name)), 0).show();
            return;
        }
        if (this$0.F1().S.getText().length() < 3) {
            Toast.makeText(this$0, this$0.O1().b("enter_valid_3_first_name", this$0.getString(R.string.enter_valid_3_first_name)), 0).show();
            return;
        }
        Editable text2 = this$0.F1().U.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            Toast.makeText(this$0, this$0.O1().b("PLEASE_ENTER_FULL_NAME", this$0.getString(R.string.enter_full_name)), 0).show();
            return;
        }
        if (this$0.F1().U.getText().length() < 3) {
            Toast.makeText(this$0, this$0.O1().b("enter_valid_3_full_name", this$0.getString(R.string.enter_valid_3_full_name)), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.relationCode, "0")) {
            Toast.makeText(this$0, this$0.O1().b("pls_enter_relation", "Please enter relation"), 0).show();
            return;
        }
        Editable text3 = this$0.F1().d0.getText();
        if (text3 == null || text3.length() == 0) {
            Toast.makeText(this$0, this$0.O1().b("PLEASE_ENTER_REL_FIRST_NAME", this$0.getString(R.string.rel_first_name)), 0).show();
            return;
        }
        if (this$0.F1().d0.getText().length() < 3) {
            Toast.makeText(this$0, this$0.O1().b("PLEASE_ENTER_REL_VALID_FIRST_NAME", this$0.getString(R.string.rel_valid_first_name)), 0).show();
            return;
        }
        String string = this$0.F1().c0.getText().toString();
        if (string == null || string.length() == 0) {
            this$0.middleName = "";
        } else {
            this$0.middleName = this$0.F1().c0.getText().toString();
        }
        String string2 = this$0.F1().a0.getText().toString();
        if (string2 == null || string2.length() == 0) {
            this$0.relMiddleName = "";
        } else {
            this$0.relMiddleName = this$0.F1().a0.getText().toString();
        }
        this$0.d2(this$0.I1(), this$0.O1().b("label_want_to_proceed", "Are you sure, You want to proceed ?"));
    }

    public static final void W1(ChangeNameCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) ClDetailsTop.class);
            intent.putExtra("dlValue", this$0.B1());
            intent.putExtra("dobValue", this$0.C1());
            intent.putExtra("fatherName", this$0.D1());
            intent.putExtra("clName", this$0.x1());
            intent.putExtra("clPhoto", this$0.y1());
            intent.putExtra("address", this$0.address).toString();
            intent.putExtra("issuing_authority", this$0.issuing_authority).toString();
            intent.putExtra("validity", this$0.validity).toString();
            intent.putExtra("cl_Status", this$0.cl_Status).toString();
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void X1(ChangeNameCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Y1(ChangeNameCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Z1(ChangeNameCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void a2(ChangeNameCl this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K1().dismiss();
        String strB = this$0.O1().b("label_unable_details", this$0.getString(R.string.unable_to_get_details));
        Intrinsics.checkNotNull(strB);
        this$0.g2(strB);
    }

    public static final void b2(ChangeNameCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c2();
    }

    public static final void e2(Dialog d2, ChangeNameCl this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        try {
            this$0.K1().show();
            kl0 kl0VarG1 = this$0.G1();
            String strP1 = this$0.P1();
            String strL1 = this$0.L1();
            String string = this$0.F1().S.getText().toString();
            String str = this$0.middleName;
            String string2 = this$0.F1().Y.getText().toString();
            String string3 = this$0.F1().d0.getText().toString();
            String str2 = this$0.relMiddleName;
            String string4 = this$0.F1().W.getText().toString();
            String str3 = this$0.relationCode;
            String string5 = this$0.F1().T.getText().toString();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this$0.F1().d0.getText());
            sb.append(' ');
            sb.append((Object) this$0.F1().a0.getText());
            sb.append(' ');
            sb.append((Object) this$0.F1().W.getText());
            kl0VarG1.i(this$0, strP1, strL1, string, str, string2, string3, str2, string4, str3, string5, sb.toString(), "559", this$0.B1(), this$0.C1());
        } catch (Exception unused) {
        }
    }

    public static final void f2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(String message) {
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
        textView.setText(O1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(O1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(O1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameCl.h2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final String B1() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }

    public final String C1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final String D1() {
        String str = this.fatherName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fatherName");
        return null;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final String getIssuing_authority() {
        return this.issuing_authority;
    }

    public final w6 F1() {
        w6 w6Var = this.mBinding;
        if (w6Var != null) {
            return w6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final kl0 G1() {
        kl0 kl0Var = this.mClDlViewModel;
        if (kl0Var != null) {
            return kl0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClDlViewModel");
        return null;
    }

    public final ClInter H1() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final Context I1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final String J1() {
        String str = this.Mobile_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("Mobile_no");
        return null;
    }

    public final ProgressDialog K1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String L1() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final String M1() {
        String str = this.rtoName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final wl5 N1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wa3 O1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final String P1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final String getValidity() {
        return this.validity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.util.ArrayList] */
    public final void R1() {
        r2(this);
        y2(new wa3(I1()));
        x2(new wl5(I1()));
        t2(new ProgressDialog(I1()));
        K1().setMessage(O1().b("label_challan_please_wait", getString(R.string.please_wait)));
        K1().setCancelable(false);
        K1().setCanceledOnTouchOutside(false);
        this.viewModel = (rb1) new z(this).a(rb1.class);
        try {
            m2(String.valueOf(getIntent().getStringExtra("dobValue")));
            l2(String.valueOf(getIntent().getStringExtra("dlValue")));
            n2(String.valueOf(getIntent().getStringExtra("fatherName")));
            i2(String.valueOf(getIntent().getStringExtra("clName")));
            j2(String.valueOf(getIntent().getStringExtra("clPhoto")));
            v2(String.valueOf(getIntent().getStringExtra("rtoCode")));
            w2(String.valueOf(getIntent().getStringExtra("rtoName")));
            z2(String.valueOf(getIntent().getStringExtra("stateCode")));
            s2(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            F1().E.g.setText(N1().k());
            F1().K.setText(O1().b("CL_NO", "CL No.") + ' ' + B1());
            String strY1 = y1();
            if (strY1 == null || strY1.length() == 0) {
                F1().E.f.setVisibility(8);
            } else {
                F1().E.f.setVisibility(0);
                F1().E.b.setImageBitmap(kt6.a(y1()));
            }
            this.address = String.valueOf(getIntent().getStringExtra("address"));
            this.issuing_authority = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.validity = String.valueOf(getIntent().getStringExtra("validity"));
            this.cl_Status = String.valueOf(getIntent().getStringExtra("cl_Status"));
        } catch (Exception unused) {
        }
        q2(ClInter.INSTANCE.a(I1()));
        p2((kl0) new z(this, new sn0(new jl0(H1()))).a(kl0.class));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? arrayList = new ArrayList();
        objectRef.element = arrayList;
        arrayList.add(0, new SpinnerPojo("0", "Select Relation"));
        ((ArrayList) objectRef.element).add(1, new SpinnerPojo("F", "Father Name"));
        ((ArrayList) objectRef.element).add(2, new SpinnerPojo("M", "Mother Name"));
        ((ArrayList) objectRef.element).add(3, new SpinnerPojo("H", "Husband Name"));
        ((ArrayList) objectRef.element).add(3, new SpinnerPojo("G", "Guardian Name"));
        F1().J.setAdapter((SpinnerAdapter) new j54(this, (ArrayList) objectRef.element));
        F1().J.setOnItemSelectedListener(new a(objectRef));
        F1().S.addTextChangedListener(new b());
        F1().c0.addTextChangedListener(new c());
        F1().Y.addTextChangedListener(new d());
    }

    public final void S1() {
        F1().P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameCl.T1(this.a, view);
            }
        });
        F1().A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameCl.U1(this.a, view);
            }
        });
    }

    public final void V1() {
        F1().F.g.setText(N1().k());
        F1().F.h.setPaintFlags(F1().F.h.getPaintFlags() | 8);
        F1().F.h.setText(StringsKt__StringsKt.trim((CharSequence) B1()).toString());
        F1().F.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ne0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameCl.W1(this.a, view);
            }
        });
    }

    public final void c2() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.mReasonList;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        d86 d86VarA = d86.INSTANCE.a("Select Reason", arrayList);
        d86VarA.k2(I0(), "ReasonPicker");
        d86VarA.n2(new g());
    }

    public final void d2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(O1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(O1().b("radio_dl_serv_yes", "Proceed"));
        textView2.setText(O1().b("radio_dl_serv_no", "Cancel"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.re0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameCl.f2(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ie0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameCl.e2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final void k2(int i) {
        this.code = i;
    }

    public final void l2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    public final void o2(w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<set-?>");
        this.mBinding = w6Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        w6 w6VarX = w6.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(w6VarX, "inflate(...)");
        o2(w6VarX);
        setContentView(F1().m());
        R1();
        S1();
        F1().E.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.he0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameCl.X1(this.a, view);
            }
        });
        F1().F.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.je0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameCl.Y1(this.a, view);
            }
        });
        F1().G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ke0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameCl.Z1(this.a, view);
            }
        });
        ta3.a.Q(this, F1());
        G1().l().g(this, new mf4() { // from class: com.zepto.le0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeNameCl.a2(this.a, (String) obj);
            }
        });
        G1().s().g(this, new h(new e()));
        F1().J.setSelection(1);
        rb1 rb1Var = null;
        if (com.nic.mparivahan.a.a.a(this)) {
            rb1 rb1Var2 = this.viewModel;
            if (rb1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                rb1Var2 = null;
            }
            rb1Var2.r("559");
        } else {
            Toast.makeText(getApplicationContext(), O1().b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
        }
        rb1 rb1Var3 = this.viewModel;
        if (rb1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            rb1Var = rb1Var3;
        }
        rb1Var.q().g(this, new h(new f()));
        F1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.me0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameCl.b2(this.a, view);
            }
        });
        V1();
    }

    public final void p2(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void q2(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void r2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void s2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Mobile_no = str;
    }

    public final void t2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void u2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relationCode = str;
    }

    public final void v2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    /* JADX INFO: renamed from: w1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final void w2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final String x1() {
        String str = this.clName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clName");
        return null;
    }

    public final void x2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final String y1() {
        String str = this.clPhoto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clPhoto");
        return null;
    }

    public final void y2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public final String getCl_Status() {
        return this.cl_Status;
    }

    public final void z2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }
}
