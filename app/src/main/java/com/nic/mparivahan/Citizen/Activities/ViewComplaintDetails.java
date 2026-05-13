package com.nic.mparivahan.Citizen.Activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Citizen.Activities.ViewComplaintDetails;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetTrafficFeedback;
import com.nic.mparivahan.Citizen.Models.GetViolationEvidenceResponse;
import com.nic.mparivahan.Citizen.Models.VoilationEvidenceModel;
import com.nic.mparivahan.R;
import com.zepto.bk2;
import com.zepto.ef3;
import com.zepto.f80;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.mj2;
import com.zepto.of4;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.ta3;
import com.zepto.tf4;
import com.zepto.tg4;
import com.zepto.uf4;
import com.zepto.vf4;
import com.zepto.vh;
import com.zepto.wa3;
import com.zepto.yz0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0003J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0003H\u0014J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010$\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\"\u0010(\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\"\u0010,\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR2\u0010^\u001a\u0012\u0012\u0004\u0012\u00020V0Uj\b\u0012\u0004\u0012\u00020V`W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010j\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010a\u001a\u0004\bh\u0010c\"\u0004\bi\u0010eR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010v\u001a\u00020k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR\"\u0010z\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010/\u001a\u0004\bx\u00101\"\u0004\by\u00103R\"\u0010~\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010/\u001a\u0004\b|\u00101\"\u0004\b}\u00103R%\u0010\u0082\u0001\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010/\u001a\u0005\b\u0080\u0001\u00101\"\u0005\b\u0081\u0001\u00103R\u001a\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/nic/mparivahan/Citizen/Activities/ViewComplaintDetails;", "Lcom/zepto/pq;", "Lcom/zepto/tg4;", "", "q1", "I1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Lcom/zepto/bk2;", "googleMap", "A", "Landroid/content/Context;", "C", "Landroid/content/Context;", "u1", "()Landroid/content/Context;", "M1", "(Landroid/content/Context;)V", "mContext", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "D1", "()Landroid/widget/TextView;", "X1", "(Landroid/widget/TextView;)V", "txtLocation", "E", "E1", "Y1", "txtStatus", "F", "F1", "Z1", "txtVehicleNumber", "G", "C1", "W1", "txtId", "H", "y1", "Q1", "OkButton", "", "I", "Ljava/lang/String;", "G1", "()Ljava/lang/String;", "b2", "(Ljava/lang/String;)V", "violOffenceId", "Landroidx/recyclerview/widget/RecyclerView;", "J", "Landroidx/recyclerview/widget/RecyclerView;", "B1", "()Landroidx/recyclerview/widget/RecyclerView;", "V1", "(Landroidx/recyclerview/widget/RecyclerView;)V", "trafficFeedBackRecyclerView", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "R1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/vf4;", "L", "Lcom/zepto/vf4;", "x1", "()Lcom/zepto/vf4;", "P1", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "M", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "w1", "()Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "O1", "(Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;)V", "mOffenceInterface", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Citizen/Models/MparViolationFeedback;", "Lkotlin/collections/ArrayList;", "N", "Ljava/util/ArrayList;", "v1", "()Ljava/util/ArrayList;", "N1", "(Ljava/util/ArrayList;)V", "mListVal", "Landroid/widget/ImageView;", "O", "Landroid/widget/ImageView;", "o1", "()Landroid/widget/ImageView;", "J1", "(Landroid/widget/ImageView;)V", "evidenceImg", "P", "p1", "K1", "evidenceVideo", "", "Q", "Z", "getShowVideo", "()Z", "U1", "(Z)V", "showVideo", "R", "getShowImage", "T1", "showImage", "S", "getVideoLink", "a2", "videoLink", "T", "getImageLink", "L1", "imageLink", "U", "getVideoLinkAfterDecode", "setVideoLinkAfterDecode", "videoLinkAfterDecode", "Lcom/zepto/vh;", "V", "Lcom/zepto/vh;", "binding", "Lcom/zepto/wa3;", "W", "Lcom/zepto/wa3;", "A1", "()Lcom/zepto/wa3;", "S1", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ViewComplaintDetails extends pq implements tg4 {

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
    public String violOffenceId;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public RecyclerView trafficFeedBackRecyclerView;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ArrayList mListVal;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ImageView evidenceImg;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ImageView evidenceVideo;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean showVideo;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean showImage;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String videoLink = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String imageLink = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String videoLinkAfterDecode = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public vh binding;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wa3 session;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetTrafficFeedback getTrafficFeedback) {
            try {
                ViewComplaintDetails.this.z1().dismiss();
                if (Intrinsics.areEqual(getTrafficFeedback.getStatusDesc(), "Success")) {
                    ViewComplaintDetails.this.B1().setLayoutManager(new LinearLayoutManager(ViewComplaintDetails.this));
                    ViewComplaintDetails.this.B1().setAdapter(null);
                    ViewComplaintDetails.this.N1(getTrafficFeedback.getViolationFeedbacks());
                    CollectionsKt___CollectionsJvmKt.reverse(ViewComplaintDetails.this.v1());
                    ViewComplaintDetails.this.B1().setAdapter(new mj2(ViewComplaintDetails.this.v1(), ViewComplaintDetails.this.u1()));
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetTrafficFeedback) obj);
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
            if (ViewComplaintDetails.this.z1().isShowing()) {
                ViewComplaintDetails.this.z1().dismiss();
            }
        }
    }

    public static final class c extends Lambda implements Function1 {

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ ViewComplaintDetails e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewComplaintDetails viewComplaintDetails, Continuation continuation) {
                super(2, continuation);
                this.e = viewComplaintDetails;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.e.I1();
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(GetViolationEvidenceResponse getViolationEvidenceResponse) {
            if (!Intrinsics.areEqual(getViolationEvidenceResponse.getStatusDesc(), "Success")) {
                ViewComplaintDetails.this.o1().setVisibility(8);
                ViewComplaintDetails.this.p1().setVisibility(8);
                ViewComplaintDetails.this.z1().dismiss();
                return;
            }
            try {
                ArrayList<VoilationEvidenceModel> evidences = getViolationEvidenceResponse.getEvidences();
                if (evidences.size() <= 0) {
                    return;
                }
                int size = evidences.size();
                int i = 0;
                while (true) {
                    vh vhVar = null;
                    if (i >= size) {
                        f80.d(ef3.a(ViewComplaintDetails.this), null, null, new a(ViewComplaintDetails.this, null), 3, null);
                        return;
                    }
                    if (Intrinsics.areEqual(evidences.get(i).getEvidenceType(), "IMG")) {
                        ViewComplaintDetails.this.T1(true);
                        ViewComplaintDetails.this.L1(evidences.get(i).getEvidenceVal());
                    } else {
                        vh vhVar2 = ViewComplaintDetails.this.binding;
                        if (vhVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            vhVar = vhVar2;
                        }
                        vhVar.c.setVisibility(8);
                    }
                    if (Intrinsics.areEqual(evidences.get(i).getEvidenceType(), "VID")) {
                        ViewComplaintDetails.this.U1(true);
                        if (evidences.get(i).getEvidenceVal().length() > 0) {
                            ViewComplaintDetails.this.a2(evidences.get(i).getEvidenceVal());
                        }
                    }
                    i++;
                }
            } catch (Exception e) {
                ViewComplaintDetails.this.o1().setVisibility(8);
                ViewComplaintDetails.this.p1().setVisibility(8);
                e.printStackTrace();
                ViewComplaintDetails.this.z1().dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetViolationEvidenceResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    public static final void H1(ViewComplaintDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1() {
        vh vhVar = null;
        if (this.showImage) {
            o1().setVisibility(0);
            if (this.imageLink.length() > 0) {
                o1().setImageBitmap(st6.c(this.imageLink));
                z1().dismiss();
                vh vhVar2 = this.binding;
                if (vhVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    vhVar = vhVar2;
                }
                vhVar.c.setVisibility(8);
            }
        } else {
            o1().setVisibility(8);
            vh vhVar3 = this.binding;
            if (vhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                vhVar = vhVar3;
            }
            vhVar.c.setVisibility(8);
        }
        if (!this.showVideo) {
            p1().setVisibility(8);
            return;
        }
        p1().setVisibility(0);
        byte[] bArrDecode = Base64.decode(this.videoLink, 0);
        Intrinsics.checkNotNull(bArrDecode);
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        String str = new String(bArrDecode, charsetForName);
        this.videoLinkAfterDecode = str;
        Log.e("VideoLink - ", str);
    }

    private final void q1() {
        View viewFindViewById = findViewById(R.id.imageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        J1((ImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.videoView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        K1((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.traffic_feedback);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        V1((RecyclerView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.b_ok_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        Q1((TextView) viewFindViewById4);
        o1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewComplaintDetails.r1(this.a, view);
            }
        });
        y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewComplaintDetails.s1(this.a, view);
            }
        });
        View viewFindViewById5 = findViewById(R.id.txt_location);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        X1((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.txt_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        Y1((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.txt_vehicle_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        Z1((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.txt_id);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        W1((TextView) viewFindViewById8);
        D1().setText(getIntent().getStringExtra("location"));
        if (Intrinsics.areEqual(getIntent().getStringExtra("status"), "0")) {
            E1().setText("Pending");
        } else {
            E1().setText("Active");
        }
        F1().setText(getIntent().getStringExtra("vehicleNumber"));
        if (G1() != null) {
            C1().setText("Violation ID: #" + G1());
        }
        P1((vf4) new z(this, new uf4(new of4(w1()))).a(vf4.class));
        x1().A().g(this, new d(new a()));
        x1().s().g(this, new d(new b()));
        x1().B().g(this, new d(new c()));
        p1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewComplaintDetails.t1(this.a, view);
            }
        });
    }

    public static final void r1(ViewComplaintDetails this$0, View view) {
        Bitmap bitmapC;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.imageLink.length() <= 0 || (bitmapC = st6.c(this$0.imageLink)) == null) {
            return;
        }
        tf4.a.t(this$0, bitmapC);
    }

    public static final void s1(ViewComplaintDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.G1() != null) {
            Intent intent = new Intent(this$0, (Class<?>) TrafficFeedback.class);
            intent.putExtra("violOffenceId", this$0.G1().toString());
            this$0.startActivity(intent);
        }
    }

    public static final void t1(ViewComplaintDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (kt6.d(this$0.videoLinkAfterDecode)) {
            Intent intent = new Intent(this$0, (Class<?>) EvidenceVideoPlayActivity.class);
            intent.putExtra("videoUrl", this$0.videoLinkAfterDecode);
            this$0.startActivity(intent);
        }
    }

    @Override // com.zepto.tg4
    public void A(bk2 googleMap) {
        Intrinsics.checkNotNullParameter(googleMap, "googleMap");
    }

    public final wa3 A1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final RecyclerView B1() {
        RecyclerView recyclerView = this.trafficFeedBackRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("trafficFeedBackRecyclerView");
        return null;
    }

    public final TextView C1() {
        TextView textView = this.txtId;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtId");
        return null;
    }

    public final TextView D1() {
        TextView textView = this.txtLocation;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtLocation");
        return null;
    }

    public final TextView E1() {
        TextView textView = this.txtStatus;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtStatus");
        return null;
    }

    public final TextView F1() {
        TextView textView = this.txtVehicleNumber;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtVehicleNumber");
        return null;
    }

    public final String G1() {
        String str = this.violOffenceId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("violOffenceId");
        return null;
    }

    public final void J1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.evidenceImg = imageView;
    }

    public final void K1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.evidenceVideo = imageView;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageLink = str;
    }

    public final void M1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void N1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mListVal = arrayList;
    }

    public final void O1(OffenceInterface offenceInterface) {
        Intrinsics.checkNotNullParameter(offenceInterface, "<set-?>");
        this.mOffenceInterface = offenceInterface;
    }

    public final void P1(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    public final void Q1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.OkButton = textView;
    }

    public final void R1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void S1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void T1(boolean z) {
        this.showImage = z;
    }

    public final void U1(boolean z) {
        this.showVideo = z;
    }

    public final void V1(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.trafficFeedBackRecyclerView = recyclerView;
    }

    public final void W1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtId = textView;
    }

    public final void X1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtLocation = textView;
    }

    public final void Y1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtStatus = textView;
    }

    public final void Z1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVehicleNumber = textView;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoLink = str;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.violOffenceId = str;
    }

    public final ImageView o1() {
        ImageView imageView = this.evidenceImg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evidenceImg");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vh vhVarC = vh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(vhVarC, "inflate(...)");
        this.binding = vhVarC;
        vh vhVar = null;
        if (vhVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vhVarC = null;
        }
        setContentView(vhVarC.b());
        R1(new ProgressDialog(this));
        z1().setMessage("Please wait...");
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        M1(this);
        O1(OffenceInterface.INSTANCE.a(this));
        b2(String.valueOf(getIntent().getStringExtra("violOffenceId")));
        S1(new wa3(this));
        ta3.a aVar = ta3.a;
        vh vhVar2 = this.binding;
        if (vhVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vhVar2 = null;
        }
        aVar.k(this, vhVar2);
        vh vhVar3 = this.binding;
        if (vhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vhVar3 = null;
        }
        vhVar3.d.g.setText(A1().b("report_traffic_violation", "View Details"));
        q1();
        z1().show();
        vh vhVar4 = this.binding;
        if (vhVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vhVar4 = null;
        }
        vhVar4.c.setVisibility(0);
        x1().U(G1());
        vh vhVar5 = this.binding;
        if (vhVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vhVar = vhVar5;
        }
        vhVar.d.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewComplaintDetails.H1(this.a, view);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        x1().S(G1());
    }

    public final ImageView p1() {
        ImageView imageView = this.evidenceVideo;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evidenceVideo");
        return null;
    }

    public final Context u1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ArrayList v1() {
        ArrayList arrayList = this.mListVal;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mListVal");
        return null;
    }

    public final OffenceInterface w1() {
        OffenceInterface offenceInterface = this.mOffenceInterface;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
        return null;
    }

    public final vf4 x1() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final TextView y1() {
        TextView textView = this.OkButton;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("OkButton");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
