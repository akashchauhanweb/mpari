package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.zepto.ar3;
import com.zepto.cs;
import com.zepto.gq3;
import com.zepto.qq;
import com.zepto.qq3;
import com.zepto.tq;
import com.zepto.uq3;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends cs {
    @Override // com.zepto.cs
    public qq c(Context context, AttributeSet attributeSet) {
        return new gq3(context, attributeSet);
    }

    @Override // com.zepto.cs
    public AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // com.zepto.cs
    public tq e(Context context, AttributeSet attributeSet) {
        return new qq3(context, attributeSet);
    }

    @Override // com.zepto.cs
    public AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new uq3(context, attributeSet);
    }

    @Override // com.zepto.cs
    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new ar3(context, attributeSet);
    }
}
