package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.zepto.co;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public abstract class co {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void c(Ref.ObjectRef dialog, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            ((Dialog) dialog.element).dismiss();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [T, android.app.Dialog] */
        public final void b(Context context, ArrayList arrayList, ArrayList arrayList2) {
            Intrinsics.checkNotNullParameter(context, "context");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? dialog = new Dialog(context);
            objectRef.element = dialog;
            dialog.requestWindowFeature(1);
            ((Dialog) objectRef.element).setContentView(R.layout.activity_alert_box_without_button);
            Window window = ((Dialog) objectRef.element).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) ((Dialog) objectRef.element).findViewById(R.id.btnClose);
            RecyclerView recyclerView = (RecyclerView) ((Dialog) objectRef.element).findViewById(R.id.impound_list_alert);
            ao aoVar = new ao(context, arrayList, arrayList2);
            recyclerView.l0();
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(aoVar);
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    co.a.c(objectRef, view);
                }
            });
            ((Dialog) objectRef.element).show();
        }
    }
}
