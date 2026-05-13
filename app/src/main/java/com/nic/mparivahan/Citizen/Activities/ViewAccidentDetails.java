package com.nic.mparivahan.Citizen.Activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Citizen.Activities.ViewAccidentDetails;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetViolationEvidenceResponse;
import com.nic.mparivahan.Citizen.Models.VoilationEvidenceModel;
import com.nic.mparivahan.R;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.of4;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.ta3;
import com.zepto.uf4;
import com.zepto.uh;
import com.zepto.ui2;
import com.zepto.vf4;
import com.zepto.wa3;
import com.zepto.wb0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\"\u0010$\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\"\u0010(\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010S\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010h\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010_\u001a\u0004\bf\u0010a\"\u0004\bg\u0010cR\"\u0010l\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u00103\u001a\u0004\bj\u00105\"\u0004\bk\u00107R\"\u0010p\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u00103\u001a\u0004\bn\u00105\"\u0004\bo\u00107R\"\u0010t\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u00103\u001a\u0004\br\u00105\"\u0004\bs\u00107R\u0016\u0010x\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010wR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f¨\u0006\u0083\u0001"}, d2 = {"Lcom/nic/mparivahan/Citizen/Activities/ViewAccidentDetails;", "Lcom/zepto/pq;", "", "p1", "G1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/content/Context;", "C", "Landroid/content/Context;", "s1", "()Landroid/content/Context;", "K1", "(Landroid/content/Context;)V", "mContext", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "z1", "()Landroid/widget/TextView;", "T1", "(Landroid/widget/TextView;)V", "txtLocation", "E", "A1", "U1", "txtStatus", "F", "B1", "V1", "txtVehicleNumber", "G", "y1", "S1", "txtId", "H", "v1", "N1", "OkButton", "Landroidx/recyclerview/widget/RecyclerView;", "I", "Landroidx/recyclerview/widget/RecyclerView;", "getAccFeedback", "()Landroidx/recyclerview/widget/RecyclerView;", "E1", "(Landroidx/recyclerview/widget/RecyclerView;)V", "accFeedback", "", "J", "Ljava/lang/String;", "m1", "()Ljava/lang/String;", "F1", "(Ljava/lang/String;)V", "accRecordId", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "O1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/vf4;", "L", "Lcom/zepto/vf4;", "u1", "()Lcom/zepto/vf4;", "M1", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "M", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "t1", "()Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "L1", "(Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;)V", "mOffenceInterface", "Landroid/widget/ImageView;", "N", "Landroid/widget/ImageView;", "n1", "()Landroid/widget/ImageView;", "H1", "(Landroid/widget/ImageView;)V", "evidenceImg", "O", "o1", "I1", "evidenceVideo", "", "P", "Z", "getShowVideo", "()Z", "R1", "(Z)V", "showVideo", "Q", "getShowImage", "Q1", "showImage", "R", "C1", "W1", "videoLink", "S", "getImageLink", "J1", "imageLink", "T", "getVideoLinkAfterDecode", "setVideoLinkAfterDecode", "videoLinkAfterDecode", "Lcom/zepto/uh;", "U", "Lcom/zepto/uh;", "binding", "Lcom/zepto/wa3;", "V", "Lcom/zepto/wa3;", "x1", "()Lcom/zepto/wa3;", "P1", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ViewAccidentDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView txtLocation;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TextView txtStatus;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView txtVehicleNumber;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TextView txtId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView OkButton;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public RecyclerView accFeedback;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String accRecordId;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ImageView evidenceImg;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ImageView evidenceVideo;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public boolean showVideo;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean showImage;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String videoLink = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String imageLink = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String videoLinkAfterDecode = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public uh binding;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public wa3 session;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ui2 ui2Var) {
            ViewAccidentDetails.this.w1().dismiss();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            wb0.a(obj);
            a(null);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(GetViolationEvidenceResponse getViolationEvidenceResponse) {
            if (!Intrinsics.areEqual(getViolationEvidenceResponse.getStatusDesc(), "Success")) {
                ViewAccidentDetails.this.n1().setVisibility(8);
                ViewAccidentDetails.this.o1().setVisibility(8);
                return;
            }
            try {
                ArrayList<VoilationEvidenceModel> evidences = getViolationEvidenceResponse.getEvidences();
                if (evidences.size() > 0) {
                    int size = evidences.size();
                    for (int i = 0; i < size; i++) {
                        if (Intrinsics.areEqual(evidences.get(i).getEvidenceType(), "IMG")) {
                            ViewAccidentDetails.this.Q1(true);
                            ViewAccidentDetails.this.J1(evidences.get(i).getEvidenceVal());
                        }
                        if (Intrinsics.areEqual(evidences.get(i).getEvidenceType(), "VID")) {
                            ViewAccidentDetails.this.R1(true);
                            ViewAccidentDetails.this.W1(evidences.get(i).getEvidenceVal());
                            Log.e("VID--", ViewAccidentDetails.this.getVideoLink());
                        }
                    }
                    ViewAccidentDetails.this.G1();
                }
            } catch (Exception unused) {
                ViewAccidentDetails.this.n1().setVisibility(8);
                ViewAccidentDetails.this.o1().setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetViolationEvidenceResponse) obj);
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

    public static final void D1(ViewAccidentDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void p1() {
        View viewFindViewById = findViewById(R.id.imageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        H1((ImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.videoView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        I1((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.acc_feedback);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        E1((RecyclerView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.b_ok_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        N1((TextView) viewFindViewById4);
        v1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAccidentDetails.q1(this.a, view);
            }
        });
        View viewFindViewById5 = findViewById(R.id.txt_location);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        T1((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.txt_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        U1((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.txt_vehicle_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        V1((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.txt_id);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        S1((TextView) viewFindViewById8);
        z1().setText(getIntent().getStringExtra("location"));
        if (Intrinsics.areEqual(getIntent().getStringExtra("status"), "0")) {
            A1().setText("Pending");
        } else {
            A1().setText("Active");
        }
        B1().setText(getIntent().getStringExtra("vehicleNumber"));
        if (m1() != null) {
            y1().setText("Accident ID: #" + m1());
        }
        M1((vf4) new z(this, new uf4(new of4(t1()))).a(vf4.class));
        O1(new ProgressDialog(this));
        w1().setMessage("Please wait...");
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        u1().v().g(this, new c(new a()));
        u1().B().g(this, new c(new b()));
        o1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAccidentDetails.r1(this.a, view);
            }
        });
    }

    public static final void q1(ViewAccidentDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m1() != null) {
            Intent intent = new Intent(this$0, (Class<?>) AccidentFeedback.class);
            intent.putExtra("accRecordId", this$0.m1().toString());
            this$0.startActivity(intent);
        }
    }

    public static final void r1(ViewAccidentDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.e("VID--", String.valueOf(this$0.showVideo));
        if (kt6.d(this$0.videoLinkAfterDecode)) {
            Intent intent = new Intent(this$0, (Class<?>) EvidenceVideoPlayActivity.class);
            intent.putExtra("videoUrl", this$0.videoLinkAfterDecode);
            Log.e("VideoLink--> ", this$0.videoLinkAfterDecode);
            this$0.startActivity(intent);
        }
    }

    public final TextView A1() {
        TextView textView = this.txtStatus;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtStatus");
        return null;
    }

    public final TextView B1() {
        TextView textView = this.txtVehicleNumber;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtVehicleNumber");
        return null;
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final String getVideoLink() {
        return this.videoLink;
    }

    public final void E1(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.accFeedback = recyclerView;
    }

    public final void F1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accRecordId = str;
    }

    public final void G1() {
        if (this.showImage) {
            n1().setVisibility(0);
            if (this.imageLink.length() > 0) {
                n1().setImageBitmap(st6.c(this.imageLink));
            }
        } else {
            n1().setVisibility(8);
        }
        if (!this.showVideo) {
            o1().setVisibility(8);
            return;
        }
        o1().setVisibility(0);
        byte[] bArrDecode = Base64.decode(this.videoLink, 0);
        Intrinsics.checkNotNull(bArrDecode);
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        this.videoLinkAfterDecode = new String(bArrDecode, charsetForName);
    }

    public final void H1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.evidenceImg = imageView;
    }

    public final void I1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.evidenceVideo = imageView;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageLink = str;
    }

    public final void K1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void L1(OffenceInterface offenceInterface) {
        Intrinsics.checkNotNullParameter(offenceInterface, "<set-?>");
        this.mOffenceInterface = offenceInterface;
    }

    public final void M1(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    public final void N1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.OkButton = textView;
    }

    public final void O1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void P1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void Q1(boolean z) {
        this.showImage = z;
    }

    public final void R1(boolean z) {
        this.showVideo = z;
    }

    public final void S1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtId = textView;
    }

    public final void T1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtLocation = textView;
    }

    public final void U1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtStatus = textView;
    }

    public final void V1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVehicleNumber = textView;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoLink = str;
    }

    public final String m1() {
        String str = this.accRecordId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accRecordId");
        return null;
    }

    public final ImageView n1() {
        ImageView imageView = this.evidenceImg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evidenceImg");
        return null;
    }

    public final ImageView o1() {
        ImageView imageView = this.evidenceVideo;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evidenceVideo");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        uh uhVarC = uh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(uhVarC, "inflate(...)");
        this.binding = uhVarC;
        uh uhVar = null;
        if (uhVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uhVarC = null;
        }
        setContentView(uhVarC.b());
        K1(this);
        L1(OffenceInterface.INSTANCE.a(s1()));
        P1(new wa3(this));
        ta3.a aVar = ta3.a;
        uh uhVar2 = this.binding;
        if (uhVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uhVar2 = null;
        }
        aVar.l(this, uhVar2);
        uh uhVar3 = this.binding;
        if (uhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uhVar3 = null;
        }
        uhVar3.d.g.setText(x1().b("report_traffic_violation", "Report Traffic Violation"));
        F1(String.valueOf(getIntent().getStringExtra("accRecordId")));
        p1();
        u1().j(m1());
        uh uhVar4 = this.binding;
        if (uhVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            uhVar = uhVar4;
        }
        uhVar.d.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAccidentDetails.D1(this.a, view);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        u1().i(m1());
    }

    public final Context s1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final OffenceInterface t1() {
        OffenceInterface offenceInterface = this.mOffenceInterface;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
        return null;
    }

    public final vf4 u1() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final TextView v1() {
        TextView textView = this.OkButton;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("OkButton");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
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

    public final TextView y1() {
        TextView textView = this.txtId;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtId");
        return null;
    }

    public final TextView z1() {
        TextView textView = this.txtLocation;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtLocation");
        return null;
    }
}
