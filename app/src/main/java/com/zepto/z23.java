package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class z23 extends y23 {
    public static final SparseIntArray S;
    public final CardView Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.doc_documents, 1);
        sparseIntArray.put(R.id.arrow_down, 2);
        sparseIntArray.put(R.id.arrow_up, 3);
        sparseIntArray.put(R.id.ll_layout, 4);
        sparseIntArray.put(R.id.title, 5);
        sparseIntArray.put(R.id.proff_spinner, 6);
        sparseIntArray.put(R.id.issue_design, 7);
        sparseIntArray.put(R.id.document_number, 8);
        sparseIntArray.put(R.id.contact_number, 9);
        sparseIntArray.put(R.id.issued_date, 10);
        sparseIntArray.put(R.id.menu_layout, 11);
        sparseIntArray.put(R.id.view_or_uploaded_doc_ll, 12);
        sparseIntArray.put(R.id.doc_selected_iv, 13);
        sparseIntArray.put(R.id.doc_selected_tv, 14);
        sparseIntArray.put(R.id.edit_doc_ll, 15);
        sparseIntArray.put(R.id.txt_edit, 16);
        sparseIntArray.put(R.id.capture_button, 17);
        sparseIntArray.put(R.id.doc_capture, 18);
        sparseIntArray.put(R.id.browse_button, 19);
        sparseIntArray.put(R.id.doc_gallary, 20);
    }

    public z23(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 21, null, S));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.R = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.R = 2L;
        }
        u();
    }

    public z23(jd1 jd1Var, View view, Object[] objArr) {
        super(jd1Var, view, 0, (ImageView) objArr[2], (ImageView) objArr[3], (LinearLayout) objArr[19], (LinearLayout) objArr[17], (EditText) objArr[9], (TextView) objArr[18], (TextView) objArr[1], (TextView) objArr[20], (ImageView) objArr[13], (TextView) objArr[14], (EditText) objArr[8], (LinearLayout) objArr[15], (EditText) objArr[7], (EditText) objArr[10], (LinearLayout) objArr[4], (LinearLayout) objArr[11], (EditText) objArr[6], (TextView) objArr[5], (TextView) objArr[16], (LinearLayout) objArr[12]);
        this.R = -1L;
        CardView cardView = (CardView) objArr[0];
        this.Q = cardView;
        cardView.setTag(null);
        w(view);
        x();
    }
}
