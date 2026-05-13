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
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class ya extends xa {
    public static final SparseIntArray E0;
    public final LinearLayout C0;
    public long D0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E0 = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 2);
        sparseIntArray.put(R.id.header_layout, 3);
        sparseIntArray.put(R.id.psl, 4);
        sparseIntArray.put(R.id.tv_upload_pic_sign, 5);
        sparseIntArray.put(R.id.dl_no_txt, 6);
        sparseIntArray.put(R.id.txt_view_details, 7);
        sparseIntArray.put(R.id.select_service_name, 8);
        sparseIntArray.put(R.id.icon_image, 9);
        sparseIntArray.put(R.id.round_card_view, 10);
        sparseIntArray.put(R.id.iv_report_traffic_violation_icon, 11);
        sparseIntArray.put(R.id.tv_appln_detail, 12);
        sparseIntArray.put(R.id.app_arrow_up, 13);
        sparseIntArray.put(R.id.app_arrow_down, 14);
        sparseIntArray.put(R.id.ll_bottom_design, 15);
        sparseIntArray.put(R.id.tv_appln_no, 16);
        sparseIntArray.put(R.id.application_number, 17);
        sparseIntArray.put(R.id.tv_appln_date, 18);
        sparseIntArray.put(R.id.application_date, 19);
        sparseIntArray.put(R.id.tv_name, 20);
        sparseIntArray.put(R.id.applicatn_name, 21);
        sparseIntArray.put(R.id.relation_name, 22);
        sparseIntArray.put(R.id.fathers_name, 23);
        sparseIntArray.put(R.id.tv_dob, 24);
        sparseIntArray.put(R.id.date_of_birth, 25);
        sparseIntArray.put(R.id.tv_rto, 26);
        sparseIntArray.put(R.id.rto_name, 27);
        sparseIntArray.put(R.id.tv_instruction, 28);
        sparseIntArray.put(R.id.app_ins_arrow_up, 29);
        sparseIntArray.put(R.id.app_ins_arrow_down, 30);
        sparseIntArray.put(R.id.ll_instructions, 31);
        sparseIntArray.put(R.id.tv_note_capture_photo, 32);
        sparseIntArray.put(R.id.tv_note_uplod_sign, 33);
        sparseIntArray.put(R.id.tv_note_uplod_pic_sign, 34);
        sparseIntArray.put(R.id.tv_spec_photo_sign, 35);
        sparseIntArray.put(R.id.spec_arrow_up, 36);
        sparseIntArray.put(R.id.spec_arrow_down, 37);
        sparseIntArray.put(R.id.ll_specifications, 38);
        sparseIntArray.put(R.id.tv_note_photo_dimen, 39);
        sparseIntArray.put(R.id.tv_note_warning, 40);
        sparseIntArray.put(R.id.title_uplod_pic_sign, 41);
        sparseIntArray.put(R.id.app_photo_arrow_up, 42);
        sparseIntArray.put(R.id.app_photo_arrow_down, 43);
        sparseIntArray.put(R.id.ll_photo, 44);
        sparseIntArray.put(R.id.tv_applic_photo, 45);
        sparseIntArray.put(R.id.photo_capture_button, 46);
        sparseIntArray.put(R.id.tv_applic_capture, 47);
        sparseIntArray.put(R.id.photo_gallery_button, 48);
        sparseIntArray.put(R.id.tv_applic_gallary, 49);
        sparseIntArray.put(R.id.tv_applic_sign, 50);
        sparseIntArray.put(R.id.sign_capture_button, 51);
        sparseIntArray.put(R.id.tv_applic_sign_capt, 52);
        sparseIntArray.put(R.id.sign_gallery_button, 53);
        sparseIntArray.put(R.id.tv_applic_sign_gally, 54);
        sparseIntArray.put(R.id.upload_image, 55);
        sparseIntArray.put(R.id.signature_image, 56);
        sparseIntArray.put(R.id.upload_photos_and_sign, 57);
        sparseIntArray.put(R.id.skipped, 58);
    }

    public ya(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 59, null, E0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.D0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.D0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.D0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ya(jd1 jd1Var, View view, Object[] objArr) {
        ImageView imageView = (ImageView) objArr[14];
        ImageView imageView2 = (ImageView) objArr[13];
        ImageView imageView3 = (ImageView) objArr[30];
        ImageView imageView4 = (ImageView) objArr[29];
        ImageView imageView5 = (ImageView) objArr[43];
        ImageView imageView6 = (ImageView) objArr[42];
        TextView textView = (TextView) objArr[19];
        TextView textView2 = (TextView) objArr[17];
        TextView textView3 = (TextView) objArr[21];
        TextView textView4 = (TextView) objArr[25];
        TextView textView5 = (TextView) objArr[6];
        TextView textView6 = (TextView) objArr[23];
        Object obj = objArr[3];
        vy3 vy3VarA = obj != null ? vy3.a((View) obj) : null;
        CardView cardView = (CardView) objArr[9];
        ImageView imageView7 = (ImageView) objArr[11];
        LinearLayout linearLayout = (LinearLayout) objArr[15];
        LinearLayout linearLayout2 = (LinearLayout) objArr[31];
        CardView cardView2 = (CardView) objArr[44];
        LinearLayout linearLayout3 = (LinearLayout) objArr[38];
        Object obj2 = objArr[2];
        iy3 iy3VarA = obj2 != null ? iy3.a((View) obj2) : null;
        LinearLayout linearLayout4 = (LinearLayout) objArr[0];
        LinearLayout linearLayout5 = (LinearLayout) objArr[46];
        LinearLayout linearLayout6 = (LinearLayout) objArr[48];
        Object obj3 = objArr[4];
        super(jd1Var, view, 0, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, textView4, textView5, textView6, vy3VarA, cardView, imageView7, linearLayout, linearLayout2, cardView2, linearLayout3, iy3VarA, linearLayout4, linearLayout5, linearLayout6, obj3 != null ? as4.a((View) obj3) : null, (AppCompatTextView) objArr[22], (CardView) objArr[10], (TextView) objArr[27], (MyTextView) objArr[8], (LinearLayout) objArr[51], (LinearLayout) objArr[53], (ImageView) objArr[56], (CustomWegetLayout) objArr[58], (ImageView) objArr[37], (ImageView) objArr[36], (TextView) objArr[41], (TextView) objArr[47], (TextView) objArr[49], (TextView) objArr[45], (TextView) objArr[50], (TextView) objArr[52], (TextView) objArr[54], (AppCompatTextView) objArr[18], (TextView) objArr[12], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[24], (TextView) objArr[28], (AppCompatTextView) objArr[20], (AppCompatTextView) objArr[32], (TextView) objArr[39], (AppCompatTextView) objArr[34], (AppCompatTextView) objArr[33], (TextView) objArr[40], (AppCompatTextView) objArr[26], (TextView) objArr[35], (TextView) objArr[5], (TextView) objArr[7], (ImageView) objArr[55], (CustomWegetLayout) objArr[57]);
        this.D0 = -1L;
        LinearLayout linearLayout7 = (LinearLayout) objArr[1];
        this.C0 = linearLayout7;
        linearLayout7.setTag(null);
        this.Q.setTag(null);
        w(view);
        x();
    }
}
