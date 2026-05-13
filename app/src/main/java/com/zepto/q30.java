package com.zepto;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q30 implements Parcelable {
    public static final Parcelable.Creator<q30> CREATOR = new a();
    public final List c;
    public final List e;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q30 createFromParcel(Parcel parcel) {
            return new q30(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q30[] newArray(int i) {
            return new q30[i];
        }
    }

    public q30(List list, List list2) {
        this.c = list;
        this.e = list2;
    }

    public List c(mg2 mg2Var, Map map) {
        HashMap map2 = new HashMap(this.c.size());
        for (String str : this.c) {
            sf2 sf2Var = (sf2) map.get(str);
            if (sf2Var != null) {
                map2.put(sf2Var.f, sf2Var);
            } else {
                Bundle bundleB = mg2Var.u0().B(str, null);
                if (bundleB != null) {
                    ClassLoader classLoader = mg2Var.w0().f().getClassLoader();
                    sf2 sf2VarC = ((xg2) bundleB.getParcelable("state")).c(mg2Var.t0(), classLoader);
                    sf2VarC.b = bundleB;
                    if (bundleB.getBundle("savedInstanceState") == null) {
                        sf2VarC.b.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleB.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    sf2VarC.L1(bundle);
                    map2.put(sf2VarC.f, sf2VarC);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            arrayList.add(((p30) it.next()).e(mg2Var, map2));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.c);
        parcel.writeTypedList(this.e);
    }

    public q30(Parcel parcel) {
        this.c = parcel.createStringArrayList();
        this.e = parcel.createTypedArrayList(p30.CREATOR);
    }
}
