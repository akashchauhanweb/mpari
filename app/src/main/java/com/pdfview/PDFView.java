package com.pdfview;

import android.content.Context;
import android.util.AttributeSet;
import com.pdfview.PDFView;
import com.zepto.ak4;
import com.zepto.rx2;
import com.zepto.se1;
import com.zepto.sx2;
import com.zepto.t86;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0007\u001a\u00020\u0005H\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/pdfview/PDFView;", "Lcom/zepto/t86;", "Ljava/io/File;", "file", "U0", "", "V0", "onDetachedFromWindow", "C0", "Ljava/io/File;", "mfile", "", "D0", "F", "mScale", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pdfview-android_release"}, k = 1, mv = {1, 5, 1})
public final class PDFView extends t86 {

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public File mfile;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public float mScale;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mScale = 8.0f;
        setMinimumTileDpi(120);
        setMinimumScaleType(4);
    }

    public static final rx2 W0(PDFView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        File file = this$0.mfile;
        Intrinsics.checkNotNull(file);
        return new ak4(this$0, file, this$0.mScale, 0, 8, null);
    }

    public final PDFView U0(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.mfile = file;
        return this;
    }

    public final void V0() {
        File file = this.mfile;
        Intrinsics.checkNotNull(file);
        sx2 sx2VarM = sx2.m(file.getPath());
        Intrinsics.checkNotNullExpressionValue(sx2VarM, "uri(mfile!!.path)");
        setRegionDecoderFactory(new se1() { // from class: com.zepto.dk4
            @Override // com.zepto.se1
            public final Object a() {
                return PDFView.W0(this.a);
            }
        });
        setImage(sx2VarM);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w0();
    }
}
