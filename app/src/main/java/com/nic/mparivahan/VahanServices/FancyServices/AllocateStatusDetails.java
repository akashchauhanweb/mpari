package com.nic.mparivahan.VahanServices.FancyServices;

import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.VahanServices.FancyServices.AllocateStatusDetails;
import com.zepto.h6;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0006\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AllocateStatusDetails;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "J0", "Lcom/zepto/h6;", "C", "Lcom/zepto/h6;", "j1", "()Lcom/zepto/h6;", "l1", "(Lcom/zepto/h6;)V", "binding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "getLanguageSession", "()Lcom/zepto/wa3;", "m1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AllocateStatusDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public h6 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wa3 languageSession;

    public static final void k1(AllocateStatusDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void J0() throws ParseException {
        j1().s.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ho
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllocateStatusDetails.k1(this.a, view);
            }
        });
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("regno");
            String string2 = extras.getString("ackNo");
            String string3 = extras.getString("recpno");
            String string4 = extras.getString("ownerName");
            String string5 = extras.getString("fatherName");
            String string6 = extras.getString("mobileNumber");
            String string7 = extras.getString("address");
            String string8 = extras.getString("pincode");
            String string9 = extras.getString("state");
            String string10 = extras.getString("rto");
            int i = extras.getInt("reserve_amt");
            int i2 = extras.getInt("auctionAmt");
            String string11 = extras.getString("bookingDate");
            String string12 = extras.getString("allotmentType");
            String string13 = extras.getString("status");
            Intrinsics.checkNotNull(string11);
            String strReplace$default = StringsKt__StringsJVMKt.replace$default(string11, " ", "T", false, 4, (Object) null);
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY", locale);
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale).parse(strReplace$default);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            String str = simpleDateFormat.format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            j1().F.setText(string);
            j1().b.setText(string2);
            j1().C.setText(string3);
            j1().w.setText(string4);
            j1().q.setText(string5);
            j1().t.setText(string6);
            j1().e.setText(string7);
            j1().z.setText(string8);
            j1().M.setText(string9);
            j1().J.setText(string10);
            j1().G.setText(String.valueOf(i));
            j1().k.setText(String.valueOf(i2));
            j1().n.setText(str);
            j1().h.setText(string12);
            j1().P.setText(string13);
        }
    }

    public final h6 j1() {
        h6 h6Var = this.binding;
        if (h6Var != null) {
            return h6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void l1(h6 h6Var) {
        Intrinsics.checkNotNullParameter(h6Var, "<set-?>");
        this.binding = h6Var;
    }

    public final void m1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws ParseException {
        super.onCreate(savedInstanceState);
        h6 h6VarC = h6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(h6VarC, "inflate(...)");
        l1(h6VarC);
        setContentView(j1().b());
        m1(new wa3(this));
        j1().s.f.setText("Allocate Status Details");
        ta3.a.B(this, j1());
        J0();
    }
}
