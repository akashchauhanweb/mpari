package com.nic.mparivahan.Dashboard;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.a;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.d12;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final C0049a a = new C0049a(null);

    /* JADX INFO: renamed from: com.nic.mparivahan.Dashboard.a$a, reason: collision with other inner class name */
    public static final class C0049a {
        public C0049a() {
        }

        public /* synthetic */ C0049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void e(Dialog d, View view) {
            Intrinsics.checkNotNullParameter(d, "$d");
            d.dismiss();
        }

        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isActive", VContant.MAINSCREEN);
            jSONObject.put("s4Enabled", VContant.MAINSCREEN);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparState", jSONObject);
            return jSONObject2;
        }

        public final JSONObject c() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isActive", VContant.MAINSCREEN);
            jSONObject.put("v4Enabled", VContant.MAINSCREEN);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparState", jSONObject);
            return jSONObject2;
        }

        public final void d(Context context, ArrayList list) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(list, "list");
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.pop_vahan_sarthi_statelist);
            dialog.setCanceledOnTouchOutside(true);
            dialog.setCancelable(true);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.state_list);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            View viewFindViewById2 = dialog.findViewById(R.id.cross_button);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
            ((LinearLayout) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vt6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.C0049a.e(dialog, view);
                }
            });
            recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            recyclerView.setAdapter(new d12(list, context));
            dialog.show();
        }
    }
}
