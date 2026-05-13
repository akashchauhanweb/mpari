package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class s9 extends r9 {
    public static final SparseIntArray W;
    public final RelativeLayout T;
    public final LinearLayout U;
    public long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 3);
        sparseIntArray.put(R.id.multi_head, 4);
        sparseIntArray.put(R.id.psl, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.select_service, 8);
        sparseIntArray.put(R.id.icon_image, 9);
        sparseIntArray.put(R.id.round_card_view, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.edit_text_layout_ca_details, 12);
        sparseIntArray.put(R.id.tv_detail_extr_dl, 13);
        sparseIntArray.put(R.id.tv_reason, 14);
        sparseIntArray.put(R.id.id_dupdl_reason, 15);
        sparseIntArray.put(R.id.extract_reason, 16);
        sparseIntArray.put(R.id.tv_reason_manually, 17);
        sparseIntArray.put(R.id.id_extract_dl, 18);
        sparseIntArray.put(R.id.tv_note_organ_donate, 19);
        sparseIntArray.put(R.id.willing_to_donate, 20);
        sparseIntArray.put(R.id.not_willing_to_donate, 21);
        sparseIntArray.put(R.id.org_mob_number, 22);
        sparseIntArray.put(R.id.reset, 23);
        sparseIntArray.put(R.id.id_next_service, 24);
    }

    public s9(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 25, null, W));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.V = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.V != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.V = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s9(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[6];
        LinearLayout linearLayout = (LinearLayout) objArr[12];
        LinearLayout linearLayout2 = (LinearLayout) objArr[16];
        LinearLayout linearLayout3 = (LinearLayout) objArr[1];
        CardView cardView = (CardView) objArr[9];
        EditText editText = (EditText) objArr[15];
        EditText editText2 = (EditText) objArr[18];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[24];
        ImageView imageView = (ImageView) objArr[11];
        Object obj = objArr[3];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        Object obj2 = objArr[4];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        RadioButton radioButton = (RadioButton) objArr[21];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[22];
        Object obj3 = objArr[5];
        super(jd1Var, view, 0, textView, linearLayout, linearLayout2, linearLayout3, cardView, editText, editText2, customWegetLayout, imageView, vy3VarA, iy3VarA, radioButton, appCompatEditText, obj3 != null ? bs4.a((View) obj3) : null, (CustomWegetLayout) objArr[23], (CardView) objArr[10], (MyTextView) objArr[8], (MyTextView) objArr[13], (MyTextView) objArr[19], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[17], (TextView) objArr[7], (RadioButton) objArr[20]);
        this.V = -1L;
        this.z.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.T = relativeLayout;
        relativeLayout.setTag(null);
        LinearLayout linearLayout4 = (LinearLayout) objArr[2];
        this.U = linearLayout4;
        linearLayout4.setTag(null);
        w(view);
        x();
    }
}
