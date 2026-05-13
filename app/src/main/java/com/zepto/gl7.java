package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.Document;
import com.nic.mparivahan.RC.Model.NrvDetails;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class gl7 extends RecyclerView.h {
    public ArrayList d;
    public final Context e;
    public final sg4 f;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public ProgressBar v;
        public LinearLayout w;
        public final TextView x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.rc_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.progress_bar);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (ProgressBar) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.vehicle_linear);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (LinearLayout) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.txtGoForAvailable);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
        }

        public final TextView O() {
            return this.u;
        }

        public final TextView P() {
            return this.x;
        }

        public final LinearLayout Q() {
            return this.w;
        }
    }

    public gl7(ArrayList rc_details, Context context, sg4 getNUmber) {
        Intrinsics.checkNotNullParameter(rc_details, "rc_details");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(getNUmber, "getNUmber");
        this.d = rc_details;
        this.e = context;
        this.f = getNUmber;
    }

    public static final void E(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void F(AppCompatEditText chassi_number, Context context, Dialog d, gl7 this$0, String rc_number, int i, View view) {
        Intrinsics.checkNotNullParameter(chassi_number, "$chassi_number");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_number, "$rc_number");
        Editable text = chassi_number.getText();
        Integer numValueOf = text != null ? Integer.valueOf(text.length()) : null;
        Intrinsics.checkNotNull(numValueOf);
        if (numValueOf.intValue() < 5) {
            Toast.makeText(context, "Please enter the Chassi number", 0).show();
        } else {
            d.dismiss();
            this$0.f.e0(rc_number, i, String.valueOf(chassi_number.getText()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H(gl7 this$0, int i, Ref.ObjectRef rc_numer, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_numer, "$rc_numer");
        NrvDetails nrvDetails = ((Document) this$0.d.get(i)).getNrvDetails();
        String strValueOf = String.valueOf(nrvDetails != null ? nrvDetails.getRc_chasi_no() : null);
        if (gd1.a.m(strValueOf)) {
            this$0.D(this$0.e, (String) rc_numer.element, i);
            return;
        }
        sg4 sg4Var = this$0.f;
        String str = (String) rc_numer.element;
        String strSubstring = strValueOf.substring(strValueOf.length() - 5, strValueOf.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sg4Var.e0(str, i, strSubstring);
    }

    public final void D(final Context context, final String rc_number, final int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.vahan_chassi_no_diloge);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View viewFindViewById = dialog.findViewById(R.id.vehicle_number);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        View viewFindViewById2 = dialog.findViewById(R.id.chassi_number);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatEditText");
        final AppCompatEditText appCompatEditText = (AppCompatEditText) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.okbuttondismiss);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.close);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        ((LinearLayoutCompat) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.el7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gl7.E(dialog, view);
            }
        });
        ((AppCompatTextView) viewFindViewById).setText(rc_number);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fl7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gl7.F(appCompatEditText, context, dialog, this, rc_number, i, view);
            }
        });
        dialog.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            holder.P().setText(new wa3(this.e).b("title_dl_serv_go_aval", this.e.getString(R.string.go_for_available_services)));
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = ((Document) this.d.get(i)).getRc();
            holder.O().setText(((String) objectRef.element).toString());
            holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dl7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gl7.H(this.a, i, objectRef, view);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vehicle_service, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
