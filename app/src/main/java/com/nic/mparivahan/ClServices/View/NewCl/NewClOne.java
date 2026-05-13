package com.nic.mparivahan.ClServices.View.NewCl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo;
import com.nic.mparivahan.ClServices.View.NewCl.NewClOne;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.sarathiStateApi.SarathiStatePojo;
import com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster;
import com.zepto.hf5;
import com.zepto.j54;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.nr1;
import com.zepto.pq;
import com.zepto.rq1;
import com.zepto.sd;
import com.zepto.ta3;
import com.zepto.u66;
import com.zepto.wa3;
import com.zepto.wl5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b1\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010>\u001a\n 7*\u0004\u0018\u000106068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010G\u001a\b\u0012\u0004\u0012\u00020@0?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010L\u001a\b\u0012\u0004\u0012\u00020H0?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010D\"\u0004\bK\u0010FR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010g\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010^\u001a\u0004\be\u0010`\"\u0004\bf\u0010bR\"\u0010k\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010^\u001a\u0004\bi\u0010`\"\u0004\bj\u0010bR\"\u0010o\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010^\u001a\u0004\bm\u0010`\"\u0004\bn\u0010bR\"\u0010s\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010^\u001a\u0004\bq\u0010`\"\u0004\br\u0010bR\"\u0010w\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010^\u001a\u0004\bu\u0010`\"\u0004\bv\u0010bR\"\u0010{\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010^\u001a\u0004\by\u0010`\"\u0004\bz\u0010bR\"\u0010\u007f\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u0010^\u001a\u0004\b}\u0010`\"\u0004\b~\u0010bR&\u0010\u0083\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010^\u001a\u0005\b\u0081\u0001\u0010`\"\u0005\b\u0082\u0001\u0010b¨\u0006\u0086\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/NewCl/NewClOne;", "Lcom/zepto/pq;", "", "q2", "J1", "M1", "", "message", "X1", "", "L1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/sd;", "C", "Lcom/zepto/sd;", "x1", "()Lcom/zepto/sd;", "c2", "(Lcom/zepto/sd;)V", "mBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "y1", "()Landroid/content/Context;", "d2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "A1", "()Landroid/app/ProgressDialog;", "f2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "G1", "()Lcom/zepto/wa3;", "m2", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "F1", "()Lcom/zepto/wl5;", "l2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "H", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/sarathiStateApi/StateMaster;", "I", "Ljava/util/ArrayList;", "I1", "()Ljava/util/ArrayList;", "o2", "(Ljava/util/ArrayList;)V", "state_list", "Lcom/nic/mparivahan/DLServicesAuth/Model/GetCurrentRTO/RtosMaster;", "J", "z1", "e2", "mRtosMaster", "Lcom/zepto/nr1;", "K", "Lcom/zepto/nr1;", "v1", "()Lcom/zepto/nr1;", "a2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "L", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "D1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "i2", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "M", "Ljava/lang/String;", "H1", "()Ljava/lang/String;", "n2", "(Ljava/lang/String;)V", "state_code", "N", "getState_name", "p2", "state_name", "O", "getRto_code", "j2", "rto_code", "P", "E1", "k2", "rto_name", "Q", "C1", "h2", "religionCode", "R", "w1", "b2", "eduCode", "S", "B1", "g2", "relationCode", "T", "u1", "Z1", "bloodGrp", "U", "getAppGender", "setAppGender", "appGender", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NewClOne extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public sd mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList state_list;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList mRtosMaster;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String state_name;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String rto_name;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String religionCode;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String eduCode;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String relationCode;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String bloodGrp;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String state_code = "0";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String rto_code = "0";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String appGender = VContant.MAINSCREEN;

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            NewClOne newClOne = NewClOne.this;
            newClOne.n2(((StateMaster) newClOne.I1().get(i)).getState_code());
            NewClOne newClOne2 = NewClOne.this;
            newClOne2.p2(((StateMaster) newClOne2.I1().get(i)).getState_name());
            nr1 nr1VarV1 = NewClOne.this.v1();
            NewClOne newClOne3 = NewClOne.this;
            nr1VarV1.h(newClOne3, newClOne3.getState_code());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i == 0) {
                NewClOne.this.j2("0");
                return;
            }
            NewClOne newClOne = NewClOne.this;
            newClOne.k2(((RtosMaster) newClOne.z1().get(i)).getRto_name());
            NewClOne newClOne2 = NewClOne.this;
            newClOne2.j2(((RtosMaster) newClOne2.z1().get(i)).getRto_code());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Ref.ObjectRef b;

        public c(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            NewClOne.this.g2(((SpinnerPojo) ((ArrayList) this.b.element).get(i)).getCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Ref.ObjectRef b;

        public d(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            NewClOne.this.h2(((SpinnerPojo) ((ArrayList) this.b.element).get(i)).getCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Ref.ObjectRef b;

        public e(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            NewClOne.this.b2(((SpinnerPojo) ((ArrayList) this.b.element).get(i)).getCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Ref.ObjectRef b;

        public f(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            NewClOne.this.Z1(((SpinnerPojo) ((ArrayList) this.b.element).get(i)).getCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    private final void J1() {
        d2(this);
        m2(new wa3(y1()));
        l2(new wl5(y1()));
        f2(new ProgressDialog(y1()));
        A1().setMessage(G1().b("label_challan_please_wait", getString(R.string.please_wait)));
        A1().setCancelable(false);
        A1().setCanceledOnTouchOutside(false);
        i2(DlServiceInt.INSTANCE.a(y1()));
        a2((nr1) new z(this, new rq1(new lr1(D1(), this))).a(nr1.class));
        A1().show();
        x1().M.g.setText(F1().k());
        v1().i(this);
        x1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws ParseException {
                NewClOne.K1(this.a, view);
            }
        });
    }

    public static final void K1(NewClOne this$0, View view) throws ParseException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.L1()) {
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(this$0.x1().z.getText().toString());
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            if (((int) ((new Date().getTime() - date.getTime()) / ((long) 86400000))) < 6570) {
                Toast.makeText(this$0, this$0.getString(R.string.age_should_be_18_years_or_older), 0).show();
                return;
            }
            try {
                Intent intent = new Intent(this$0, (Class<?>) NewClTwo.class);
                intent.putExtra("state_code", this$0.state_code);
                intent.putExtra("rto_code", this$0.rto_code);
                intent.putExtra("rto_name", this$0.E1());
                intent.putExtra("clFirstName", StringsKt__StringsKt.trim((CharSequence) this$0.x1().B.getText().toString()).toString());
                String string = this$0.x1().D.getText().toString();
                if (string == null || string.length() == 0) {
                    intent.putExtra("clMiddleName", "");
                } else {
                    intent.putExtra("clMiddleName", StringsKt__StringsKt.trim((CharSequence) this$0.x1().D.getText().toString()).toString());
                }
                Editable text = this$0.x1().C.getText();
                if (text == null || text.length() == 0) {
                    intent.putExtra("clLastName", "");
                } else {
                    intent.putExtra("clLastName", StringsKt__StringsKt.trim((CharSequence) this$0.x1().C.getText().toString()).toString());
                }
                intent.putExtra("clRelation", this$0.B1());
                intent.putExtra("relFirstName", StringsKt__StringsKt.trim((CharSequence) this$0.x1().o0.getText().toString()).toString());
                String string2 = StringsKt__StringsKt.trim((CharSequence) this$0.x1().s0.getText().toString()).toString();
                if (string2 == null || string2.length() == 0) {
                    intent.putExtra("relMiddleName", "");
                } else {
                    intent.putExtra("relMiddleName", StringsKt__StringsKt.trim((CharSequence) this$0.x1().s0.getText().toString()).toString());
                }
                Editable text2 = this$0.x1().q0.getText();
                if (text2 == null || text2.length() == 0) {
                    intent.putExtra("relLastName", "");
                } else {
                    intent.putExtra("relLastName", StringsKt__StringsKt.trim((CharSequence) this$0.x1().q0.getText().toString()).toString());
                }
                intent.putExtra("appGender", this$0.appGender);
                intent.putExtra("appDob", StringsKt__StringsKt.trim((CharSequence) this$0.x1().z.getText().toString()).toString());
                intent.putExtra("clEdu", this$0.w1());
                intent.putExtra("clBlood", this$0.u1());
                intent.putExtra("clPhone", StringsKt__StringsKt.trim((CharSequence) this$0.x1().J.getText().toString()).toString());
                intent.putExtra("clEmail", StringsKt__StringsKt.trim((CharSequence) this$0.x1().F.getText().toString()).toString());
                intent.putExtra("clMobile", StringsKt__StringsKt.trim((CharSequence) this$0.x1().I.getText().toString()).toString());
                intent.putExtra("clAlterMobile", StringsKt__StringsKt.trim((CharSequence) this$0.x1().A.getText().toString()).toString());
                Editable text3 = this$0.x1().G.getText();
                if (text3 == null || text3.length() == 0) {
                    intent.putExtra("mark1", "NA");
                } else {
                    intent.putExtra("mark1", StringsKt__StringsKt.trim((CharSequence) this$0.x1().G.getText().toString()).toString());
                }
                Editable text4 = this$0.x1().H.getText();
                if (text4 == null || text4.length() == 0) {
                    intent.putExtra("mark2", StringsKt__StringsKt.trim((CharSequence) this$0.x1().H.getText().toString()).toString());
                } else {
                    intent.putExtra("mark2", StringsKt__StringsKt.trim((CharSequence) this$0.x1().H.getText().toString()).toString());
                }
                this$0.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    private final boolean L1() {
        if (Intrinsics.areEqual(this.state_code, "0")) {
            Toast.makeText(this, G1().b("label_log_sel_state", "Please select state"), 0).show();
            return false;
        }
        if (Intrinsics.areEqual(this.rto_code, "0")) {
            Toast.makeText(this, G1().b("select_rto", getString(R.string.please_select_rto)), 0).show();
            return false;
        }
        Editable text = x1().B.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this, G1().b("PLEASE_ENTER_FIRST_NAME", getString(R.string.enter_first_name)), 0).show();
            return false;
        }
        if (x1().B.getText().length() < 3) {
            Toast.makeText(this, G1().b("enter_valid_3_first_name", getString(R.string.enter_valid_3_first_name)), 0).show();
            return false;
        }
        if (x1().C.getText().length() < 3) {
            Editable text2 = x1().C.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            if (text2.length() > 0) {
                Toast.makeText(this, G1().b("enter_valid_rel_3_last_name", getString(R.string.enter_valid_rel_3_last_name)), 0).show();
                return false;
            }
        }
        if (Intrinsics.areEqual(B1(), "0")) {
            Toast.makeText(this, G1().b("PLEASE_SELECT_RELATION", getString(R.string.select_relation)), 0).show();
            return false;
        }
        Editable text3 = x1().o0.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            Toast.makeText(this, G1().b("PLEASE_ENTER_REL_FIRST_NAME", getString(R.string.rel_first_name)), 0).show();
            return false;
        }
        if (x1().o0.getText().length() < 3) {
            Toast.makeText(this, G1().b("enter_valid_rel_3_first_name", getString(R.string.enter_valid_rel_3_first_name)), 0).show();
            return false;
        }
        if (x1().q0.getText().length() < 3) {
            Editable text4 = x1().q0.getText();
            Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
            if (text4.length() > 0) {
                Toast.makeText(this, G1().b("enter_valid_rel_3_last_name", getString(R.string.enter_valid_rel_3_last_name)), 0).show();
                return false;
            }
        }
        CharSequence text5 = x1().z.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() == 0) {
            Toast.makeText(this, G1().b("please_enter_bd", getString(R.string.please_enter_bd)), 0).show();
            return false;
        }
        Editable text6 = x1().E.getText();
        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
        if (text6.length() == 0) {
            Toast.makeText(this, G1().b("edit_dl_serv_enter_birth_plac", getString(R.string.enter_birth_place)), 0).show();
            return false;
        }
        if (x1().E.getText().length() < 3) {
            Toast.makeText(this, G1().b("PLEASE_ENTER_VALID_PLACE", getString(R.string.valid_place)), 0).show();
            return false;
        }
        if (Intrinsics.areEqual(C1(), "0")) {
            Toast.makeText(this, G1().b("PLEASE_SELECT_REGION", getString(R.string.select_religion)), 0).show();
            return false;
        }
        if (Intrinsics.areEqual(w1(), "22")) {
            Toast.makeText(this, G1().b("PLEASE_SELECT_EDUCATION", getString(R.string.select_education)), 0).show();
            return false;
        }
        if (Intrinsics.areEqual(u1(), "Select Blood Group")) {
            Toast.makeText(this, G1().b("PLEASE_SELECT_BG", getString(R.string.select_bg)), 0).show();
            return false;
        }
        Editable text7 = x1().I.getText();
        Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
        if (text7.length() == 0) {
            Toast.makeText(this, G1().b("label_mb", getString(R.string.enter_mobile_number)), 0).show();
            return false;
        }
        if (x1().I.getText().length() >= 10) {
            return true;
        }
        Toast.makeText(this, G1().b("lbl_enter_valid_number", getString(R.string.enter_mobile_no)), 1).show();
        return false;
    }

    public static final void N1(NewClOne this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().dismiss();
        this$0.X1(this$0.G1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void O1(NewClOne this$0, SarathiStatePojo sarathiStatePojo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (StringsKt__StringsJVMKt.equals(sarathiStatePojo.getStatus_code(), "00", true)) {
                List<StateMaster> stateMaster = sarathiStatePojo.getStateMaster();
                Intrinsics.checkNotNull(stateMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster>");
                this$0.o2((ArrayList) stateMaster);
                this$0.I1().add(0, new StateMaster("Select State", "0"));
                this$0.x1().y.setAdapter((SpinnerAdapter) new u66(this$0, this$0.I1()));
            } else {
                this$0.o2(new ArrayList());
                this$0.I1().add(0, new StateMaster("Select State", "0"));
                this$0.x1().y.setAdapter((SpinnerAdapter) new u66(this$0, this$0.I1()));
            }
        } catch (Exception unused) {
            this$0.A1().dismiss();
            Toast.makeText(this$0.getApplicationContext(), this$0.G1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)), 1).show();
        }
    }

    public static final void P1(NewClOne this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().dismiss();
        Toast.makeText(this$0.getApplicationContext(), this$0.G1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)), 1).show();
    }

    public static final void Q1(NewClOne this$0, CurrentRTO currentRTO) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().dismiss();
        try {
            if (StringsKt__StringsJVMKt.equals(currentRTO.getStatus_code(), "00", true)) {
                List<RtosMaster> rtosMaster = currentRTO.getRtosMaster();
                Intrinsics.checkNotNull(rtosMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>");
                this$0.e2((ArrayList) rtosMaster);
                ArrayList arrayListZ1 = this$0.z1();
                String string = this$0.getString(R.string.please_select_rto);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayListZ1.add(0, new RtosMaster(string, "0"));
                this$0.x1().x.setAdapter((SpinnerAdapter) new hf5(this$0, this$0.z1()));
                this$0.x1().x.setEnabled(true);
                this$0.x1().x.setClickable(true);
            } else {
                List<RtosMaster> rtosMaster2 = currentRTO.getRtosMaster();
                Intrinsics.checkNotNull(rtosMaster2, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>");
                this$0.e2((ArrayList) rtosMaster2);
                ArrayList arrayListZ12 = this$0.z1();
                String strB = this$0.G1().b("select_rto", this$0.getString(R.string.please_select_rto));
                Intrinsics.checkNotNull(strB);
                arrayListZ12.add(0, new RtosMaster(strB, "0"));
                this$0.x1().x.setAdapter((SpinnerAdapter) new hf5(this$0, this$0.z1()));
            }
        } catch (Exception unused) {
            this$0.X1(this$0.G1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
        }
    }

    public static final void R1(NewClOne this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.appGender = VContant.MAINSCREEN;
    }

    public static final void S1(NewClOne this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.appGender = VContant.APPLICATION_SCREEN;
    }

    public static final void T1(NewClOne this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.appGender = "3";
    }

    public static final void U1(NewClOne this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.x1().z.setText(((String) charSequence) + '-' + ((String) charSequence2) + '-' + ((String) charSequence3));
    }

    public static final void V1(NewClOne this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void W1(NewClOne this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void X1(String message) {
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
        textView.setText(G1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(G1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(G1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClOne.Y1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void Y1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final ProgressDialog A1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String B1() {
        String str = this.relationCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relationCode");
        return null;
    }

    public final String C1() {
        String str = this.religionCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("religionCode");
        return null;
    }

    public final DlServiceInt D1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final String E1() {
        String str = this.rto_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rto_name");
        return null;
    }

    public final wl5 F1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wa3 G1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    /* JADX INFO: renamed from: H1, reason: from getter */
    public final String getState_code() {
        return this.state_code;
    }

    public final ArrayList I1() {
        ArrayList arrayList = this.state_list;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_list");
        return null;
    }

    public final void M1() {
        v1().z().g(this, new mf4() { // from class: com.zepto.t54
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewClOne.O1(this.a, (SarathiStatePojo) obj);
            }
        });
        v1().B().g(this, new mf4() { // from class: com.zepto.u54
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewClOne.P1(this.a, (String) obj);
            }
        });
        v1().y().g(this, new mf4() { // from class: com.zepto.v54
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewClOne.Q1(this.a, (CurrentRTO) obj);
            }
        });
        v1().A().g(this, new mf4() { // from class: com.zepto.l54
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewClOne.N1(this.a, (String) obj);
            }
        });
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bloodGrp = str;
    }

    public final void a2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eduCode = str;
    }

    public final void c2(sd sdVar) {
        Intrinsics.checkNotNullParameter(sdVar, "<set-?>");
        this.mBinding = sdVar;
    }

    public final void d2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void e2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mRtosMaster = arrayList;
    }

    public final void f2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void g2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relationCode = str;
    }

    public final void h2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.religionCode = str;
    }

    public final void i2(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_code = str;
    }

    public final void k2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_name = str;
    }

    public final void l2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void m2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final void o2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.state_list = arrayList;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sd sdVarX = sd.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(sdVarX, "inflate(...)");
        c2(sdVarX);
        setContentView(x1().m());
        J1();
        M1();
        q2();
        ta3.a.w1(this, x1());
        x1().N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClOne.R1(this.a, view);
            }
        });
        x1().K.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClOne.S1(this.a, view);
            }
        });
        x1().T.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClOne.T1(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.p54
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                NewClOne.U1(this.a, datePicker, i, i2, i3);
            }
        };
        x1().z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClOne.V1(this.a, onDateSetListener, view);
            }
        });
        x1().y.setOnItemSelectedListener(new a());
        x1().M.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClOne.W1(this.a, view);
            }
        });
        x1().x.setOnItemSelectedListener(new b());
    }

    public final void p2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_name = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v16, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, java.util.ArrayList] */
    public final void q2() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? arrayList = new ArrayList();
        objectRef.element = arrayList;
        arrayList.add(0, new SpinnerPojo("0", "Select Religion"));
        ((ArrayList) objectRef.element).add(1, new SpinnerPojo("G", "Hindu"));
        ((ArrayList) objectRef.element).add(2, new SpinnerPojo("R", "Muslim"));
        ((ArrayList) objectRef.element).add(3, new SpinnerPojo("T", "Sikh"));
        ((ArrayList) objectRef.element).add(4, new SpinnerPojo("X", "Christian"));
        ((ArrayList) objectRef.element).add(5, new SpinnerPojo("F", "Other"));
        x1().R.setAdapter((SpinnerAdapter) new j54(this, (ArrayList) objectRef.element));
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ?? arrayList2 = new ArrayList();
        objectRef2.element = arrayList2;
        arrayList2.add(0, new SpinnerPojo("22", "Select Education Qualification"));
        ((ArrayList) objectRef2.element).add(1, new SpinnerPojo(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, "10+2 or Equivalent"));
        ((ArrayList) objectRef2.element).add(2, new SpinnerPojo("3", "10th Standard or Equivalent"));
        ((ArrayList) objectRef2.element).add(3, new SpinnerPojo(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, "Diploma in any Discipline"));
        ((ArrayList) objectRef2.element).add(4, new SpinnerPojo(VContant.RCPARTICULAR_PURPOSE_CODE, "Doctorate in any Discipline"));
        ((ArrayList) objectRef2.element).add(5, new SpinnerPojo(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE, "Graduate in Non Medical Sciences"));
        ((ArrayList) objectRef2.element).add(6, new SpinnerPojo(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, "Graduate in any Medical Sciences"));
        ((ArrayList) objectRef2.element).add(7, new SpinnerPojo("4", "ITI/Certificate Course"));
        ((ArrayList) objectRef2.element).add(8, new SpinnerPojo("12", "M.Phil. in any Discipline"));
        ((ArrayList) objectRef2.element).add(9, new SpinnerPojo("10", "Post Graduate Diploma in any Discipline"));
        ((ArrayList) objectRef2.element).add(10, new SpinnerPojo(VContant.NOC_PURPOSE_CODE, "Post Graduate in Non Medical Sciences"));
        ((ArrayList) objectRef2.element).add(11, new SpinnerPojo("11", "Post Graduate in any Medical Science"));
        x1().P.setAdapter((SpinnerAdapter) new j54(this, (ArrayList) objectRef2.element));
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        ?? arrayList3 = new ArrayList();
        objectRef3.element = arrayList3;
        arrayList3.add(0, new SpinnerPojo("0", "Select Relation"));
        ((ArrayList) objectRef3.element).add(1, new SpinnerPojo("F", "Father Name"));
        ((ArrayList) objectRef3.element).add(2, new SpinnerPojo("M", "Mother Name"));
        ((ArrayList) objectRef3.element).add(3, new SpinnerPojo("H", "Husband Name"));
        ((ArrayList) objectRef3.element).add(3, new SpinnerPojo("G", "Guardian Name"));
        x1().Q.setAdapter((SpinnerAdapter) new j54(this, (ArrayList) objectRef3.element));
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        ?? arrayList4 = new ArrayList();
        objectRef4.element = arrayList4;
        arrayList4.add(0, new SpinnerPojo("Select Blood Group", "Select Blood Group"));
        ((ArrayList) objectRef4.element).add(1, new SpinnerPojo("A+", "A+"));
        ((ArrayList) objectRef4.element).add(2, new SpinnerPojo("A-", "A-"));
        ((ArrayList) objectRef4.element).add(3, new SpinnerPojo("A1+", "A1+"));
        ((ArrayList) objectRef4.element).add(4, new SpinnerPojo("A1B", "A1B"));
        ((ArrayList) objectRef4.element).add(5, new SpinnerPojo("A2B", "A2B"));
        ((ArrayList) objectRef4.element).add(6, new SpinnerPojo("AB+", "AB+"));
        ((ArrayList) objectRef4.element).add(7, new SpinnerPojo("AB-", "AB-"));
        ((ArrayList) objectRef4.element).add(8, new SpinnerPojo("B+", "B+"));
        ((ArrayList) objectRef4.element).add(9, new SpinnerPojo("B-", "B-"));
        ((ArrayList) objectRef4.element).add(10, new SpinnerPojo("O+", "O+"));
        ((ArrayList) objectRef4.element).add(11, new SpinnerPojo("O-", "O-"));
        x1().O.setAdapter((SpinnerAdapter) new j54(this, (ArrayList) objectRef4.element));
        x1().Q.setOnItemSelectedListener(new c(objectRef3));
        x1().R.setOnItemSelectedListener(new d(objectRef));
        x1().P.setOnItemSelectedListener(new e(objectRef2));
        x1().O.setOnItemSelectedListener(new f(objectRef4));
    }

    public final String u1() {
        String str = this.bloodGrp;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bloodGrp");
        return null;
    }

    public final nr1 v1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final String w1() {
        String str = this.eduCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eduCode");
        return null;
    }

    public final sd x1() {
        sd sdVar = this.mBinding;
        if (sdVar != null) {
            return sdVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final Context y1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ArrayList z1() {
        ArrayList arrayList = this.mRtosMaster;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRtosMaster");
        return null;
    }
}
