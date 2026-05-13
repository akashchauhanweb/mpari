package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;

/* JADX INFO: loaded from: classes2.dex */
public class ua extends ta {
    public static final SparseIntArray b0;
    public long a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b0 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 7);
        sparseIntArray.put(R.id.app_status_title, 8);
        sparseIntArray.put(R.id.dl_app_status_request_tv, 9);
        sparseIntArray.put(R.id.renewal_dl, 10);
        sparseIntArray.put(R.id.dl_status, 11);
        sparseIntArray.put(R.id.dl_status_tv, 12);
        sparseIntArray.put(R.id.dl_app_no, 13);
        sparseIntArray.put(R.id.dl_name, 14);
        sparseIntArray.put(R.id.dl_s_d_w, 15);
        sparseIntArray.put(R.id.dl_dob, 16);
        sparseIntArray.put(R.id.dl_rto_name, 17);
        sparseIntArray.put(R.id.view3, 18);
        sparseIntArray.put(R.id.dl_status_label, 19);
        sparseIntArray.put(R.id.refresh_status, 20);
        sparseIntArray.put(R.id.refresh_status_pb, 21);
        sparseIntArray.put(R.id.view4, 22);
        sparseIntArray.put(R.id.dl_stages_to_compeleted_label, 23);
        sparseIntArray.put(R.id.dl_stages_rv, 24);
        sparseIntArray.put(R.id.view5, 25);
        sparseIntArray.put(R.id.dl_note_label, 26);
        sparseIntArray.put(R.id.dl_note_tv, 27);
        sparseIntArray.put(R.id.done, 28);
    }

    public ua(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 29, null, b0));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @Override // com.zepto.lq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.a0     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            r7.a0 = r2     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6e
            com.nic.mparivahan.dlservices.data.model.DlStatusDycptResponse r4 = r7.Z
            r5 = 3
            long r0 = r0 & r5
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L48
            if (r4 == 0) goto L19
            com.nic.mparivahan.dlservices.data.model.DlApplStatusDto r2 = r4.getDlApplStatusDto()
            goto L1a
        L19:
            r2 = r1
        L1a:
            if (r2 == 0) goto L21
            java.util.List r2 = r2.getApplStatusDetails()
            goto L22
        L21:
            r2 = r1
        L22:
            if (r2 == 0) goto L2c
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem r2 = (com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem) r2
            goto L2d
        L2c:
            r2 = r1
        L2d:
            if (r2 == 0) goto L48
            java.lang.String r1 = r2.getApplno()
            java.lang.String r3 = r2.getDob()
            java.lang.String r4 = r2.getSwdName()
            java.lang.String r5 = r2.getRtoName()
            java.lang.String r6 = r2.getApplpendStatus()
            java.lang.String r2 = r2.getApplName()
            goto L4d
        L48:
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L4d:
            if (r0 == 0) goto L6d
            android.widget.TextView r0 = r7.y
            com.zepto.df6.c(r0, r1)
            android.widget.TextView r0 = r7.B
            com.zepto.df6.c(r0, r3)
            android.widget.TextView r0 = r7.D
            com.zepto.df6.c(r0, r2)
            android.widget.TextView r0 = r7.H
            com.zepto.df6.c(r0, r5)
            android.widget.TextView r0 = r7.J
            com.zepto.df6.c(r0, r4)
            android.widget.TextView r0 = r7.O
            com.zepto.df6.c(r0, r6)
        L6d:
            return
        L6e:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ua.i():void");
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

    public void x() {
        synchronized (this) {
            this.a0 = 2L;
        }
        u();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ua(jd1 jd1Var, View view, Object[] objArr) {
        MyTextView myTextView = (MyTextView) objArr[8];
        TextView textView = (TextView) objArr[13];
        TextView textView2 = (TextView) objArr[1];
        TextView textView3 = (TextView) objArr[9];
        TextView textView4 = (TextView) objArr[16];
        TextView textView5 = (TextView) objArr[4];
        TextView textView6 = (TextView) objArr[14];
        TextView textView7 = (TextView) objArr[2];
        TextView textView8 = (TextView) objArr[26];
        TextView textView9 = (TextView) objArr[27];
        TextView textView10 = (TextView) objArr[17];
        TextView textView11 = (TextView) objArr[5];
        TextView textView12 = (TextView) objArr[15];
        TextView textView13 = (TextView) objArr[3];
        RecyclerView recyclerView = (RecyclerView) objArr[24];
        TextView textView14 = (TextView) objArr[23];
        TextView textView15 = (TextView) objArr[11];
        TextView textView16 = (TextView) objArr[19];
        TextView textView17 = (TextView) objArr[6];
        TextView textView18 = (TextView) objArr[12];
        LinearLayout linearLayout = (LinearLayout) objArr[28];
        Object obj = objArr[7];
        super(jd1Var, view, 0, myTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, recyclerView, textView14, textView15, textView16, textView17, textView18, linearLayout, obj != null ? vy3.a((View) obj) : null, (ImageView) objArr[20], (ProgressBar) objArr[21], (TextView) objArr[10], (LinearLayout) objArr[0], (View) objArr[18], (View) objArr[22], (View) objArr[25]);
        this.a0 = -1L;
        this.y.setTag(null);
        this.B.setTag(null);
        this.D.setTag(null);
        this.H.setTag(null);
        this.J.setTag(null);
        this.O.setTag(null);
        this.V.setTag(null);
        w(view);
        x();
    }
}
