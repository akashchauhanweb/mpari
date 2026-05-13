package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
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
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class b27 extends RecyclerView.h {
    public final Context d;
    public final a e;
    public final ArrayList f;
    public wa3 g;

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
        public final TextView E;
        public final TextView F;
        public final TextView G;
        public final TextView H;
        public final TextView I;
        public final TextView J;
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
            this.E = (TextView) view.findViewById(R.id.doc_type_title);
            this.F = (TextView) view.findViewById(R.id.doc_name_title);
            this.G = (TextView) view.findViewById(R.id.gallery);
            this.H = (TextView) view.findViewById(R.id.capture);
            this.I = (TextView) view.findViewById(R.id.edit_txt);
            this.J = (TextView) view.findViewById(R.id.preview);
        }

        public final LinearLayout O() {
            return this.w;
        }

        public final LinearLayout P() {
            return this.x;
        }

        public final TextView Q() {
            return this.H;
        }

        public final ImageView R() {
            return this.v;
        }

        public final TextView S() {
            return this.F;
        }

        public final TextView T() {
            return this.E;
        }

        public final TextView U() {
            return this.I;
        }

        public final TextView V() {
            return this.G;
        }

        public final TextView W() {
            return this.D;
        }

        public final LinearLayout X() {
            return this.z;
        }

        public final TextView Y() {
            return this.J;
        }

        public final Spinner Z() {
            return this.y;
        }

        public final TextView a0() {
            return this.u;
        }

        public final LinearLayout b0() {
            return this.C;
        }

        public final LinearLayout c0() {
            return this.B;
        }

        public final LinearLayout d0() {
            return this.A;
        }
    }

    public b27(Context context, a itemListener, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemListener, "itemListener");
        this.d = context;
        this.e = itemListener;
        this.f = arrayList;
        this.g = new wa3(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I(b27 this$0, int i, Ref.ObjectRef testval, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(testval, "$testval");
        this$0.e.d(i, ((SubcategoryMasterDataX) testval.element).getCat_id(), ((SubcategoryMasterDataX) testval.element).getSub_cat_id());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(b27 this$0, int i, Ref.ObjectRef testval, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(testval, "$testval");
        this$0.e.h(i, ((SubcategoryMasterDataX) testval.element).getCat_id(), ((SubcategoryMasterDataX) testval.element).getSub_cat_id());
    }

    public static final void K(b27 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e.a(i);
    }

    public static final void L(b27 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e.g(i);
    }

    public static final void M(b27 this$0, int i, View view) {
        NonUploaded nonUploaded;
        ArrayList arrayList;
        NonUploaded nonUploaded2;
        Integer docType;
        NonUploaded nonUploaded3;
        NonUploaded nonUploaded4;
        NonUploaded nonUploaded5;
        ArrayList arrayList2;
        NonUploaded nonUploaded6;
        Integer docType2;
        NonUploaded nonUploaded7;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList arrayList3 = this$0.f;
        String docBase64 = null;
        bitmap = null;
        Bitmap bitmap = null;
        docBase64 = null;
        if (arrayList3 != null && (nonUploaded5 = (NonUploaded) arrayList3.get(i)) != null && Intrinsics.areEqual(nonUploaded5.getIsAttached(), Boolean.TRUE) && (arrayList2 = this$0.f) != null && (nonUploaded6 = (NonUploaded) arrayList2.get(i)) != null && (docType2 = nonUploaded6.getDocType()) != null && docType2.intValue() == 0) {
            try {
                Context context = this$0.d;
                ArrayList arrayList4 = this$0.f;
                if (arrayList4 != null && (nonUploaded7 = (NonUploaded) arrayList4.get(i)) != null) {
                    bitmap = nonUploaded7.getBitmap();
                }
                this$0.Q(context, bitmap);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        ArrayList arrayList5 = this$0.f;
        if (arrayList5 == null || (nonUploaded = (NonUploaded) arrayList5.get(i)) == null || !Intrinsics.areEqual(nonUploaded.getIsAttached(), Boolean.TRUE) || (arrayList = this$0.f) == null || (nonUploaded2 = (NonUploaded) arrayList.get(i)) == null || (docType = nonUploaded2.getDocType()) == null || docType.intValue() != 1) {
            return;
        }
        try {
            ArrayList arrayList6 = this$0.f;
            String strValueOf = String.valueOf((arrayList6 == null || (nonUploaded4 = (NonUploaded) arrayList6.get(i)) == null) ? null : nonUploaded4.getFile_name());
            ArrayList arrayList7 = this$0.f;
            if (arrayList7 != null && (nonUploaded3 = (NonUploaded) arrayList7.get(i)) != null) {
                docBase64 = nonUploaded3.getDocBase64();
            }
            this$0.P(strValueOf, String.valueOf(docBase64));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void N(b27 this$0, int i, Ref.ObjectRef testval, View view) {
        NonUploaded nonUploaded;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(testval, "$testval");
        a aVar = this$0.e;
        String sub_cat_id = ((SubcategoryMasterDataX) testval.element).getSub_cat_id();
        String cat_id = ((SubcategoryMasterDataX) testval.element).getCat_id();
        ArrayList arrayList = this$0.f;
        aVar.e(i, sub_cat_id, cat_id, (arrayList == null || (nonUploaded = (NonUploaded) arrayList.get(i)) == null) ? null : nonUploaded.getBitmap());
    }

    public static final void R(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [T, com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void p(b holder, final int i) {
        NonUploaded nonUploaded;
        NonUploaded nonUploaded2;
        NonUploaded nonUploaded3;
        String mandatory;
        NonUploaded nonUploaded4;
        Intrinsics.checkNotNullParameter(holder, "holder");
        wa3 wa3Var = new wa3(this.d);
        holder.U().setText(wa3Var.b("label_edit", "Edit"));
        holder.Y().setText(wa3Var.b("label_Preview", "Preview"));
        holder.T().setText(wa3Var.b("Document_type_Text", "Document Type"));
        holder.S().setText(wa3Var.b("Document_Name_Text", "Document Name"));
        holder.Q().setText(wa3Var.b("label_capture", "Capture"));
        holder.V().setText(wa3Var.b("label_gallery", "Gallery"));
        ArrayList arrayList = this.f;
        List<SubcategoryMasterDataX> subcategoryMasterDataList = null;
        String strValueOf = String.valueOf((arrayList == null || (nonUploaded4 = (NonUploaded) arrayList.get(i)) == null) ? null : nonUploaded4.getCatName());
        ArrayList arrayList2 = this.f;
        if (arrayList2 == null || (nonUploaded3 = (NonUploaded) arrayList2.get(i)) == null || (mandatory = nonUploaded3.getMandatory()) == null || !mandatory.equals("Y")) {
            holder.a0().setText(strValueOf);
            holder.W().setVisibility(8);
        } else {
            holder.a0().setText(strValueOf);
            holder.W().setVisibility(0);
        }
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null && (nonUploaded2 = (NonUploaded) arrayList3.get(i)) != null) {
            subcategoryMasterDataList = nonUploaded2.getSubcategoryMasterDataList();
        }
        holder.Z().setAdapter((SpinnerAdapter) new l27(this.d, subcategoryMasterDataList));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object selectedItem = holder.Z().getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX");
        ?? r1 = (SubcategoryMasterDataX) selectedItem;
        objectRef.element = r1;
        Log.e("test", r1.getSub_cat_id());
        ArrayList arrayList4 = this.f;
        if (arrayList4 == null || (nonUploaded = (NonUploaded) arrayList4.get(i)) == null || !Intrinsics.areEqual(nonUploaded.getIsAttached(), Boolean.TRUE)) {
            holder.X().setVisibility(0);
            holder.c0().setVisibility(8);
            holder.d0().setVisibility(8);
            holder.b0().setVisibility(8);
        } else {
            holder.X().setVisibility(8);
            holder.c0().setVisibility(0);
            holder.d0().setVisibility(8);
            holder.b0().setVisibility(0);
        }
        holder.O().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b27.I(this.a, i, objectRef, view);
            }
        });
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b27.J(this.a, i, objectRef, view);
            }
        });
        holder.R().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b27.K(this.a, i, view);
            }
        });
        holder.b0().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b27.L(this.a, i, view);
            }
        });
        holder.c0().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b27.M(this.a, i, view);
            }
        });
        holder.d0().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b27.N(this.a, i, objectRef, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vahan_dms_doc, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new b(viewInflate);
    }

    public final void P(String file_name, String base64Pdf) throws IOException {
        Intrinsics.checkNotNullParameter(file_name, "file_name");
        Intrinsics.checkNotNullParameter(base64Pdf, "base64Pdf");
        String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str + file_name);
        if (!file2.exists()) {
            byte[] bArrDecode = Base64.decode(base64Pdf, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArrDecode);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        Uri uriF = FileProvider.f(this.d, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + file_name));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(uriF);
        Log.e("create pdf uri path==>", sb.toString());
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            this.d.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void Q(Context context, Bitmap bitmap) {
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
        ((TextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a27
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b27.R(dialog, view);
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
