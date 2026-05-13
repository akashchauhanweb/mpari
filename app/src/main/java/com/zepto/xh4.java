package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Checkpost.CheckPostReceiptStatus;
import com.nic.mparivahan.Checkpost.DownloadCheckPostReceipt2;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Dashboard.OtherServicesViewMoreActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyNumberStatus;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeeReceipt;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateDownload;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xh4 extends RecyclerView.h {
    public final List d;
    public final Context e;
    public String f;
    public String g;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final LinearLayout v;
        public final ImageView w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.es_sarathi_service_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.layout_es_sarathi);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (LinearLayout) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.es_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (ImageView) viewFindViewById3;
        }

        public final ImageView O() {
            return this.w;
        }

        public final TextView P() {
            return this.u;
        }

        public final LinearLayout Q() {
            return this.v;
        }
    }

    public xh4(List mList, Context mContext, String State_code) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(State_code, "State_code");
        this.d = mList;
        this.e = mContext;
        this.f = State_code;
        this.g = "T";
    }

    public static final void C(int i, xh4 this$0, Enabledservice mModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        if (i != 3) {
            this$0.E(mModel.getServCode(), this$0.e, mModel.getServName());
            return;
        }
        Intent intent = new Intent(this$0.e, (Class<?>) OtherServicesViewMoreActivity.class);
        intent.putExtra("state_code", this$0.f);
        this$0.e.startActivity(intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Enabledservice enabledservice = (Enabledservice) this.d.get(i);
        holder.P().setText(enabledservice.getServName());
        holder.P().setText(ta3.a.T(this.e, enabledservice.getServCode(), enabledservice.getServName()));
        if (Intrinsics.areEqual(this.g, "T") && i == 3) {
            holder.P().setText(new wa3(this.e).b("label_view_more", "View More"));
            enabledservice.setServCode("0");
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_view));
        }
        F(enabledservice.getServCode(), holder);
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wh4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh4.C(i, this, enabledservice, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.es_sarathi_adapter, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void E(String service_code, Context context, String name) {
        Intrinsics.checkNotNullParameter(service_code, "service_code");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        if (service_code.equals("2002")) {
            Intent intent = new Intent(context, (Class<?>) AvailableFancyNumberStatus.class);
            intent.putExtra("ServiceName", name);
            context.startActivity(intent);
        }
        if (service_code.equals("2003")) {
            Intent intent2 = new Intent(context, (Class<?>) AuctionStatusActivity.class);
            intent2.putExtra("ServiceName", name);
            context.startActivity(intent2);
        }
        if (service_code.equals("2004")) {
            Intent intent3 = new Intent(context, (Class<?>) FancyFeeReceipt.class);
            intent3.putExtra("ServiceName", name);
            context.startActivity(intent3);
        }
        if (service_code.equals("2005")) {
            Intent intent4 = new Intent(context, (Class<?>) AllotmentLetterActivity.class);
            intent4.putExtra("ServiceName", name);
            context.startActivity(intent4);
        }
        if (service_code.equals("2001")) {
            Intent intent5 = new Intent(context, (Class<?>) PUCCCertificateDownload.class);
            intent5.putExtra("ServiceName", name);
            context.startActivity(intent5);
        }
        if (service_code.equals("2007")) {
            Intent intent6 = new Intent(context, (Class<?>) CheckPostReceiptStatus.class);
            intent6.putExtra("ServiceName", name);
            context.startActivity(intent6);
        }
        if (service_code.equals("2008")) {
            Intent intent7 = new Intent(context, (Class<?>) DownloadCheckPostReceipt2.class);
            intent7.putExtra("ServiceName", name);
            context.startActivity(intent7);
        }
    }

    public final void F(String service_code, a holder) {
        Intrinsics.checkNotNullParameter(service_code, "service_code");
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (service_code.equals("2001")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_status));
        }
        if (service_code.equals("2002")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (service_code.equals("2003")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_verify));
        }
        if (service_code.equals("2004")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (service_code.equals("2005")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.print_receipt));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        if (this.d.size() > 3) {
            this.g = "T";
            return 4;
        }
        this.g = "F";
        return this.d.size();
    }
}
