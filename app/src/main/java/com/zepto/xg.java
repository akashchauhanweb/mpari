package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class xg extends wg {
    public static final SparseIntArray f0;
    public final RelativeLayout d0;
    public long e0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f0 = sparseIntArray;
        sparseIntArray.put(R.id.topHolder, 1);
        sparseIntArray.put(R.id.freshPermitTv, 2);
        sparseIntArray.put(R.id.permitTypeTv, 3);
        sparseIntArray.put(R.id.permitTypeValueTv, 4);
        sparseIntArray.put(R.id.permitCategoryTv, 5);
        sparseIntArray.put(R.id.permitCategoryValueTv, 6);
        sparseIntArray.put(R.id.serviceTypeLl, 7);
        sparseIntArray.put(R.id.serviceTypeTv, 8);
        sparseIntArray.put(R.id.serviceTypeValueTv, 9);
        sparseIntArray.put(R.id.authNoTv, 10);
        sparseIntArray.put(R.id.authNoValueTv, 11);
        sparseIntArray.put(R.id.authStartFromTv, 12);
        sparseIntArray.put(R.id.authStartFromValueTv, 13);
        sparseIntArray.put(R.id.authUptoTv, 14);
        sparseIntArray.put(R.id.authUptoValueTv, 15);
        sparseIntArray.put(R.id.permitNoTv, 16);
        sparseIntArray.put(R.id.permitNoValueTv, 17);
        sparseIntArray.put(R.id.allotmentOfficeTv, 18);
        sparseIntArray.put(R.id.allotmentOfficeValueTv, 19);
        sparseIntArray.put(R.id.surrenderPurTv, 20);
        sparseIntArray.put(R.id.surrenderPurSpn, 21);
        sparseIntArray.put(R.id.rightReasonPin, 22);
        sparseIntArray.put(R.id.remarkTv, 23);
        sparseIntArray.put(R.id.remarkEt, 24);
        sparseIntArray.put(R.id.relationshipTv, 25);
        sparseIntArray.put(R.id.relationShipEt, 26);
        sparseIntArray.put(R.id.ownershipTypeTv, 27);
        sparseIntArray.put(R.id.ownershipTypeRg, 28);
        sparseIntArray.put(R.id.village_rb, 29);
        sparseIntArray.put(R.id.town_rb, 30);
        sparseIntArray.put(R.id.btnHolder, 31);
        sparseIntArray.put(R.id.reset, 32);
        sparseIntArray.put(R.id.id_next_service, 33);
    }

    public xg(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 34, null, f0));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.e0 = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.e0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        synchronized (this) {
            this.e0 = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xg(jd1 jd1Var, View view, Object[] objArr) {
        MyTextView myTextView = (MyTextView) objArr[18];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[19];
        MyTextView myTextView2 = (MyTextView) objArr[10];
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[11];
        MyTextView myTextView3 = (MyTextView) objArr[12];
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[13];
        MyTextView myTextView4 = (MyTextView) objArr[14];
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) objArr[15];
        LinearLayout linearLayout = (LinearLayout) objArr[31];
        MyTextView myTextView5 = (MyTextView) objArr[2];
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) objArr[33];
        RadioGroup radioGroup = (RadioGroup) objArr[28];
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) objArr[27];
        MyTextView myTextView6 = (MyTextView) objArr[5];
        AppCompatTextView appCompatTextView6 = (AppCompatTextView) objArr[6];
        MyTextView myTextView7 = (MyTextView) objArr[16];
        AppCompatTextView appCompatTextView7 = (AppCompatTextView) objArr[17];
        MyTextView myTextView8 = (MyTextView) objArr[3];
        AppCompatTextView appCompatTextView8 = (AppCompatTextView) objArr[4];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[26];
        AppCompatTextView appCompatTextView9 = (AppCompatTextView) objArr[25];
        AppCompatEditText appCompatEditText2 = (AppCompatEditText) objArr[24];
        AppCompatTextView appCompatTextView10 = (AppCompatTextView) objArr[23];
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) objArr[32];
        ImageView imageView = (ImageView) objArr[22];
        LinearLayout linearLayout2 = (LinearLayout) objArr[7];
        MyTextView myTextView9 = (MyTextView) objArr[8];
        AppCompatTextView appCompatTextView11 = (AppCompatTextView) objArr[9];
        Spinner spinner = (Spinner) objArr[21];
        AppCompatTextView appCompatTextView12 = (AppCompatTextView) objArr[20];
        Object obj = objArr[1];
        super(jd1Var, view, 0, myTextView, appCompatTextView, myTextView2, appCompatTextView2, myTextView3, appCompatTextView3, myTextView4, appCompatTextView4, linearLayout, myTextView5, customWegetLayout, radioGroup, appCompatTextView5, myTextView6, appCompatTextView6, myTextView7, appCompatTextView7, myTextView8, appCompatTextView8, appCompatEditText, appCompatTextView9, appCompatEditText2, appCompatTextView10, customWegetLayout2, imageView, linearLayout2, myTextView9, appCompatTextView11, spinner, appCompatTextView12, obj != null ? d47.a((View) obj) : null, (RadioButton) objArr[30], (RadioButton) objArr[29]);
        this.e0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.d0 = relativeLayout;
        relativeLayout.setTag(null);
        w(view);
        z();
    }
}
