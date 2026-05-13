package com.zepto;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.zepto.ly0;

/* JADX INFO: loaded from: classes.dex */
public abstract class wy2 {

    public class a extends InputConnectionWrapper {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z, b bVar) {
            super(inputConnection, z);
            this.a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.a.a(xy2.f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    public interface b {
        boolean a(xy2 xy2Var, int i, Bundle bundle);
    }

    public static b b(final View view) {
        lu4.g(view);
        return new b() { // from class: com.zepto.vy2
            @Override // com.zepto.wy2.b
            public final boolean a(xy2 xy2Var, int i, Bundle bundle) {
                return wy2.e(view, xy2Var, i, bundle);
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        lf4.d(inputConnection, "inputConnection must be non-null");
        lf4.d(editorInfo, "editorInfo must be non-null");
        lf4.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }

    public static /* synthetic */ boolean e(View view, xy2 xy2Var, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                xy2Var.d();
                InputContentInfo inputContentInfo = (InputContentInfo) xy2Var.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        return dq7.g0(view, new ly0.a(new ClipData(xy2Var.b(), new ClipData.Item(xy2Var.a())), 2).d(xy2Var.c()).b(bundle).a()) == null;
    }
}
