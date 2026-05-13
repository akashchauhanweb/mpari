package com.nic.mparivahan.PushNoti.NotViews;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.FetchVahanLog.Pojo.DltVhnTransaction;
import com.nic.mparivahan.PushNoti.NotInterface;
import com.nic.mparivahan.PushNoti.NotViews.NotificationView;
import com.nic.mparivahan.PushNoti.Pojo.NotificationResponse;
import com.nic.mparivahan.R;
import com.zepto.fc4;
import com.zepto.hc4;
import com.zepto.ic4;
import com.zepto.jc4;
import com.zepto.mf4;
import com.zepto.ns1;
import com.zepto.pq;
import com.zepto.wa3;
import com.zepto.ws6;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b~\u0010\u007fJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u00103\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010I\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010=\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010l\u001a\u0004\bs\u0010n\"\u0004\bt\u0010pR\"\u0010y\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010l\u001a\u0004\bw\u0010n\"\u0004\bx\u0010pR\"\u0010}\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010l\u001a\u0004\b{\u0010n\"\u0004\b|\u0010p¨\u0006\u0080\u0001"}, d2 = {"Lcom/nic/mparivahan/PushNoti/NotViews/NotificationView;", "Lcom/zepto/pq;", "Lcom/zepto/ns1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "RecordId", "", "position", "F", "Landroid/content/Context;", "C", "Landroid/content/Context;", "k1", "()Landroid/content/Context;", "z1", "(Landroid/content/Context;)V", "context", "Landroidx/recyclerview/widget/RecyclerView;", "D", "Landroidx/recyclerview/widget/RecyclerView;", "v1", "()Landroidx/recyclerview/widget/RecyclerView;", "L1", "(Landroidx/recyclerview/widget/RecyclerView;)V", "rv_vahan_trans", "Lcom/zepto/jc4;", "E", "Lcom/zepto/jc4;", "n1", "()Lcom/zepto/jc4;", "C1", "(Lcom/zepto/jc4;)V", "mNotVM", "Lcom/nic/mparivahan/PushNoti/NotInterface;", "Lcom/nic/mparivahan/PushNoti/NotInterface;", "m1", "()Lcom/nic/mparivahan/PushNoti/NotInterface;", "B1", "(Lcom/nic/mparivahan/PushNoti/NotInterface;)V", "mNotInterface", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/PushNoti/Pojo/Notification;", "G", "Ljava/util/ArrayList;", "l1", "()Ljava/util/ArrayList;", "A1", "(Ljava/util/ArrayList;)V", "mListVal", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "p1", "()Lcom/zepto/ws6;", "E1", "(Lcom/zepto/ws6;)V", "mSession", "Landroid/widget/ImageView;", "I", "Landroid/widget/ImageView;", "q1", "()Landroid/widget/ImageView;", "F1", "(Landroid/widget/ImageView;)V", "mvvm_back", "J", "j1", "()I", "setAdapterPos", "(I)V", "AdapterPos", "Lcom/zepto/fc4;", "K", "Lcom/zepto/fc4;", "o1", "()Lcom/zepto/fc4;", "D1", "(Lcom/zepto/fc4;)V", "mNotadapter", "Landroid/widget/LinearLayout;", "L", "Landroid/widget/LinearLayout;", "s1", "()Landroid/widget/LinearLayout;", "H1", "(Landroid/widget/LinearLayout;)V", "no_noti_linear", "Landroid/app/ProgressDialog;", "M", "Landroid/app/ProgressDialog;", "u1", "()Landroid/app/ProgressDialog;", "K1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "N", "Lcom/zepto/wa3;", "x1", "()Lcom/zepto/wa3;", "N1", "(Lcom/zepto/wa3;)V", "session", "Landroid/widget/TextView;", "O", "Landroid/widget/TextView;", "getNotificationTitle", "()Landroid/widget/TextView;", "I1", "(Landroid/widget/TextView;)V", "notificationTitle", "P", "r1", "G1", "noNotificationTv", "Q", "t1", "J1", "notifyTv", "R", "w1", "M1", "service_label", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NotificationView extends pq implements ns1 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public RecyclerView rv_vahan_trans;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public jc4 mNotVM;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public NotInterface mNotInterface;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ArrayList mListVal;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ws6 mSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ImageView mvvm_back;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public int AdapterPos;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public fc4 mNotadapter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public LinearLayout no_noti_linear;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public TextView notificationTitle;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public TextView noNotificationTv;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public TextView notifyTv;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public TextView service_label;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(NotificationResponse notificationResponse) {
            try {
                NotificationView.this.u1().dismiss();
                if (Intrinsics.areEqual(notificationResponse.getStatusCode(), "AL001")) {
                    NotificationView.this.s1().setVisibility(8);
                    NotificationView.this.v1().setVisibility(0);
                    NotificationView.this.v1().setLayoutManager(new LinearLayoutManager(NotificationView.this));
                    NotificationView.this.v1().setAdapter(null);
                    NotificationView.this.A1(notificationResponse.getNotifications());
                    NotificationView notificationView = NotificationView.this;
                    notificationView.D1(new fc4(notificationView.l1(), NotificationView.this.k1(), NotificationView.this));
                    NotificationView.this.v1().setAdapter(NotificationView.this.o1());
                } else {
                    NotificationView.this.v1().setAdapter(null);
                    NotificationView.this.s1().setVisibility(0);
                }
            } catch (Exception unused) {
                NotificationView.this.s1().setVisibility(0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NotificationResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(DltVhnTransaction dltVhnTransaction) {
            try {
                NotificationView.this.u1().dismiss();
                if (Intrinsics.areEqual(dltVhnTransaction.getStatusCode(), "AL001")) {
                    NotificationView.this.o1().M(NotificationView.this.getAdapterPos());
                    if (NotificationView.this.o1().e() > 0) {
                        NotificationView.this.s1().setVisibility(8);
                    } else {
                        NotificationView.this.s1().setVisibility(0);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DltVhnTransaction) obj);
            return Unit.INSTANCE;
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

    public static final void y1(NotificationView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void A1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mListVal = arrayList;
    }

    public final void B1(NotInterface notInterface) {
        Intrinsics.checkNotNullParameter(notInterface, "<set-?>");
        this.mNotInterface = notInterface;
    }

    public final void C1(jc4 jc4Var) {
        Intrinsics.checkNotNullParameter(jc4Var, "<set-?>");
        this.mNotVM = jc4Var;
    }

    public final void D1(fc4 fc4Var) {
        Intrinsics.checkNotNullParameter(fc4Var, "<set-?>");
        this.mNotadapter = fc4Var;
    }

    public final void E1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSession = ws6Var;
    }

    @Override // com.zepto.ns1
    public void F(long RecordId, int position) {
        this.AdapterPos = position;
        n1().g(Long.valueOf(RecordId));
    }

    public final void F1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mvvm_back = imageView;
    }

    public final void G1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.noNotificationTv = textView;
    }

    public final void H1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.no_noti_linear = linearLayout;
    }

    public final void I1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.notificationTitle = textView;
    }

    public final void J1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.notifyTv = textView;
    }

    public final void K1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void L1(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.rv_vahan_trans = recyclerView;
    }

    public final void M1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.service_label = textView;
    }

    public final void N1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    /* JADX INFO: renamed from: j1, reason: from getter */
    public final int getAdapterPos() {
        return this.AdapterPos;
    }

    public final Context k1() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public final ArrayList l1() {
        ArrayList arrayList = this.mListVal;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mListVal");
        return null;
    }

    public final NotInterface m1() {
        NotInterface notInterface = this.mNotInterface;
        if (notInterface != null) {
            return notInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mNotInterface");
        return null;
    }

    public final jc4 n1() {
        jc4 jc4Var = this.mNotVM;
        if (jc4Var != null) {
            return jc4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mNotVM");
        return null;
    }

    public final fc4 o1() {
        fc4 fc4Var = this.mNotadapter;
        if (fc4Var != null) {
            return fc4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mNotadapter");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_view);
        z1(this);
        E1(new ws6(this));
        B1(NotInterface.INSTANCE.a(k1()));
        View viewFindViewById = findViewById(R.id.rec_not);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        L1((RecyclerView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.mvvm_Back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        F1((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.no_noti_linear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        H1((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.notificationTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        I1((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.noNotificationTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        G1((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.service_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        M1((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.notifyTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        J1((TextView) viewFindViewById7);
        N1(new wa3(this));
        K1(new ProgressDialog(this));
        u1().setMessage(x1().b("label_challan_please_wait", "Please wait..."));
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        w1().setText(x1().b("label_notifications", "Notifications"));
        r1().setText(x1().b("label_no_notification", "No Notification"));
        t1().setText(x1().b("label_notify_user", "We'll notify you when something arrives."));
        q1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fe4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationView.y1(this.a, view);
            }
        });
        C1((jc4) new z(this, new hc4(new ic4(m1()))).a(jc4.class));
        u1().show();
        n1().k(Long.parseLong(p1().k()));
        n1().j().g(this, new c(new a()));
        n1().h().g(this, new c(new b()));
    }

    public final ws6 p1() {
        ws6 ws6Var = this.mSession;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSession");
        return null;
    }

    public final ImageView q1() {
        ImageView imageView = this.mvvm_back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final TextView r1() {
        TextView textView = this.noNotificationTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noNotificationTv");
        return null;
    }

    public final LinearLayout s1() {
        LinearLayout linearLayout = this.no_noti_linear;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("no_noti_linear");
        return null;
    }

    public final TextView t1() {
        TextView textView = this.notifyTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("notifyTv");
        return null;
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final RecyclerView v1() {
        RecyclerView recyclerView = this.rv_vahan_trans;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rv_vahan_trans");
        return null;
    }

    public final TextView w1() {
        TextView textView = this.service_label;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("service_label");
        return null;
    }

    public final wa3 x1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void z1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }
}
