package com.nic.mparivahan.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.nic.mparivahan.Dashboard.SearchDashboard;
import com.nic.mparivahan.Dl.SearchDL;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.SearchRC;
import com.zepto.pq;
import com.zepto.zf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/nic/mparivahan/Dashboard/SearchDashboard;", "Lcom/zepto/pq;", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "selection", "value", "k1", "Lcom/zepto/zf;", "C", "Lcom/zepto/zf;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SearchDashboard extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public zf binding;

    public static final void j1(SearchDashboard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void k1(String selection, String value) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(value, "value");
        if (selection.equals("DL001")) {
            Intent intent = new Intent(this, (Class<?>) SearchDL.class);
            intent.putExtra("DLNumber", value);
            startActivity(intent);
            finish();
        }
        if (selection.equals("INS002")) {
            Intent intent2 = new Intent(this, (Class<?>) SearchRC.class);
            intent2.putExtra("RC_Number", value);
            intent2.putExtra("RCSERVICE", "INS002");
            finish();
        }
        if (selection.equals("PUCC003")) {
            Intent intent3 = new Intent(this, (Class<?>) SearchRC.class);
            intent3.putExtra("RC_Number", value);
            intent3.putExtra("RCSERVICE", "PUCC003");
            finish();
        }
        if (selection.equals("RC001")) {
            new Intent(this, (Class<?>) SearchRC.class).putExtra("RC_Number", value);
            finish();
        }
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
        Log.e("Text", "3");
        if (getIntent() != null) {
            k1(String.valueOf(getIntent().getStringExtra("RCSERVICE")), String.valueOf(getIntent().getStringExtra("Value")));
        }
        zf zfVar2 = this.binding;
        if (zfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            zfVar = zfVar2;
        }
        zfVar.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDashboard.j1(this.a, view);
            }
        });
    }
}
