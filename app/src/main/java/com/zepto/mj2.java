package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Citizen.Models.MparViolationFeedback;
import com.nic.mparivahan.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class mj2 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final TextView v;
        public final TextView w;
        public final TextView x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.acc_feedback);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.acc_feedback_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.acc_feedback_id);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.tv_feedback);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
        }

        public final TextView O() {
            return this.u;
        }

        public final TextView P() {
            return this.v;
        }

        public final TextView Q() {
            return this.x;
        }

        public final TextView R() {
            return this.w;
        }
    }

    public mj2(ArrayList mList, Context mContext) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.d = mList;
        this.e = mContext;
    }

    public final String A(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        try {
            Date date = simpleDateFormat.parse(str);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.Q().setText(new wa3(this.e).b("Document_type_Text", "Feedback"));
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        MparViolationFeedback mparViolationFeedback = (MparViolationFeedback) obj;
        holder.O().setText(mparViolationFeedback.getFeedbackRemarks());
        holder.R().setText("Feedback " + (i + 1));
        if (mparViolationFeedback.getFeedbackCreatedAt().length() > 8) {
            TextView textViewP = holder.P();
            String strSubstring = StringsKt__StringsJVMKt.replace$default(mparViolationFeedback.getFeedbackCreatedAt(), "T", " ", false, 4, (Object) null).substring(0, 16);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            textViewP.setText(A(strSubstring));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.get_acc_feedback, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
