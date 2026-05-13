package com.zepto;

import android.content.Context;
import android.util.Log;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.TaxCalModleItem;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class id6 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(ArrayList taxCalModeItem) {
            Intrinsics.checkNotNullParameter(taxCalModeItem, "taxCalModeItem");
            ArrayList arrayList = new ArrayList();
            String pur_CD = "";
            if (taxCalModeItem.size() <= 0) {
                return "";
            }
            int size = taxCalModeItem.size();
            for (int i = 0; i < size; i++) {
                pur_CD = ((TaxCalModleItem) taxCalModeItem.get(i)).getPur_CD();
                arrayList.add(StringsKt__StringsKt.trim((CharSequence) String.valueOf(pur_CD)).toString());
            }
            return arrayList.size() > 1 ? CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) : String.valueOf(pur_CD);
        }

        public final String b(ArrayList taxCalModeItem) {
            Intrinsics.checkNotNullParameter(taxCalModeItem, "taxCalModeItem");
            Log.e("TaxMode---> ", taxCalModeItem.toString());
            ArrayList arrayList = new ArrayList();
            String tax_MODE = "";
            if (taxCalModeItem.size() <= 0) {
                return "";
            }
            int size = taxCalModeItem.size();
            for (int i = 0; i < size; i++) {
                tax_MODE = ((TaxCalModleItem) taxCalModeItem.get(i)).getTax_MODE();
                arrayList.add(((TaxCalModleItem) taxCalModeItem.get(i)).getPur_CD() + '-' + StringsKt__StringsKt.trim((CharSequence) String.valueOf(tax_MODE)).toString());
            }
            return arrayList.size() >= 1 ? CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) : String.valueOf(tax_MODE);
        }

        public final ArrayList c() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(6);
            arrayList.add(7);
            arrayList.add(8);
            arrayList.add(9);
            arrayList.add(10);
            arrayList.add(11);
            arrayList.add(12);
            arrayList.add(13);
            arrayList.add(14);
            arrayList.add(15);
            arrayList.add(16);
            arrayList.add(17);
            arrayList.add(18);
            arrayList.add(19);
            arrayList.add(20);
            arrayList.add(21);
            arrayList.add(22);
            arrayList.add(23);
            arrayList.add(24);
            arrayList.add(25);
            arrayList.add(26);
            arrayList.add(27);
            arrayList.add(28);
            arrayList.add(29);
            arrayList.add(30);
            arrayList.add(31);
            arrayList.add(32);
            arrayList.add(33);
            arrayList.add(34);
            arrayList.add(35);
            arrayList.add(36);
            arrayList.add(37);
            arrayList.add(38);
            arrayList.add(39);
            arrayList.add(40);
            arrayList.add(41);
            arrayList.add(42);
            arrayList.add(43);
            arrayList.add(44);
            arrayList.add(45);
            arrayList.add(46);
            arrayList.add(47);
            arrayList.add(48);
            arrayList.add(49);
            arrayList.add(50);
            arrayList.add(51);
            arrayList.add(52);
            arrayList.add(53);
            arrayList.add(54);
            arrayList.add(55);
            arrayList.add(56);
            arrayList.add(57);
            arrayList.add(58);
            arrayList.add(59);
            arrayList.add(60);
            return arrayList;
        }

        public final String d(ArrayList taxCalModeItem, Context context) {
            Intrinsics.checkNotNullParameter(taxCalModeItem, "taxCalModeItem");
            Intrinsics.checkNotNullParameter(context, "context");
            wa3 wa3Var = new wa3(context);
            if (taxCalModeItem.size() <= 0) {
                return "";
            }
            int size = taxCalModeItem.size();
            for (int i = 0; i < size; i++) {
                String tax_MODE = ((TaxCalModleItem) taxCalModeItem.get(i)).getTax_MODE();
                int timePeriod = ((TaxCalModleItem) taxCalModeItem.get(i)).getTimePeriod();
                if (StringsKt__StringsJVMKt.equals(tax_MODE, "Y", true) && timePeriod > 5) {
                    return String.valueOf(wa3Var.b("YEARLY_VALIDATION", context.getString(R.string.yearly_Validation)));
                }
                if (StringsKt__StringsJVMKt.equals(tax_MODE, "M", true) && timePeriod > 60) {
                    return String.valueOf(wa3Var.b("MONTHLY_VALIDATION", context.getString(R.string.monthly_Validation)));
                }
                if (StringsKt__StringsJVMKt.equals(tax_MODE, "Q", true) && timePeriod > 20) {
                    return String.valueOf(wa3Var.b("QUATERLY_VALIDATION", context.getString(R.string.quaterly_Validation)));
                }
            }
            return "";
        }

        public final boolean e(ArrayList taxCalModeItem) {
            Intrinsics.checkNotNullParameter(taxCalModeItem, "taxCalModeItem");
            Log.e("TaxCheck", VContant.MAINSCREEN);
            if (taxCalModeItem.size() > 0) {
                Log.e("TaxCheck", VContant.APPLICATION_SCREEN);
                int size = taxCalModeItem.size();
                for (int i = 0; i < size; i++) {
                    String tax_MODE = ((TaxCalModleItem) taxCalModeItem.get(i)).getTax_MODE();
                    if (StringsKt__StringsJVMKt.equals(tax_MODE, "0", true) || StringsKt__StringsJVMKt.equals(tax_MODE, "Select Tax Mode", true)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final boolean f(ArrayList taxCalModeItem) {
            Intrinsics.checkNotNullParameter(taxCalModeItem, "taxCalModeItem");
            if (taxCalModeItem.size() > 0) {
                int size = taxCalModeItem.size();
                for (int i = 0; i < size; i++) {
                    String tax_MODE = ((TaxCalModleItem) taxCalModeItem.get(i)).getTax_MODE();
                    int timePeriod = ((TaxCalModleItem) taxCalModeItem.get(i)).getTimePeriod();
                    if ((StringsKt__StringsJVMKt.equals(tax_MODE, "Y", true) && timePeriod > 5) || ((StringsKt__StringsJVMKt.equals(tax_MODE, "M", true) && timePeriod > 60) || (StringsKt__StringsJVMKt.equals(tax_MODE, "Q", true) && timePeriod > 20))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
