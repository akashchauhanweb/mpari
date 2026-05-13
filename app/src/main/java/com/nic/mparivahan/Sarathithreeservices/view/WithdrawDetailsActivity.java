package com.nic.mparivahan.Sarathithreeservices.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplStatusDetail;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.GetAppStatusMain;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import com.nic.mparivahan.Sarathithreeservices.view.WithdrawDetailsActivity;
import com.zepto.bj2;
import com.zepto.cx;
import com.zepto.dx;
import com.zepto.mf4;
import com.zepto.o40;
import com.zepto.q44;
import com.zepto.rw4;
import com.zepto.wl5;
import com.zepto.yh;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00103\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u0010.¨\u00066"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/view/WithdrawDetailsActivity;", "Lcom/zepto/o40;", "", "G1", "H1", "F1", "Landroid/content/Context;", "context", "L1", "", "visible", "O1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/zepto/yh;", "F", "Lcom/zepto/yh;", "mBinding", "Lcom/zepto/cx;", "G", "Lcom/zepto/cx;", "appStatusVM", "Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "H", "Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "E1", "()Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "N1", "(Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;)V", "appInfoService", "Lcom/zepto/rw4;", "I", "Lcom/zepto/rw4;", "progress", "Lcom/zepto/wl5;", "J", "Lcom/zepto/wl5;", "getSarthiSession", "()Lcom/zepto/wl5;", "P1", "(Lcom/zepto/wl5;)V", "sarthiSession", "", "K", "Ljava/lang/String;", "appNo", "L", "dob", "M", "format_date", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWithdrawDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawDetailsActivity.kt\ncom/nic/mparivahan/Sarathithreeservices/view/WithdrawDetailsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
public final class WithdrawDetailsActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public yh mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public cx appStatusVM;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public GetApplStatusService appInfoService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public rw4 progress;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String appNo;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String format_date;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetAppStatusMain getAppStatusMain) {
            WithdrawDetailsActivity.this.O1(false);
            if (!Intrinsics.areEqual(getAppStatusMain.getStatus_code(), "00") || !Intrinsics.areEqual(getAppStatusMain.getStatus_desc(), "Success")) {
                Toast.makeText(WithdrawDetailsActivity.this, getAppStatusMain.getStatus_desc(), 1).show();
                return;
            }
            List<ApplStatusDetail> applStatus_Details = getAppStatusMain.getApplStatus_Details();
            yh yhVar = WithdrawDetailsActivity.this.mBinding;
            yh yhVar2 = null;
            if (yhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                yhVar = null;
            }
            yhVar.f.setText(applStatus_Details.get(0).getApplno());
            yh yhVar3 = WithdrawDetailsActivity.this.mBinding;
            if (yhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                yhVar3 = null;
            }
            yhVar3.b.setText(applStatus_Details.get(0).getApplName());
            yh yhVar4 = WithdrawDetailsActivity.this.mBinding;
            if (yhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                yhVar4 = null;
            }
            yhVar4.d.setText(applStatus_Details.get(0).getDob());
            yh yhVar5 = WithdrawDetailsActivity.this.mBinding;
            if (yhVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                yhVar5 = null;
            }
            yhVar5.r.setText(applStatus_Details.get(0).getRtoCd());
            yh yhVar6 = WithdrawDetailsActivity.this.mBinding;
            if (yhVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                yhVar2 = yhVar6;
            }
            yhVar2.n.setText(applStatus_Details.get(0).getRtoName());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetAppStatusMain) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public b(Function1 function) {
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

    private final void F1() {
        if (!q44.a.a(this)) {
            Toast.makeText(this, getString(R.string.no_internet), 1).show();
            return;
        }
        O1(true);
        cx cxVar = this.appStatusVM;
        cx cxVar2 = null;
        if (cxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
            cxVar = null;
        }
        String str = this.appNo;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appNo");
            str = null;
        }
        String str2 = this.format_date;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("format_date");
            str2 = null;
        }
        cxVar.h(this, str, str2);
        cx cxVar3 = this.appStatusVM;
        if (cxVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
        } else {
            cxVar2 = cxVar3;
        }
        cxVar2.k().g(this, new b(new a()));
    }

    private final void G1() {
        String stringExtra = getIntent().getStringExtra("app_no");
        Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
        this.appNo = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("dob");
        Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
        this.dob = stringExtra2;
        this.appStatusVM = (cx) new z(this, new dx(new bj2(E1()))).a(cx.class);
        P1(new wl5(this));
        String str = this.appNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appNo");
            str = null;
        }
        if (str.length() <= 0) {
            String str3 = this.dob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dob");
                str3 = null;
            }
            if (str3.length() <= 0) {
                return;
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        String str4 = this.dob;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dob");
        } else {
            str2 = str4;
        }
        String str5 = simpleDateFormat2.format(simpleDateFormat.parse(str2));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        this.format_date = str5;
        F1();
    }

    private final void H1() {
        yh yhVar = this.mBinding;
        yh yhVar2 = null;
        if (yhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            yhVar = null;
        }
        yhVar.k.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ax7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawDetailsActivity.I1(this.a, view);
            }
        });
        yh yhVar3 = this.mBinding;
        if (yhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            yhVar3 = null;
        }
        yhVar3.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bx7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawDetailsActivity.J1(this.a, view);
            }
        });
        yh yhVar4 = this.mBinding;
        if (yhVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            yhVar2 = yhVar4;
        }
        yhVar2.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cx7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawDetailsActivity.K1(this.a, view);
            }
        });
    }

    public static final void I1(WithdrawDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void J1(WithdrawDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void K1(WithdrawDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1(this$0);
    }

    private final void L1(Context context) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_dialog);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.msg_title);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        dialog.show();
        ((TextView) viewFindViewById).setText(getString(R.string.withdraw_pop_msg));
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dx7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawDetailsActivity.M1(dialog, view);
            }
        });
    }

    public static final void M1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(boolean visible) {
        if (visible) {
            try {
                this.progress = new rw4(this, R.string.please_wait, true);
            } catch (WindowManager.BadTokenException e) {
                e.printStackTrace();
                return;
            }
        }
        rw4 rw4Var = this.progress;
        if (rw4Var != null) {
            if (visible) {
                rw4Var.b();
            } else {
                rw4Var.a();
            }
        }
    }

    public final GetApplStatusService E1() {
        GetApplStatusService getApplStatusService = this.appInfoService;
        if (getApplStatusService != null) {
            return getApplStatusService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appInfoService");
        return null;
    }

    public final void N1(GetApplStatusService getApplStatusService) {
        Intrinsics.checkNotNullParameter(getApplStatusService, "<set-?>");
        this.appInfoService = getApplStatusService;
    }

    public final void P1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yh yhVarC = yh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(yhVarC, "inflate(...)");
        this.mBinding = yhVarC;
        if (yhVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            yhVarC = null;
        }
        setContentView(yhVarC.b());
        N1(GetApplStatusService.INSTANCE.a(this));
        G1();
        H1();
    }
}
