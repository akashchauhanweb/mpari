package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dashboard.ui.VehicleServiceHomeNew;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.aj0;
import com.zepto.jm3;
import com.zepto.pq;
import com.zepto.ql6;
import com.zepto.ta3;
import com.zepto.wa3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bR\u0010SJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aJ\"\u0010 \u001a\u00020\u00172\u001a\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u001eJ\"\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00104\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010,\u001a\u0004\bI\u0010.\"\u0004\bJ\u00100R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerView/TransferOfOwnerShipConfirmationScreen;", "Lcom/zepto/pq;", "", "E1", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "y1", "Ljava/io/File;", "file", "J1", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "onResume", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "q1", "Landroid/app/Activity;", "activity", "p1", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "multiServiceList", "v1", "title", "K1", "Lcom/zepto/ql6;", "C", "Lcom/zepto/ql6;", "t1", "()Lcom/zepto/ql6;", "F1", "(Lcom/zepto/ql6;)V", "binding", "D", "Ljava/lang/String;", "getApplication", "()Ljava/lang/String;", "setApplication", "(Ljava/lang/String;)V", "application", "E", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "F", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "G1", "(Lcom/zepto/wa3;)V", "languageKeySession", "H", "w1", "H1", "rc_number", "I", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TransferOfOwnerShipConfirmationScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ql6 binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String application = " ";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final void A1(TransferOfOwnerShipConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q1(this$0, "Are you sure you want to leave?");
    }

    public static final void B1(TransferOfOwnerShipConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1();
    }

    public static final void C1(TransferOfOwnerShipConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.p1(this$0)) {
            ConstraintLayout containerCl = this$0.t1().c;
            Intrinsics.checkNotNullExpressionValue(containerCl, "containerCl");
            this$0.y1(containerCl);
        }
    }

    public static final void D1(TransferOfOwnerShipConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q1(this$0, "Are you sure you want to leave?");
    }

    private final void E1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void J1(File file) {
        Uri uriF = FileProvider.f(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, u1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    public static final void r1(Dialog d, TransferOfOwnerShipConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) VehicleServiceHomeNew.class);
        intent.putExtra("state_code", this$0.x1().getState_cd());
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void s1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void y1(ConstraintLayout containerView) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(containerView.getWidth(), containerView.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            containerView.draw(new Canvas(bitmapCreateBitmap));
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "//";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str + "screenshot" + this.application + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            J1(file2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final void z1(TransferOfOwnerShipConfirmationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.w1());
        intent.putExtra("RcDetails", this$0.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
        intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
        this$0.startActivity(intent);
    }

    public final void F1(ql6 ql6Var) {
        Intrinsics.checkNotNullParameter(ql6Var, "<set-?>");
        this.binding = ql6Var;
    }

    public final void G1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void I1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void K1(String title, String message, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        jm3.a.b(title, message, context);
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        q1(this, u1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tranfer_of_owner_ship_confirmation_seller);
        ql6 ql6VarC = ql6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ql6VarC, "inflate(...)");
        F1(ql6VarC);
        setContentView(t1().b());
        ta3.a.z2(this, t1());
        G1(new wa3(this));
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.APP_NO);
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type kotlin.String");
        this.application = (String) serializableExtra;
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        I1((NrvDetails) serializableExtra2);
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        H1(String.valueOf(x1().getRc_regn_no()));
        t1().f.i.setText(String.valueOf(u1().b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
        t1().b.setText("Application for " + v1(this.multiServiceList) + "has been initiated with application No.\n" + this.application + " \n\n An SMS has been sent on buyer's mobile number entered by you. \n\n Please ask the buyer to process further on NextGen mParivahan app using the option 'Transfer of Ownership (Buyer)' with\n\npartially completed application No.");
        K1(t1().f.i.getText().toString(), t1().b.getText().toString(), this);
        t1().f.e.setVisibility(0);
        t1().f.e.setText(w1());
        SpannableString spannableString = new SpannableString(w1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        t1().f.e.setText(spannableString);
        t1().f.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipConfirmationScreen.z1(this.a, view);
            }
        });
        t1().f.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.im6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipConfirmationScreen.A1(this.a, view);
            }
        });
        t1().f.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipConfirmationScreen.B1(this.a, view);
            }
        });
        t1().e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.km6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipConfirmationScreen.C1(this.a, view);
            }
        });
        t1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipConfirmationScreen.D1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        VUtility.INSTANCE.y(this, u1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final boolean p1(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT > 30) {
            return true;
        }
        aj0 aj0Var = aj0.a;
        if (!aj0Var.c() || aj0Var.d(activity)) {
            return true;
        }
        aj0Var.f(activity, 666);
        return false;
    }

    public final void q1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipConfirmationScreen.r1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfOwnerShipConfirmationScreen.s1(dialog, view);
            }
        });
        dialog.show();
    }

    public final ql6 t1() {
        ql6 ql6Var = this.binding;
        if (ql6Var != null) {
            return ql6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String v1(ArrayList multiServiceList) {
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(multiServiceList);
        if (multiServiceList.size() > 0) {
            int size = multiServiceList.size();
            for (int i = 0; i < size; i++) {
                Object obj = multiServiceList.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                arrayList.add(VContant.INSTANCE.C(this, (String) obj));
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    public final String w1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }
}
