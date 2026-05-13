package com.nic.mparivahan.LLServices.UI;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo.SubmitResponse;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.LLMainScreen.LlApplicationNumber;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.LlInterface;
import com.nic.mparivahan.LLServices.SubmitLlServiceAPI;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.ChangeOfNameReq;
import com.nic.mparivahan.LLServices.UI.ChangeNameLL;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.zepto.cf2;
import com.zepto.d86;
import com.zepto.df2;
import com.zepto.dm3;
import com.zepto.ef2;
import com.zepto.ff2;
import com.zepto.hl3;
import com.zepto.j54;
import com.zepto.mf4;
import com.zepto.o40;
import com.zepto.q86;
import com.zepto.r86;
import com.zepto.rb1;
import com.zepto.s86;
import com.zepto.ta3;
import com.zepto.uj3;
import com.zepto.wa3;
import com.zepto.wb0;
import com.zepto.wl5;
import com.zepto.y6;
import java.io.Serializable;
import java.text.SimpleDateFormat;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b±\u0001\u0010²\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR \u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010O\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010,R\"\u0010_\u001a\u00020Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010+\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010aR\"\u0010l\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010a\u001a\u0004\bj\u0010c\"\u0004\bk\u0010eR\"\u0010p\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010a\u001a\u0004\bn\u0010c\"\u0004\bo\u0010eR\"\u0010t\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010a\u001a\u0004\br\u0010c\"\u0004\bs\u0010eR\"\u0010x\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010a\u001a\u0004\bv\u0010c\"\u0004\bw\u0010eR\"\u0010|\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010a\u001a\u0004\bz\u0010c\"\u0004\b{\u0010eR#\u0010\u0080\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010a\u001a\u0004\b~\u0010c\"\u0004\b\u007f\u0010eR&\u0010\u0084\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010a\u001a\u0005\b\u0082\u0001\u0010c\"\u0005\b\u0083\u0001\u0010eR&\u0010\u0088\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010a\u001a\u0005\b\u0086\u0001\u0010c\"\u0005\b\u0087\u0001\u0010eR&\u0010\u008c\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010a\u001a\u0005\b\u008a\u0001\u0010c\"\u0005\b\u008b\u0001\u0010eR\u0018\u0010\u008e\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010aR\u0018\u0010\u0090\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010aR*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010°\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001¨\u0006³\u0001"}, d2 = {"Lcom/nic/mparivahan/LLServices/UI/ChangeNameLL;", "Lcom/zepto/o40;", "", "f2", "N1", "e2", "k2", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FormOneRequest;", "M1", "Lcom/nic/mparivahan/LLServices/SubmitServiceAssets/ChangeOfNameReq;", "R1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "message", "n2", "l2", "Lcom/zepto/y6;", "F", "Lcom/zepto/y6;", "U1", "()Lcom/zepto/y6;", "q2", "(Lcom/zepto/y6;)V", "mBinding", "Landroid/content/Context;", "G", "Landroid/content/Context;", "V1", "()Landroid/content/Context;", "r2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "c2", "()Landroid/app/ProgressDialog;", "y2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wl5;", "I", "Lcom/zepto/wl5;", "d2", "()Lcom/zepto/wl5;", "A2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "J", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "T1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "p2", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "Lcom/zepto/dm3;", "K", "Lcom/zepto/dm3;", "Z1", "()Lcom/zepto/dm3;", "v2", "(Lcom/zepto/dm3;)V", "mLlViewModel", "Lcom/nic/mparivahan/LLServices/LlInterface;", "L", "Lcom/nic/mparivahan/LLServices/LlInterface;", "Y1", "()Lcom/nic/mparivahan/LLServices/LlInterface;", "u2", "(Lcom/nic/mparivahan/LLServices/LlInterface;)V", "mLlInterface", "Lcom/zepto/rb1;", "M", "Lcom/zepto/rb1;", "viewModel", "", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/ReasonsMasterItem;", "N", "Ljava/util/List;", "mReasonList", "Lcom/zepto/wa3;", "O", "Lcom/zepto/wa3;", "langSession", "P", "sarthiSession", "", "Q", "S1", "()I", "o2", "(I)V", "code", "R", "Ljava/lang/String;", "getRelationCode", "()Ljava/lang/String;", "z2", "(Ljava/lang/String;)V", "relationCode", "S", "Mobile_no", "T", "getForm1FlagDLserReq", "setForm1FlagDLserReq", "form1FlagDLserReq", "U", "getSubmitFormOne", "B2", "submitFormOne", "V", "getAString", "setAString", "aString", "W", "getBString", "setBString", "bString", "X", "getCString", "setCString", "cString", "Y", "getDString", "setDString", "dString", "Z", "getEString", "setEString", "eString", "a0", "getFString", "setFString", "fString", "b0", "getGString", "setGString", "gString", "c0", "selectedRtoCd", "d0", "selectedRtoName", "Lcom/zepto/ef2;", "e0", "Lcom/zepto/ef2;", "W1", "()Lcom/zepto/ef2;", "s2", "(Lcom/zepto/ef2;)V", "mFormEligVM", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "f0", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "X1", "()Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "t2", "(Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;)V", "mFormsInterface", "Lcom/zepto/s86;", "g0", "Lcom/zepto/s86;", "a2", "()Lcom/zepto/s86;", "w2", "(Lcom/zepto/s86;)V", "mSubmitFormVM", "Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "h0", "Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "b2", "()Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "x2", "(Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;)V", "mSubmitInterface", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nChangeNameLL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeNameLL.kt\ncom/nic/mparivahan/LLServices/UI/ChangeNameLL\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,836:1\n1855#2,2:837\n*S KotlinDebug\n*F\n+ 1 ChangeNameLL.kt\ncom/nic/mparivahan/LLServices/UI/ChangeNameLL\n*L\n604#1:837,2\n*E\n"})
public final class ChangeNameLL extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public y6 mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public dm3 mLlViewModel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public LlInterface mLlInterface;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public rb1 viewModel;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public List mReasonList;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public int code;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String selectedRtoCd;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String selectedRtoName;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public ef2 mFormEligVM;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public FromEligCheck mFormsInterface;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public s86 mSubmitFormVM;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public SubmitInterface mSubmitInterface;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String relationCode = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String gString = "N";

    public static final class a implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Ref.ObjectRef b;

        public a(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            ChangeNameLL.this.z2(((SpinnerPojo) ((ArrayList) this.b.element).get(i)).getCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(ff2 ff2Var) {
            try {
                throw null;
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            wb0.a(obj);
            a(null);
            return Unit.INSTANCE;
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
                EditText editText = ChangeNameLL.this.U1().Q;
                StringBuilder sb = new StringBuilder();
                sb.append((Object) ChangeNameLL.this.U1().O.getText());
                sb.append(' ');
                sb.append((Object) charSequence);
                sb.append(' ');
                sb.append((Object) ChangeNameLL.this.U1().S.getText());
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
                if (ChangeNameLL.this.U1().Y.getText().toString().length() <= 0) {
                    EditText editText = ChangeNameLL.this.U1().Q;
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) ChangeNameLL.this.U1().O.getText());
                    sb.append(' ');
                    sb.append((Object) ChangeNameLL.this.U1().Y.getText());
                    sb.append((Object) charSequence);
                    editText.setText(sb.toString());
                    return;
                }
                EditText editText2 = ChangeNameLL.this.U1().Q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) ChangeNameLL.this.U1().O.getText());
                sb2.append(' ');
                sb2.append((Object) ChangeNameLL.this.U1().Y.getText());
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

        public final void a(SubmitResponse submitResponse) {
            ChangeNameLL.this.c2().dismiss();
            try {
                if (!Intrinsics.areEqual(submitResponse.getStatus_code(), "00")) {
                    ChangeNameLL.this.l2(submitResponse.getFoneObject().get(0).getMsg());
                    return;
                }
                ChangeNameLL.this.B2("Y");
                CustomWegetLayout customWegetLayout = ChangeNameLL.this.U1().y;
                wa3 wa3Var = ChangeNameLL.this.langSession;
                if (wa3Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var = null;
                }
                customWegetLayout.setText(wa3Var.b("vahan_btn_submit", "Submit"));
                ChangeNameLL.this.n2(submitResponse.getFoneObject().get(0).getMsg());
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ChangeNameLL.this.c2().dismiss();
            ChangeNameLL changeNameLL = ChangeNameLL.this;
            wa3 wa3Var = changeNameLL.langSession;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var = null;
            }
            changeNameLL.n2(wa3Var.b("service_is_not_present", ChangeNameLL.this.getString(R.string.unable_to_get_details)));
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            ChangeNameLL.this.c2().dismiss();
            wa3 wa3Var = null;
            try {
                if (StringsKt__StringsJVMKt.equals$default(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, null)) {
                    ChangeNameLL.this.mReasonList = getReasonsTransWiseResponse.getReasonsMaster();
                } else {
                    ChangeNameLL.this.n2(getReasonsTransWiseResponse.getStatusDesc());
                }
            } catch (Exception e) {
                ChangeNameLL changeNameLL = ChangeNameLL.this;
                wa3 wa3Var2 = changeNameLL.langSession;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                } else {
                    wa3Var = wa3Var2;
                }
                String strB = wa3Var.b("service_is_not_present", "");
                Intrinsics.checkNotNull(strB);
                Toast.makeText(changeNameLL, strB, 1).show();
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetReasonsTransWiseResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(SubmitLlServiceAPI submitLlServiceAPI) {
            ChangeNameLL.this.U1().y.c(false);
            try {
                String string = submitLlServiceAPI.getApplicationNumber().toString();
                if (string != null && string.length() != 0) {
                    Intent intent = new Intent(ChangeNameLL.this, (Class<?>) LlApplicationNumber.class);
                    intent.putExtra("LLDetails", ChangeNameLL.this.T1());
                    String str = ChangeNameLL.this.Mobile_no;
                    String str2 = null;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("Mobile_no");
                        str = null;
                    }
                    intent.putExtra("Mobile_no", str);
                    String str3 = ChangeNameLL.this.selectedRtoCd;
                    if (str3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedRtoCd");
                        str3 = null;
                    }
                    intent.putExtra("selectedRtoCd", str3);
                    String str4 = ChangeNameLL.this.selectedRtoName;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedRtoName");
                    } else {
                        str2 = str4;
                    }
                    intent.putExtra("selectedRtoName", str2);
                    intent.putExtra("appNumber", submitLlServiceAPI.getApplicationNumber().toString());
                    ChangeNameLL.this.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitLlServiceAPI) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ChangeNameLL.this.U1().y.c(false);
            ChangeNameLL changeNameLL = ChangeNameLL.this;
            wa3 wa3Var = changeNameLL.langSession;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var = null;
            }
            changeNameLL.n2(wa3Var.b("service_is_not_present", ChangeNameLL.this.getString(R.string.unable_to_get_details)));
        }
    }

    public static final class j implements TextWatcher {
        public j() {
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
                if (ChangeNameLL.this.U1().Y.getText().toString().length() <= 0) {
                    EditText editText = ChangeNameLL.this.U1().Q;
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) charSequence);
                    sb.append(' ');
                    sb.append((Object) ChangeNameLL.this.U1().Y.getText());
                    sb.append((Object) ChangeNameLL.this.U1().S.getText());
                    editText.setText(sb.toString());
                    return;
                }
                EditText editText2 = ChangeNameLL.this.U1().Q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) charSequence);
                sb2.append(' ');
                sb2.append((Object) ChangeNameLL.this.U1().Y.getText());
                sb2.append(' ');
                sb2.append((Object) ChangeNameLL.this.U1().S.getText());
                editText2.setText(sb2.toString());
            }
        }
    }

    public static final class k implements d86.b {
        public k() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            ReasonsMasterItem reasonsMasterItem;
            ChangeNameLL changeNameLL = ChangeNameLL.this;
            List list = changeNameLL.mReasonList;
            Integer reasonCode = (list == null || (reasonsMasterItem = (ReasonsMasterItem) list.get(i)) == null) ? null : reasonsMasterItem.getReasonCode();
            Intrinsics.checkNotNull(reasonCode);
            changeNameLL.o2(reasonCode.intValue());
            ChangeNameLL.this.U1().x.setText(str);
            ChangeNameLL.this.U1().x.setContentDescription("" + ChangeNameLL.this.getCode());
        }
    }

    public static final class l extends Lambda implements Function1 {
        public static final l c = new l();

        public l() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class m implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public m(Function1 function) {
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

    private final FormOneRequest M1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(574);
        String str = this.selectedRtoCd;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedRtoCd");
            str = null;
        }
        return new FormOneRequest("mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", StringsKt__StringsKt.trim((CharSequence) str).toString(), arrayList);
    }

    private final void N1() {
        U1().L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ve0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameLL.O1(this.a, view);
            }
        });
        U1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.we0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameLL.P1(this.a, view);
            }
        });
        U1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameLL.Q1(this.a, view);
            }
        });
    }

    public static final void O1(ChangeNameLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.T1());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void P1(ChangeNameLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.U1().O.getText();
        wa3 wa3Var = null;
        if (text == null || text.length() == 0) {
            wa3 wa3Var2 = this$0.langSession;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var2;
            }
            Toast.makeText(this$0, wa3Var.b("PLEASE_ENTER_FIRST_NAME", this$0.getString(R.string.enter_first_name)), 0).show();
            return;
        }
        if (this$0.U1().O.getText().length() < 3) {
            wa3 wa3Var3 = this$0.langSession;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var3;
            }
            Toast.makeText(this$0, wa3Var.b("enter_valid_3_first_name", this$0.getString(R.string.enter_valid_3_first_name)), 0).show();
            return;
        }
        Editable text2 = this$0.U1().U.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() > 0 && this$0.U1().U.getText().length() < 3) {
            wa3 wa3Var4 = this$0.langSession;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var4;
            }
            Toast.makeText(this$0, wa3Var.b("enter_valid_3_last_name", this$0.getString(R.string.enter_valid_3_last_name)), 0).show();
            return;
        }
        Editable text3 = this$0.U1().Q.getText();
        if (text3 == null || text3.length() == 0 || this$0.U1().Q.getText().length() < 3) {
            wa3 wa3Var5 = this$0.langSession;
            if (wa3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var5;
            }
            Toast.makeText(this$0, wa3Var.b("enter_valid_3_full_name", this$0.getString(R.string.enter_valid_3_full_name)), 0).show();
            return;
        }
        if (Intrinsics.areEqual(this$0.relationCode, "0")) {
            wa3 wa3Var6 = this$0.langSession;
            if (wa3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var6;
            }
            Toast.makeText(this$0, wa3Var.b("pls_enter_relation", "Please enter relation"), 0).show();
            return;
        }
        Editable text4 = this$0.U1().Z.getText();
        if (text4 == null || text4.length() == 0) {
            wa3 wa3Var7 = this$0.langSession;
            if (wa3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var7;
            }
            Toast.makeText(this$0, wa3Var.b("PLEASE_ENTER_REL_FIRST_NAME", this$0.getString(R.string.rel_first_name)), 0).show();
            return;
        }
        if (this$0.U1().Z.getText().length() < 3) {
            wa3 wa3Var8 = this$0.langSession;
            if (wa3Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var8;
            }
            Toast.makeText(this$0, wa3Var.b("enter_valid_rel_3_first_name", this$0.getString(R.string.enter_valid_rel_3_first_name)), 0).show();
            return;
        }
        Editable text5 = this$0.U1().S.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() > 0 && this$0.U1().S.getText().length() < 3) {
            wa3 wa3Var9 = this$0.langSession;
            if (wa3Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var9;
            }
            Toast.makeText(this$0, wa3Var.b("enter_valid_rel_3_last_name", this$0.getString(R.string.enter_valid_rel_3_last_name)), 0).show();
            return;
        }
        if (com.nic.mparivahan.a.a.a(this$0)) {
            try {
                this$0.U1().y.c(true);
                this$0.Z1().o(this$0, this$0.R1());
                return;
            } catch (Exception unused) {
                return;
            }
        }
        Context contextV1 = this$0.V1();
        wa3 wa3Var10 = this$0.langSession;
        if (wa3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
        } else {
            wa3Var = wa3Var10;
        }
        Toast.makeText(contextV1, wa3Var.b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    public static final void Q1(ChangeNameLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [T, java.util.ArrayList] */
    private final void e2() {
        this.langSession = new wa3(this);
        this.sarthiSession = new wl5(this);
        y2(new ProgressDialog(this));
        ProgressDialog progressDialogC2 = c2();
        wa3 wa3Var = this.langSession;
        wa3 wa3Var2 = null;
        rb1 rb1Var = null;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        progressDialogC2.setMessage(wa3Var.b("label_challan_please_wait", "Please wait..."));
        c2().setCancelable(false);
        c2().setCanceledOnTouchOutside(false);
        U1().L.setPaintFlags(U1().L.getPaintFlags() | 8);
        TextView textView = U1().C.g;
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
            wl5Var = null;
        }
        textView.setText(wl5Var.k());
        this.viewModel = (rb1) new z(this).a(rb1.class);
        try {
            this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            p2((FetchLlDetails) serializableExtra);
            this.selectedRtoCd = String.valueOf(getIntent().getStringExtra("selectedRtoCd"));
            this.selectedRtoName = String.valueOf(getIntent().getStringExtra("selectedRtoName"));
            U1().J.setText("LL No. : " + StringsKt__StringsKt.trim((CharSequence) T1().getLearningLicence()).toString());
        } catch (Exception unused) {
        }
        u2(LlInterface.INSTANCE.a(V1()));
        v2((dm3) new z(this, new uj3(new hl3(Y1()))).a(dm3.class));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? arrayList = new ArrayList();
        objectRef.element = arrayList;
        arrayList.add(0, new SpinnerPojo("0", "Select Relation"));
        ((ArrayList) objectRef.element).add(1, new SpinnerPojo("F", "Father Name"));
        ((ArrayList) objectRef.element).add(2, new SpinnerPojo("M", "Mother Name"));
        ((ArrayList) objectRef.element).add(3, new SpinnerPojo("H", "Husband Name"));
        ((ArrayList) objectRef.element).add(3, new SpinnerPojo("G", "Guardian Name"));
        U1().H.setAdapter((SpinnerAdapter) new j54(this, (ArrayList) objectRef.element));
        U1().H.setOnItemSelectedListener(new a(objectRef));
        if (com.nic.mparivahan.a.a.a(this)) {
            c2().show();
            rb1 rb1Var2 = this.viewModel;
            if (rb1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                rb1Var = rb1Var2;
            }
            rb1Var.r("574");
        } else {
            Context applicationContext = getApplicationContext();
            wa3 wa3Var3 = this.langSession;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var2 = wa3Var3;
            }
            Toast.makeText(applicationContext, wa3Var2.b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
        }
        t2(FromEligCheck.INSTANCE.a(this));
        s2((ef2) new z(this, new df2(new cf2(X1()))).a(ef2.class));
        W1().h(M1());
        W1().j().g(this, new m(new b()));
        x2(SubmitInterface.INSTANCE.a(this));
        w2((s86) new z(this, new q86(new r86(b2()))).a(s86.class));
    }

    private final void f2() {
        try {
            U1().J.setVisibility(8);
            U1().L.setVisibility(8);
            U1().D.g.setText(d2().k());
            U1().D.h.setPaintFlags(8 | U1().D.h.getPaintFlags());
            U1().D.h.setText(StringsKt__StringsKt.trim((CharSequence) T1().getLearningLicence()).toString());
            U1().D.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ze0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChangeNameLL.g2(this.a, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    public static final void g2(ChangeNameLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.T1());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void h2(ChangeNameLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void i2(ChangeNameLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void j2(ChangeNameLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void k2() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.mReasonList;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        d86 d86VarA = d86.INSTANCE.a("Select Reason", arrayList);
        d86VarA.k2(I0(), "ReasonPicker");
        d86VarA.n2(new k());
    }

    public static final void m2(Dialog d2, ChangeNameLL this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public final void A2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void B2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.submitFormOne = str;
    }

    public final ChangeOfNameReq R1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("changeOfName");
        String string = StringsKt__StringsKt.trim((CharSequence) U1().Y.getText().toString()).toString();
        String string2 = (string == null || string.length() == 0) ? "" : StringsKt__StringsKt.trim((CharSequence) U1().Y.getText().toString()).toString();
        String string3 = StringsKt__StringsKt.trim((CharSequence) U1().W.getText().toString()).toString();
        String string4 = (string3 == null || string3.length() == 0) ? "" : StringsKt__StringsKt.trim((CharSequence) U1().W.getText().toString()).toString();
        String str = new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(System.currentTimeMillis()));
        String string5 = StringsKt__StringsKt.trim((CharSequence) T1().getLearningLicence()).toString();
        String string6 = StringsKt__StringsKt.trim((CharSequence) T1().getDateOfBirth()).toString();
        String stCd = T1().getState().getStCd();
        String str2 = this.selectedRtoCd;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedRtoCd");
            str2 = null;
        }
        String str3 = str2;
        String string7 = StringsKt__StringsKt.trim((CharSequence) U1().Q.getText().toString()).toString();
        String string8 = StringsKt__StringsKt.trim((CharSequence) U1().O.getText().toString()).toString();
        String string9 = StringsKt__StringsKt.trim((CharSequence) U1().U.getText().toString()).toString();
        String str4 = this.relationCode;
        String string10 = StringsKt__StringsKt.trim((CharSequence) U1().Z.getText().toString()).toString();
        String string11 = StringsKt__StringsKt.trim((CharSequence) U1().S.getText().toString()).toString();
        String string12 = U1().x.getText().toString();
        Intrinsics.checkNotNull(str);
        return new ChangeOfNameReq("UmangOD", "2335647e653c970102713f68f6aad970", "164.100.161.142", "SarathiMobileService", string5, string6, stCd, str3, "NA", string7, string8, string2, string9, str4, string10, string4, string11, string12, str, "changeOfName", arrayList);
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final FetchLlDetails T1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final y6 U1() {
        y6 y6Var = this.mBinding;
        if (y6Var != null) {
            return y6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final Context V1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ef2 W1() {
        ef2 ef2Var = this.mFormEligVM;
        if (ef2Var != null) {
            return ef2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormEligVM");
        return null;
    }

    public final FromEligCheck X1() {
        FromEligCheck fromEligCheck = this.mFormsInterface;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsInterface");
        return null;
    }

    public final LlInterface Y1() {
        LlInterface llInterface = this.mLlInterface;
        if (llInterface != null) {
            return llInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLlInterface");
        return null;
    }

    public final dm3 Z1() {
        dm3 dm3Var = this.mLlViewModel;
        if (dm3Var != null) {
            return dm3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLlViewModel");
        return null;
    }

    public final s86 a2() {
        s86 s86Var = this.mSubmitFormVM;
        if (s86Var != null) {
            return s86Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSubmitFormVM");
        return null;
    }

    public final SubmitInterface b2() {
        SubmitInterface submitInterface = this.mSubmitInterface;
        if (submitInterface != null) {
            return submitInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSubmitInterface");
        return null;
    }

    public final ProgressDialog c2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wl5 d2() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final void l2(String message) {
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
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        wa3 wa3Var = this.langSession;
        wa3 wa3Var2 = null;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        textView2.setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        wa3 wa3Var3 = this.langSession;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
        } else {
            wa3Var2 = wa3Var3;
        }
        textView.setText(wa3Var2.b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameLL.m2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void n2(String message) {
        if (message != null) {
            wa3 wa3Var = this.langSession;
            wa3 wa3Var2 = null;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var = null;
            }
            String strB = wa3Var.b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            wa3 wa3Var3 = this.langSession;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var2 = wa3Var3;
            }
            String strB2 = wa3Var2.b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, l.c, 16, null);
        }
    }

    public final void o2(int i2) {
        this.code = i2;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        y6 y6VarX = y6.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(y6VarX, "inflate(...)");
        q2(y6VarX);
        setContentView(U1().m());
        r2(this);
        ta3.a.S(this, U1());
        A2(new wl5(V1()));
        e2();
        N1();
        U1().C.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.se0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameLL.h2(this.a, view);
            }
        });
        U1().D.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.te0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameLL.i2(this.a, view);
            }
        });
        U1().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeNameLL.j2(this.a, view);
            }
        });
        a2().i().g(this, new m(new e()));
        a2().h().g(this, new m(new f()));
        rb1 rb1Var = this.viewModel;
        if (rb1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            rb1Var = null;
        }
        rb1Var.q().g(this, new m(new g()));
        Z1().l().g(this, new m(new h()));
        Z1().i().g(this, new m(new i()));
        U1().O.addTextChangedListener(new j());
        U1().Y.addTextChangedListener(new c());
        U1().U.addTextChangedListener(new d());
        f2();
    }

    public final void p2(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void q2(y6 y6Var) {
        Intrinsics.checkNotNullParameter(y6Var, "<set-?>");
        this.mBinding = y6Var;
    }

    public final void r2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void s2(ef2 ef2Var) {
        Intrinsics.checkNotNullParameter(ef2Var, "<set-?>");
        this.mFormEligVM = ef2Var;
    }

    public final void t2(FromEligCheck fromEligCheck) {
        Intrinsics.checkNotNullParameter(fromEligCheck, "<set-?>");
        this.mFormsInterface = fromEligCheck;
    }

    public final void u2(LlInterface llInterface) {
        Intrinsics.checkNotNullParameter(llInterface, "<set-?>");
        this.mLlInterface = llInterface;
    }

    public final void v2(dm3 dm3Var) {
        Intrinsics.checkNotNullParameter(dm3Var, "<set-?>");
        this.mLlViewModel = dm3Var;
    }

    public final void w2(s86 s86Var) {
        Intrinsics.checkNotNullParameter(s86Var, "<set-?>");
        this.mSubmitFormVM = s86Var;
    }

    public final void x2(SubmitInterface submitInterface) {
        Intrinsics.checkNotNullParameter(submitInterface, "<set-?>");
        this.mSubmitInterface = submitInterface;
    }

    public final void y2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void z2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relationCode = str;
    }
}
