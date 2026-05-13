package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class o9 extends n9 {
    public static final SparseIntArray b0;
    public final FrameLayout X;
    public final LinearLayout Y;
    public final a33 Z;
    public long a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.psl, 4);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.tv_appln_detail, 7);
        sparseIntArray.put(R.id.app_arrow_up, 8);
        sparseIntArray.put(R.id.app_arrow_down, 9);
        sparseIntArray.put(R.id.ll_app_layout, 10);
        sparseIntArray.put(R.id.tv_appln_no, 11);
        sparseIntArray.put(R.id.application_number_textview, 12);
        sparseIntArray.put(R.id.tv_appln_date, 13);
        sparseIntArray.put(R.id.doc_appl_date, 14);
        sparseIntArray.put(R.id.tv_name, 15);
        sparseIntArray.put(R.id.doc_appl_name, 16);
        sparseIntArray.put(R.id.tv_son_daugh_wife, 17);
        sparseIntArray.put(R.id.doc_appl_fname, 18);
        sparseIntArray.put(R.id.tv_dob, 19);
        sparseIntArray.put(R.id.doc_appl_dob, 20);
        sparseIntArray.put(R.id.view8, 21);
        sparseIntArray.put(R.id.textView, 22);
        sparseIntArray.put(R.id.view9, 23);
        sparseIntArray.put(R.id.textView2, 24);
        sparseIntArray.put(R.id.shimmer_view_container, 25);
        sparseIntArray.put(R.id.upload_list_rv, 26);
        sparseIntArray.put(R.id.button_layout_button, 27);
        sparseIntArray.put(R.id.upload_documents, 28);
        sparseIntArray.put(R.id.skipped_upload_doc, 29);
    }

    public o9(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 30, null, b0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.a0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.a0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.a0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o9(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[9];
        ImageView imageView2 = (ImageView) objArr[8];
        TextView textView = (TextView) objArr[12];
        LinearLayout linearLayout = (LinearLayout) objArr[27];
        TextView textView2 = (TextView) objArr[6];
        TextView textView3 = (TextView) objArr[14];
        TextView textView4 = (TextView) objArr[20];
        TextView textView5 = (TextView) objArr[18];
        TextView textView6 = (TextView) objArr[16];
        Object obj = objArr[3];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        LinearLayout linearLayout3 = (LinearLayout) objArr[10];
        Object obj2 = objArr[4];
        super(jd1Var, view, 0, imageView, imageView2, textView, linearLayout, textView2, textView3, textView4, textView5, textView6, vy3VarA, linearLayout2, linearLayout3, obj2 != null ? vl0.a((View) obj2) : null, (ShimmerFrameLayout) objArr[25], (CustomWegetLayout) objArr[29], (TextView) objArr[22], (TextView) objArr[24], (TextView) objArr[13], (TextView) objArr[7], (TextView) objArr[11], (TextView) objArr[19], (TextView) objArr[15], (TextView) objArr[17], (CustomWegetLayout) objArr[28], (RecyclerView) objArr[26], (View) objArr[21], (View) objArr[23]);
        this.a0 = -1L;
        this.G.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.X = frameLayout;
        frameLayout.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[2];
        this.Y = linearLayout4;
        linearLayout4.setTag(null);
        Object obj3 = objArr[5];
        this.Z = obj3 != null ? a33.a((View) obj3) : null;
        w(view);
        z();
    }
}
