package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.zepto.np7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public abstract class np7 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void d(Ref.ObjectRef dialog, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            ((Dialog) dialog.element).dismiss();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void e(Ref.ObjectRef dialog, Context context, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            Intrinsics.checkNotNullParameter(context, "$context");
            ((Dialog) dialog.element).dismiss();
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.nic.mparivahan")));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [T, android.app.Dialog] */
        public final void c(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? dialog = new Dialog(context);
            objectRef.element = dialog;
            dialog.requestWindowFeature(1);
            ((Dialog) objectRef.element).setContentView(R.layout.version_update);
            Window window = ((Dialog) objectRef.element).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            TextView textView = (TextView) ((Dialog) objectRef.element).findViewById(R.id.close);
            TextView textView2 = (TextView) ((Dialog) objectRef.element).findViewById(R.id.update);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lp7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    np7.a.d(objectRef, view);
                }
            });
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mp7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    np7.a.e(objectRef, context, view);
                }
            });
            ((Dialog) objectRef.element).show();
        }
    }
}
