package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import ai.protectt.app.security.recyclerviewhelper.RecyclerViewInteractor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zepto.jt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e41 extends RecyclerView.h {
    public static final a m = new a(null);
    public static e41 n;
    public final List d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final ArrayList l;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e41 a() {
            return e41.n;
        }

        public final boolean b(md5 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            try {
            } catch (Exception e) {
                nn3.c(nn3.a, "CustomAdapters", e.toString(), null, 4, null);
            }
            return CollectionsKt___CollectionsKt.contains(CollectionsKt__CollectionsKt.arrayListOf(30, 25, 44, 41, 31, 24, 35, 5, 224, 217), response.getVulnerabilityCode());
        }

        public final void c(md5 itemData, List data) {
            Intrinsics.checkNotNullParameter(itemData, "itemData");
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                int size = data.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
                    e41 e41VarV = aVar.v();
                    Intrinsics.checkNotNull(e41VarV);
                    e41VarV.n(i);
                    e41 e41VarV2 = aVar.v();
                    Intrinsics.checkNotNull(e41VarV2);
                    e41VarV2.m(i, data.size());
                    e41 e41VarV3 = aVar.v();
                    Intrinsics.checkNotNull(e41VarV3);
                    e41VarV3.j();
                    if (Intrinsics.areEqual(itemData.getVulnerabilityCode(), ((md5) data.get(i)).getVulnerabilityCode())) {
                        e41 e41VarV4 = aVar.v();
                        Intrinsics.checkNotNull(e41VarV4);
                        e41VarV4.j();
                        e41 e41VarV5 = aVar.v();
                        Intrinsics.checkNotNull(e41VarV5);
                        e41VarV5.m(i, data.size());
                        e41 e41VarA = a();
                        Intrinsics.checkNotNull(e41VarA);
                        e41VarA.K(i, itemData);
                        return;
                    }
                    i = i2;
                }
            } catch (Exception e) {
                nn3.c(nn3.a, "CustomAdapters", e.toString(), null, 4, null);
            }
        }
    }

    public static final class b extends RecyclerView.d0 {
        public TextView u;
        public TextView v;
        public Button w;
        public ImageView x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View itemView, ArrayList IDs) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(IDs, "IDs");
            Object obj = IDs.get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "IDs[0]");
            View viewFindViewById = itemView.findViewById(((Number) obj).intValue());
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(IDs[0])");
            this.u = (TextView) viewFindViewById;
            Object obj2 = IDs.get(1);
            Intrinsics.checkNotNullExpressionValue(obj2, "IDs[1]");
            View viewFindViewById2 = itemView.findViewById(((Number) obj2).intValue());
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(IDs[1])");
            this.v = (TextView) viewFindViewById2;
            Object obj3 = IDs.get(2);
            Intrinsics.checkNotNullExpressionValue(obj3, "IDs[2]");
            View viewFindViewById3 = itemView.findViewById(((Number) obj3).intValue());
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(IDs[2])");
            this.w = (Button) viewFindViewById3;
            Object obj4 = IDs.get(3);
            Intrinsics.checkNotNullExpressionValue(obj4, "IDs[3]");
            View viewFindViewById4 = itemView.findViewById(((Number) obj4).intValue());
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "itemView.findViewById(IDs[3])");
            this.x = (ImageView) viewFindViewById4;
        }

        public final Button O() {
            return this.w;
        }

        public final ImageView P() {
            return this.x;
        }

        public final TextView Q() {
            return this.u;
        }

        public final TextView R() {
            return this.v;
        }
    }

    public e41(List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.d = data;
        this.e = "CustomAdapters";
        n = this;
        jt.a aVar = jt.c;
        this.f = aVar.C().getResources().getIdentifier("ap_itemview_fixable_issues_for_rv", "layout", aVar.C().getPackageName());
        this.g = aVar.C().getResources().getIdentifier("ap_orange", "color", aVar.C().getPackageName());
        int iD = D("ap_tv_item_view_issue_title");
        this.h = iD;
        int iD2 = D("ap_tv_item_view_short_description");
        this.i = iD2;
        int iD3 = D("ap_btn_item_view_fix_issue");
        this.j = iD3;
        int iD4 = D("ap_iv_info");
        this.k = iD4;
        this.l = CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(iD), Integer.valueOf(iD2), Integer.valueOf(iD3), Integer.valueOf(iD4));
    }

    public static final void F(md5 itemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "$itemsViewModel");
        j70 j70VarK = RecyclerViewInteractor.c.k();
        Intrinsics.checkNotNull(j70VarK);
        j70VarK.a(itemsViewModel);
    }

    public static final void G(e41 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        nn3.a.f(this$0.e, "info clicked");
        j70 j70VarK = RecyclerViewInteractor.c.k();
        Intrinsics.checkNotNull(j70VarK);
        j70VarK.i((md5) this$0.d.get(i));
    }

    public final int D(String str) {
        try {
            jt.a aVar = jt.c;
            return aVar.C().getResources().getIdentifier(str, "id", aVar.C().getPackageName());
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, e.toString(), null, 4, null);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void p(b holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            final md5 md5Var = (md5) this.d.get(i);
            if (Intrinsics.areEqual(md5Var.getVulnerabilityActionRequired(), NativeInteractor.a.e1())) {
                nn3.a.f(this.e, "vulnerabilityCode:-" + md5Var.getVulnerabilityCode() + " vulnerabilityActionRequired" + ((Object) md5Var.getVulnerabilityActionRequired()));
                holder.Q().setText(md5Var.getVulnerabilityTitle());
                holder.R().setText(md5Var.getShortdescription());
                holder.R().setTextColor(jt.c.C().getColor(this.g));
                if (m.b(md5Var)) {
                    holder.O().setVisibility(0);
                    holder.O().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c41
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            e41.F(md5Var, view);
                        }
                    });
                } else {
                    holder.O().setVisibility(8);
                }
                holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d41
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        e41.G(this.a, i, view);
                    }
                });
            }
            RecyclerViewInteractor.c.x();
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, e.toString(), null, 4, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(this.f, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new b(view, this.l);
    }

    public final void I(int i) {
        try {
            jt.a aVar = jt.c;
            if (aVar.K().contains(Integer.valueOf(i))) {
                aVar.K().remove(Integer.valueOf(i));
            }
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, e.toString(), null, 4, null);
        }
    }

    public final void J(md5 itemData) {
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        try {
            int size = this.d.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
                e41 e41VarV = aVar.v();
                Intrinsics.checkNotNull(e41VarV);
                e41VarV.n(i);
                e41 e41VarV2 = aVar.v();
                Intrinsics.checkNotNull(e41VarV2);
                e41VarV2.m(i, this.d.size());
                e41 e41VarV3 = aVar.v();
                Intrinsics.checkNotNull(e41VarV3);
                e41VarV3.j();
                if (Intrinsics.areEqual(itemData.getVulnerabilityCode(), ((md5) this.d.get(i)).getVulnerabilityCode())) {
                    e41 e41VarV4 = aVar.v();
                    Intrinsics.checkNotNull(e41VarV4);
                    e41VarV4.j();
                    e41 e41VarV5 = aVar.v();
                    Intrinsics.checkNotNull(e41VarV5);
                    e41VarV5.m(i, this.d.size());
                    e41 e41Var = n;
                    Intrinsics.checkNotNull(e41Var);
                    e41Var.K(i, itemData);
                    return;
                }
                i = i2;
            }
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, e.toString(), null, 4, null);
        }
    }

    public final void K(int i, md5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        try {
            this.d.remove(i);
            n(i);
            m(i, this.d.size());
            RecyclerViewInteractor.a aVar = RecyclerViewInteractor.c;
            if (aVar.p().size() == 0) {
                com.google.android.material.bottomsheet.a aVarL = aVar.l();
                Intrinsics.checkNotNull(aVarL);
                if (aVarL.isShowing()) {
                    com.google.android.material.bottomsheet.a aVarL2 = aVar.l();
                    Intrinsics.checkNotNull(aVarL2);
                    aVarL2.dismiss();
                }
            }
            Integer vulnerabilityCode = item.getVulnerabilityCode();
            Intrinsics.checkNotNull(vulnerabilityCode);
            I(vulnerabilityCode.intValue());
            if (aVar.t() != null) {
                RecyclerView recyclerViewT = aVar.t();
                Intrinsics.checkNotNull(recyclerViewT);
                recyclerViewT.setItemViewCacheSize(1000);
            }
            n(i);
            m(i, this.d.size());
        } catch (Exception e) {
            nn3.c(nn3.a, this.e, e.toString(), null, 4, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
