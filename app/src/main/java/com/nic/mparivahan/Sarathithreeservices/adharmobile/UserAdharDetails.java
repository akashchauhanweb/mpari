package com.nic.mparivahan.sarathithreeservices.adharmobile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.sarathithreeservices.adharmobile.UserAdharDetails;
import com.zepto.kt6;
import com.zepto.o40;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.yg;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00105\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u00109\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u0010.\"\u0004\b8\u00100¨\u0006<"}, d2 = {"Lcom/nic/mparivahan/sarathithreeservices/adharmobile/UserAdharDetails;", "Lcom/zepto/o40;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/yg;", "F", "Lcom/zepto/yg;", "B1", "()Lcom/zepto/yg;", "H1", "(Lcom/zepto/yg;)V", "binding", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "getSarthiSession", "()Lcom/zepto/wl5;", "K1", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "D1", "()Lcom/zepto/wa3;", "J1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "I", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "aadharData", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "J", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "C1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "I1", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "", "K", "Ljava/lang/String;", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "L", "getDob", "setDob", "dob", "M", "getAadhaarLastFourDigitMobileNo", "setAadhaarLastFourDigitMobileNo", "aadhaarLastFourDigitMobileNo", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class UserAdharDetails extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public yg binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public Aadarkyc.DOEkyc aadharData;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhaarLastFourDigitMobileNo = "";

    public static final void E1(UserAdharDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void F1(UserAdharDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void G1(UserAdharDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) ConfirmMobNo.class);
            Aadarkyc.DOEkyc dOEkyc = this$0.aadharData;
            if (dOEkyc == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc = null;
            }
            intent.putExtra("aadharData", dOEkyc);
            intent.putExtra("DLDetails", this$0.C1());
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("aadhaarLastFourDigitMobileNo", this$0.aadhaarLastFourDigitMobileNo);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final yg B1() {
        yg ygVar = this.binding;
        if (ygVar != null) {
            return ygVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final DldetobjX C1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final wa3 D1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void H1(yg ygVar) {
        Intrinsics.checkNotNullParameter(ygVar, "<set-?>");
        this.binding = ygVar;
    }

    public final void I1(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void J1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void K1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yg ygVarX = yg.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ygVarX, "inflate(...)");
        H1(ygVarX);
        setContentView(B1().m());
        K1(new wl5(this));
        J1(new wa3(this));
        B1().f0.g.setText(D1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        B1().f0.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sr6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAdharDetails.E1(this.a, view);
            }
        });
        try {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("aadharData");
            Intrinsics.checkNotNull(parcelableExtra);
            this.aadharData = (Aadarkyc.DOEkyc) parcelableExtra;
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            I1((DldetobjX) serializableExtra);
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            this.aadhaarLastFourDigitMobileNo = String.valueOf(getIntent().getStringExtra("aadhaarLastFourDigitMobileNo"));
            B1().a0.setText(D1().b("dl_no", "DL No. : ") + ' ' + C1().getBioObj().getBioDlno());
            AppCompatTextView appCompatTextView = B1().Z;
            Aadarkyc.DOEkyc dOEkyc = this.aadharData;
            Aadarkyc.DOEkyc dOEkyc2 = null;
            if (dOEkyc == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc = null;
            }
            String name = dOEkyc.getName();
            Intrinsics.checkNotNull(name);
            appCompatTextView.setText(StringsKt__StringsKt.trim((CharSequence) name).toString());
            AppCompatTextView appCompatTextView2 = B1().c0;
            Aadarkyc.DOEkyc dOEkyc3 = this.aadharData;
            if (dOEkyc3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc3 = null;
            }
            appCompatTextView2.setText(dOEkyc3.getDob());
            AppCompatTextView appCompatTextView3 = B1().e0;
            Aadarkyc.DOEkyc dOEkyc4 = this.aadharData;
            if (dOEkyc4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc4 = null;
            }
            appCompatTextView3.setText(StringsKt__StringsKt.trim((CharSequence) dOEkyc4.getCareOf()).toString());
            Aadarkyc.DOEkyc dOEkyc5 = this.aadharData;
            if (dOEkyc5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc5 = null;
            }
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) dOEkyc5.getGender()).toString(), "M")) {
                B1().d0.setText("Male");
            } else {
                B1().d0.setText("Female");
            }
            Aadarkyc.DOEkyc dOEkyc6 = this.aadharData;
            if (dOEkyc6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc6 = null;
            }
            String house = dOEkyc6.getHouse();
            if (house == null || house.length() == 0) {
                B1().L.setText("NA");
            } else {
                AppCompatTextView appCompatTextView4 = B1().L;
                Aadarkyc.DOEkyc dOEkyc7 = this.aadharData;
                if (dOEkyc7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                    dOEkyc7 = null;
                }
                String house2 = dOEkyc7.getHouse();
                Intrinsics.checkNotNull(house2);
                appCompatTextView4.setText(StringsKt__StringsKt.trim((CharSequence) house2).toString());
            }
            Aadarkyc.DOEkyc dOEkyc8 = this.aadharData;
            if (dOEkyc8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc8 = null;
            }
            String street = dOEkyc8.getStreet();
            if (street == null || street.length() == 0) {
                B1().W.setText("NA");
            } else {
                AppCompatTextView appCompatTextView5 = B1().W;
                Aadarkyc.DOEkyc dOEkyc9 = this.aadharData;
                if (dOEkyc9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                    dOEkyc9 = null;
                }
                String street2 = dOEkyc9.getStreet();
                Intrinsics.checkNotNull(street2);
                appCompatTextView5.setText(StringsKt__StringsKt.trim((CharSequence) street2).toString());
            }
            Aadarkyc.DOEkyc dOEkyc10 = this.aadharData;
            if (dOEkyc10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc10 = null;
            }
            String localityIfAny = dOEkyc10.getLocalityIfAny();
            if (localityIfAny == null || localityIfAny.length() == 0) {
                B1().P.setText("NA");
            } else {
                AppCompatTextView appCompatTextView6 = B1().P;
                Aadarkyc.DOEkyc dOEkyc11 = this.aadharData;
                if (dOEkyc11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                    dOEkyc11 = null;
                }
                String localityIfAny2 = dOEkyc11.getLocalityIfAny();
                Intrinsics.checkNotNull(localityIfAny2);
                appCompatTextView6.setText(StringsKt__StringsKt.trim((CharSequence) localityIfAny2).toString());
            }
            Aadarkyc.DOEkyc dOEkyc12 = this.aadharData;
            if (dOEkyc12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc12 = null;
            }
            String landMark = dOEkyc12.getLandMark();
            if (landMark == null || landMark.length() == 0) {
                B1().N.setText("NA");
            } else {
                AppCompatTextView appCompatTextView7 = B1().N;
                Aadarkyc.DOEkyc dOEkyc13 = this.aadharData;
                if (dOEkyc13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                    dOEkyc13 = null;
                }
                String landMark2 = dOEkyc13.getLandMark();
                Intrinsics.checkNotNull(landMark2);
                appCompatTextView7.setText(StringsKt__StringsKt.trim((CharSequence) landMark2).toString());
            }
            Aadarkyc.DOEkyc dOEkyc14 = this.aadharData;
            if (dOEkyc14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc14 = null;
            }
            String villageTownCity = dOEkyc14.getVillageTownCity();
            if (villageTownCity == null || villageTownCity.length() == 0) {
                B1().Y.setText("NA");
            } else {
                AppCompatTextView appCompatTextView8 = B1().Y;
                Aadarkyc.DOEkyc dOEkyc15 = this.aadharData;
                if (dOEkyc15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                    dOEkyc15 = null;
                }
                String villageTownCity2 = dOEkyc15.getVillageTownCity();
                Intrinsics.checkNotNull(villageTownCity2);
                appCompatTextView8.setText(StringsKt__StringsKt.trim((CharSequence) villageTownCity2).toString());
            }
            Aadarkyc.DOEkyc dOEkyc16 = this.aadharData;
            if (dOEkyc16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc16 = null;
            }
            String pincode = dOEkyc16.getPincode();
            if (pincode == null || pincode.length() == 0) {
                B1().S.setText("NA");
            } else {
                AppCompatTextView appCompatTextView9 = B1().S;
                Aadarkyc.DOEkyc dOEkyc17 = this.aadharData;
                if (dOEkyc17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                    dOEkyc17 = null;
                }
                String pincode2 = dOEkyc17.getPincode();
                Intrinsics.checkNotNull(pincode2);
                appCompatTextView9.setText(StringsKt__StringsKt.trim((CharSequence) pincode2).toString());
            }
            Aadarkyc.DOEkyc dOEkyc18 = this.aadharData;
            if (dOEkyc18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc18 = null;
            }
            String dist = dOEkyc18.getDist();
            if (dist == null || dist.length() == 0) {
                B1().j0.setText("NA");
            } else {
                AppCompatTextView appCompatTextView10 = B1().j0;
                Aadarkyc.DOEkyc dOEkyc19 = this.aadharData;
                if (dOEkyc19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                    dOEkyc19 = null;
                }
                String dist2 = dOEkyc19.getDist();
                Intrinsics.checkNotNull(dist2);
                appCompatTextView10.setText(StringsKt__StringsKt.trim((CharSequence) dist2).toString());
            }
            Aadarkyc.DOEkyc dOEkyc20 = this.aadharData;
            if (dOEkyc20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc20 = null;
            }
            String state = dOEkyc20.getState();
            if (state == null || state.length() == 0) {
                B1().k0.setText("NA");
            } else {
                AppCompatTextView appCompatTextView11 = B1().k0;
                Aadarkyc.DOEkyc dOEkyc21 = this.aadharData;
                if (dOEkyc21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                    dOEkyc21 = null;
                }
                String state2 = dOEkyc21.getState();
                Intrinsics.checkNotNull(state2);
                appCompatTextView11.setText(StringsKt__StringsKt.trim((CharSequence) state2).toString());
            }
            Aadarkyc.DOEkyc dOEkyc22 = this.aadharData;
            if (dOEkyc22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                dOEkyc22 = null;
            }
            String pht = dOEkyc22.getPht();
            if (pht == null || pht.length() == 0) {
                B1().F.setVisibility(8);
                B1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tr6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UserAdharDetails.F1(this.a, view);
                    }
                });
            } else {
                Aadarkyc.DOEkyc dOEkyc23 = this.aadharData;
                if (dOEkyc23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                    dOEkyc23 = null;
                }
                if (Intrinsics.areEqual(dOEkyc23.getPht(), "")) {
                    B1().F.setVisibility(8);
                    B1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tr6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UserAdharDetails.F1(this.a, view);
                        }
                    });
                } else {
                    B1().F.setVisibility(0);
                    ImageView imageView = B1().z;
                    Aadarkyc.DOEkyc dOEkyc24 = this.aadharData;
                    if (dOEkyc24 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("aadharData");
                    } else {
                        dOEkyc2 = dOEkyc24;
                    }
                    imageView.setImageBitmap(kt6.a(dOEkyc2.getPht()));
                    B1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tr6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UserAdharDetails.F1(this.a, view);
                        }
                    });
                }
            }
        } catch (Exception unused) {
        }
        B1().C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ur6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAdharDetails.G1(this.a, view);
            }
        });
    }
}
