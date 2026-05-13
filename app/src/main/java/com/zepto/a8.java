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
public class a8 extends z7 {
    public static final SparseIntArray z0;
    public final LinearLayout x0;
    public long y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 2);
        sparseIntArray.put(R.id.multi_head, 3);
        sparseIntArray.put(R.id.psl, 4);
        sparseIntArray.put(R.id.tv_upload_pic_sign, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.tv_appln_detail, 7);
        sparseIntArray.put(R.id.app_arrow_up, 8);
        sparseIntArray.put(R.id.app_arrow_down, 9);
        sparseIntArray.put(R.id.ll_bottom_design, 10);
        sparseIntArray.put(R.id.tv_appln_no, 11);
        sparseIntArray.put(R.id.application_number, 12);
        sparseIntArray.put(R.id.tv_appln_date, 13);
        sparseIntArray.put(R.id.application_date, 14);
        sparseIntArray.put(R.id.tv_name, 15);
        sparseIntArray.put(R.id.applicatn_name, 16);
        sparseIntArray.put(R.id.relation_name, 17);
        sparseIntArray.put(R.id.fathers_name, 18);
        sparseIntArray.put(R.id.tv_dob, 19);
        sparseIntArray.put(R.id.date_of_birth, 20);
        sparseIntArray.put(R.id.tv_rto, 21);
        sparseIntArray.put(R.id.rto_name, 22);
        sparseIntArray.put(R.id.tv_instruction, 23);
        sparseIntArray.put(R.id.app_ins_arrow_up, 24);
        sparseIntArray.put(R.id.app_ins_arrow_down, 25);
        sparseIntArray.put(R.id.ll_instructions, 26);
        sparseIntArray.put(R.id.tv_note_capture_photo, 27);
        sparseIntArray.put(R.id.tv_note_uplod_sign, 28);
        sparseIntArray.put(R.id.tv_note_uplod_pic_sign, 29);
        sparseIntArray.put(R.id.tv_spec_photo_sign, 30);
        sparseIntArray.put(R.id.spec_arrow_up, 31);
        sparseIntArray.put(R.id.spec_arrow_down, 32);
        sparseIntArray.put(R.id.ll_specifications, 33);
        sparseIntArray.put(R.id.tv_note_photo_dimen, 34);
        sparseIntArray.put(R.id.tv_note_warning, 35);
        sparseIntArray.put(R.id.title_uplod_pic_sign, 36);
        sparseIntArray.put(R.id.app_photo_arrow_up, 37);
        sparseIntArray.put(R.id.app_photo_arrow_down, 38);
        sparseIntArray.put(R.id.ll_photo, 39);
        sparseIntArray.put(R.id.tv_applic_photo, 40);
        sparseIntArray.put(R.id.photo_capture_button, 41);
        sparseIntArray.put(R.id.tv_applic_capture, 42);
        sparseIntArray.put(R.id.photo_gallery_button, 43);
        sparseIntArray.put(R.id.tv_applic_gallary, 44);
        sparseIntArray.put(R.id.tv_applic_sign, 45);
        sparseIntArray.put(R.id.sign_capture_button, 46);
        sparseIntArray.put(R.id.tv_applic_sign_capt, 47);
        sparseIntArray.put(R.id.sign_gallery_button, 48);
        sparseIntArray.put(R.id.tv_applic_sign_gally, 49);
        sparseIntArray.put(R.id.upload_image, 50);
        sparseIntArray.put(R.id.signature_image, 51);
        sparseIntArray.put(R.id.upload_photos_and_sign, 52);
        sparseIntArray.put(R.id.skipped, 53);
    }

    public a8(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 54, null, z0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.y0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.y0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.y0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a8(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[9];
        ImageView imageView2 = (ImageView) objArr[8];
        ImageView imageView3 = (ImageView) objArr[25];
        ImageView imageView4 = (ImageView) objArr[24];
        ImageView imageView5 = (ImageView) objArr[38];
        ImageView imageView6 = (ImageView) objArr[37];
        TextView textView = (TextView) objArr[14];
        TextView textView2 = (TextView) objArr[12];
        TextView textView3 = (TextView) objArr[16];
        TextView textView4 = (TextView) objArr[20];
        TextView textView5 = (TextView) objArr[6];
        TextView textView6 = (TextView) objArr[18];
        Object obj = objArr[2];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        LinearLayout linearLayout = (LinearLayout) objArr[10];
        LinearLayout linearLayout2 = (LinearLayout) objArr[26];
        CardView cardView = (CardView) objArr[39];
        LinearLayout linearLayout3 = (LinearLayout) objArr[33];
        Object obj2 = objArr[3];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        LinearLayout linearLayout4 = (LinearLayout) objArr[0];
        LinearLayout linearLayout5 = (LinearLayout) objArr[41];
        LinearLayout linearLayout6 = (LinearLayout) objArr[43];
        Object obj3 = objArr[4];
        super(jd1Var, view, 0, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, textView5, textView6, vy3VarA, linearLayout, linearLayout2, cardView, linearLayout3, iy3VarA, linearLayout4, linearLayout5, linearLayout6, obj3 != null ? yn0.a((View) obj3) : null, (AppCompatTextView) objArr[17], (TextView) objArr[22], (LinearLayout) objArr[46], (LinearLayout) objArr[48], (ImageView) objArr[51], (CustomWegetLayout) objArr[53], (ImageView) objArr[32], (ImageView) objArr[31], (TextView) objArr[36], (TextView) objArr[42], (TextView) objArr[44], (TextView) objArr[40], (TextView) objArr[45], (TextView) objArr[47], (TextView) objArr[49], (AppCompatTextView) objArr[13], (TextView) objArr[7], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[19], (TextView) objArr[23], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[27], (TextView) objArr[34], (AppCompatTextView) objArr[29], (AppCompatTextView) objArr[28], (TextView) objArr[35], (AppCompatTextView) objArr[21], (TextView) objArr[30], (TextView) objArr[5], (ImageView) objArr[50], (CustomWegetLayout) objArr[52]);
        this.y0 = -1L;
        LinearLayout linearLayout7 = (LinearLayout) objArr[1];
        this.x0 = linearLayout7;
        linearLayout7.setTag(null);
        this.O.setTag(null);
        w(view);
        x();
    }
}
