package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ja {
    public static final SparseIntArray V;
    public final LinearLayout S;
    public final LinearLayout T;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(R.id.multi_head, 2);
        sparseIntArray.put(R.id.txt_dl_service, 3);
        sparseIntArray.put(R.id.ll_layout, 4);
        sparseIntArray.put(R.id.btn_my_vehicle, 5);
        sparseIntArray.put(R.id.btn_othe_vehicle, 6);
        sparseIntArray.put(R.id.btn_my_vehicle_two, 7);
        sparseIntArray.put(R.id.vehicleServiceRecycler, 8);
        sparseIntArray.put(R.id.dl_virtual, 9);
        sparseIntArray.put(R.id.dl_dash_number, 10);
        sparseIntArray.put(R.id.dl_go, 11);
        sparseIntArray.put(R.id.other_New_VehicleLayout, 12);
        sparseIntArray.put(R.id.tv_dl_no, 13);
        sparseIntArray.put(R.id.dl_number, 14);
        sparseIntArray.put(R.id.chassi_number, 15);
        sparseIntArray.put(R.id.dl_dob, 16);
        sparseIntArray.put(R.id.ll_note_layout, 17);
        sparseIntArray.put(R.id.tv_note, 18);
        sparseIntArray.put(R.id.noteText, 19);
        sparseIntArray.put(R.id.btn_cancel_button, 20);
        sparseIntArray.put(R.id.btn_cancel, 21);
        sparseIntArray.put(R.id.btn_reset, 22);
        sparseIntArray.put(R.id.btn_submit, 23);
    }

    public ka(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 24, null, V));
    }

    @Override // com.zepto.lq7
    public void i() {
        synchronized (this) {
            this.U = 0L;
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.U != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.U = 1L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ka(jd1 jd1Var, View view, Object[] objArr) {
        AppCompatButton appCompatButton = (AppCompatButton) objArr[21];
        AppCompatButton appCompatButton2 = (AppCompatButton) objArr[20];
        TextView textView = (TextView) objArr[5];
        TextView textView2 = (TextView) objArr[7];
        TextView textView3 = (TextView) objArr[6];
        AppCompatButton appCompatButton3 = (AppCompatButton) objArr[22];
        AppCompatButton appCompatButton4 = (AppCompatButton) objArr[23];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[15];
        TextView textView4 = (TextView) objArr[10];
        TextView textView5 = (TextView) objArr[16];
        TextView textView6 = (TextView) objArr[11];
        EditText editText = (EditText) objArr[14];
        LinearLayout linearLayout = (LinearLayout) objArr[9];
        LinearLayout linearLayout2 = (LinearLayout) objArr[4];
        LinearLayout linearLayout3 = (LinearLayout) objArr[17];
        Object obj = objArr[2];
        super(jd1Var, view, 0, appCompatButton, appCompatButton2, textView, textView2, textView3, appCompatButton3, appCompatButton4, appCompatTextView, textView4, textView5, textView6, editText, linearLayout, linearLayout2, linearLayout3, obj != null ? iy3.a((View) obj) : null, (TextView) objArr[19], (LinearLayout) objArr[12], (MyTextView) objArr[13], (MyTextView) objArr[18], (MyTextView) objArr[3], (RecyclerView) objArr[8]);
        this.U = -1L;
        LinearLayout linearLayout4 = (LinearLayout) objArr[0];
        this.S = linearLayout4;
        linearLayout4.setTag(null);
        LinearLayout linearLayout5 = (LinearLayout) objArr[1];
        this.T = linearLayout5;
        linearLayout5.setTag(null);
        w(view);
        x();
    }
}
