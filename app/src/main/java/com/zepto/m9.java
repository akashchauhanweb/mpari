package com.zepto;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.widget.CircleImageView;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;

/* JADX INFO: loaded from: classes2.dex */
public class m9 extends l9 {
    public static final SparseIntArray u1;
    public final LinearLayout g1;
    public g13 h1;
    public g13 i1;
    public g13 j1;
    public g13 k1;
    public g13 l1;
    public g13 m1;
    public g13 n1;
    public g13 o1;
    public g13 p1;
    public g13 q1;
    public g13 r1;
    public g13 s1;
    public long t1;

    public class a implements g13 {
        public a() {
        }

        @Override // com.zepto.g13
        public void a() {
            String strA = df6.a(m9.this.t0);
            DlAddress dlAddress = m9.this.e1;
            if (dlAddress != null) {
                dlAddress.setStreet(strA);
            }
        }
    }

    public class b implements g13 {
        public b() {
        }

        @Override // com.zepto.g13
        public void a() {
            synchronized (m9.this) {
                m9.x(m9.this, 16L);
            }
            m9.this.u();
        }
    }

    public class c implements g13 {
        public c() {
        }

        @Override // com.zepto.g13
        public void a() {
            synchronized (m9.this) {
                m9.x(m9.this, 8L);
            }
            m9.this.u();
        }
    }

    public class d implements g13 {
        public d() {
        }

        @Override // com.zepto.g13
        public void a() {
            String strA = df6.a(m9.this.F);
            DlAddress dlAddress = m9.this.e1;
            if (dlAddress != null) {
                dlAddress.setState(strA);
            }
        }
    }

    public class e implements g13 {
        public e() {
        }

        @Override // com.zepto.g13
        public void a() {
            String strA = df6.a(m9.this.b0);
            DlAddress dlAddress = m9.this.f1;
            if (dlAddress != null) {
                dlAddress.setHouseNo(strA);
            }
        }
    }

    public class f implements g13 {
        public f() {
        }

        @Override // com.zepto.g13
        public void a() {
            String strA = df6.a(m9.this.c0);
            DlAddress dlAddress = m9.this.f1;
            if (dlAddress != null) {
                dlAddress.setLocation(strA);
            }
        }
    }

    public class g implements g13 {
        public g() {
        }

        @Override // com.zepto.g13
        public void a() {
            String strA = df6.a(m9.this.d0);
            DlAddress dlAddress = m9.this.f1;
            if (dlAddress != null) {
                dlAddress.setPinCode(strA);
            }
        }
    }

    public class h implements g13 {
        public h() {
        }

        @Override // com.zepto.g13
        public void a() {
            String strA = df6.a(m9.this.e0);
            DlAddress dlAddress = m9.this.f1;
            if (dlAddress != null) {
                dlAddress.setStreet(strA);
            }
        }
    }

    public class i implements g13 {
        public i() {
        }

        @Override // com.zepto.g13
        public void a() {
            String strA = df6.a(m9.this.h0);
            DlAddress dlAddress = m9.this.f1;
            if (dlAddress != null) {
                dlAddress.setState(strA);
            }
        }
    }

    public class j implements g13 {
        public j() {
        }

        @Override // com.zepto.g13
        public void a() {
            String strA = df6.a(m9.this.p0);
            DlAddress dlAddress = m9.this.e1;
            if (dlAddress != null) {
                dlAddress.setHouseNo(strA);
            }
        }
    }

    public class k implements g13 {
        public k() {
        }

        @Override // com.zepto.g13
        public void a() {
            String strA = df6.a(m9.this.r0);
            DlAddress dlAddress = m9.this.e1;
            if (dlAddress != null) {
                dlAddress.setLocation(strA);
            }
        }
    }

    public class l implements g13 {
        public l() {
        }

        @Override // com.zepto.g13
        public void a() {
            String strA = df6.a(m9.this.s0);
            DlAddress dlAddress = m9.this.e1;
            if (dlAddress != null) {
                dlAddress.setPinCode(strA);
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u1 = sparseIntArray;
        sparseIntArray.put(R.id.header_layout, 27);
        sparseIntArray.put(R.id.dl_details_title, 28);
        sparseIntArray.put(R.id.dl_details_checked, 29);
        sparseIntArray.put(R.id.view, 30);
        sparseIntArray.put(R.id.dl_details_unchecked1, 31);
        sparseIntArray.put(R.id.view2, 32);
        sparseIntArray.put(R.id.dl_details_unchecked2, 33);
        sparseIntArray.put(R.id.dl_details_tv, 34);
        sparseIntArray.put(R.id.textView5, 35);
        sparseIntArray.put(R.id.acknowledgemnet_tv, 36);
        sparseIntArray.put(R.id.dl_num_label, 37);
        sparseIntArray.put(R.id.dl_holder_label, 38);
        sparseIntArray.put(R.id.dl_holder_s_d_w_label, 39);
        sparseIntArray.put(R.id.dl_holder_dob_label, 40);
        sparseIntArray.put(R.id.dl_blood_label, 41);
        sparseIntArray.put(R.id.dl_present_add_label, 42);
        sparseIntArray.put(R.id.view3, 43);
        sparseIntArray.put(R.id.dl_vehicle_class_label, 44);
        sparseIntArray.put(R.id.dl_cov_abbr_tv, 45);
        sparseIntArray.put(R.id.dl_issuing_authority_label, 46);
        sparseIntArray.put(R.id.view4, 47);
        sparseIntArray.put(R.id.lmv_label, 48);
        sparseIntArray.put(R.id.dl_lmv_tv, 49);
        sparseIntArray.put(R.id.trans_label, 50);
        sparseIntArray.put(R.id.dl_trans_tv, 51);
        sparseIntArray.put(R.id.view5, 52);
        sparseIntArray.put(R.id.valid_period_label, 53);
        sparseIntArray.put(R.id.view6, 54);
        sparseIntArray.put(R.id.non_tranport_label, 55);
        sparseIntArray.put(R.id.trans_validity_label, 56);
        sparseIntArray.put(R.id.review_all_details_label, 57);
        sparseIntArray.put(R.id.dl_licence_holder_label, 58);
        sparseIntArray.put(R.id.view7, 59);
        sparseIntArray.put(R.id.dl_licence_holder_name_label, 60);
        sparseIntArray.put(R.id.dl_state_et, 61);
        sparseIntArray.put(R.id.dl_state_rto_et, 62);
        sparseIntArray.put(R.id.dl_current_pic_img, 63);
        sparseIntArray.put(R.id.delete_verification_img, 64);
        sparseIntArray.put(R.id.aplicant_label, 65);
        sparseIntArray.put(R.id.tab_to_click_label, 66);
        sparseIntArray.put(R.id.upload_img_for_verify_bt, 67);
        sparseIntArray.put(R.id.want_to_change_add_cb, 68);
        sparseIntArray.put(R.id.current_address_to_be_printed_label, 69);
        sparseIntArray.put(R.id.dl_current_address_dist_et, 70);
        sparseIntArray.put(R.id.dl_current_address_city_et, 71);
        sparseIntArray.put(R.id.village_town_rg, 72);
        sparseIntArray.put(R.id.village_rb, 73);
        sparseIntArray.put(R.id.town_rb, 74);
        sparseIntArray.put(R.id.dl_select_villa_town_et, 75);
        sparseIntArray.put(R.id.parmanent_address_to_be_printed_label, 76);
        sparseIntArray.put(R.id.same_as_current_address_cb, 77);
        sparseIntArray.put(R.id.dl_permanent_address_dist_et, 78);
        sparseIntArray.put(R.id.dl_permanent_address_city_et, 79);
        sparseIntArray.put(R.id.dl_permanent_village_town_rg, 80);
        sparseIntArray.put(R.id.dl_permanent_village_rb, 81);
        sparseIntArray.put(R.id.dl_permanent_town_rb, 82);
        sparseIntArray.put(R.id.dl_permanent_select_villa_town_et, 83);
        sparseIntArray.put(R.id.i_have_decleare_all_details_cb, 84);
        sparseIntArray.put(R.id.save_continue_to_next, 85);
    }

    public m9(jd1 jd1Var, View view) {
        this(jd1Var, view, lq7.r(jd1Var, view, 86, null, u1));
    }

    public static /* synthetic */ long x(m9 m9Var, long j2) {
        long j3 = j2 | m9Var.t1;
        m9Var.t1 = j3;
        return j3;
    }

    public void A() {
        synchronized (this) {
            this.t1 = 32L;
        }
        u();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[PHI: r2
      0x0030: PHI (r2v1 long) = (r2v0 long), (r2v30 long) binds: [B:7:0x0017, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.zepto.lq7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.m9.i():void");
    }

    @Override // com.zepto.lq7
    public boolean n() {
        synchronized (this) {
            try {
                return this.t1 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m9(jd1 jd1Var, View view, Object[] objArr) {
        TextView textView = (TextView) objArr[36];
        TextView textView2 = (TextView) objArr[65];
        TextView textView3 = (TextView) objArr[69];
        ImageView imageView = (ImageView) objArr[64];
        TextView textView4 = (TextView) objArr[41];
        TextView textView5 = (TextView) objArr[7];
        TextView textView6 = (TextView) objArr[45];
        EditText editText = (EditText) objArr[71];
        EditText editText2 = (EditText) objArr[70];
        EditText editText3 = (EditText) objArr[15];
        CircleImageView circleImageView = (CircleImageView) objArr[63];
        ImageView imageView2 = (ImageView) objArr[29];
        MyTextView myTextView = (MyTextView) objArr[28];
        TextView textView7 = (TextView) objArr[34];
        ImageView imageView3 = (ImageView) objArr[31];
        ImageView imageView4 = (ImageView) objArr[33];
        TextView textView8 = (TextView) objArr[40];
        TextView textView9 = (TextView) objArr[6];
        TextView textView10 = (TextView) objArr[38];
        TextView textView11 = (TextView) objArr[39];
        TextView textView12 = (TextView) objArr[5];
        TextView textView13 = (TextView) objArr[4];
        TextView textView14 = (TextView) objArr[46];
        TextView textView15 = (TextView) objArr[58];
        TextView textView16 = (TextView) objArr[60];
        TextView textView17 = (TextView) objArr[13];
        TextView textView18 = (TextView) objArr[12];
        TextView textView19 = (TextView) objArr[49];
        TextView textView20 = (TextView) objArr[2];
        TextView textView21 = (TextView) objArr[10];
        TextView textView22 = (TextView) objArr[37];
        AppCompatEditText appCompatEditText = (AppCompatEditText) objArr[23];
        AppCompatEditText appCompatEditText2 = (AppCompatEditText) objArr[25];
        AppCompatEditText appCompatEditText3 = (AppCompatEditText) objArr[26];
        AppCompatEditText appCompatEditText4 = (AppCompatEditText) objArr[24];
        EditText editText4 = (EditText) objArr[79];
        EditText editText5 = (EditText) objArr[78];
        EditText editText6 = (EditText) objArr[22];
        EditText editText7 = (EditText) objArr[83];
        RadioButton radioButton = (RadioButton) objArr[82];
        RadioButton radioButton2 = (RadioButton) objArr[81];
        RadioGroup radioGroup = (RadioGroup) objArr[80];
        TextView textView23 = (TextView) objArr[42];
        TextView textView24 = (TextView) objArr[8];
        CircleImageView circleImageView2 = (CircleImageView) objArr[1];
        AppCompatEditText appCompatEditText5 = (AppCompatEditText) objArr[16];
        EditText editText8 = (EditText) objArr[75];
        AppCompatEditText appCompatEditText6 = (AppCompatEditText) objArr[18];
        AppCompatEditText appCompatEditText7 = (AppCompatEditText) objArr[19];
        AppCompatEditText appCompatEditText8 = (AppCompatEditText) objArr[17];
        EditText editText9 = (EditText) objArr[61];
        EditText editText10 = (EditText) objArr[62];
        TextView textView25 = (TextView) objArr[51];
        TextView textView26 = (TextView) objArr[11];
        TextView textView27 = (TextView) objArr[9];
        TextView textView28 = (TextView) objArr[44];
        Object obj = objArr[27];
        super(jd1Var, view, 0, textView, textView2, textView3, imageView, textView4, textView5, textView6, editText, editText2, editText3, circleImageView, imageView2, myTextView, textView7, imageView3, imageView4, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, appCompatEditText, appCompatEditText2, appCompatEditText3, appCompatEditText4, editText4, editText5, editText6, editText7, radioButton, radioButton2, radioGroup, textView23, textView24, circleImageView2, appCompatEditText5, editText8, appCompatEditText6, appCompatEditText7, appCompatEditText8, editText9, editText10, textView25, textView26, textView27, textView28, obj != null ? vy3.a((View) obj) : null, (CheckBox) objArr[84], (TextView) objArr[48], (TextView) objArr[55], (TextView) objArr[76], (TextView) objArr[57], (CheckBox) objArr[77], (CustomWegetLayout) objArr[85], (ImageView) objArr[3], (LinearLayout) objArr[0], (TextView) objArr[66], (TextView) objArr[35], (RadioButton) objArr[74], (TextView) objArr[50], (TextView) objArr[56], (CustomWegetLayout) objArr[67], (TextView) objArr[53], (View) objArr[30], (View) objArr[32], (View) objArr[43], (View) objArr[47], (View) objArr[52], (View) objArr[54], (View) objArr[59], (RadioButton) objArr[73], (RadioGroup) objArr[72], (CheckBox) objArr[68], (LinearLayout) objArr[14], (FrameLayout) objArr[20]);
        this.h1 = new d();
        this.i1 = new e();
        this.j1 = new f();
        this.k1 = new g();
        this.l1 = new h();
        this.m1 = new i();
        this.n1 = new j();
        this.o1 = new k();
        this.p1 = new l();
        this.q1 = new a();
        this.r1 = new b();
        this.s1 = new c();
        this.t1 = -1L;
        this.B.setTag(null);
        this.F.setTag(null);
        this.N.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        this.b0.setTag(null);
        this.c0.setTag(null);
        this.d0.setTag(null);
        this.e0.setTag(null);
        this.h0.setTag(null);
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[21];
        this.g1 = linearLayout;
        linearLayout.setTag(null);
        this.I0.setTag(null);
        this.J0.setTag(null);
        this.b1.setTag(null);
        this.c1.setTag(null);
        w(view);
        A();
    }
}
