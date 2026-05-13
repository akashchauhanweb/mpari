package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class aa extends z9 {
    public static final SparseIntArray y0;
    public final LinearLayout w0;
    public long x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 2);
        sparseIntArray.put(R.id.psl, 3);
        sparseIntArray.put(R.id.tv_upload_pic_sign, 4);
        sparseIntArray.put(R.id.dl_no_txt, 5);
        sparseIntArray.put(R.id.tv_appln_detail, 6);
        sparseIntArray.put(R.id.app_arrow_up, 7);
        sparseIntArray.put(R.id.app_arrow_down, 8);
        sparseIntArray.put(R.id.ll_bottom_design, 9);
        sparseIntArray.put(R.id.tv_appln_no, 10);
        sparseIntArray.put(R.id.application_number, 11);
        sparseIntArray.put(R.id.tv_appln_date, 12);
        sparseIntArray.put(R.id.application_date, 13);
        sparseIntArray.put(R.id.tv_name, 14);
        sparseIntArray.put(R.id.applicatn_name, 15);
        sparseIntArray.put(R.id.relation_name, 16);
        sparseIntArray.put(R.id.fathers_name, 17);
        sparseIntArray.put(R.id.tv_dob, 18);
        sparseIntArray.put(R.id.date_of_birth, 19);
        sparseIntArray.put(R.id.tv_rto, 20);
        sparseIntArray.put(R.id.rto_name, 21);
        sparseIntArray.put(R.id.tv_instruction, 22);
        sparseIntArray.put(R.id.app_ins_arrow_up, 23);
        sparseIntArray.put(R.id.app_ins_arrow_down, 24);
        sparseIntArray.put(R.id.ll_instructions, 25);
        sparseIntArray.put(R.id.tv_note_capture_photo, 26);
        sparseIntArray.put(R.id.tv_note_uplod_sign, 27);
        sparseIntArray.put(R.id.tv_note_uplod_pic_sign, 28);
        sparseIntArray.put(R.id.tv_spec_photo_sign, 29);
        sparseIntArray.put(R.id.spec_arrow_up, 30);
        sparseIntArray.put(R.id.spec_arrow_down, 31);
        sparseIntArray.put(R.id.ll_specifications, 32);
        sparseIntArray.put(R.id.tv_note_photo_dimen, 33);
        sparseIntArray.put(R.id.tv_note_warning, 34);
        sparseIntArray.put(R.id.title_uplod_pic_sign, 35);
        sparseIntArray.put(R.id.app_photo_arrow_up, 36);
        sparseIntArray.put(R.id.app_photo_arrow_down, 37);
        sparseIntArray.put(R.id.ll_photo, 38);
        sparseIntArray.put(R.id.tv_applic_photo, 39);
        sparseIntArray.put(R.id.photo_capture_button, 40);
        sparseIntArray.put(R.id.tv_applic_capture, 41);
        sparseIntArray.put(R.id.photo_gallery_button, 42);
        sparseIntArray.put(R.id.tv_applic_gallary, 43);
        sparseIntArray.put(R.id.tv_applic_sign, 44);
        sparseIntArray.put(R.id.sign_capture_button, 45);
        sparseIntArray.put(R.id.tv_applic_sign_capt, 46);
        sparseIntArray.put(R.id.sign_gallery_button, 47);
        sparseIntArray.put(R.id.tv_applic_sign_gally, 48);
        sparseIntArray.put(R.id.upload_image, 49);
        sparseIntArray.put(R.id.signature_image, 50);
        sparseIntArray.put(R.id.upload_photos_and_sign, 51);
        sparseIntArray.put(R.id.skipped, 52);
    }

    public aa(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 53, null, y0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.x0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.x0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.x0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public aa(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[8];
        ImageView imageView2 = (ImageView) objArr[7];
        ImageView imageView3 = (ImageView) objArr[24];
        ImageView imageView4 = (ImageView) objArr[23];
        ImageView imageView5 = (ImageView) objArr[37];
        ImageView imageView6 = (ImageView) objArr[36];
        TextView textView = (TextView) objArr[13];
        TextView textView2 = (TextView) objArr[11];
        TextView textView3 = (TextView) objArr[15];
        TextView textView4 = (TextView) objArr[19];
        TextView textView5 = (TextView) objArr[5];
        TextView textView6 = (TextView) objArr[17];
        Object obj = objArr[2];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        LinearLayout linearLayout = (LinearLayout) objArr[9];
        LinearLayout linearLayout2 = (LinearLayout) objArr[25];
        CardView cardView = (CardView) objArr[38];
        LinearLayout linearLayout3 = (LinearLayout) objArr[32];
        LinearLayout linearLayout4 = (LinearLayout) objArr[0];
        LinearLayout linearLayout5 = (LinearLayout) objArr[40];
        LinearLayout linearLayout6 = (LinearLayout) objArr[42];
        Object obj2 = objArr[3];
        super(jd1Var, view, 0, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, textView5, textView6, vy3VarA, linearLayout, linearLayout2, cardView, linearLayout3, linearLayout4, linearLayout5, linearLayout6, obj2 != null ? yn0.a((View) obj2) : null, (AppCompatTextView) objArr[16], (TextView) objArr[21], (LinearLayout) objArr[45], (LinearLayout) objArr[47], (ImageView) objArr[50], (CustomWegetLayout) objArr[52], (ImageView) objArr[31], (ImageView) objArr[30], (TextView) objArr[35], (TextView) objArr[41], (TextView) objArr[43], (TextView) objArr[39], (TextView) objArr[44], (TextView) objArr[46], (TextView) objArr[48], (AppCompatTextView) objArr[12], (TextView) objArr[6], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[18], (TextView) objArr[22], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[26], (TextView) objArr[33], (AppCompatTextView) objArr[28], (AppCompatTextView) objArr[27], (TextView) objArr[34], (AppCompatTextView) objArr[20], (TextView) objArr[29], (TextView) objArr[4], (ImageView) objArr[49], (CustomWegetLayout) objArr[51]);
        this.x0 = -1L;
        LinearLayout linearLayout7 = (LinearLayout) objArr[1];
        this.w0 = linearLayout7;
        linearLayout7.setTag(null);
        this.N.setTag(null);
        w(view);
        z();
    }
}
