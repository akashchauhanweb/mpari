package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;

/* JADX INFO: loaded from: classes2.dex */
public class b9 extends a9 {
    public static final SparseIntArray n0;
    public long m0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 13);
        sparseIntArray.put(R.id.dl_details_title, 14);
        sparseIntArray.put(R.id.dl_details_checked, 15);
        sparseIntArray.put(R.id.view, 16);
        sparseIntArray.put(R.id.dl_details_unchecked1, 17);
        sparseIntArray.put(R.id.view2, 18);
        sparseIntArray.put(R.id.dl_details_unchecked2, 19);
        sparseIntArray.put(R.id.dl_details_tv, 20);
        sparseIntArray.put(R.id.textView5, 21);
        sparseIntArray.put(R.id.acknowledgemnet_tv, 22);
        sparseIntArray.put(R.id.dl_holder_label, 23);
        sparseIntArray.put(R.id.dl_holder_tv, 24);
        sparseIntArray.put(R.id.dl_holder_s_d_w_tv, 25);
        sparseIntArray.put(R.id.dl_holder_dob_label, 26);
        sparseIntArray.put(R.id.dl_holder_dob_tv, 27);
        sparseIntArray.put(R.id.dl_present_add_label, 28);
        sparseIntArray.put(R.id.dl_present_add_tv, 29);
        sparseIntArray.put(R.id.dl_ack_applicant_gender_label, 30);
        sparseIntArray.put(R.id.dl_ack_nt_valid_tv, 31);
        sparseIntArray.put(R.id.view3, 32);
        sparseIntArray.put(R.id.dl_vehicle_class_label, 33);
        sparseIntArray.put(R.id.view4, 34);
        sparseIntArray.put(R.id.dl_rto_location_label, 35);
        sparseIntArray.put(R.id.view5, 36);
        sparseIntArray.put(R.id.dl_doc_proof_req_label, 37);
        sparseIntArray.put(R.id.view6, 38);
        sparseIntArray.put(R.id.dl_ack_note_label, 39);
        sparseIntArray.put(R.id.save_continue_to_next, 40);
    }

    public b9(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 41, null, n0));
    }

    @Override // com.zepto.lq7
    public void i() {
        long j;
        String rtoLocation;
        String dlno;
        String applicantGender;
        String fatherName;
        String nTValidities;
        String dateofBirth;
        String applicantAddress;
        String applicationNo;
        String applicationDate;
        String note1;
        String documentaryProofsRequired;
        String applicantname;
        synchronized (this) {
            j = this.m0;
            this.m0 = 0L;
        }
        ResultItemSubmit resultItemSubmit = this.l0;
        long j2 = j & 3;
        if (j2 == 0 || resultItemSubmit == null) {
            rtoLocation = null;
            dlno = null;
            applicantGender = null;
            fatherName = null;
            nTValidities = null;
            dateofBirth = null;
            applicantAddress = null;
            applicationNo = null;
            applicationDate = null;
            note1 = null;
            documentaryProofsRequired = null;
            applicantname = null;
        } else {
            rtoLocation = resultItemSubmit.getRtoLocation();
            dlno = resultItemSubmit.getDlno();
            applicantGender = resultItemSubmit.getApplicantGender();
            nTValidities = resultItemSubmit.getNTValidities();
            dateofBirth = resultItemSubmit.getDateofBirth();
            applicantAddress = resultItemSubmit.getApplicantAddress();
            applicationNo = resultItemSubmit.getApplicationNo();
            applicationDate = resultItemSubmit.getApplicationDate();
            note1 = resultItemSubmit.getNote1();
            documentaryProofsRequired = resultItemSubmit.getDocumentaryProofsRequired();
            applicantname = resultItemSubmit.getApplicantname();
            fatherName = resultItemSubmit.getFatherName();
        }
        if (j2 != 0) {
            df6.c(this.y, applicantGender);
            df6.c(this.A, note1);
            df6.c(this.C, nTValidities);
            df6.c(this.D, applicationNo);
            df6.c(this.E, applicationDate);
            df6.c(this.F, applicantAddress);
            df6.c(this.M, documentaryProofsRequired);
            df6.c(this.P, dlno);
            df6.c(this.Q, applicantname);
            df6.c(this.W, fatherName);
            df6.c(this.X, dateofBirth);
            df6.c(this.Z, rtoLocation);
        }
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.m0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this) {
            this.m0 = 2L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b9(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[22];
        TextView textView2 = (TextView) objArr[30];
        TextView textView3 = (TextView) objArr[7];
        TextView textView4 = (TextView) objArr[39];
        TextView textView5 = (TextView) objArr[12];
        TextView textView6 = (TextView) objArr[31];
        TextView textView7 = (TextView) objArr[8];
        TextView textView8 = (TextView) objArr[1];
        TextView textView9 = (TextView) objArr[2];
        TextView textView10 = (TextView) objArr[9];
        ImageView imageView = (ImageView) objArr[15];
        MyTextView myTextView = (MyTextView) objArr[14];
        TextView textView11 = (TextView) objArr[20];
        ImageView imageView2 = (ImageView) objArr[17];
        ImageView imageView3 = (ImageView) objArr[19];
        TextView textView12 = (TextView) objArr[37];
        TextView textView13 = (TextView) objArr[11];
        TextView textView14 = (TextView) objArr[26];
        TextView textView15 = (TextView) objArr[27];
        TextView textView16 = (TextView) objArr[3];
        TextView textView17 = (TextView) objArr[4];
        TextView textView18 = (TextView) objArr[23];
        TextView textView19 = (TextView) objArr[25];
        TextView textView20 = (TextView) objArr[24];
        TextView textView21 = (TextView) objArr[28];
        TextView textView22 = (TextView) objArr[29];
        TextView textView23 = (TextView) objArr[5];
        TextView textView24 = (TextView) objArr[6];
        TextView textView25 = (TextView) objArr[35];
        TextView textView26 = (TextView) objArr[10];
        TextView textView27 = (TextView) objArr[33];
        Object obj = objArr[13];
        super(jd1Var, view, 0, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, imageView, myTextView, textView11, imageView2, imageView3, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, obj != null ? vy3.a((View) obj) : null, (LinearLayout) objArr[40], (LinearLayout) objArr[0], (TextView) objArr[21], (View) objArr[16], (View) objArr[18], (View) objArr[32], (View) objArr[34], (View) objArr[36], (View) objArr[38]);
        this.m0 = -1L;
        this.y.setTag(null);
        this.A.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.M.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Z.setTag(null);
        this.d0.setTag(null);
        w(view);
        x();
    }
}
