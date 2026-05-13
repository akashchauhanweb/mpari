package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem;
import com.nic.mparivahan.Checkpost.CheckPostReceiptDetails;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sj0 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final String f;
    public wa3 g;

    public static final class a extends RecyclerView.d0 {
        public final MyTextView u;
        public final AppCompatTextView v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.challanNoTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (MyTextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.viewTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (AppCompatTextView) viewFindViewById2;
        }

        public final MyTextView O() {
            return this.u;
        }

        public final AppCompatTextView P() {
            return this.v;
        }
    }

    public sj0(Context context, ArrayList checkPostList, String inputType, wa3 langSession) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(checkPostList, "checkPostList");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(langSession, "langSession");
        this.d = context;
        this.e = checkPostList;
        this.f = inputType;
        this.g = langSession;
    }

    public static final void D(sj0 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.d, (Class<?>) CheckPostReceiptDetails.class);
        intent.putExtra("selectedData", (Parcelable) this$0.e.get(i));
        intent.putExtra("inputType", this$0.f);
        this$0.d.startActivity(intent);
    }

    public final void B(List searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(searchList);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        this.g = new wa3(this.d);
        holder.O().setText(((CheckPostReceiptDetailNewItem) obj).getRcptNo());
        holder.P().setText(this.g.b("label_challan_view_details", this.d.getString(R.string.view_Details)));
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sj0.D(this.a, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_search_notice_list, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }
}
