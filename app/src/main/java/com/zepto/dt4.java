package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.nic.mparivahan.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dt4 {
    public static final void d(PopupWindow popupWindow, View view) {
        Intrinsics.checkNotNullParameter(popupWindow, "$popupWindow");
        popupWindow.dismiss();
    }

    public static final boolean e(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(popupWindow, "$popupWindow");
        popupWindow.dismiss();
        return true;
    }

    public final void c(View view, String imgUrl, String base64, Context context) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        Intrinsics.checkNotNullParameter(base64, "base64");
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = view.getContext().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dl_renewal_custom_popup_image_display, (ViewGroup) null);
        final PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -1, true);
        popupWindow.showAtLocation(view, 17, 0, 0);
        View viewFindViewById = viewInflate.findViewById(R.id.picture_of_doc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        if (imgUrl.length() > 0) {
            hz0.a.O(context).k(imgUrl).h(imageView);
        } else {
            imageView.setImageBitmap(st6.c(base64));
        }
        ((Button) viewInflate.findViewById(R.id.messageButton)).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dt4.d(popupWindow, view2);
            }
        });
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: com.zepto.ct4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return dt4.e(popupWindow, view2, motionEvent);
            }
        });
    }
}
