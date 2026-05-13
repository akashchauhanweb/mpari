package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class j27 extends RecyclerView.h {
    public final Context d;
    public final a e;
    public final ArrayList f;

    public interface a {
        void a(int i);

        void d(int i, String str, String str2);

        void e(int i, String str, String str2, Bitmap bitmap);

        void g(int i);

        void h(int i, String str, String str2);
    }

    public static final class b extends RecyclerView.d0 {
        public final LinearLayout A;
        public final LinearLayout B;
        public final LinearLayout C;
        public final TextView D;
        public final TextView u;
        public final ImageView v;
        public final LinearLayout w;
        public final LinearLayout x;
        public final Spinner y;
        public final LinearLayout z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.u = (TextView) view.findViewById(R.id.title);
            this.v = (ImageView) view.findViewById(R.id.delet_proff);
            this.w = (LinearLayout) view.findViewById(R.id.browser_button);
            this.x = (LinearLayout) view.findViewById(R.id.camera);
            this.y = (Spinner) view.findViewById(R.id.proff_spinner);
            this.z = (LinearLayout) view.findViewById(R.id.menu_layout);
            this.A = (LinearLayout) view.findViewById(R.id.upload_image);
            this.B = (LinearLayout) view.findViewById(R.id.upload_doc_img);
            this.C = (LinearLayout) view.findViewById(R.id.update);
            this.D = (TextView) view.findViewById(R.id.mandatory_icon);
        }

        public final LinearLayout O() {
            return this.w;
        }

        public final LinearLayout P() {
            return this.x;
        }

        public final ImageView Q() {
            return this.v;
        }

        public final TextView R() {
            return this.D;
        }

        public final LinearLayout S() {
            return this.z;
        }

        public final Spinner T() {
            return this.y;
        }

        public final TextView U() {
            return this.u;
        }

        public final LinearLayout V() {
            return this.C;
        }

        public final LinearLayout W() {
            return this.B;
        }

        public final LinearLayout X() {
            return this.A;
        }
    }

    public j27(Context context, a itemListener, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemListener, "itemListener");
        this.d = context;
        this.e = itemListener;
        this.f = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I(j27 this$0, int i, Ref.ObjectRef testval, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(testval, "$testval");
        this$0.e.d(i, ((SubcategoryMasterDataX) testval.element).getCat_id(), ((SubcategoryMasterDataX) testval.element).getSub_cat_id());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(j27 this$0, int i, Ref.ObjectRef testval, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(testval, "$testval");
        this$0.e.h(i, ((SubcategoryMasterDataX) testval.element).getCat_id(), ((SubcategoryMasterDataX) testval.element).getSub_cat_id());
    }

    public static final void K(j27 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e.a(i);
    }

    public static final void L(j27 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e.g(i);
    }

    public static final void M(j27 this$0, int i, View view) {
        NonUploaded nonUploaded;
        NonUploaded nonUploaded2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList arrayList = this$0.f;
        if (arrayList == null || (nonUploaded = (NonUploaded) arrayList.get(i)) == null || !Intrinsics.areEqual(nonUploaded.getIsAttached(), Boolean.TRUE)) {
            return;
        }
        try {
            Context context = this$0.d;
            ArrayList arrayList2 = this$0.f;
            this$0.P(context, (arrayList2 == null || (nonUploaded2 = (NonUploaded) arrayList2.get(i)) == null) ? null : nonUploaded2.getBitmap());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void N(j27 this$0, int i, Ref.ObjectRef testval, View view) {
        NonUploaded nonUploaded;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(testval, "$testval");
        a aVar = this$0.e;
        String sub_cat_id = ((SubcategoryMasterDataX) testval.element).getSub_cat_id();
        String cat_id = ((SubcategoryMasterDataX) testval.element).getCat_id();
        ArrayList arrayList = this$0.f;
        aVar.e(i, sub_cat_id, cat_id, (arrayList == null || (nonUploaded = (NonUploaded) arrayList.get(i)) == null) ? null : nonUploaded.getBitmap());
    }

    public static final void Q(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [T, com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void p(b holder, final int i) {
        NonUploaded nonUploaded;
        NonUploaded nonUploaded2;
        NonUploaded nonUploaded3;
        String mandatory;
        NonUploaded nonUploaded4;
        NonUploaded nonUploaded5;
        Intrinsics.checkNotNullParameter(holder, "holder");
        StringBuilder sb = new StringBuilder();
        sb.append("calling3 ");
        sb.append(i);
        ArrayList arrayList = this.f;
        List<SubcategoryMasterDataX> subcategoryMasterDataList = null;
        sb.append((arrayList == null || (nonUploaded5 = (NonUploaded) arrayList.get(i)) == null) ? null : nonUploaded5.getIsAttached());
        Log.e("calling1", sb.toString());
        ArrayList arrayList2 = this.f;
        String strValueOf = String.valueOf((arrayList2 == null || (nonUploaded4 = (NonUploaded) arrayList2.get(i)) == null) ? null : nonUploaded4.getCatName());
        ArrayList arrayList3 = this.f;
        if (arrayList3 == null || (nonUploaded3 = (NonUploaded) arrayList3.get(i)) == null || (mandatory = nonUploaded3.getMandatory()) == null || !StringsKt__StringsJVMKt.equals(mandatory, "Y", true)) {
            holder.U().setText(strValueOf);
            holder.R().setVisibility(8);
        } else {
            holder.U().setText(strValueOf);
            holder.R().setVisibility(0);
        }
        ArrayList arrayList4 = this.f;
        if (arrayList4 != null && (nonUploaded2 = (NonUploaded) arrayList4.get(i)) != null) {
            subcategoryMasterDataList = nonUploaded2.getSubcategoryMasterDataList();
        }
        holder.T().setAdapter((SpinnerAdapter) new l27(this.d, subcategoryMasterDataList));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object selectedItem = holder.T().getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX");
        ?? r1 = (SubcategoryMasterDataX) selectedItem;
        objectRef.element = r1;
        Log.e("test", r1.getSub_cat_id());
        ArrayList arrayList5 = this.f;
        if (arrayList5 == null || (nonUploaded = (NonUploaded) arrayList5.get(i)) == null || !Intrinsics.areEqual(nonUploaded.getIsAttached(), Boolean.TRUE)) {
            holder.S().setVisibility(0);
            holder.W().setVisibility(8);
            holder.X().setVisibility(8);
            holder.V().setVisibility(8);
        } else {
            holder.S().setVisibility(8);
            holder.W().setVisibility(0);
            holder.X().setVisibility(8);
            holder.V().setVisibility(0);
        }
        holder.O().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j27.I(this.a, i, objectRef, view);
            }
        });
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j27.J(this.a, i, objectRef, view);
            }
        });
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j27.K(this.a, i, view);
            }
        });
        holder.V().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j27.L(this.a, i, view);
            }
        });
        holder.W().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j27.M(this.a, i, view);
            }
        });
        holder.X().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j27.N(this.a, i, objectRef, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.vahan_non_upload_reupload, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new b(viewInflate);
    }

    public final void P(Context context, Bitmap bitmap) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.show_dms_doc);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.images_upload);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) viewFindViewById2).setImageBitmap(bitmap);
        ((TextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j27.Q(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList arrayList = this.f;
        Integer numValueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        return numValueOf.intValue();
    }
}
