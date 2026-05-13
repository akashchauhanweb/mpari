package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class rz1 extends qz1 {
    public static final SparseIntArray O;
    public final LinearLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.mHeader, 1);
        sparseIntArray.put(R.id.txt_app_category, 2);
        sparseIntArray.put(R.id.infoIv, 3);
        sparseIntArray.put(R.id.covListLl, 4);
        sparseIntArray.put(R.id.selectedVehicleClassTv, 5);
        sparseIntArray.put(R.id.selectedVehicleClassLl, 6);
        sparseIntArray.put(R.id.tv_note_organ_donate, 7);
        sparseIntArray.put(R.id.willToDonateRg, 8);
        sparseIntArray.put(R.id.willing_to_donate, 9);
        sparseIntArray.put(R.id.not_willing_to_donate, 10);
        sparseIntArray.put(R.id.org_mob_number, 11);
        sparseIntArray.put(R.id.termCndRl, 12);
        sparseIntArray.put(R.id.selfDeclartionCb, 13);
        sparseIntArray.put(R.id.selfDeclartionTv, 14);
        sparseIntArray.put(R.id.cancelTv, 15);
        sparseIntArray.put(R.id.nextTv, 16);
    }

    public rz1(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 17, null, O));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.N = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.N = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rz1(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[15];
        LinearLayout linearLayout = (LinearLayout) objArr[4];
        ImageView imageView = (ImageView) objArr[3];
        Object obj = objArr[1];
        super(jd1Var, view, 0, textView, linearLayout, imageView, obj != null ? ri5.a((View) obj) : null, (TextView) objArr[16], (RadioButton) objArr[10], (AppCompatEditText) objArr[11], (LinearLayout) objArr[6], (TextView) objArr[5], (CheckBox) objArr[13], (TextView) objArr[14], (RelativeLayout) objArr[12], (MyTextView) objArr[7], (TextView) objArr[2], (RadioGroup) objArr[8], (RadioButton) objArr[9]);
        this.N = -1L;
        LinearLayout linearLayout2 = (LinearLayout) objArr[0];
        this.M = linearLayout2;
        linearLayout2.setTag(null);
        w(view);
        z();
    }
}
