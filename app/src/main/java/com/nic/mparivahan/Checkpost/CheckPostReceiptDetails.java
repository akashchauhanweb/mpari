package com.nic.mparivahan.Checkpost;

import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem;
import com.nic.mparivahan.Checkpost.CheckPostReceiptDetails;
import com.nic.mparivahan.MyTextView;
import com.zepto.h7;
import com.zepto.pq;
import com.zepto.ta3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0006\u001a\u00020\u0004R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/Checkpost/CheckPostReceiptDetails;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "J0", "Lcom/zepto/h7;", "C", "Lcom/zepto/h7;", "j1", "()Lcom/zepto/h7;", "l1", "(Lcom/zepto/h7;)V", "binding", "", "D", "Ljava/lang/String;", "inputType", "Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptDetailNewItem;", "E", "Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptDetailNewItem;", "getSelectedCheckPostData", "()Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptDetailNewItem;", "setSelectedCheckPostData", "(Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptDetailNewItem;)V", "selectedCheckPostData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CheckPostReceiptDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public h7 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public CheckPostReceiptDetailNewItem selectedCheckPostData;

    public static final void k1(CheckPostReceiptDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void J0() throws ParseException {
        j1().h.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckPostReceiptDetails.k1(this.a, view);
            }
        });
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem = this.selectedCheckPostData;
        String paymentDate = checkPostReceiptDetailNewItem != null ? checkPostReceiptDetailNewItem.getPaymentDate() : null;
        Intrinsics.checkNotNull(paymentDate);
        Date date = simpleDateFormat2.parse(StringsKt__StringsJVMKt.replace$default(paymentDate, " ", "T", false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem2 = this.selectedCheckPostData;
        String taxFrom = checkPostReceiptDetailNewItem2 != null ? checkPostReceiptDetailNewItem2.getTaxFrom() : null;
        Intrinsics.checkNotNull(taxFrom);
        Date date2 = simpleDateFormat2.parse(StringsKt__StringsJVMKt.replace$default(taxFrom, " ", "T", false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(date2, "parse(...)");
        String str2 = simpleDateFormat.format(date2);
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem3 = this.selectedCheckPostData;
        String paymentDate2 = checkPostReceiptDetailNewItem3 != null ? checkPostReceiptDetailNewItem3.getPaymentDate() : null;
        Intrinsics.checkNotNull(paymentDate2);
        Date date3 = simpleDateFormat2.parse(StringsKt__StringsJVMKt.replace$default(paymentDate2, " ", "T", false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(date3, "parse(...)");
        String str3 = simpleDateFormat.format(date3);
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        MyTextView myTextView = j1().i;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem4 = this.selectedCheckPostData;
        myTextView.setText(checkPostReceiptDetailNewItem4 != null ? checkPostReceiptDetailNewItem4.getOwnerName() : null);
        MyTextView myTextView2 = j1().L;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem5 = this.selectedCheckPostData;
        myTextView2.setText(checkPostReceiptDetailNewItem5 != null ? checkPostReceiptDetailNewItem5.getRegnNo() : null);
        MyTextView myTextView3 = j1().s;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem6 = this.selectedCheckPostData;
        myTextView3.setText(checkPostReceiptDetailNewItem6 != null ? checkPostReceiptDetailNewItem6.getRcptNo() : null);
        j1().j.setText(str);
        MyTextView myTextView4 = j1().J;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem7 = this.selectedCheckPostData;
        myTextView4.setText(checkPostReceiptDetailNewItem7 != null ? checkPostReceiptDetailNewItem7.getVehicleClass() : null);
        MyTextView myTextView5 = j1().G;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem8 = this.selectedCheckPostData;
        myTextView5.setText(checkPostReceiptDetailNewItem8 != null ? checkPostReceiptDetailNewItem8.getVehicleType() : null);
        MyTextView myTextView6 = j1().e;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem9 = this.selectedCheckPostData;
        myTextView6.setText(checkPostReceiptDetailNewItem9 != null ? checkPostReceiptDetailNewItem9.getChassisNo() : null);
        j1().v.setText(str2);
        j1().B.setText(str3);
        MyTextView myTextView7 = j1().b;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem10 = this.selectedCheckPostData;
        myTextView7.setText(String.valueOf(checkPostReceiptDetailNewItem10 != null ? checkPostReceiptDetailNewItem10.getAmount() : null));
        MyTextView myTextView8 = j1().y;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem11 = this.selectedCheckPostData;
        myTextView8.setText(String.valueOf(checkPostReceiptDetailNewItem11 != null ? checkPostReceiptDetailNewItem11.getTaxMode() : null));
        MyTextView myTextView9 = j1().m;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem12 = this.selectedCheckPostData;
        myTextView9.setText(checkPostReceiptDetailNewItem12 != null ? checkPostReceiptDetailNewItem12.getPaymentMode() : null);
        MyTextView myTextView10 = j1().p;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem13 = this.selectedCheckPostData;
        myTextView10.setText(checkPostReceiptDetailNewItem13 != null ? checkPostReceiptDetailNewItem13.getPaymentStatus() : null);
    }

    public final h7 j1() {
        h7 h7Var = this.binding;
        if (h7Var != null) {
            return h7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void l1(h7 h7Var) {
        Intrinsics.checkNotNullParameter(h7Var, "<set-?>");
        this.binding = h7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws ParseException {
        super.onCreate(savedInstanceState);
        h7 h7VarC = h7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(h7VarC, "inflate(...)");
        l1(h7VarC);
        setContentView(j1().b());
        this.selectedCheckPostData = (CheckPostReceiptDetailNewItem) getIntent().getParcelableExtra("selectedData");
        String stringExtra = getIntent().getStringExtra("inputType");
        Intrinsics.checkNotNull(stringExtra);
        this.inputType = stringExtra;
        ta3.a.W(this, j1());
        J0();
    }
}
