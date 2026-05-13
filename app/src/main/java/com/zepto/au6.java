package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataXX;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class au6 extends RecyclerView.h {
    public final Context d;
    public final a e;
    public final List f;
    public Calendar g;

    public interface a {
        void q(String str);
    }

    public static final class b extends RecyclerView.d0 {
        public final TextView A;
        public final TextView u;
        public final TextView v;
        public final ImageView w;
        public final LinearLayout x;
        public final TextView y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.u = (TextView) view.findViewById(R.id.title);
            this.v = (TextView) view.findViewById(R.id.proff_spinner);
            this.w = (ImageView) view.findViewById(R.id.upload_doc_img);
            this.x = (LinearLayout) view.findViewById(R.id.view);
            this.y = (TextView) view.findViewById(R.id.doc_type_title);
            this.z = (TextView) view.findViewById(R.id.doc_name_title);
            this.A = (TextView) view.findViewById(R.id.view_title);
        }

        public final TextView O() {
            return this.z;
        }

        public final TextView P() {
            return this.y;
        }

        public final TextView Q() {
            return this.v;
        }

        public final TextView R() {
            return this.u;
        }

        public final ImageView S() {
            return this.w;
        }

        public final LinearLayout T() {
            return this.x;
        }

        public final TextView U() {
            return this.A;
        }
    }

    public au6(Context context, a itemListener, List list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemListener, "itemListener");
        this.d = context;
        this.e = itemListener;
        this.f = list;
        this.g = Calendar.getInstance();
    }

    public static final void D(au6 this$0, int i, View view) {
        Uploaded uploaded;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.e;
        List list = this$0.f;
        aVar.q(String.valueOf((list == null || (uploaded = (Uploaded) list.get(i)) == null) ? null : uploaded.getObjectId()));
    }

    public static final void E(au6 this$0, int i, View view) {
        Uploaded uploaded;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a aVar = this$0.e;
        List list = this$0.f;
        aVar.q(String.valueOf((list == null || (uploaded = (Uploaded) list.get(i)) == null) ? null : uploaded.getObjectId()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void p(b holder, final int i) {
        Uploaded uploaded;
        SubcategoryMasterDataXX subcategoryMasterData;
        Uploaded uploaded2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        wa3 wa3Var = new wa3(this.d);
        holder.P().setText(wa3Var.b("Document_type_Text", " Document Type"));
        holder.O().setText(wa3Var.b("Document_Name_Text", "Document Name"));
        holder.U().setText(wa3Var.b("label_view", "View"));
        List list = this.f;
        String sub_cat_name = null;
        holder.R().setText(String.valueOf((list == null || (uploaded2 = (Uploaded) list.get(i)) == null) ? null : uploaded2.getCatName()));
        List list2 = this.f;
        if (list2 != null && (uploaded = (Uploaded) list2.get(i)) != null && (subcategoryMasterData = uploaded.getSubcategoryMasterData()) != null) {
            sub_cat_name = subcategoryMasterData.getSub_cat_name();
        }
        holder.Q().setText(sub_cat_name);
        holder.S().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yt6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                au6.D(this.a, i, view);
            }
        });
        holder.T().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zt6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                au6.E(this.a, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.uploaded_documents_dms, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new b(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        List list = this.f;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        return numValueOf.intValue();
    }
}
