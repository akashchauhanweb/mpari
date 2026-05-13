package com.zepto;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.AddContactScreen;
import com.nic.mparivahan.Sos.SModle.MparSosContact;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zx0 extends RecyclerView.h {
    public ArrayList d;
    public HashMap e;
    public final AddContactScreen f;

    public static final class a extends RecyclerView.d0 {
        public final ImageView u;
        public final ImageView v;
        public final TextView w;
        public final TextView x;
        public final TextView y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.update);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.delet);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (ImageView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.full_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.phone_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.relation_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (TextView) viewFindViewById5;
        }

        public final ImageView O() {
            return this.v;
        }

        public final TextView P() {
            return this.w;
        }

        public final TextView Q() {
            return this.x;
        }

        public final TextView R() {
            return this.y;
        }

        public final ImageView S() {
            return this.u;
        }
    }

    public zx0(ArrayList contactlist, HashMap relationMasterHashMap, AddContactScreen addContact) {
        Intrinsics.checkNotNullParameter(contactlist, "contactlist");
        Intrinsics.checkNotNullParameter(relationMasterHashMap, "relationMasterHashMap");
        Intrinsics.checkNotNullParameter(addContact, "addContact");
        this.d = contactlist;
        this.e = relationMasterHashMap;
        this.f = addContact;
    }

    public static final void E(zx0 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f.z1(i, ((MparSosContact) this$0.d.get(i)).getSoscRecordId());
    }

    public static final void F(zx0 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AddContactScreen addContactScreen = this$0.f;
        Integer numValueOf = Integer.valueOf(i);
        Object obj = this$0.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        addContactScreen.A1(numValueOf, (MparSosContact) obj);
    }

    public final int C() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            if (String.valueOf(((MparSosContact) this.d.get(i)).getSoscStatus()).equals(VContant.MAINSCREEN)) {
                String soscName = ((MparSosContact) this.d.get(i)).getSoscName();
                String soscMobile = ((MparSosContact) this.d.get(i)).getSoscMobile();
                holder.P().setText(soscName.toString());
                holder.Q().setText(soscMobile.toString());
                holder.R().setText(" (" + ((String) this.e.get(Integer.valueOf(((MparSosContact) this.d.get(i)).getSoscRelation()))) + ')');
                holder.O().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xx0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        zx0.E(this.a, i, view);
                    }
                });
                holder.S().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yx0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        zx0.F(this.a, i, view);
                    }
                });
            }
        } catch (Exception e) {
            Log.e("AdapterEoor", e.toString());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void H(int i) {
        this.d.remove(i);
        n(i);
        m(i, this.d.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
