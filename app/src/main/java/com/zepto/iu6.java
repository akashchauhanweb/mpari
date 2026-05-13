package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataXX;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class iu6 extends RecyclerView.h {
    public final Context d;
    public final VahanDmsReupload e;
    public final List f;
    public Calendar g;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final TextView v;
        public final ImageView w;
        public final LinearLayout x;
        public final LinearLayout y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.u = (TextView) view.findViewById(R.id.title);
            this.v = (TextView) view.findViewById(R.id.proff_spinner);
            this.w = (ImageView) view.findViewById(R.id.upload_doc_img);
            this.x = (LinearLayout) view.findViewById(R.id.view);
            this.y = (LinearLayout) view.findViewById(R.id.update);
        }

        public final TextView O() {
            return this.v;
        }

        public final TextView P() {
            return this.u;
        }

        public final LinearLayout Q() {
            return this.y;
        }

        public final ImageView R() {
            return this.w;
        }

        public final LinearLayout S() {
            return this.x;
        }
    }

    public iu6(Context context, VahanDmsReupload itemListener, List list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemListener, "itemListener");
        this.d = context;
        this.e = itemListener;
        this.f = list;
        this.g = Calendar.getInstance();
    }

    public static final void I(Dialog d, iu6 this$0, Context context, String obj_id, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(obj_id, "$obj_id");
        d.dismiss();
        this$0.K(context, "", obj_id);
    }

    public static final void J(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void L(Dialog d, iu6 this$0, String obj_id, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(obj_id, "$obj_id");
        d.dismiss();
        this$0.e.h2(obj_id, 1);
    }

    public static final void M(Dialog d, iu6 this$0, String obj_id, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(obj_id, "$obj_id");
        d.dismiss();
        this$0.e.h2(obj_id, 2);
    }

    public static final void O(iu6 this$0, int i, View view) {
        Uploaded uploaded;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VahanDmsReupload vahanDmsReupload = this$0.e;
        List list = this$0.f;
        vahanDmsReupload.q(String.valueOf((list == null || (uploaded = (Uploaded) list.get(i)) == null) ? null : uploaded.getObjectId()));
    }

    public static final void P(iu6 this$0, int i, View view) {
        Uploaded uploaded;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VahanDmsReupload vahanDmsReupload = this$0.e;
        List list = this$0.f;
        vahanDmsReupload.q(String.valueOf((list == null || (uploaded = (Uploaded) list.get(i)) == null) ? null : uploaded.getObjectId()));
    }

    public static final void Q(iu6 this$0, int i, View view) {
        Uploaded uploaded;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.d;
        List list = this$0.f;
        this$0.H(context, "Are you sure you want to update the Document?", String.valueOf((list == null || (uploaded = (Uploaded) list.get(i)) == null) ? null : uploaded.getObjectId()));
    }

    public final void H(final Context context, String str, final String obj_id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(obj_id, "obj_id");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_diloge_choose);
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
        ((TextView) viewFindViewById).setText(str);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iu6.I(dialog, this, context, obj_id, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iu6.J(dialog, view);
            }
        });
        dialog.show();
    }

    public final void K(Context context, String str, final String obj_id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(obj_id, "obj_id");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_gallery);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.galler);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById2 = dialog.findViewById(R.id.camera);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iu6.L(dialog, this, obj_id, view);
            }
        });
        ((LinearLayout) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iu6.M(dialog, this, obj_id, view);
            }
        });
        dialog.show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Uploaded uploaded;
        SubcategoryMasterDataXX subcategoryMasterData;
        Uploaded uploaded2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f;
        String sub_cat_name = null;
        holder.P().setText(String.valueOf((list == null || (uploaded2 = (Uploaded) list.get(i)) == null) ? null : uploaded2.getCatName()));
        List list2 = this.f;
        if (list2 != null && (uploaded = (Uploaded) list2.get(i)) != null && (subcategoryMasterData = uploaded.getSubcategoryMasterData()) != null) {
            sub_cat_name = subcategoryMasterData.getSub_cat_name();
        }
        holder.O().setText(sub_cat_name);
        holder.R().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iu6.O(this.a, i, view);
            }
        });
        holder.S().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iu6.P(this.a, i, view);
            }
        });
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.du6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iu6.Q(this.a, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.reupload_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        List list = this.f;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        return numValueOf.intValue();
    }
}
