package com.zepto;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class zy1 {
    public static final a a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.zy1$a$a, reason: collision with other inner class name */
        public static final class C0137a implements TextWatcher {
            public final /* synthetic */ EditText a;

            public C0137a(EditText editText) {
                this.a = editText;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence != null && charSequence.length() > 0) {
                    this.a.setError(null);
                }
                String strValueOf = String.valueOf(charSequence);
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String upperCase = strValueOf.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (Intrinsics.areEqual(strValueOf, upperCase)) {
                    return;
                }
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                String upperCase2 = strValueOf.toUpperCase(locale2);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                this.a.setText(upperCase2);
                EditText editText = this.a;
                editText.setSelection(editText.length());
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, EditText editText) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(editText, "editText");
            editText.addTextChangedListener(new C0137a(editText));
        }
    }
}
