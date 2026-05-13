package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel;
import com.nic.mparivahan.DPTNotice.DownloadNoticeActivity;
import com.nic.mparivahan.DPTNotice.NoticeDetailsActivity;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class od4 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final String f;
    public final wa3 g;
    public final String h;
    public final String i;

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

    public od4(Context context, ArrayList noticeList, String inputType, wa3 langSession, String serviceName, String serviceCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(noticeList, "noticeList");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(langSession, "langSession");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        this.d = context;
        this.e = noticeList;
        this.f = inputType;
        this.g = langSession;
        this.h = serviceName;
        this.i = serviceCode;
    }

    public static final void D(od4 this$0, DPTNoticeDataModel model, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
        if (StringsKt__StringsJVMKt.equals(this$0.i, "114", true)) {
            Intent intent = new Intent(this$0.d, (Class<?>) DownloadNoticeActivity.class);
            intent.putExtra("challanPdfUrl", model.getPdf_url());
            intent.putExtra("challanNo", model.getDoc_no());
            intent.putExtra("fromActivity", "noticeDetailsActivity");
            this$0.d.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(this$0.d, (Class<?>) NoticeDetailsActivity.class);
        intent2.putExtra("selectedData", (Parcelable) this$0.e.get(i));
        intent2.putExtra("inputType", this$0.f);
        intent2.putExtra("serviceName", this$0.h);
        intent2.putExtra("Service_code", this$0.i);
        this$0.d.startActivity(intent2);
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
        final DPTNoticeDataModel dPTNoticeDataModel = (DPTNoticeDataModel) obj;
        holder.O().setText(String.valueOf(dPTNoticeDataModel.getChallan_no()));
        if (StringsKt__StringsJVMKt.equals(this.i, "114", true)) {
            holder.P().setText(this.d.getString(R.string.download_notice));
        } else {
            holder.P().setText(this.g.b("label_challan_view_details", this.d.getString(R.string.view_Details)));
        }
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                od4.D(this.a, dPTNoticeDataModel, i, view);
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
