package com.zepto;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptModel.CheckpostTaxReceiptDownloadItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dv1 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public wa3 f;

    public static final class a extends RecyclerView.d0 {
        public final MyTextView u;
        public final MyTextView v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.tax_rcpt2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (MyTextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.searchTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (MyTextView) viewFindViewById2;
        }

        public final MyTextView O() {
            return this.v;
        }

        public final MyTextView P() {
            return this.u;
        }
    }

    public dv1(Context context, ArrayList searchList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        this.d = context;
        this.e = searchList;
    }

    public static final void E(dv1 this$0, CheckpostTaxReceiptDownloadItem model, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
    }

    public final void B(List searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        this.e.addAll(searchList);
        j();
    }

    public final wa3 C() {
        wa3 wa3Var = this.f;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final CheckpostTaxReceiptDownloadItem checkpostTaxReceiptDownloadItem = (CheckpostTaxReceiptDownloadItem) obj;
        G(new wa3(this.d));
        holder.P().setText(checkpostTaxReceiptDownloadItem.getRcptNo().toString());
        holder.O().setText(C().b("download", this.d.getString(R.string.download)));
        holder.O().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dv1.E(this.a, checkpostTaxReceiptDownloadItem, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.avilable_checkpost_tax_receipt, parent, false);
        Log.e("chekTax", "test2");
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void G(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.f = wa3Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i) {
        return i;
    }
}
