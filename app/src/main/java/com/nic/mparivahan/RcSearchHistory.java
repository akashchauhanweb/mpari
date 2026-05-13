package com.nic.mparivahan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.SearchDL;
import com.nic.mparivahan.RC.Model.RecentSearch;
import com.nic.mparivahan.RC.SearchRC;
import com.nic.mparivahan.RcSearchHistory;
import com.zepto.c65;
import com.zepto.d65;
import com.zepto.pq;
import com.zepto.tb0;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.y55;
import com.zepto.zf;
import java.text.ParseException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b:\u0010;J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0015\u001a\u00020\u0004R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u000e\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/nic/mparivahan/RcSearchHistory;", "Lcom/zepto/pq;", "Lcom/zepto/tb0;", "Lcom/zepto/d65;", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "A1", "C1", "", "searchNumber", "u", "I", "M", "x", "Landroid/content/Context;", "context", "x1", "u1", "r1", "Lcom/zepto/zf;", "C", "Lcom/zepto/zf;", "binding", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "D", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "o1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "B1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/RecentSearch;", "E", "Ljava/util/ArrayList;", "p1", "()Ljava/util/ArrayList;", "D1", "(Ljava/util/ArrayList;)V", "recentSearchList", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "E1", "(Lcom/zepto/wa3;)V", "session", "", "G", "getFlag", "()I", "setFlag", "(I)V", "flag", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class RcSearchHistory extends pq implements tb0, d65 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public zf binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ArrayList recentSearchList;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public int flag = 1;

    public static final void s1(RcSearchHistory this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.flag == 1) {
            this$0.u1(this$0);
        } else {
            this$0.x1(this$0);
        }
    }

    public static final void t1(RcSearchHistory this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void v1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void w1(Dialog d, RcSearchHistory this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        if (this$0.o1().I0("RC") != null) {
            ArrayList arrayListI0 = this$0.o1().I0("RC");
            Intrinsics.checkNotNullExpressionValue(arrayListI0, "getRecentSearch(...)");
            this$0.D1(arrayListI0);
            zf zfVar = null;
            if (this$0.p1() != null || !this$0.p1().isEmpty()) {
                int size = this$0.p1().size();
                for (int i = 0; i < size; i++) {
                    try {
                        this$0.o1().x0(((RecentSearch) this$0.p1().get(i)).getSearchNumber(), "RC");
                        zf zfVar2 = this$0.binding;
                        if (zfVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            zfVar2 = null;
                        }
                        zfVar2.b.setVisibility(8);
                        this$0.r1();
                    } catch (Exception unused) {
                    }
                }
                this$0.p1().clear();
            }
            zf zfVar3 = this$0.binding;
            if (zfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zfVar = zfVar3;
            }
            zfVar.j.setVisibility(8);
        }
    }

    public static final void y1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void z1(Dialog d, RcSearchHistory this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        if (this$0.o1().I0("DL") != null) {
            ArrayList arrayListI0 = this$0.o1().I0("DL");
            Intrinsics.checkNotNullExpressionValue(arrayListI0, "getRecentSearch(...)");
            this$0.D1(arrayListI0);
            zf zfVar = null;
            if (this$0.p1() != null || !this$0.p1().isEmpty()) {
                int size = this$0.p1().size();
                for (int i = 0; i < size; i++) {
                    try {
                        this$0.o1().x0(((RecentSearch) this$0.p1().get(i)).getSearchNumber(), "DL");
                        zf zfVar2 = this$0.binding;
                        if (zfVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            zfVar2 = null;
                        }
                        zfVar2.b.setVisibility(8);
                        this$0.r1();
                    } catch (Exception unused) {
                    }
                }
                this$0.p1().clear();
            }
            zf zfVar3 = this$0.binding;
            if (zfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zfVar = zfVar3;
            }
            zfVar.c.setVisibility(8);
        }
    }

    public final void A1() {
        try {
            zf zfVar = null;
            if (o1().I0("DL") == null) {
                zf zfVar2 = this.binding;
                if (zfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar2 = null;
                }
                zfVar2.c.setVisibility(8);
                zf zfVar3 = this.binding;
                if (zfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar3 = null;
                }
                zfVar3.j.setVisibility(8);
                zf zfVar4 = this.binding;
                if (zfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    zfVar = zfVar4;
                }
                zfVar.b.setVisibility(8);
                r1();
                return;
            }
            zf zfVar5 = this.binding;
            if (zfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zfVar5 = null;
            }
            zfVar5.c.setVisibility(0);
            zf zfVar6 = this.binding;
            if (zfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zfVar6 = null;
            }
            zfVar6.j.setVisibility(8);
            zf zfVar7 = this.binding;
            if (zfVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zfVar7 = null;
            }
            zfVar7.m.setVisibility(8);
            ArrayList arrayListI0 = o1().I0("DL");
            Intrinsics.checkNotNullExpressionValue(arrayListI0, "getRecentSearch(...)");
            D1(arrayListI0);
            if (p1() != null) {
                zf zfVar8 = this.binding;
                if (zfVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar8 = null;
                }
                zfVar8.b.setVisibility(0);
                zf zfVar9 = this.binding;
                if (zfVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar9 = null;
                }
                zfVar9.k.setLayoutManager(new LinearLayoutManager(this));
                y55 y55Var = new y55(this, p1(), this);
                zf zfVar10 = this.binding;
                if (zfVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    zfVar = zfVar10;
                }
                zfVar.k.setAdapter(y55Var);
                y55Var.j();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public final void B1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void C1() {
        try {
            DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
            Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
            B1(databaseHelperD0);
            zf zfVar = null;
            if (o1().I0("RC") == null) {
                r1();
                zf zfVar2 = this.binding;
                if (zfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar2 = null;
                }
                zfVar2.j.setVisibility(8);
                zf zfVar3 = this.binding;
                if (zfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar3 = null;
                }
                zfVar3.c.setVisibility(8);
                zf zfVar4 = this.binding;
                if (zfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    zfVar = zfVar4;
                }
                zfVar.b.setVisibility(8);
                return;
            }
            zf zfVar5 = this.binding;
            if (zfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zfVar5 = null;
            }
            zfVar5.j.setVisibility(0);
            zf zfVar6 = this.binding;
            if (zfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zfVar6 = null;
            }
            zfVar6.c.setVisibility(8);
            zf zfVar7 = this.binding;
            if (zfVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zfVar7 = null;
            }
            zfVar7.b.setVisibility(0);
            zf zfVar8 = this.binding;
            if (zfVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zfVar8 = null;
            }
            zfVar8.m.setVisibility(8);
            ArrayList arrayListI0 = o1().I0("RC");
            Intrinsics.checkNotNullExpressionValue(arrayListI0, "getRecentSearch(...)");
            D1(arrayListI0);
            if (p1() != null) {
                zf zfVar9 = this.binding;
                if (zfVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar9 = null;
                }
                zfVar9.b.setVisibility(0);
                zf zfVar10 = this.binding;
                if (zfVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar10 = null;
                }
                zfVar10.l.setLayoutManager(new LinearLayoutManager(this));
                c65 c65Var = new c65(this, p1(), this);
                zf zfVar11 = this.binding;
                if (zfVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    zfVar = zfVar11;
                }
                zfVar.l.setAdapter(c65Var);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public final void D1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.recentSearchList = arrayList;
    }

    public final void E1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    @Override // com.zepto.d65
    public void I(String searchNumber) {
        try {
            o1().d0(searchNumber);
            A1();
        } catch (Exception unused) {
        }
    }

    @Override // com.zepto.tb0
    public void M(String searchNumber) {
        if (searchNumber == null || searchNumber.length() == 0) {
            return;
        }
        if (!a.a.a(this)) {
            Toast.makeText(this, getString(R.string.kindly_check_your_internet_connection), 0).show();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) SearchRC.class);
        intent.putExtra("RC_Number", searchNumber);
        startActivity(intent);
    }

    public final DatabaseHelper o1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_dashboard);
        zf zfVarC = zf.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(zfVarC, "inflate(...)");
        this.binding = zfVarC;
        zf zfVar = null;
        if (zfVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zfVarC = null;
        }
        setContentView(zfVarC.b());
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        B1(databaseHelperD0);
        E1(new wa3(this));
        zf zfVar2 = this.binding;
        if (zfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zfVar2 = null;
        }
        zfVar2.b.setText(q1().b("clear_all", "Clear All"));
        try {
            int intExtra = getIntent().getIntExtra("RC", 0);
            this.flag = intExtra;
            if (intExtra == 1) {
                zf zfVar3 = this.binding;
                if (zfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar3 = null;
                }
                zfVar3.e.setText(q1().b("Vehicle_Search_History", "Vehicle Search History"));
                C1();
            } else {
                zf zfVar4 = this.binding;
                if (zfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar4 = null;
                }
                zfVar4.e.setText(q1().b("Driving_Licence_Search_History", "Driving Licence Search History"));
                A1();
            }
            zf zfVar5 = this.binding;
            if (zfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zfVar5 = null;
            }
            zfVar5.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t45
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RcSearchHistory.s1(this.a, view);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        zf zfVar6 = this.binding;
        if (zfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            zfVar = zfVar6;
        }
        zfVar.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RcSearchHistory.t1(this.a, view);
            }
        });
    }

    public final ArrayList p1() {
        ArrayList arrayList = this.recentSearchList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recentSearchList");
        return null;
    }

    public final wa3 q1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void r1() {
        try {
            zf zfVar = this.binding;
            zf zfVar2 = null;
            if (zfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zfVar = null;
            }
            zfVar.m.setVisibility(0);
            int i = this.flag;
            if (i == 1) {
                zf zfVar3 = this.binding;
                if (zfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zfVar3 = null;
                }
                TextView textView = zfVar3.i;
                wa3 wa3VarQ1 = q1();
                va3.a aVar = va3.a;
                textView.setText(wa3VarQ1.b(aVar.R(), "There is no Search(s) History \nfound for your account."));
                zf zfVar4 = this.binding;
                if (zfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    zfVar2 = zfVar4;
                }
                zfVar2.f.setText(q1().b(aVar.N(), "No History Found."));
                return;
            }
            if (i != 2) {
                return;
            }
            zf zfVar5 = this.binding;
            if (zfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zfVar5 = null;
            }
            TextView textView2 = zfVar5.i;
            wa3 wa3VarQ12 = q1();
            va3.a aVar2 = va3.a;
            textView2.setText(wa3VarQ12.b(aVar2.R(), "There is no Search(s) History \nfound for your account."));
            zf zfVar6 = this.binding;
            if (zfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zfVar2 = zfVar6;
            }
            zfVar2.f.setText(q1().b(aVar2.N(), "No History Found."));
        } catch (Exception unused) {
        }
    }

    @Override // com.zepto.d65
    public void u(String searchNumber) {
        if (!a.a.a(this)) {
            Toast.makeText(this, getString(R.string.kindly_check_your_internet_connection), 0).show();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) SearchDL.class);
        intent.putExtra("DLNumber", searchNumber);
        startActivity(intent);
    }

    public final void u1(Context context) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_history);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        MyTextView myTextView = (MyTextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.ok_dlt);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        MyTextView myTextView2 = (MyTextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_msg);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(q1().b("clear_all_history", "Are you sure you want to delete all the search history ?"));
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(q1().b("nex_parivahan", "NextGen mParivahan"));
        myTextView2.setText(q1().b("btn_ok", "OK"));
        myTextView.setText(q1().b("button_cancel", "Cancel"));
        myTextView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RcSearchHistory.v1(dialog, view);
            }
        });
        myTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RcSearchHistory.w1(dialog, this, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.tb0
    public void x(String searchNumber) {
        try {
            o1().d0(searchNumber);
            C1();
        } catch (Exception unused) {
        }
    }

    public final void x1(Context context) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_history);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        View viewFindViewById2 = dialog.findViewById(R.id.ok_dlt);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.tv_msg);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((MyTextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RcSearchHistory.y1(dialog, view);
            }
        });
        ((MyTextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RcSearchHistory.z1(dialog, this, view);
            }
        });
        dialog.show();
    }
}
